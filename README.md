# ð¡ Base API

This project is created with [ð¡Base-API](https://git.procesos.ctag.com/Paperless-API/base-api) using [OpenAPI 3.0 Specification](https://swagger.io/docs/specification/about/) and [ð CTAG Standard](https://git.procesos.ctag.com/Paperless-API/docs)

### Master

[![Build Status](https://jenkins.procesos.ctag.com/buildStatus/icon?job=API/base-api/master)](https://jenkins.procesos.ctag.com/job/API/job/pet-store/job/master/)

### Develop

[![Build Status](https://jenkins.procesos.ctag.com/buildStatus/icon?job=API/base-api/develop)](https://jenkins.procesos.ctag.com/job/API/job/pet-store/job/develop/)

# ð Table of Contents

- [Overview](#overview)
- [Getting Started](#getting-started)
- [ð Watch](#ð-watcher)
- [Shortcuts](#shortcuts)

# Overview

You can **clone** this project **to** generate a **new API** following the [ð CTAG Standard](https://git.procesos.ctag.com/Paperless-API/docs) and **edit** all examples with your own requirements.

# Getting Started

- It is recommended that you first learn how to do API with [ð Ctag Standard](https://git.procesos.ctag.com/Paperless-API/docs).

- This API is splitted in multiple yaml files, is recommended that you check [âï¸ Split Swagger Standard - Guide âï¸](https://git.procesos.ctag.com/Paperless-API/docs/edit/master/split-guide.md) at least

- Clone the repository

        git clone https://git.procesos.ctag.com/git/Paperless-API/base-api.git

- â Replace (ctrl+f **Base API**) (ctrl+f **base-api**) with your own project name

- âï¸ Update in README.md the [Overview](#Overview) headland

- âï¸ Update in **openapi.yaml** the **title**

- âï¸ Update in **openapi.yaml** the servers **-url**

- **Rules**
  -  All Schemas include **schemas/generic/Id.yaml** file like this example:

      ```yaml
      # ./schemas/you-basic-model/YouBasicModel.yaml
      type: object
      required:
        - id
        - name
      properties:
        id:
          $ref: './Id.yaml'
        name:
          type: string
        tags:
          type: array
          items:
            $ref: './Tag.yaml'
      ```

      Output:
      ```yaml
      YouBasicModel:
        type: object
        required:
          - id
          - name
        properties:
          id:
            $ref: '#/components/schemas/Id'
          name:
            type: string
          tags:
            type: array
            items:
              $ref: '#/components/schemas/Tag'
      ```

  - This generic folders don't should be removed:
    - ð« **parameters/id** folder
    - ð« **parameters/pagination** folder
    - ð« **responses/generic** folder

  - **schemas/generic** files don't should be removed:
    - ð«**schemas/generic/Id.yaml** file
    - ð«**schemas/generic/Error.yaml** file

  - Go to **schemas** and **override** (or remove) with **you requirements**:
    -  âï¸ Tag.yaml
    -  âï¸ YouBasicModel.yaml
    -  âï¸ YouModelCreate.yaml
    -  âï¸ YouModer.yaml

  - Go to **paths** and **override** (or remove) the folders with **you requirements**:
    -  âï¸ tag
    -  âï¸ you-basic-model
    -  âï¸ you-model

  - ð£ Delete step [Getting Started](#getting-started)

# ð Watcher

Follow this [guide](https://git.procesos.ctag.com/Paperless-API/docs/blob/master/watcher-ui-guide.md) or run this if you already have before:

    swagger-ui-watcher openapi.yaml

Alternative after generate bundle [editor.swagger.io](https://editor.swagger.io/)

# Shortcuts

Generate bundle

    swagger-cli bundle openapi.yaml --outfile swagger.yaml --type yaml

Generate Client

    java -jar swagger-generator-cli.jar generate -l jaxrs-jersey-seedstack -i swagger.yaml -o base-api-swagger-rest --template-engine mustache

ð¥ Backend Override -l with

    -l jaxrs-jersey-seedstack

ð Client Override -l with

    -l typescript-params-angular

__NOTE:__ please, do not commit with generated cli!