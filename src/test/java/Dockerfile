FROM maven:3.8.6-openjdk-11
LABEL authors="sinan"
COPY . /usr/src/app
WORKDIR /usr/src/app
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src ./src
VOLUME /usr/src/app/test-reports
RUN mvn clean install
CMD ["mvn", "test"]
RUN mvn allure:report