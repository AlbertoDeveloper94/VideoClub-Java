# 🎬 Videoclub App (Java + JDBC)

Aplicación de consola desarrollada en Java que permite gestionar un catálogo de películas utilizando una base de datos relacional.

---

## 🚀 Funcionalidades

* ➕ Añadir nuevas películas a la base de datos
* 📋 Listar todas las películas almacenadas
* 🔗 Conexión a base de datos mediante JDBC
* 🧱 Arquitectura por capas (View, Controller, Repository, Model)

---

## 🧱 Estructura del Proyecto

```
org.videoclub
│
├── config
│   └── DBManager.java          # Gestión de conexión a la BD
│
├── model
│   └── Movie.java              # Entidad película
│
├── repository
│   └── MovieRepository.java    # Acceso a datos (JDBC)
│
├── controller
│   └── MovieController.java    # Lógica de negocio
│
├── view
│   └── MovieView.java          # Interacción con usuario (consola)
│
└── Main.java                   # Punto de entrada
```

---

## 🗄️ Base de Datos

### Crear tabla `movies`

```sql
CREATE TABLE movies (
    id INT AUTO_INCREMENT PRIMARY KEY,
    year INT NOT NULL,
    duration INT NOT NULL,
    title VARCHAR(255) NOT NULL,
    director VARCHAR(255),
    sinopsis TEXT,
    language VARCHAR(100),
    genre VARCHAR(100),
    rating DOUBLE
);
```

---

## ⚙️ Configuración

### 1. Base de datos

Asegúrate de tener MySQL en ejecución.

### 2. Configurar conexión

En `DBManager.java`:

```java
private static final String URL = "jdbc:mysql://localhost:3306/videoclub";
private static final String USER = "root";
private static final String PASSWORD = "tu_password";
```

---

## ▶️ Ejecución

1. Compilar el proyecto
2. Ejecutar `Main.java`

---

## 💻 Ejemplo de uso

```
Escriba el título de la película:
Inception

Escriba el año de la película:
2010

Escriba el director:
Christopher Nolan
...
```

---

## ⚠️ Problemas comunes

### ❌ Error de conexión

* Revisar usuario y contraseña
* Revisar URL JDBC
* Verificar que la BD esté encendida

---

### ❌ Columnas no encontradas

Asegúrate de que la tabla coincide exactamente con los nombres:

```
year, duration, title, director, sinopsis, language, genre, rating
```

---

## 🧠 Buenas prácticas aplicadas

* Uso de `PreparedStatement` (evita SQL Injection)
* Uso de `try-with-resources` (cierre automático de conexiones)
* Separación por capas (MVC simplificado)
* Código modular y mantenible

---

## 🔧 Mejoras futuras

* ✏️ Actualizar y eliminar películas
* 🔍 Buscar por título o género
* 🌐 Interfaz gráfica (JavaFX / Swing)
* 🚀 Migración a Spring Boot + JPA

---

## 👨‍💻 Autor

Proyecto educativo para práctica de JDBC y arquitectura básica en Java.

Factoria F5.

Alberto Garcia Poncet

---

## 📄 Licencia

Uso libre para aprendizaje.
