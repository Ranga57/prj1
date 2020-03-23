FROM openjdk:8-jdk-alpine
COPY /var/lib/jenkins/workspace/mycertProj@2/target/calculateTax-0.0.1-SNAPSHOT.jar /app.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","/app.jar"]