FROM amazoncorretto:11-alpine-jdk

MAINTAINER elkebarrios

COPY target/hcc.jar Sprintboot4.jar

ENTRYPOINT ["java","-jar","/Sprintboot4.jar"]
