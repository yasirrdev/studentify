#!/bin/bash
sudo apt-get update -y
sudo apt-get install -y openjdk-21-jdk

cd /opt/codedeploy-agent/deployment-root/$DEPLOYMENT_GROUP_ID/$DEPLOYMENT_ID/deployment-archive
chmod +x gradlew
./gradlew build
mv build/libs/studentify-1.0.0.war studentify.war