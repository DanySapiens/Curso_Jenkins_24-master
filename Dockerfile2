FROM maven:3-alpine
WORKDIR /appmavenjenkins
ADD . /appmavenjenkins
COPY target/my-app-1.0-SNAPSHOT.jar /appmavenjenkins/app.jar
EXPOSE 3000
CMD java -jar /appmavenjenkins/app.jar
