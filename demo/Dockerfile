FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY target/geolocation-service.jar geolocation-service.jar
ENTRYPOINT ["java", "-jar", "/geolocation-service.jar"]
