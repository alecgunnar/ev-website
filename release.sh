#!/usr/bin/env bash

./gradlew :api:stopApi &> /dev/null
./gradlew :ui:stopUi &> /dev/null

set -e

./gradlew startApp
npm --prefix ./ui run test:e2e

pushd api
./gradlew build
popd

pushd ui
npm run test:unit
npm run build
popd

scp api/build/libs/WhatsUpEV-RELEASE.jar $WHATSUPEV_DEPLOY_USER@$WHATSUPEV_DEPLOY_SERVER:$WHATSUPEV_DEPLOY_API_LOCATION
scp -r ui/dist/*  $WHATSUPEV_DEPLOY_USER@$WHATSUPEV_DEPLOY_SERVER:$WHATSUPEV_DEPLOY_UI_LOCATION
