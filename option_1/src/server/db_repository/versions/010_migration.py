from sqlalchemy import *
from migrate import *


from migrate.changeset import schema
pre_meta = MetaData()
post_meta = MetaData()
screening = Table('screening', pre_meta,
    Column('id', INTEGER, primary_key=True, nullable=False),
    Column('screening_id', INTEGER),
)

screening = Table('screening', post_meta,
    Column('id', Integer, primary_key=True, nullable=False),
    Column('movie_id', Integer),
)


def upgrade(migrate_engine):
    # Upgrade operations go here. Don't create your own engine; bind
    # migrate_engine to your metadata
    pre_meta.bind = migrate_engine
    post_meta.bind = migrate_engine
    pre_meta.tables['screening'].columns['screening_id'].drop()
    post_meta.tables['screening'].columns['movie_id'].create()


def downgrade(migrate_engine):
    # Operations to reverse the above upgrade go here.
    pre_meta.bind = migrate_engine
    post_meta.bind = migrate_engine
    pre_meta.tables['screening'].columns['screening_id'].create()
    post_meta.tables['screening'].columns['movie_id'].drop()
