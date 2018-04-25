from app import app, db, models
from flask import render_template, flash, request, redirect, url_for, session
from .forms import addMovie, bookingForm

@app.route('/')
def index():
	movies = models.Movies.query.all()
	return render_template('movies.html', title='Movies From Database', movies=movies)

@app.route('/admin', methods=['GET', 'POST'])
def admin():
	form = addMovie()
	if form.validate_on_submit():
		movie = models.Movies(title=request.form['title'], blurb=request.form['blurb'], certificate=request.form['certificate'], director=request.form['director'])
		db.session.add(movie)
		db.session.commit()
	return render_template('admin.html', title="Register", form=form)

@app.route('/buyticket/<int:id>',methods=['GET', 'POST'])
def book(id):
	form = bookingForm()
	flash("here")
	if form.validate_on_submit():

		p = models.Screenings.query.get(id)
		p.tickets_sold = p.tickets_sold + form.quantity.data
		p.seats_available = p.seats_available - form.quantity.data
		db.session.commit()
		flash("here")
	else:
		if form.quantity.data =="":
    			flash("Please enter Quantity")
	Screening = models.Screenings.query.get(id)
	# screenings = models.Screening.query.all()
	return render_template('booking.html',title='Screening.movies.title', p=Screening, form = form)

# add screenings
# >>> screening.movies = movie
# >>> screening.tickets_sold = 0
# >>> screening.seats_available = 100
# >>> db.session.add(screening)
# >>> db.session.commit()
