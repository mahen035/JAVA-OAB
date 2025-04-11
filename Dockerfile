FROM openjdk:17-jdk-slim
MAINTAINER abc@mail.com
WORKDIR /app
EXPOSE 8080
COPY /target/product-service.jar /app/product-service.jar
ENTRYPOINT ["java","-jar","product-service.jar"]