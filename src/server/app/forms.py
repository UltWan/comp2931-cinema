from flask_wtf import Form
from wtforms import TextField, TextAreaField, DateField, SelectField, SubmitField
from wtforms.validators import DataRequired
from flask_wtf.file import FileField, FileRequired, FileAllowed


class addMovie(Form):
	title = TextField('title', validators=[DataRequired()])
	blurb =TextAreaField('blurb', validators=[DataRequired()])
	certificate = TextField('certificate', validators=[DataRequired()])
	director = TextField('director', validators=[DataRequired()])
	duration = TextField('duration', validators=[DataRequired()])
	poster = FileField('poster', validators=[FileRequired()])

class addScreening(Form):
	movie = SelectField('movie', choices=[], coerce=int)
	screen = SelectField('screen', choices=[], coerce=int)
	date = DateField('date', format='%d/%m/%Y', validators=[DataRequired()])
	#time = SelectField('time', choices=[], coerce=int)
	#date = DateField('date', format='%d/%m/%Y', validators=[DataRequired()])

class addScreen(Form):
	newscreen = SubmitField(label='New Screen')