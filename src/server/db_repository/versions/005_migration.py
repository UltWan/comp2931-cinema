from sqlalchemy import *
from migrate import *


from migrate.changeset import schema
pre_meta = MetaData()
post_meta = MetaData()
screenings = Table('screenings', pre_meta,
    Column('id', INTEGER, primary_key=True, nullable=False),
    Column('movie_id', INTEGER),
    Column('screen_id', INTEGER),
    Column('tickets_sold', INTEGER),
    Column('seats_available', INTEGER),
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


def upgrade(migrate_engine):
    # Upgrade operations go here. Don't create your own engine; bind
    # migrate_engine to your metadata
    pre_meta.bind = migrate_engine
    post_meta.bind = migrate_engine
    pre_meta.tables['screenings'].drop()
    post_meta.tables['Movies'].create()
    post_meta.tables['Screens'].create()


def downgrade(migrate_engine):
    # Operations to reverse the above upgrade go here.
    pre_meta.bind = migrate_engine
    post_meta.bind = migrate_engine
    pre_meta.tables['screenings'].create()
    post_meta.tables['Movies'].drop()
    post_meta.tables['Screens'].drop()
