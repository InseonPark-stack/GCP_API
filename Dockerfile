FROM openjdk:11
VOLUME /tmp
EXPOSE 7272
ARG JAR_FILE=build/libs/demo-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} to-do-springboot.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/.urandom","-jar","/to-do-springboot.jar"]