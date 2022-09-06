# Crear API para bazar

## Necesidad:

Un bazar necesita de una aplicación que le permite realizar el ABML de cada uno de sus productos que tiene en stock.

Objetivo:
La creación de una API que, dependiendo del tipo de solicitud que reciba, permita hacer el alta, baja, modificación o lectura de los productos en una base de datos. Para ello tener en cuenta los siguientes endpoints:

1. Crear un nuevo producto
```
Método POST
localhost:8080/productos/crear
```
2. Ver la lista completa de productos
```
Métoto GET
localhost:8080/productos/traer
```
3. Eliminar un producto
```
Método: DELETE
Endpoint:  localhost:8080/productos/eliminar/{id}
```
4. Modificar un producto
```
Método: PUT
Endpoint: localhost:8080/productos/editar/{id}
```
5. Buscar un producto en particular
```
Método: GET
Endpoint:  Localhost:8080/productos/traer/{id}
```
Por otra parte, el bazar también necesita conocer su producto más caro y su producto más barato. Para ello necesita desarrollar endpoints que le permitan:

* Obtener el producto más barato.
* Obtener el producto más caro.
* Obtener todos los productos ordenados de más barato a más caro.
* Obtener todos los productos de más caro a más barato.
