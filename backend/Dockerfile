# Use Gradle image to build the Spring Boot app
FROM gradle:7.4.2-jdk17 AS backend

WORKDIR /app

# Copy the project files
COPY . .

# Package the application using Gradle
RUN ./gradlew build -x test

# Use OpenJDK to run the Spring Boot app
FROM openjdk:17-jdk-slim

# Set the working directory in the container
WORKDIR /app

# Copy the packaged JAR file from the build stage
COPY --from=backend /app/build/libs/*.jar app.jar

# Expose the port that Spring Boot runs on
EXPOSE 8086

# Run the application
ENTRYPOINT ["java","-jar","/app/app.jar"]
