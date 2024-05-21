# ApacheVelocityDemo

## Descripción

Este proyecto, llamado **ApacheVelocityDemo**, demuestra cómo leer datos externos y convertirlos en una estructura estándar utilizando Apache Velocity. La estructura de datos resultante se formatea de la siguiente manera:

```json
{
  "estado": "success",
  "mensaje": "Data retrieved successfully",
  "usuario": {
    "nombre": "John Doe",
    "edad": 30,
    "email": "john.doe@example.com"
  },
  "pedidos": [
    {
      "id": 1,
      "producto": "Shirt",
      "cantidad": 2,
      "precio_unitario": 25
    },
    {
      "id": 2,
      "producto": "Pants",
      "cantidad": 1,
      "precio_unitario": 35
    }
  ]
}
