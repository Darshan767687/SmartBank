# Use Java 17
FROM eclipse-temurin:17-jdk

# Create app directory
WORKDIR /app

# Copy Maven build output
COPY target/*.jar app.jar

# Run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
