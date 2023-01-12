FROM amazoncorretto:19-alpine-jdk

MAINTAINER elkebarrios

COPY target/Sprintboot4-0.0.1-SNAPSHOT.jar Sprintboot4-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","/Sprintboot4-0.0.1-SNAPSHOT.jar"]



