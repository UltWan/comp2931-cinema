from app import app, db, models, mail
from flask import render_template, flash, request, redirect, url_for, session
from .forms import addMovie, addScreening, addScreen, purchaseTicket, Login, Register
from datetime import timedelta
import os
from werkzeug.utils import secure_filename
from flask_mail import Message

@app.before_request
def make_session_permanent():
    session.permanent = True
    app.permanent_session_lifetime = timedelta(minutes=20)

@app.route('/')
def index():
	movies = models.Movies.query.all()
	return render_template('index.html', title='JackDaw Cinema')

@app.route('/register', methods=['GET', 'POST'])
def register():
	if 'user' in session:
		return redirect(url_for('index'))
	else:
		RegisterForm = Register()
		if RegisterForm.validate_on_submit():
			if request.form['password']==request.form['passwordconf']:
				user = models.Users(name=request.form['name'], email=request.form['email'], username=request.form['username'], password=request.form['password'])
				db.session.add(user)
				db.session.commit()

				return redirect(url_for('register'))
			else:
				 flash('Passwords do not match')

	return render_template('register.html', title="Register - JackDaw Cinema", Register=RegisterForm)

@app.route('/login', methods=['GET','POST'])
def login():
	LoginForm = Login()
	if LoginForm.validate_on_submit():
		user = models.Users.query.get(request.form['username'])
		if user != None:
			if user.password == request.form['password']:
				session['user'] = request.form['username']
				return redirect(url_for('index'))
			else:
				flash('Your password is incorrect')
		else:
			flash('The details you entered are incorrect.')
	return render_template('login.html', title="Login - JackDaw Cinema", Login=LoginForm)

@app.route('/logout')
def logout():
	session.pop('user', None)
	return redirect(url_for('login'))

@app.route('/nowshowing')
def allscreenings():
	movies = models.Movies.query.all()
	return render_template('nowshowing.html', title='Now Showing - JackDaw Cinema', movies=movies)

@app.route('/where')
def where():
	return render_template('location.html', title='Where - JackDaw Cinema')

@app.route('/admin', methods=['GET', 'POST'])
def admin():
	if 'user' in session:
		if session['user'] == 'admin':
			addMovieform = addMovie(csrf_enabled=False)
			addScreeningform = addScreening()
			addScreenform = addScreen()

			screens = models.Screens.query.all()
			screenings = models.Screenings.query.all()
			movies = models.Movies.query.all()

			movies_select = [(c.id, c.title) for c in models.Movies.query.all()]
			addScreeningform.movie.choices = movies_select

			screens_select = [(c.id, c.id) for c in models.Screens.query.all()]
			addScreeningform.screen.choices = screens_select

			if addMovieform.validate_on_submit():
				nmovies = str(models.Movies.query.count())
				f = addMovieform.poster.data
				filename = secure_filename(nmovies+f.filename)
				fpath = os.path.join(os.path.abspath(os.path.dirname(__file__)), 'static/images/', filename)
				f.save(fpath)
				movie = models.Movies(title=request.form['title'], blurb=request.form['blurb'], certificate=request.form['certificate'], director=request.form['director'], duration=request.form['duration'], poster=filename)
				db.session.add(movie)
				db.session.commit()
				return redirect(url_for('admin'))
			
			if addScreeningform.validate_on_submit():
				screening = models.Screenings(movie=request.form['movie'], screen=request.form['screen'], date=request.form['date'], time=request.form['time'])
				db.session.add(screening)
				db.session.commit()
				return redirect(url_for('admin'))
			
			if addScreenform.validate_on_submit():
				screen = models.Screens()
				db.session.add(screen)
				db.session.commit()
				return redirect(url_for('admin'))

			return render_template('admin.html', title="Admin Panel", addMovieform=addMovieform, addScreeningform=addScreeningform, addScreenform=addScreenform, screenings=screenings, screens=screens, movies=movies)
		else:
			return redirect(url_for('login'))
	else:
		return redirect(url_for('index'))

@app.route('/load_demo_data')
def load_demo_data():
	movie1 = models.Movies(title="DeadPool", blurb="DeadPool Blurb", certificate="PG-13", director="ANTONIS", duration=120, poster="deadpool.jpg")
	movie2 = models.Movies(title="Black Panther", blurb="Black Panther Blurb", certificate="PG-13", director="Clesio", duration=100, poster="blackpanther.jpg")
	movie3 = models.Movies(title="Jurassic World", blurb="Jurassic World Blurb", certificate="PG-13", director="Aaron", duration=110, poster="jurassicworld.jpg")
	screen1 = models.Screens(now_playing = 1)
	screen2 = models.Screens(now_playing = 2)
	db.session.add(movie1)
	db.session.add(movie2)
	db.session.add(movie3)
	db.session.add(screen1)
	db.session.add(screen2)
	db.session.commit()
	return redirect(url_for('index'))

@app.route('/screenings/<id>', methods=['GET', 'POST'])
def screenings(id):
	movies = models.Movies.query.all()
	screenings = models.Screenings.query.filter_by(movie=id).all()
	if len(screenings)>0:
		return render_template('screenings.html', title="View Screenings", screenings=screenings, movies=movies)
	else:
		flash('No screenings found')
		return redirect(url_for('index'))

@app.route('/movie/<id>', methods=['GET', 'POST'])
def movie(id):
	movie = models.Movies.query.get(id)
	if movie!=None:
		return render_template('movie.html', title="Movie Details", movie=movie)
	else:
		return redirect(url_for('index'))

@app.route('/purchase/<id>', methods=['GET', 'POST'])
def purchase(id):
	movies = models.Movies.query.all()
	purchaseTicketform = purchaseTicket()
	screening = models.Screenings.query.get(id)
	if screening!=None:
		if purchaseTicketform.validate_on_submit():
			sendmail(request.form['email'], str(request.form['totaltickets']), str(movies[screening.movie-1].title), str(screening.date), str(screening.screen))
			flash('Thank you for booking. Find your tickets at your email')
			return redirect(url_for('index'))
		return render_template('booking.html', title='Purchase tickets', screening=screening, purchaseTicketform=purchaseTicketform, movies=movies)
	else:
		return redirect(url_for('index'))

def sendmail(recipient, ntickets, title, date, screen):
	message = 'Thank you for purchasing tickets for Jackdaw Cinema.\nYou have booked '+ntickets+' tickets for '+title+' on \n'+date+' at Screen '+screen+'.'
	subject = "Your JackDaw Cinema Tickets"
	msg = Message(recipients=[recipient], body=message, subject=subject, sender="jackdawcinema@mail.com")
	mail.send(msg)

@app.route('/screen/delete/<id>')
def delete_screen(id):
	screen = models.Screens.query.get(id)
	db.session.delete(screen)
	db.session.commit()
	return redirect(url_for('admin'))

@app.route('/movie/delete/<id>')
def delete_movie(id):
	movie = models.Movies.query.get(id)
	db.session.delete(movie)
	db.session.commit()
	return redirect(url_for('admin'))

@app.route('/screening/delete/<id>')
def delete_screening(id):
	screening = models.Screenings.query.get(id)
	db.session.delete(screening)
	db.session.commit()
	return	redirect(url_for('admin'))