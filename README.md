# computelematic
SpringBoot Reactive Web Application



## Creacion de base de datos en docker

docker pull postgres 

docker run --name postgres_local -e POSTGRES_PASSWORD=admin.2024.db  -p 5432:5432 -d postgres

docker exec -it postgres_local bash

psql -U postgres --password

CREATE USER cmt_admin_user WITH PASSWORD 'Cmt.2024.db';

CREATE DATABASE computelematic_db;

GRANT ALL PRIVILEGES ON DATABASE computelematic_db TO cmt_admin_user;

## Generacion automatica de css con archivos sass

Se debe instalar node js en el computador 

luego instalar el paquete de sass 

npm install -g sass

ahora podremos con el siguiente comando dentro del proyecto indicar 
que archivo queremos monitorear para que automaticamente genere
el archivo css

sass --watch  src/main/resources/static/scss/:src/main/resources/static/css





