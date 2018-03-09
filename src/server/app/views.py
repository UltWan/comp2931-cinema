from app import app, db, models
from flask import render_template, redirect

@app.route('/')
def index():
	movies = models.Movies.query.all()
	return render_template('movies.html', title='Movies From Database', movies=movies)

@app.route('/screenings')
def curscreenings():
	movies = models.Movies.query.all()
	return render_template('screenings.html', title="Screenings", movies=movies)
