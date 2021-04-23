#!/bin/sh
npx swagger-cli bundle openapi.yaml -o bundle.yaml -t yaml
rm jaxrs  -Rf
java -jar swagger-codegen-cli.jar generate -l jaxrs-jersey-seedstack --group-id hotel_actialife --artifact-id actialife-rest --artifact-version 1.0.0 --api-package API-hotel_actialife --model-package actialife -i bundle.yaml -o ./jaxrs --template-engine handlebars

cd jaxrs 
mvn clean package
cd ..