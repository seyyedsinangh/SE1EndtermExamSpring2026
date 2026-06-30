FROM eclipse-temurin:21-jdk-jammy
WORKDIR /app
COPY . /app
RUN chmod +x mvnw || true
RUN ./mvnw -q -DskipTests package || mvn -q -DskipTests package
EXPOSE 8080
CMD ["java", "-jar", "target/*.jar"]
