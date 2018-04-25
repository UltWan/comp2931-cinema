from flask_wtf import Form
from wtforms import TextField, TextAreaField, DateField, IntegerField,validators
from wtforms.validators import DataRequired


class addMovie(Form):
	title = TextField('title', validators=[DataRequired()])
	blurb =TextAreaField('blurb', validators=[DataRequired()])
	certificate = TextField('certificate', validators=[DataRequired()])
	director = TextField('director', validators=[DataRequired()])

class bookingForm(Form):
    quantity = IntegerField( [validators.NumberRange(min=0, max=10)])
