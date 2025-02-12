# Challenge Red Link - Backend

Este repositorio contiene el desarrollo del MVP de una API para la gestión de préstamos en el sistema RedLink. Su objetivo es implementar la siguiente funcionalidad:

- Dar acceso a empleados mediante una autenticación con número de DNI.
- Consultar el monto del préstamo disponible para los usuarios logueados.
- Generar un reporte diario de los usuarios que visualizaron el préstamo disponible.

## Casos de uso principales:

- **DNI no reconocido:** El usuario no puede acceder al sistema.
- **DNI válido sin préstamo asociado:** Se mostrará un mensaje indicando que no hay crédito disponible.
- **DNI válido con préstamo disponible:** Se mostrará el monto del préstamo disponible.

## Diagrama de flujo
![Diagrama de flujo](https://github.com/user-attachments/assets/fcacdb67-6655-43d0-9ac2-e6854f1d101c)


## Como ejecutar este proyecto en local

- Abrir una terminal y ejecutar el siguiente comando para clonar el proyecto en tu máquina:
```
git clone https://github.com/Siebenlist/Challenge-Backend-Link
```
- Acceder a la carpeta del proyecto
```
cd carpeta-proyecto
```
- Instalar las dependencias
```
mvn clean install
```
- Ejectuar el proyecto
```
mvn spring-boot:run
```
