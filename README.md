# computelematic
SpringBoot Reactive Web Application

## Creacion de base de datos en docker

docker pull postgres 

docker run --name postgres_local -e POSTGRES_PASSWORD=contraseña_principal_de_postgres  -p 5432:5432 -d postgres

docker exec -it postgres_local bash

psql -U postgres --password

CREATE USER usuario_de_base_de_datos WITH PASSWORD 'contraseña_de_usuario';

CREATE DATABASE nombre_de_base_de_datos;

GRANT ALL PRIVILEGES ON DATABASE nombre_de_base_de_datos TO usuario_de_base_de_datos;

## Generacion automatica de css con archivos sass

Se debe instalar node js en el computador 

luego instalar el paquete de sass 

npm install -g sass

ahora podremos con el siguiente comando dentro del proyecto indicar 
que archivo queremos monitorear para que automaticamente genere
el archivo css

sass --watch  src/main/resources/static/scss/:src/main/resources/static/css

## Creacion manual de imagen docker

Generacion de imagen
docker build -t computelematic-app:1.0 .

Generacion de contenedor
docker run -d -p 1111:1111 --restart=always -t computelematic-app:1.0


