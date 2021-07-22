# FROM openjdk:11 AS bulider
# COPY gradlew .
# COPY gradle gradle
# COPY build.gradle .
# COPY settings.gradle .
# COPY src src
# RUN chmod +x ./gradlew
# RUN ./gradlew bootJar

FROM openjdk:11
# COPY --from=builder build/libs/*.jar app.jar

VOLUME /tmp
EXPOSE 7272
ARG JAR_FILE=build/libs/demo-0.0.1.jar
ADD ${JAR_FILE} to-do-springboot.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/.urandom","-jar","/app.jar"]

