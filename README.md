# 📚 Sistema de Gestión de Préstamos de Biblioteca

Un sistema orientado a objetos desarrollado en Java que simula la gestión de préstamos de libros dentro de una biblioteca, controlando la disponibilidad de los ejemplares e imprimiendo un comprobante cuando el préstamo es exitoso.

---

## 🏗️ Arquitectura y Clases

El proyecto está diseñado bajo los principios de la **Programación Orientada a Objetos (POO)** y se compone de las siguientes clases principales:

*   **`Libro`**: Representa un libro con sus atributos esenciales (`titulo`, `autor` y el estado del libro `disponibilidad`).
*   **`Socio`**: Representa al usuario que solicita el libro, registrando su `nombre` y `numeroSocio`.
*   **`ComprobantePrestamo`**: Genera e imprime el resumen con los datos del socio y del libro cuando una transacción se concreta de manera correcta.
*   **`Biblioteca`**: Contiene la lógica de negocio principal para procesar préstamos. Verifica la disponibilidad del libro y actualiza su estado si está disponible.
*   **`Main`**: Punto de entrada de la aplicación donde se instancian los objetos y se simulan diferentes casos de uso.

---

## 🔄 Flujo de Funcionamiento

```text
[Inicio: Solicitud de Préstamo]
             │
             ▼
   ¿Libro disponible?
    /               \
 (Sí)               (No)
  │                   │
  ├── Cambia estado   └── Muestra: "Préstamo no disponible"
  │   a no disponible     Retorna `null`
  │
  └── Genera e imprime
      `ComprobantePrestamo`
