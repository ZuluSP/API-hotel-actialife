#!/bin/sh
npx swagger-cli bundle openapi.yaml -o bundle.yaml -t yaml
rm jaxrs  -Rf
java -jar ./swagger-codegen-cli.jar generate -l jaxrs-jersey-seedstack --group-id com.ctag.hotel --artifact-id hotel-rest --artifact-version 2.0.3 --api-package com.ctag.hotel.rest.api --model-package com.ctag.hotel.rest.model -i ./bundle.yaml -o ./jaxrs --template-engine handlebars
cd jaxrs 
mvn clean package
cd ..