FROM openjdk:8-stretch

## Add the wait script to the image
ADD https://github.com/ufoscout/docker-compose-wait/releases/download/2.5.0/wait /usr/local/bin/wait
RUN chmod +x /usr/local/bin/wait

# Deploy our war file to the Tomcat
COPY /build/libs/algorithm-server-0.0.1.jar /usr/local/bin/algorithm-server.jar

WORKDIR /usr/local/bin

EXPOSE 8080

# ENTRYPOINT ["java", "-jar", "./algorithm-server.jar"]
## Launch the wait tool and then your application
CMD /usr/local/bin/wait && java -jar ./algorithm-server.jar