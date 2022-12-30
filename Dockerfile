FROM openjdk:17-alpine

COPY target/RM_myProject-0.0.1-SNAPSHOT.war app.war

ENTRYPOINT ["java","-jar","app.war"]