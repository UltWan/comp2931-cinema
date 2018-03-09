from app import db

class Movies(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    title = db.Column(db.String(100))
    blurb = db.Column(db.String((2000)))
    certificate = db.Column(db.String(30))
    director = db.Column(db.String(50))
    screenings_id = db.Column(db.Integer, db.ForeignKey('screening.id'))

class Screenings(db.Model):
    id = db.Column(db.Integer, primary_key=True)
