# Challenge Red Link - Backend

Este repositorio contiene el desarrollo del MVP de una API para la gestión de préstamos en el sistema RedLink. Su objetivo es implementar la siguiente funcionalidad:

- Dar acceso a empleados mediante una autenticación con número de DNI.
- Consultar el monto del préstamo disponible para los usuarios logueados.
- Generar un reporte diario de los usuarios que visualizaron el préstamo disponible.

## Casos de uso principales:

- **DNI no reconocido:** El usuario no puede al sistema.
- **DNI válido sin préstamo asociado:** Se mostrará un mensaje indicando que no hay crédito disponible.
- **DNI válido con préstamo disponible:** Se mostrará el monto del préstamo disponible.

## Importación para postman

```
{
	"info": {
		"_postman_id": "c07c33c7-fa44-4a82-9846-fcbfcbd0b497",
		"name": "Endpoint Tests",
		"schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json",
		"_exporter_id": "28958399"
	},
	"item": [
		{
			"name": "Autenticar empleado",
			"request": {
				"method": "GET",
				"header": []
			},
			"response": []
		},
		{
			"name": "Listar usuarios",
			"request": {
				"method": "GET",
				"header": []
			},
			"response": []
		}
	]
}
```
