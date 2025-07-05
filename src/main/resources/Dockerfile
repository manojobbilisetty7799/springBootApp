# Use a minimal base image with Java
FROM openjdk:17-jdk-slim

# Set app directory
WORKDIR /app

# Copy the JAR file (adjust if needed)
COPY target/*.jar app.jar

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
