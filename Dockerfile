FROM openjdk:17-jdk-slim-buster
LABEL maintainer=chengziyu

COPY target/*.jar   /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]