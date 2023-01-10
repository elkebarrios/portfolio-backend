FROM amazoncorretto:17-alpine-jdk

MAINTAINER elkebarrios

COPY target/Sprintboot4.jar Sprintboot4.jar

ENTRYPOINT ["java","-jar","/Sprintboot4.jar"]

