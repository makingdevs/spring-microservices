FROM node:16.10.0-slim AS build

ARG PATH_FOLDER

WORKDIR /app

COPY $PATH_FOLDER ./

RUN npm install

RUN npm run prod-build

FROM nginx:alpine AS app

COPY --from=build /app/nginx.conf /etc/nginx/nginx.conf

COPY --from=build /app/dist/web-app /usr/share/nginx/html