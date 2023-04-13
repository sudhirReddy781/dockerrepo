FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD data-service/target/data-service-*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
