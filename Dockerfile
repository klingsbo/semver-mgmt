FROM openjdk:17-alpine
COPY build/libs/semver-mgmt-*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
