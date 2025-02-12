FROM eclipse-temurin:21-jdk
ADD ./api-gateway/target/api-gateway.jar api-gateway.jar
EXPOSE 9001
ENTRYPOINT ["java","-jar","/api-gateway.jar"]