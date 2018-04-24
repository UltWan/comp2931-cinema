from sqlalchemy import *
from migrate import *


from migrate.changeset import schema
pre_meta = MetaData()
post_meta = MetaData()
Cinemascreens = Table('Cinemascreens', pre_meta,
    Column('id', INTEGER, primary_key=True, nullable=False),
)

screening = Table('screening', pre_meta,
    Column('id', INTEGER, primary_key=True, nullable=False),
    Column('movie_id', INTEGER),
    Column('time', VARCHAR(length=30)),
    Column('cinemascreen_id', INTEGER),
)


def upgrade(migrate_engine):
    # Upgrade operations go here. Don't create your own engine; bind
    # migrate_engine to your metadata
    pre_meta.bind = migrate_engine
    post_meta.bind = migrate_engine
    pre_meta.tables['Cinemascreens'].drop()
    pre_meta.tables['screening'].columns['cinemascreen_id'].drop()


def downgrade(migrate_engine):
    # Operations to reverse the above upgrade go here.
    pre_meta.bind = migrate_engine
    post_meta.bind = migrate_engine
    pre_meta.tables['Cinemascreens'].create()
    pre_meta.tables['screening'].columns['cinemascreen_id'].create()
