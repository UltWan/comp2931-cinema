#!/usr/bin/env bash
mkdir bin
cd bin
virtualenv server
source ./server/bin/activate
server/bin/pip install flask
server/bin/pip install flask-login
server/bin/pip install flask-mail
server/bin/pip install flask-sqlalchemy
server/bin/pip install sqlalchemy-migrate
server/bin/pip install flask-whooshalchemy
server/bin/pip install flask-wtf
server/bin/pip install flask-babel
server/bin/pip install coverage
server/bin/pip install WTForms-Components 
cd server
mkdir app
mkdir app/static
mkdir app/templates
mkdir tmp
cd ..
cd ..
cp -a src/server/. bin/server
cd bin/server
python db_create.py
python run.py

