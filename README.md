# 📚 Sistema de Préstamo de Libros en Java (POO)

Este proyecto es una simulación sencilla de un sistema de biblioteca implementado en Java. Su objetivo es poner en práctica los conceptos fundamentales de la **Programación Orientada a Objetos (POO)** mediante la interacción de objetos en memoria (sin uso de bases de datos ni persistencia).

---

## 🧩 Clases y Modelado de Objetos

El sistema modela el dominio del problema dividiendo las responsabilidades en 5 clases:

*   **`Libro`**: Clase entidad que almacena la información del libro (`titulo`, `autor`) y mantiene el estado de su disponibilidad (`disponibilidad`).
*   **`Socio`**: Clase entidad que almacena los datos básicos del usuario (`nombre`, `numeroSocio`).
*   **`Biblioteca`**: Contiene la **lógica de negocio**. Recibe los objetos `Libro` y `Socio` para verificar el estado de disponibilidad y realizar la transacción.
*   **`ComprobantePrestamo`**: Clase encargada de asociar un libro con un socio e imprimir el resumen del préstamo si este fue exitoso.
*   **`Main`**: Clase ejecutable para probar la instanciación de objetos y la lógica del programa.

---

## ⚙️ Lógica de Control de Estado

El flujo del programa demuestra cómo los objetos cambian su estado interno en tiempo de ejecución:

1. **Préstamo Exitoso:** Si `libro.disponibilidad` es `true`:
   * Se muta el atributo del objeto a `false`.
   * Se crea e instancia un nuevo objeto `ComprobantePrestamo`.
2. **Préstamo Fallido:** Si `libro.disponibilidad` es `false`:
   * Se imprime un mensaje de error por consola.
   * La función retorna `null` para indicar que no se pudo generar el comprobante.

---

## 💻 Ejemplo de Ejecución

Resultado por consola al ejecutar el método `main`:

```text
=============== Prestamo 1 ===============
Prestamo exitoso
Socio: Alex
Número de socio: 1
Libro: El Principito
Autor: Antoine de Saint-Exupery
=============== Prestamo 2 ===============
Prestamo no disponible
No se pudo realizar el comprobante pestamo
