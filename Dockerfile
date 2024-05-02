FROM maven:3.8.7-openjdk-18-slim as build
RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app
ADD . /usr/src/app
RUN mvn package

EXPOSE 8080

FROM eclipse-temurin:18-jdk
RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app
COPY --from=build /usr/src/app/target/EarthTech-API-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]

