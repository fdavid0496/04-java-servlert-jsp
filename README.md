## Laboratorio 4 — Aplicación Web Dinámica MVC con JSP y Servlets (Jakarta + Tomcat + MySQL)

Este proyecto implementa una aplicación web Java con el patrón **MVC (Modelo–Vista–Controlador)** para listar información de países desde una base de datos **MySQL** y mostrarla en una vista **JSP**.

### Temas aprendidos / aplicados

* **Patrón MVC en Java Web**

  * **Modelo:** entidad `Pais` + acceso a datos mediante **DAO**.
  * **Controlador:** **Servlet** que recibe la petición (POST), consulta datos y los envía a la vista.
  * **Vista:** **JSP** que renderiza dinámicamente la tabla.
* **Conexión a base de datos MySQL con JDBC**

  * Configuración de URL, credenciales y uso de `DriverManager`.
* **Uso de JSTL para renderizado dinámico**

  * Iteración de listas con `<c:forEach>` y salida segura con `<c:out>`.
* **Despliegue en servidor**

  * Ejecución del proyecto en **Tomcat** con Java **21 LTS** y entorno **Jakarta EE**.

---

## Script SQL (MySQL)

```sql
-- 1) Crear BD
CREATE DATABASE IF NOT EXISTS lab_software_iii_paises_db
  CHARACTER SET utf8mb4
  COLLATE utf8mb4_unicode_ci;

USE lab_software_iii_paises_db;

-- 2) Crear tabla
CREATE TABLE IF NOT EXISTS pais (
  idpais INT NOT NULL,
  nombre VARCHAR(50) NOT NULL,
  capital VARCHAR(50) NOT NULL,
  CONSTRAINT pais_pkey PRIMARY KEY (idpais)
);

-- 3) Insertar datos (máx 5 ejemplos)
INSERT INTO pais (idpais, nombre, capital) VALUES
(1, 'Colombia', 'Bogotá'),
(2, 'Perú', 'Lima'),
(3, 'Ecuador', 'Quito'),
(4, 'Chile', 'Santiago'),
(5, 'Argentina', 'Buenos Aires');
```

---
