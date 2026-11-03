FROM gradle:9.8.2-jdk21

WORKDIR /java-project-99

COPY . .

RUN ./gradlew bootJar --no-daemon

CMD ["java", "-jar", "build/libs/app-0.0.1-SNAPSHOT.jar"]