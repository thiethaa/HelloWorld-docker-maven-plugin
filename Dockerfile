FROM openjdk:latest
ARG JAR_FILE
ADD ${JAR_FILE} /helloworld-docker-maven-plugin.jar
ENTRYPOINT ["java","-jar","helloworld-docker-maven-plugin.jar"]