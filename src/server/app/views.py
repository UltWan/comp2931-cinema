from app import app, db, models
from flask import render_template, flash, request, redirect, url_for, session
from .forms import addMovie, addScreening, addScreen
from datetime import timedelta
import os
from werkzeug.utils import secure_filename

@app.route('/')
def index():
	movies = models.Movies.query.all()
	return render_template('movies.html', title='Movies From Database', movies=movies)

@app.route('/admin', methods=['GET', 'POST'])
def admin():
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
		screening = models.Screenings(movie=request.form['movie'], screen=request.form['screen'], date=request.form['date'])
		db.session.add(screening)
		db.session.commit()
		return redirect(url_for('admin'))
	
	if addScreenform.validate_on_submit():
		screen = models.Screens()
		db.session.add(screen)
		db.session.commit()
		return redirect(url_for('admin'))

	return render_template('admin.html', title="Admin Panel", addMovieform=addMovieform, addScreeningform=addScreeningform, addScreenform=addScreenform, screenings=screenings, screens=screens, movies=movies)


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
