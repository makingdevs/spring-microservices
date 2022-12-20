FROM node:16.10.0-slim AS build

ARG PATH_FOLDER

WORKDIR /app

COPY $PATH_FOLDER ./

RUN npm install

RUN npm run build --prod