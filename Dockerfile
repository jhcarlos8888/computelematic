

# Usar una imagen base con JDK 17 y Gradle
FROM gradle:8.5.0-jdk17 AS build

LABEL version="1.0.0" authors="tecnologia" maintainer="info@computelematic.net" description="Aplicacion web"

# Establecer un directorio de trabajo
WORKDIR /app

# Copiar archivos de tu proyecto al directorio de trabajo
COPY . /app

# Ejecutar Gradle para construir el proyecto
RUN gradle clean build

# Crear una nueva imagen basada en OpenJDK 17
FROM openjdk:17-ea-17-jdk-slim

# Exponer el puerto que utilizará la aplicación
EXPOSE 1111

# Copiar el archivo JAR construido desde la etapa anterior
COPY --from=build /app/build/libs/computelematic-0.0.1-SNAPSHOT.jar /app/computelematic-app.jar

ENV JAVA_OPTS="-XX:+UseContainerSupport -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=dev"

# Establecer el punto de entrada para ejecutar la aplicación
#ENTRYPOINT ["java", "-jar", "/app/computelematic-app.jar"]
ENTRYPOINT ["sh","-c","java $JAVA_OPTS -jar /app/computelematic-app.jar"]

