# Use the official OpenJDK image as base image
FROM openjdk:20

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the build target directory into the container
COPY target/dockerexample-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that your Spring Boot application will run on
EXPOSE 8080

# Command to run the Spring Boot application when the container starts
CMD ["java", "-jar", "app.jar"]
