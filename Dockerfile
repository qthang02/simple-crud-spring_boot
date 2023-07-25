FROM openjdk:22-oraclelinux7
WORKDIR /app
COPY .mvn .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline
COPY src src
CMD ["./mvnw", "spring-boot:run"]