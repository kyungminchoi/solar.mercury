FROM node:14 AS build

WORKDIR /app

COPY ./istio-webapp-angular/package*.json ./

RUN npm install

COPY ./istio-webapp-angular/ ./

RUN npm run build

FROM nginx:1.14.0-alpine

MAINTAINER Richard Chesterwood "richard@inceptiontraining.co.uk"

RUN rm -rf /usr/share/nginx/html/*

COPY --from=build /app/dist /usr/share/nginx/html

COPY ./istio-webapp-angular/nginx.conf /etc/nginx/

CMD ["nginx", "-g", "daemon off;"]
