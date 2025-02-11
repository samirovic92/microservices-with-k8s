FROM eclipse-temurin:21-jdk
ADD ./user-service/target/user-service.jar user-service.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/user-service.jar"]