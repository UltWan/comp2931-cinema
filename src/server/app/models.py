from app import db

# class Movies(db.Model):
#     id = db.Column(db.Integer, primary_key=True)
#     title = db.Column(db.String(100))
#     blurb = db.Column(db.String((2000)))
#     certificate = db.Column(db.String(30))
#     director = db.Column(db.String(50))
#
# class Screens(db.Model):
#     id = db.Column(db.Integer, primary_key=True)
#     now_playing = db.column(db.String(100))
#
# class Screenings(db.Model):
# 	id = db.Column(db.Integer, primary_key=True)
# 	movie = db.Column(db.Integer, db.ForeignKey(Movies.id))
# 	screen = db.Column(db.Integer, db.ForeignKey(Screens.id))
# 	tickets_sold = db.Column(db.Integer)
# 	seats_available = db.Column(db.Integer)
#


class Movies(db.Model):
    __tablename__ = 'Movies'
    id = db.Column(db.Integer, primary_key=True)
    title = db.Column(db.String(100))
    blurb = db.Column(db.String((2000)))
    certificate = db.Column(db.String(30))
    director = db.Column(db.String(50))
    screenings = db.relationship('Screenings', backref='movie', lazy='dynamic',
    primaryjoin="Movies.id==Screenings.movie_id")

class Screens(db.Model):
    __tablename__ = 'Screens'
    id = db.Column(db.Integer, primary_key = True)
    now_playing = db.column(db.String(100))
    screenings = db.relationship('Screenings', backref='screen', lazy='dynamic',
    primaryjoin="Screens.id==Screenings.cinemascreen_id")

class Tickets(db.Model):
    __tablename__ = 'Tickets'
    id = db.Column(db.Integer, primary_key=True)
    # screening = db.Column(db.Integer, db.ForeignKey(Screenings.id))
    name = db.Column(db.String(50))
    email = db.Column(db.String(150))
    type = db.Column(db.String(30))
    price = db.Column(db.Float)
    title = db.Column(db.String(100))
    certificate = db.Column(db.String(30))
    screen = db.Column(db.Integer)
    # screening_id = db.Column(db.Integer, db.ForeignKey('screenings.id'))


class Screenings(db.Model):
    __tablename__ = 'screenings'
    id = db.Column(db.Integer, primary_key=True)
    movie_id = db.Column(db.Integer, db.ForeignKey('Movies.id'))
    name = db.Column(db.String(25))
    time = db.Column(db.Float)
    cinemascreen_id = db.Column(db.Integer, db.ForeignKey('Screens.id'))
    ticket_id = db.Column(db.Integer, db.ForeignKey('Tickets.id'))
    tickets_sold = db.Column(db.Integer)
    seats_available = db.Column(db.Integer)
    # tickets = db.relationship('Tickets', backref='screening', lazy='dynamic',
    # primaryjoin="Screenings.id==Tickets.screening_id")

# class Tickets(db.Model):
#     __tablename__ = 'Tickets'
#     id = db.Column(db.Integer, primary_key=True)
#     # screening = db.Column(db.Integer, db.ForeignKey(Screenings.id))
#     name = db.Column(db.String(50))
#     email = db.Column(db.String(150))
#     type = db.Column(db.String(30))
#     price = db.Column(db.Float)
#     screenings = db.relationship('Screenings', backref='ticket', lazy='dynamic',
#     primaryjoin="Tickets.id==Screenings.ticket_id")
#
# class Screenings(db.Model):
#     __tablename__ = 'screenings'
#     id = db.Column(db.Integer, primary_key=True)
#     movie_id = db.Column(db.Integer, db.ForeignKey('Movies.id'))
#     cinemascreen_id = db.Column(db.Integer, db.ForeignKey('Screens.id'))
#     ticket_id = db.Column(db.Integer, db.ForeignKey('Tickets.id'))
#     tickets_sold = db.Column(db.Integer)
#     seats_available = db.Column(db.Integer)
