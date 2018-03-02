from sqlalchemy import *
from migrate import *


from migrate.changeset import schema
pre_meta = MetaData()
post_meta = MetaData()
screening = Table('screening', post_meta,
    Column('id', Integer, primary_key=True, nullable=False),
    Column('screening_id', Integer),
)

movies = Table('movies', pre_meta,
    Column('id', INTEGER, primary_key=True, nullable=False),
    Column('title', VARCHAR(length=100)),
    Column('blurb', VARCHAR(length=2000)),
    Column('certificate', VARCHAR(length=30)),
    Column('director', VARCHAR(length=50)),
    Column('movies_id', INTEGER),
)


def upgrade(migrate_engine):
    # Upgrade operations go here. Don't create your own engine; bind
    # migrate_engine to your metadata
    pre_meta.bind = migrate_engine
    post_meta.bind = migrate_engine
    post_meta.tables['screening'].columns['screening_id'].create()
    pre_meta.tables['movies'].columns['movies_id'].drop()


def downgrade(migrate_engine):
    # Operations to reverse the above upgrade go here.
    pre_meta.bind = migrate_engine
    post_meta.bind = migrate_engine
    post_meta.tables['screening'].columns['screening_id'].drop()
    pre_meta.tables['movies'].columns['movies_id'].create()
