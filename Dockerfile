# Use a lightweight image for running the application
FROM amazoncorretto:21
WORKDIR /app
COPY target/PersonalBudgetTracker-0.0.1-SNAPSHOT.jar /app
#EXPOSE 80
ENTRYPOINT ["java", "-jar", "PersonalBudgetTracker-0.0.1-SNAPSHOT.jar"]
