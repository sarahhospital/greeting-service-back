FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ./build/libs/demo-0.0.1.jar demo.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/demo.jar"]