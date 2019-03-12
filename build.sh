#!/usr/bin/env bash
ROOT=`pwd`
cd ./algorithm-server
./gradlew build
cd $ROOT/client-ng
npm ci && npm run build
cd $ROOT
docker-compose build