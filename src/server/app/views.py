from app import app, db, models
from .forms import ticketForm
from flask import render_template, redirect, flash

@app.route('/')
def index():
	movies = models.Movies.query.all()
	return render_template('movies.html', title='Movies From Database', movies=movies)

@app.route('/screenings')
def screenings():
	screenings = models.Screening.query.all()
	return render_template('screenings.html',title='Movie Screening', screenings=screenings)


@app.route('/buyticket/<int:id>',methods=['GET', 'POST'])
def buyticket(id):
	form = ticketForm()
	flash("here")
	if form.validate_on_submit():

		p = models.Screening.query.get(id)
		p.seats = p.seats - form.quantity.data
		db.session.commit()
		flash("here")
	else:
		if form.quantity.data =="":
    			flash("Please Quantity")


	Screening = models.Screening.query.get(id)
	# screenings = models.Screening.query.all()
	return render_template('buyticket.html',title='Screening.movies.title', p=Screening, form = form)
