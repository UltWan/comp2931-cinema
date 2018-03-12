from flask_wtf import Form
from wtforms import TextField, TextAreaField, BooleanField, SubmitField,StringField,PasswordField, validators,IntegerField
from wtforms.validators import DataRequired

# login page form
class ticketForm(Form):
    quantity = IntegerField( [validators.NumberRange(min=0, max=10)])
