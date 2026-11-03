FROM gradle:9.8.2-jdk21

WORKDIR /java-project-99

RUN ./gradlew shadowJar --no-daemon

CMD ["java", "-jar", "build/libs/app-0.0.1-SNAPSHOT-all.jar"]