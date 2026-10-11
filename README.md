# Catálogo de Videojuegos - API REST con Spring Boot

Proyecto de backend desarrollado para la materia de Desarrollo Web Profesional.

## Requisitos previos
* Java 17
* PostgreSQL (Base de datos: `catalogo_videojuegos`)
* Spring Boot 3.x

## Configuración para ejecutar el proyecto
1. Clonar el repositorio en la máquina local.
2. Abrir el proyecto en el IDE (IntelliJ IDEA recomendado).
3. Actualizar el archivo `src/main/resources/application.properties` con las credenciales locales de PostgreSQL:
   - `spring.datasource.username=postgres`
   - `spring.datasource.password=TU_CONTRASEÑA`
4. Ejecutar la clase principal `ProyectoApplication.java`.
5. El servidor se iniciará en `http://localhost:8080`.

## Endpoints desarrollados (Primer Avance)
* `GET /hola`
* `GET /adios`
* Controladores base para Usuarios, Videojuegos y Reseñas.
