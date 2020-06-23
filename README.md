# 🏡 Base API

This project is created with [🏡Base-API](https://git.procesos.ctag.com/Paperless-API/base-api) using [OpenAPI 3.0 Specification](https://swagger.io/docs/specification/about/) and [📘 CTAG Standard](https://git.procesos.ctag.com/Paperless-API/docs)

### Master

[![Build Status](https://jenkins.procesos.ctag.com/buildStatus/icon?job=API/base-api/master)](https://jenkins.procesos.ctag.com/job/API/job/pet-store/job/master/)

### Develop

[![Build Status](https://jenkins.procesos.ctag.com/buildStatus/icon?job=API/base-api/develop)](https://jenkins.procesos.ctag.com/job/API/job/pet-store/job/develop/)

# 📖 Table of Contents

- [Overview](#overview)
- [Getting Started](#getting-started)
- [👀 Watch](#👀-watch)
- [Shortcuts](#shortcuts)

# Overview

🏡 Base-API is a swagger project created following the [📘 CTAG Standard](https://git.procesos.ctag.com/Paperless-API/docs). You can **clone** and **edit** all examples with your own requirements

# Getting Started

- It is recommended that you first learn how to do API with [📘 Ctag Standard](https://git.procesos.ctag.com/Paperless-API/docs).

- This API is splitted in multiple yaml files, is recommended that you check [✂️ Split Swagger Standard - Guide ✂️](https://git.procesos.ctag.com/Paperless-API/docs/edit/master/split-guide.md) at least

- Clone the repository

        git clone https://git.procesos.ctag.com/git/Paperless-API/base-api.git

- ✍ Replace (ctrl+f **Base API**) (ctrl+f **base-api**) with your own project name

- ✏️ Update in README.md the [Overview](#Overview) headland

- Rules
  - This generic folders don't should be removed:
    - 🚫 **parameters/pagination** folder
    - 🚫 **responses/generic** folder

  - This generic files don't should be removed:
    - 🚫**schemas/Error.yaml** file

- Go to **schemas** and **override** (or remove) with **you requirements**:
  -  ✏️ Tag.yaml
  -  ✏️ YouBasicModel.yaml
  -  ✏️ YouModelCreate.yaml
  -  ✏️ YouModer.yaml

- Go to **paths** and **override** (or remove) the folders with **you requirements**:
  -  ✏️ tag
  -  ✏️ you-basic-model
  -  ✏️ you-model

- 💣 Delete step [Getting Started](#getting-started)

# 👀 Watch

Follow this [guide](https://git.procesos.ctag.com/Paperless-API/docs/blob/master/watcher-ui-guide.md) or run this if you already have before:

    swagger-ui-watcher openapi.yaml

Alternative after generate bundle [editor.swagger.io](https://editor.swagger.io/)

# Shortcuts

Generate bundle

    swagger-cli bundle openapi.yaml --outfile swagger.yaml --type yaml

Generate Client

    java -jar swagger-generator-cli.jar generate -l jaxrs-jersey-seedstack -i swagger.yaml -o base-api-swagger-rest --template-engine mustache

🖥 Backend Override -l with

    -l jaxrs-jersey-seedstack

🌍 Client Override -l with

    -l typescript-params-angular

__NOTE:__ please, do not commit with generated cli!