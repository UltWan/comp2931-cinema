from app import db

class Screening(db.Model):
    __tablename__ = 'screening'
    id = db.Column(db.Integer, primary_key=True)
    time = db.Column(db.String(30))
    movie_id = db.Column(db.Integer, db.ForeignKey('Movies.id'))
    cinemascreen_id = db.Column(db.Integer, db.ForeignKey('Cinemascreens.id'))


class Movies(db.Model):
    __tablename__ = 'Movies'
    id = db.Column(db.Integer, primary_key=True)
    title = db.Column(db.String(100))
    blurb = db.Column(db.String((2000)))
    certificate = db.Column(db.String(30))
    director = db.Column(db.String(50))
    screenings = db.relationship('Screening', backref='movies', lazy='dynamic',
    primaryjoin="Movies.id==Screening.movie_id")

class Cinemascreens(db.Model):
    __tablename__ = 'Cinemascreens'
    id = db.Column(db.Integer, primary_key = True)
    num = db.Column(db.Integer)
    screenings = db.relationship('Screening', backref='cinemascreens', lazy='dynamic',
    primaryjoin="Cinemascreens.id==Screening.cinemascreen_id")



# #
#     cinemascreen_screening = db.relationship('Cinemascreen',backref='screening',lazy='dynamic',
#     primaryjoin="Cinemascreen.id==Screenings.id")
# #
# class Cinemascreen(db.Model):
#     id = db.Column(db.Integer, primary_key = True)
#     cinemascreen_id= db.Column(db.Integer, db.ForeignKey('screening.id'))
