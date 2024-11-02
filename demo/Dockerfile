# Use a base image with JDK
FROM openjdk:17-jdk-alpine

# Set a working directory
# WORKDIR /app

# Copy the built JAR file from the Maven target directory to /app
COPY target/demo-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080 

# Run the application
# CMD ["java", "-jar", "app.jar"]
ENTRYPOINT ["java", "-jar", "app.jar"]

