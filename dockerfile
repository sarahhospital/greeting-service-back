FROM openjdk:8-jdk-alpine

COPY ./build/libs/demo-0.0.1.jar demo.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/demo.jar"]