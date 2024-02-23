FROM openjdk:21-slim
COPY build/libs/semver-mgmt-*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
