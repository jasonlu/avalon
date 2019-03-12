FROM nginx:1.15

RUN rm -rf /usr/share/nginx/html/*

COPY /docker/nginx-default.conf /etc/nginx/conf.d/default.conf
COPY /dist/client-ng /usr/share/nginx/html

EXPOSE 80

# ENTRYPOINT ["java", "-jar", "./algorithm-server.jar"]
## Launch the wait tool and then your application
