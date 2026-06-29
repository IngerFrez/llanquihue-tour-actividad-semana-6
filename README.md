# LlanquihueTourApp - Semana 6

## Descripción del proyecto

Este proyecto corresponde a la actividad formativa de la Semana 6 de la asignatura Desarrollo Orientado a Objetos I.

El objetivo de esta semana es implementar una jerarquía de clases con herencia simple para representar los distintos servicios turísticos ofrecidos por la agencia Llanquihue Tour.

La solución considera una clase base llamada `ServicioTuristico`, desde la cual heredan tres subclases específicas: `RutaGastronomica`, `PaseoLacustre` y `ExcursionCultural`.

## Objetivo de la semana

Aplicar los conceptos de herencia simple, reutilización de atributos, uso de `super(...)` en constructores y sobrescritura del método `toString()` en subclases.

## Estructura del proyecto

El proyecto está organizado en los siguientes paquetes:

- `model`: contiene la jerarquía de clases del sistema.
- `data`: contiene la clase encargada de crear objetos de prueba.
- `ui`: contiene la clase principal que ejecuta el programa.

## Clases creadas

### ServicioTuristico

Clase base o superclase. Contiene los atributos comunes:

- `nombre`
- `duracionHoras`

### RutaGastronomica

Subclase de `ServicioTuristico`. Agrega el atributo:

- `numeroDeParadas`

### PaseoLacustre

Subclase de `ServicioTuristico`. Agrega el atributo:

- `tipoEmbarcacion`

### ExcursionCultural

Subclase de `ServicioTuristico`. Agrega el atributo:

- `lugarHistorico`

### GestorServicios

Clase ubicada en el paquete `data`. Su función es crear objetos de prueba de cada subclase y mostrar sus datos por consola.

### Main

Clase ubicada en el paquete `ui`. Ejecuta el programa llamando al método de prueba creado en `GestorServicios`.

## Instrucciones para ejecutar

1. Abrir el proyecto en NetBeans.
2. Verificar que las clases estén dentro de los paquetes `model`, `data` y `ui`.
3. Ejecutar la clase `Main`.
4. Revisar en consola la información de los servicios turísticos creados.

## Resultado esperado

Al ejecutar el programa, se deben mostrar por consola dos objetos de cada tipo de servicio turístico:

- Dos rutas gastronómicas.
- Dos paseos lacustres.
- Dos excursiones culturales.

Cada objeto muestra su información completa mediante el método `toString()`.
