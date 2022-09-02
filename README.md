### Descripción
1. Se requiere crear un microservicio REST que me permita consultar la información básica de un cliente.
Condiciones del servicio:

- Es indispensable el manejo de códigos http en la respuesta (dentro del código es necesario evidenciar el manejo de los siguientes 400, 404, 500 y 200).
- Los únicos datos de entrada del servicio son tipo y número de documento, ambos son obligatorios y para tipo de documento son únicamente válidos los tipos C (cédula de
ciudadanía) y P (Pasaporte).
- Los datos que debe retornar el servicio son: (Deben estar “quemados”)
`✓ Primer nombre
✓ Segundo nombre
✓ Primer apellido
✓ Segundo apellido
✓ Teléfono
✓ Dirección
✓ Ciudad de residencia`
- El puerto por el cual debe iniciar la aplicación es 8090.
- Indispensable usar Spring y Maven.
- Son entregables el JAR de la aplicación y el código fuente.
### PUNTOS RELEVANTES:
`✓ Los datos de respuesta son mockeados, es decir solo se retornara información para el cliente identificado con Cedula de ciudadanía 23445322.
✓ Son valores agregados pero no obligatorios manejo de log de la aplicación, pruebas unitarias y calidad de código.
✓ Puede utilizar el Ide de desarrollo que se sienta más cómodo.
✓ Se tendrá una sesión de 15 a 30 minutos para sustentar la prueba técnica`
