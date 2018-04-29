#!/usr/bin/env bash
make clean
javac Main.java
java -classpath ".:sqlite-jdbc-3.21.0.jar" Main
