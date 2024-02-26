# Base image
FROM selenium/standalone-chrome:latest

# Set working directory
#WORKDIR src

# Copy Maven dependencies file
#COPY pom.xml .
COPY . /dev/shm

WORKDIR /dev/shm
#
## Download dependencies
#RUN mvn dependency:go-offline -B
#
## Copy project source
#
## Build the project
#RUN mvn package -DskipTests
#
## Command to run the tests
#CMD ["mvn", "test"]
