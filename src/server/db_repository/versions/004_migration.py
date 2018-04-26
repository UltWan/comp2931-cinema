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

screenings = Table('screenings', pre_meta,
    Column('id', INTEGER, primary_key=True, nullable=False),
    Column('movie', INTEGER),
    Column('screen', INTEGER),
    Column('tickets_sold', INTEGER),
    Column('seats_available', INTEGER),
)

screens = Table('screens', pre_meta,
    Column('id', INTEGER, primary_key=True, nullable=False),
)

Screenings = Table('Screenings', post_meta,
    Column('id', Integer, primary_key=True, nullable=False),
    Column('movie_id', Integer),
    Column('screen_id', Integer),
    Column('tickets_sold', Integer),
    Column('seats_available', Integer),
)


def upgrade(migrate_engine):
    # Upgrade operations go here. Don't create your own engine; bind
    # migrate_engine to your metadata
    pre_meta.bind = migrate_engine
    post_meta.bind = migrate_engine
    pre_meta.tables['movies'].drop()
    pre_meta.tables['screenings'].drop()
    pre_meta.tables['screens'].drop()
    post_meta.tables['Screenings'].create()


def downgrade(migrate_engine):
    # Operations to reverse the above upgrade go here.
    pre_meta.bind = migrate_engine
    post_meta.bind = migrate_engine
    pre_meta.tables['movies'].create()
    pre_meta.tables['screenings'].create()
    pre_meta.tables['screens'].create()
    post_meta.tables['Screenings'].drop()