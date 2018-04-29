import os
basedir = os.path.abspath(os.path.dirname(__file__))

SQLALCHEMY_DATABASE_URI = 'sqlite:///' + os.path.join(basedir, 'app.db')
SQLALCHEMY_MIGRATE_REPO = os.path.join(basedir, 'db_repository')
SQLALCHEMY_TRACK_MODIFICATIONS = True

#CSRF Security
WTF_CSRF_ENABLED = True
SECRET_KEY= 'j@ckD@w_C1n3m@2kl8'

#EMAIL
# email server
MAIL_SERVER = 'smtp.mail.com'
MAIL_PORT = 465
MAIL_USE_TLS = False
MAIL_USE_SSL = True
MAIL_USERNAME = 'jackdawcinema@mail.com'
MAIL_PASSWORD = 'J@cKd@w1N()'