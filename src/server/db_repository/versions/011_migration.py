from sqlalchemy import *
from migrate import *


from migrate.changeset import schema
pre_meta = MetaData()
post_meta = MetaData()
Movies = Table('Movies', pre_meta,
    Column('id', INTEGER, primary_key=True, nullable=False),
    Column('title', VARCHAR(length=100)),
    Column('blurb', VARCHAR(length=2000)),
    Column('certificate', VARCHAR(length=30)),
    Column('director', VARCHAR(length=50)),
)

Screens = Table('Screens', pre_meta,
    Column('id', INTEGER, primary_key=True, nullable=False),
)

Tickets = Table('Tickets', pre_meta,
    Column('id', INTEGER, primary_key=True, nullable=False),
    Column('screening', INTEGER),
    Column('name', VARCHAR(length=50)),
    Column('email', VARCHAR(length=150)),
    Column('type', VARCHAR(length=30)),
    Column('price', FLOAT),
)

movies = Table('movies', post_meta,
    Column('id', Integer, primary_key=True, nullable=False),
    Column('title', String(length=100)),
    Column('blurb', String(length=2000)),
    Column('certificate', String(length=30)),
    Column('director', String(length=50)),
)

screens = Table('screens', post_meta,
    Column('id', Integer, primary_key=True, nullable=False),
)

tickets = Table('tickets', post_meta,
    Column('id', Integer, primary_key=True, nullable=False),
    Column('screening', Integer),
    Column('name', String(length=50)),
    Column('email', String(length=150)),
    Column('type', String(length=30)),
    Column('price', Float),
)

screenings = Table('screenings', pre_meta,
    Column('id', INTEGER, primary_key=True, nullable=False),
    Column('movie_id', INTEGER),
    Column('cinemascreen_id', INTEGER),
    Column('tickets_sold', INTEGER),
    Column('seats_available', INTEGER),
)

screenings = Table('screenings', post_meta,
    Column('id', Integer, primary_key=True, nullable=False),
    Column('movie', Integer),
    Column('screen', Integer),
    Column('tickets_sold', Integer),
    Column('seats_available', Integer),
)


def upgrade(migrate_engine):
    # Upgrade operations go here. Don't create your own engine; bind
    # migrate_engine to your metadata
    pre_meta.bind = migrate_engine
    post_meta.bind = migrate_engine
    pre_meta.tables['Movies'].drop()
    pre_meta.tables['Screens'].drop()
    pre_meta.tables['Tickets'].drop()
    post_meta.tables['movies'].create()
    post_meta.tables['screens'].create()
    post_meta.tables['tickets'].create()
    pre_meta.tables['screenings'].columns['cinemascreen_id'].drop()
    pre_meta.tables['screenings'].columns['movie_id'].drop()
    post_meta.tables['screenings'].columns['movie'].create()
    post_meta.tables['screenings'].columns['screen'].create()


def downgrade(migrate_engine):
    # Operations to reverse the above upgrade go here.
    pre_meta.bind = migrate_engine
    post_meta.bind = migrate_engine
    pre_meta.tables['Movies'].create()
    pre_meta.tables['Screens'].create()
    pre_meta.tables['Tickets'].create()
    post_meta.tables['movies'].drop()
    post_meta.tables['screens'].drop()
    post_meta.tables['tickets'].drop()
    pre_meta.tables['screenings'].columns['cinemascreen_id'].create()
    pre_meta.tables['screenings'].columns['movie_id'].create()
    post_meta.tables['screenings'].columns['movie'].drop()
    post_meta.tables['screenings'].columns['screen'].drop()
