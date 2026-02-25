# 📦 Product Management - Java Class Project

## 📖 Descripción

Este proyecto consiste en la creación de una clase en Java llamada `Product`, que representa una entidad del mundo real.  

El objetivo es aplicar correctamente los conceptos fundamentales de la Programación Orientada a Objetos (POO), incluyendo:

- Encapsulamiento
- Constructores (por defecto y parametrizado)
- Métodos getter y setter
- Sobrescritura del método `toString()`
- Uso de una clase `Main` para demostrar la funcionalidad

---

## 🏗️ Estructura del Proyecto

El proyecto contiene los siguientes archivos:

- `Product.java` → Clase principal que representa el producto.
- `Main.java` → Clase de demostración con el método `main`.
- `README.md` → Documento descriptivo del proyecto.

---

## 🧩 Clase Product

La clase `Product` contiene los siguientes atributos:

- `private String id;`
- `private String name;`
- `private double price;`
- `private int stock;`

### 🔹 Constructores

**1. Constructor por defecto**
- Inicializa los atributos con valores predeterminados:
  - `null` para Strings
  - `0.0` para double
  - `0` para int

**2. Constructor parametrizado**
- Permite inicializar todos los atributos al momento de crear el objeto.

---

### 🔹 Métodos Implementados

- Métodos getter para cada atributo (`getId()`, `getName()`, etc.).
- Métodos setter para actualizar los valores (`setId()`, `setPrice()`, etc.).
- Validaciones básicas en los setters:
  - `price` no puede ser negativo.
  - `stock` no puede ser negativo.
- Sobrescritura del método `toString()` para mostrar una representación clara del objeto.

Ejemplo:

```java
Product [ID: P123, Name: Laptop, Price: 1200.0, Stock: 50]