FROM eclipse-temurin:21-jdk
ADD ./departement-service/target/departement-service.jar departement-service.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/departement-service.jar"]