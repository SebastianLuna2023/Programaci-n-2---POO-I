
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

✨ **Objetivo:**  
Comprender el uso del operador `this` en la referencia al propio objeto y en la resolución de ambigüedades entre parámetros y atributos.

🧩 **Fragmento destacado:**
```java
public void setAlias(String alias) {
    if (alias != null) {
        this.alias = alias; // 'this' resuelve la ambigüedad
    }
}
```

---

### 2. Actividad Constructores
📂 Carpeta: `constructorjava/`

✨ **Objetivo:**  
Implementar constructores personalizados para inicializar objetos de forma segura y automatizada al momento de la instancia.

🧩 **Fragmento destacado:**
```java
public CuentaBancaria(String alias, String moneda, String tipo) {
    this.CBU = generarCBU();  // Llama a un método desde el constructor
    setAlias(alias);
    setMoneda(moneda);
    setTipo(tipo);
}
```

---

### 3. Actividad Sobrecarga de Constructores
📂 Carpeta: `sobrecargaconstructores/`

✨ **Objetivo:**  
Demostrar cómo crear múltiples constructores que inicialicen objetos de distintas formas, reutilizando lógica mediante llamadas entre constructores (`this(...)`).

🧩 **Fragmento destacado:**
```java
public CuentaBancaria(String moneda, String tipo) {
    this("ALIAS.POR.DEFECTO", moneda, tipo); // Reutiliza el constructor principal
}
```

---

### 4. Actividad Sobrecarga de Métodos
📂 Carpeta: `sobrecargametodos/`

✨ **Objetivo:**  
Aplicar el concepto de sobrecarga para definir múltiples versiones de un método que se adapten al número y tipo de parámetros.

🧩 **Fragmento destacado:**
```java
public void saludar(String nombrePersona) {
    System.out.println("Hola " + nombrePersona + ", soy" + nombre);
}

public void saludar() {
    saludar("extraño sobrecargado"); // Llama internamente al método sobrecargado
}
```

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

- Todos los ejemplos son simplificados para fines didácticos y educativos.
