from sqlalchemy import *
from migrate import *


from migrate.changeset import schema
pre_meta = MetaData()
post_meta = MetaData()
Tickets = Table('Tickets', post_meta,
    Column('id', Integer, primary_key=True, nullable=False),
    Column('name', String(length=50)),
    Column('email', String(length=150)),
    Column('type', String(length=30)),
    Column('price', Float),
    Column('title', String(length=100)),
    Column('certificate', String(length=30)),
    Column('screen', Integer),
    Column('screening_id', Integer),
)


def upgrade(migrate_engine):
    # Upgrade operations go here. Don't create your own engine; bind
    # migrate_engine to your metadata
    pre_meta.bind = migrate_engine
    post_meta.bind = migrate_engine
    post_meta.tables['Tickets'].columns['certificate'].create()
    post_meta.tables['Tickets'].columns['screen'].create()
    post_meta.tables['Tickets'].columns['title'].create()


def downgrade(migrate_engine):
    # Operations to reverse the above upgrade go here.
    pre_meta.bind = migrate_engine
    post_meta.bind = migrate_engine
    post_meta.tables['Tickets'].columns['certificate'].drop()
    post_meta.tables['Tickets'].columns['screen'].drop()
    post_meta.tables['Tickets'].columns['title'].drop()
