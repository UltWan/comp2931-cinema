from app import db

class Movies(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    title = db.Column(db.String(100))
    blurb = db.Column(db.String((2000)))
    certificate = db.Column(db.String(30))
    director = db.Column(db.String(50))
    duration = db.Column(db.Integer)
    poster = db.Column(db.String(100))

class Screens(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    now_playing = db.column(db.String(100))

class Screenings(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    movie = db.Column(db.Integer, db.ForeignKey(Movies.id))
    screen = db.Column(db.Integer, db.ForeignKey(Screens.id))
    tickets_sold = db.Column(db.Integer)
    seats_available = db.Column(db.Integer)
    date = db.Column(db.String(13))

class Tickets(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    screening = db.Column(db.Integer, db.ForeignKey(Screenings.id))
    name = db.Column(db.String(50))
    email = db.Column(db.String(150))
    type = db.Column(db.String(30))
    price = db.Column(db.Float)

class Seats(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    screen = db.Column(db.Integer, db.ForeignKey(Screens.id))
    row = db.Column(db.Integer)
    number = db.Column(db.Integer)
    available = db.Column(db.Boolean)
    vip = db.Column(db.Boolean)