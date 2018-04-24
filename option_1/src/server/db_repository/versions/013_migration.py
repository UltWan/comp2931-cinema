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

Movies = Table('Movies', post_meta,
    Column('id', Integer, primary_key=True, nullable=False),
    Column('title', String(length=100)),
    Column('blurb', String(length=2000)),
    Column('certificate', String(length=30)),
    Column('director', String(length=50)),
)


def upgrade(migrate_engine):
    # Upgrade operations go here. Don't create your own engine; bind
    # migrate_engine to your metadata
    pre_meta.bind = migrate_engine
    post_meta.bind = migrate_engine
    pre_meta.tables['movies'].drop()
    post_meta.tables['Movies'].create()


def downgrade(migrate_engine):
    # Operations to reverse the above upgrade go here.
    pre_meta.bind = migrate_engine
    post_meta.bind = migrate_engine
    pre_meta.tables['movies'].create()
    post_meta.tables['Movies'].drop()
