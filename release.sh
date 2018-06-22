#!/usr/bin/env bash

set -e

pushd api

./gradlew build
scp build/libs/WhatsUpEV-RELEASE.jar $WHATSUPEV_DEPLOY_USER@$WHATSUPEV_DEPLOY_SERVER:$WHATSUPEV_DEPLOY_API_LOCATION

popd

pushd ui

npm run build
scp -r build/*  $WHATSUPEV_DEPLOY_USER@$WHATSUPEV_DEPLOY_SERVER:$WHATSUPEV_DEPLOY_UI_LOCATION

popd

