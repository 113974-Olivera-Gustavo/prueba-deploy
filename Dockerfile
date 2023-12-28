# Usa una imagen base con OpenJDK 17
FROM openjdk:17

# Copia el JAR
COPY target/lciii-scaffolding-0.0.1-SNAPSHOT.jar app.jar

# Comando de entrada para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
