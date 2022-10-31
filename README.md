# Tarea N°2 programacion II

Repositorio Tareas N°2 de la asignatura Programacion 2 S2-22 de la carrera Ingenieria Civil Informatica de la Universidad de Concepcion.

>Fecha de entrega **30 de octubre hasta las 23:59.**

<!-- agregar fotos del UML -->
## Enunciado

El trabajo consiste en crear un expendedor de bebidas, que cuenta con una entrada para monedas, un selector
numérico para elegir el tipo bebida y un retorno de bebida. Cada vez que se le ingresa una moneda y un número,
retorne siempre una bebida del tipo solicitado, si queda alguna en el depósito interno correspondiente, si no, la
devuelve como vuelto moneda.
Debe haber un comprador que compre una bebida, recupere todo el vuelto, beba, y responda si la bebió y cuanta
plata le devolvió expendedor

- Si la Bebida es más barata que el valor de la Moneda debe devolver la diferencia en monedas de $100 como vuelto.
- Si no hay Bebidas, devuelve la misma Moneda como vuelto. Debe utilizar una excepción personalizada (NoHayBebidaException)
- Si se quiere comprar una Bebida por un valor inferior al precio, solo devuelve la misma Moneda como vuelto. Debe utilizar una excepción personalizada (PagoInsuficienteException)
- Si se quiere comprar Bebidas sin dinero (moneda null) no retorna vuelto, ni bebida. Debe utilizar una excepción personalizada (PagoIncorrectoException)

## Grafico UML


![UML](Recursos\GraficoUML.png)

## Autores

- [@PabloSanhueza1](https://github.com/PabloSanhueza1) Pablo Sanhueza Yévenes
- [@TheAmazingLife](https://github.com/TheAmazingLife) Joaquin San Martín Vargas

![Imagen Duo](Recursos/ImagenDuo.png)
