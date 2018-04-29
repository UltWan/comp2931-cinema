#!/usr/bin/env bash
cd bin
source ./server/bin/activate
cd ..
cp -a src/server/. bin/server
cd bin/server
python run.py