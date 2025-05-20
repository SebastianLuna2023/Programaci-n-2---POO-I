# Ejercitaciones Java - Programación Orientada a Objetos

Este repositorio contiene una serie de ejercicios prácticos desarrollados en Java que aplican los conceptos fundamentales de la **Programación Orientada a Objetos (POO)**, tales como el uso de `this`, constructores, sobrecarga de constructores y sobrecarga de métodos.

---

## 🔧 Tecnologías Utilizadas

- Java SE
- NetBeans IDE
- JDK 17+

---

## 📁 Estructura del Proyecto

```plaintext
ejercitacion/
├── avtividadthis/
│   ├── CuentaBancaria.java
│   └── AvtividadThis.java
├── constructorjava/
│   ├── CuentaBancaria.java
│   └── ConstructorJava.java
├── sobrecargaconstructores/
│   ├── CuentaBancaria.java
│   └── SobrecargaConstructores.java
└── sobrecargametodos/
    ├── Robot.java
    └── SobrecargaMetodos.java
```

---

## 📌 Actividades

### 1. Actividad `this`
📂 Carpeta: `avtividadthis/`

- Se demuestra el uso del operador `this` para:
  - Diferenciar atributos de parámetros locales.
  - Pasarse a sí mismo como referencia.
- Se muestra cómo evitar ambigüedades al acceder a atributos de instancia.

### 2. Actividad Constructores
📂 Carpeta: `constructorjava/`

- Implementación de constructores:
  - Constructor por defecto (sin parámetros).
  - Constructor parametrizado.
- Se inicializan atributos con valores iniciales y se invoca a métodos desde el constructor.

### 3. Actividad Sobrecarga de Constructores
📂 Carpeta: `sobrecargaconstructores/`

- Se implementan múltiples constructores con diferente número de parámetros.
- Se reutiliza código llamando a un constructor desde otro mediante `this(...)`.

### 4. Actividad Sobrecarga de Métodos
📂 Carpeta: `sobrecargametodos/`

- Se demuestra la sobrecarga del método `saludar`.
- Una versión recibe el nombre de la persona, otra no recibe parámetros y llama a la versión generalizada.

---

## ✅ Conceptos Clave Aplicados

- `this`: uso para referencias internas al objeto.
- Constructores: definición e inicialización de atributos.
- Sobrecarga de constructores: múltiples formas de construir objetos.
- Sobrecarga de métodos: diferentes comportamientos según parámetros.
- Encapsulamiento y uso de métodos `get` y `set`.

---

## 📸 Ejemplo de Salida

```plaintext
CBU GENERADO AUTO miAlias 0.0 Precios Caja de ahorros
null null 0.0 null null
CBU GENERADO AUTO ALIAS.POR.DEFECTO 0.0 DOLARES CAJA DE AHORROS
Hola Seba, soyJavaBot
Hola extraño sobrecargado, soyJavaBot
```

---

## 🧠 Autor

- **Nombre**: *Sebastián Luna*
- **Curso**: Programación Orientada a Objetos – Java
- **Institución**: *UTN FRM*
- **Año**: 2025

---

## 📌 Notas

- Todos los ejemplos son simplificados para fines didácticos.

