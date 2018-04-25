from flask_wtf import Form
from wtforms import TextField, TextAreaField, DateField
from wtforms.validators import DataRequired


class addMovie(Form):
	title = TextField('title', validators=[DataRequired()])
	blurb =TextAreaField('blurb', validators=[DataRequired()])
	certificate = TextField('certificate', validators=[DataRequired()])
	director = TextField('director', validators=[DataRequired()])

