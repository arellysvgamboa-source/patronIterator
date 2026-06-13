# Patrón de Diseño Iterator - Sistema Financiero Inmobiliario

## Descripción del Proyecto

Se desarrolló un sistema para el área financiera de la inmobiliaria **Los Portales SAC**. El sistema permite visualizar los pagos realizados por los clientes y recorrer la colección de transacciones mediante la implementación del patrón de diseño **Iterator**.

El objetivo principal es que el encargado de finanzas pueda revisar los pagos registrados sin acceder directamente a la estructura interna donde se almacenan los datos.

---

## Contexto

La inmobiliaria registra periódicamente los pagos de alquiler o compra de inmuebles realizados por sus clientes. Cada cliente puede tener múltiples pagos asociados, los cuales contienen información relevante como:

* Cliente
* DNI
* Teléfono
* Fecha de pago
* Monto
* Estado del pago

Debido al crecimiento constante de los registros financieros, se requiere una forma organizada de recorrer la información para identificar rápidamente las transacciones que necesitan atención.

---

## Patrón de Diseño Utilizado

### Iterator

El patrón Iterator permite recorrer una colección de objetos sin exponer la estructura interna utilizada para almacenarlos.

En este proyecto, el Iterator recorre la colección de pagos uno por uno y devuelve la información al encargado de finanzas de forma ordenada.

---

## Algoritmo de Recorrido

Se implementó un algoritmo de recorrido basado en prioridad financiera.

### Orden de prioridad

1. Vencido
2. Pendiente
3. Pagado

Esto permite que el área financiera visualice primero los pagos más críticos para la empresa.

### Ejemplo

Si existen los siguientes pagos:

| Cliente      | Estado    |
| ------------ | --------- |
| Ana Torres   | Pagado    |
| Carlos Pérez | Vencido   |
| Juan López   | Pendiente |

El Iterator devolverá:

1. Carlos Pérez (Vencido)
2. Juan López (Pendiente)
3. Ana Torres (Pagado)

---

## Justificación

Se eligió el recorrido por prioridad porque el área financiera necesita atender primero aquellos pagos que representan un riesgo para la empresa.

Los pagos vencidos requieren acciones inmediatas de cobranza, los pendientes necesitan seguimiento y los pagados únicamente sirven como referencia histórica.

Gracias al patrón Iterator, este criterio de recorrido puede implementarse sin modificar la estructura interna de almacenamiento.

---

## Estructura del Proyecto

```text
src/
│
├── modelo/
│   ├── Cliente.java
│   └── Pago.java
│
├── iterator/
│   ├── IteratorPago.java
│   └── IteratorPorPrioridad.java
│
├── coleccion/
│   └── ColeccionPagos.java
│
└── app/
    └── Main.java
```

---

## Clases Principales

### Cliente

Representa a los clientes registrados en la inmobiliaria.

Atributos:

* dni
* nombre
* telefono

---

### Pago

Representa una transacción financiera.

Atributos:

* cliente
* monto
* fechaPago
* estado

---

### IteratorPago

Interfaz que define los métodos:

* hasNext()
* next()

---

### PagoPorPrioridad

Implementa el algoritmo de recorrido basado en prioridad financiera.

---

### ColeccionPagos

Contiene todos los pagos registrados y genera el Iterator correspondiente.

---

### Main

Contiene el menú principal utilizado por el encargado de finanzas.

---

## Funcionamiento

1. El sistema carga clientes y pagos.
2. El encargado de finanzas selecciona la opción "Ver pagos por prioridad".
3. Se crea un Iterator.
4. El Iterator recorre todos los pagos.
5. Los pagos son mostrados siguiendo el criterio:

```text
Vencido → Pendiente → Pagado
```

---

## Resultados

<img width="569" height="334" alt="image" src="https://github.com/user-attachments/assets/d63c752b-9c9a-42ff-aca8-93e84ada5b34" />
<img width="569" height="347" alt="image" src="https://github.com/user-attachments/assets/5c3d080c-d426-404a-a9f8-a8348e5eabbf" />
<img width="571" height="375" alt="image" src="https://github.com/user-attachments/assets/ec666e27-95f3-45e2-aaac-d12eee1c58cd" />
<img width="571" height="295" alt="image" src="https://github.com/user-attachments/assets/c5bce0c2-0983-4aa5-833e-33ce62d72fa6" />
<img width="572" height="190" alt="image" src="https://github.com/user-attachments/assets/2fc27052-d981-4a9d-b91b-59e3ee5b99e7" />

## Autor
Arellys Villena Gamboa.

id:000292454
