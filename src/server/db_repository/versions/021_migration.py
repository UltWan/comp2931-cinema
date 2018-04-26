from sqlalchemy import *
from migrate import *


from migrate.changeset import schema
pre_meta = MetaData()
post_meta = MetaData()
screenings = Table('screenings', pre_meta,
    Column('id', INTEGER, primary_key=True, nullable=False),
    Column('movie_id', INTEGER),
    Column('name', VARCHAR(length=25)),
    Column('time', FLOAT),
    Column('cinemascreen_id', INTEGER),
    Column('ticket_id', INTEGER),
    Column('tickets_sold', INTEGER),
    Column('seats_available', INTEGER),
)

screenings = Table('screenings', post_meta,
    Column('id', Integer, primary_key=True, nullable=False),
    Column('movie_id', Integer),
    Column('date', String(length=25)),
    Column('time', Float),
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
    pre_meta.tables['screenings'].columns['name'].drop()
    post_meta.tables['screenings'].columns['date'].create()


def downgrade(migrate_engine):
    # Operations to reverse the above upgrade go here.
    pre_meta.bind = migrate_engine
    post_meta.bind = migrate_engine
    pre_meta.tables['screenings'].columns['name'].create()
    post_meta.tables['screenings'].columns['date'].drop()
