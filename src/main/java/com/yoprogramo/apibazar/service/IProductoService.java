package com.yoprogramo.apibazar.service;

import com.yoprogramo.apibazar.model.Producto;

import java.util.List;

public interface IProductoService {
    void guardarProducto(Producto producto);
    List<Producto> obtenerProductos();
    void eliminarProducto(Long id);
    void modificarProducto(Long id, Producto producto);
    Producto obtenerProductoPorId(Long id);
}
