#!/usr/bin/env bash
npm run build
cd ../backend
mvn package
sshpass -p "Wssst13886195197" scp ../backend/target/ad-automation-0.0.1-SNAPSHOT.jar  root@106.14.171.111:/home/ssthouse/ad-automation-0.0.1-SNAPSHOT.jar
