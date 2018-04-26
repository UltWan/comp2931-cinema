from sqlalchemy import *
from migrate import *


from migrate.changeset import schema
pre_meta = MetaData()
post_meta = MetaData()
movies = Table('movies', pre_meta,
    Column('id', INTEGER, primary_key=True, nullable=False),
    Column('title', VARCHAR(length=100)),
    Column('blurb', VARCHAR(length=2000)),
    Column('certificate', VARCHAR(length=30)),
    Column('director', VARCHAR(length=50)),
)

screens = Table('screens', pre_meta,
    Column('id', INTEGER, primary_key=True, nullable=False),
)

tickets = Table('tickets', pre_meta,
    Column('id', INTEGER, primary_key=True, nullable=False),
    Column('screening', INTEGER),
    Column('name', VARCHAR(length=50)),
    Column('email', VARCHAR(length=150)),
    Column('type', VARCHAR(length=30)),
    Column('price', FLOAT),
)

Movies = Table('Movies', post_meta,
    Column('id', Integer, primary_key=True, nullable=False),
    Column('title', String(length=100)),
    Column('blurb', String(length=2000)),
    Column('certificate', String(length=30)),
    Column('director', String(length=50)),
)

Screens = Table('Screens', post_meta,
    Column('id', Integer, primary_key=True, nullable=False),
)

Tickets = Table('Tickets', post_meta,
    Column('id', Integer, primary_key=True, nullable=False),
    Column('name', String(length=50)),
    Column('email', String(length=150)),
    Column('type', String(length=30)),
    Column('price', Float),
)

screenings = Table('screenings', pre_meta,
    Column('id', INTEGER, primary_key=True, nullable=False),
    Column('tickets_sold', INTEGER),
    Column('seats_available', INTEGER),
    Column('movie', INTEGER),
    Column('screen', INTEGER),
)

screenings = Table('screenings', post_meta,
    Column('id', Integer, primary_key=True, nullable=False),
    Column('movie_id', Integer),
    Column('cinemascreen_id', Integer),
    Column('ticket_id', Integer),
    Column('tickets_sold', Integer),
    Column('seats_available', Integer),
)


def upgrade(migrate_engine):
    # Upgrade operations go here. Don't create your own engine; bind
    # migrate_engine to your metadata
    pre_meta.bind = migrate_engine
    post_meta.bind = migrate_engine
    pre_meta.tables['movies'].drop()
    pre_meta.tables['screens'].drop()
    pre_meta.tables['tickets'].drop()
    post_meta.tables['Movies'].create()
    post_meta.tables['Screens'].create()
    post_meta.tables['Tickets'].create()
    pre_meta.tables['screenings'].columns['movie'].drop()
    pre_meta.tables['screenings'].columns['screen'].drop()
    post_meta.tables['screenings'].columns['cinemascreen_id'].create()
    post_meta.tables['screenings'].columns['movie_id'].create()
    post_meta.tables['screenings'].columns['ticket_id'].create()


def downgrade(migrate_engine):
    # Operations to reverse the above upgrade go here.
    pre_meta.bind = migrate_engine
    post_meta.bind = migrate_engine
    pre_meta.tables['movies'].create()
    pre_meta.tables['screens'].create()
    pre_meta.tables['tickets'].create()
    post_meta.tables['Movies'].drop()
    post_meta.tables['Screens'].drop()
    post_meta.tables['Tickets'].drop()
    pre_meta.tables['screenings'].columns['movie'].create()
    pre_meta.tables['screenings'].columns['screen'].create()
    post_meta.tables['screenings'].columns['cinemascreen_id'].drop()
    post_meta.tables['screenings'].columns['movie_id'].drop()
    post_meta.tables['screenings'].columns['ticket_id'].drop()
