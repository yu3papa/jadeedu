FROM openjdk:8-alpine

COPY target/weather-0.0.1-SNAPSHOT.jar /app.jar
EXPOSE 8080
WORKDIR /

CMD java -jar app.jar