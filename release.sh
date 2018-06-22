#!/usr/bin/env bash

set -e

pushd api

./gradlew build

popd

pushd ui

npm run build

popd

scp -r ./ui/build/*  $WHATSUPEV_DEPLOY_USER@$WHATSUPEV_DEPLOY_SERVER:$WHATSUPEV_DEPLOY_LOCATION

