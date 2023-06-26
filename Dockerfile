FROM openjdk:8

#Information around who maintains the image
MAINTAINER saivivekgorkal

# Add the application's jar to the container
COPY target/Accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

#execute the application
ENTRYPOINT ["java","-jar","/accounts-0.0.1-SNAPSHOT.jar"]