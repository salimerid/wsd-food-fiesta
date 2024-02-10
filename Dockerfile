FROM openjdk:17.0.1
ARG JAR_FILE=target/*.jar
COPY ./target/wsd-food-fiesta-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT["java", "-jar", "/app.jar"]