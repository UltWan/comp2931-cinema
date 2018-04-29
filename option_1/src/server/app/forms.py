from flask_wtf import Form
from wtforms import TextField, TextAreaField, DateField, SelectField, SubmitField, IntegerField, HiddenField, PasswordField
from wtforms.validators import DataRequired
from wtforms_components import TimeField
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
	date = TextField('date', validators=[DataRequired()])
	time = TextField('time', validators=[DataRequired()])
	#date = DateField('date', format='%d/%m/%Y', validators=[DataRequired()])

class addScreen(Form):
	newscreen = SubmitField(label='New Screen', validators=[DataRequired()])

class purchaseTicket(Form):
	cardholdern = TextField('cardholdern', validators=[DataRequired()])
	ccnumber = IntegerField('ccnumber', validators=[DataRequired()])
	expdate = DateField('expdate', validators=[DataRequired()], format='%m/%y')
	cvvnumber = IntegerField('cvvnumber', validators=[DataRequired()])

	email = TextField('email', validators=[DataRequired()])

	adult_std_ticket_amt = SelectField('movie', choices=[('0', '0'), ('1', '1'), ('2', '2'), ('3', '3'), ('4', '4'), ('5', '5'), ('6', '6')])
	adult_vip_ticket_amt = SelectField('movie', choices=[('0', '0'), ('1', '1'), ('2', '2'), ('3', '3'), ('4', '4'), ('5', '5'), ('6', '6')])

	student_std_ticket_amt = SelectField('movie', choices=[('0', '0'), ('1', '1'), ('2', '2'), ('3', '3'), ('4', '4'), ('5', '5'), ('6', '6')])
	student_vip_ticket_amt = SelectField('movie', choices=[('0', '0'), ('1', '1'), ('2', '2'), ('3', '3'), ('4', '4'), ('5', '5'), ('6', '6')])

	child_std_ticket_amt = SelectField('movie', choices=[('0', '0'), ('1', '1'), ('2', '2'), ('3', '3'), ('4', '4'), ('5', '5'), ('6', '6')])
	child_vip_ticket_amt = SelectField('movie', choices=[('0', '0'), ('1', '1'), ('2', '2'), ('3', '3'), ('4', '4'), ('5', '5'), ('6', '6')])

	senior_std_ticket_amt = SelectField('movie', choices=[('0', '0'), ('1', '1'), ('2', '2'), ('3', '3'), ('4', '4'), ('5', '5'), ('6', '6')])
	senior_vip_ticket_amt = SelectField('movie', choices=[('0', '0'), ('1', '1'), ('2', '2'), ('3', '3'), ('4', '4'), ('5', '5'), ('6', '6')])

	totaltickets = HiddenField("totaltickets")

class Register(Form):
	name = TextField('name', validators=[DataRequired()])
	username = TextField('username', validators=[DataRequired()])
	email = TextField('email', validators=[DataRequired()])
	password = PasswordField('password', validators=[DataRequired()])
	passwordconf = PasswordField('passwordconf', validators=[DataRequired()])

class Login(Form):
	username = TextField('username', validators=[DataRequired()])
	password = PasswordField('password', validators=[DataRequired()])