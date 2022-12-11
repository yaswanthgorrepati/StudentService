FROM openjdk:8-jdk-alpine
COPY ./target/StudentService-0.0.1-SNAPSHOT.jar StudentService-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","StudentService-0.0.1-SNAPSHOT.jar"]