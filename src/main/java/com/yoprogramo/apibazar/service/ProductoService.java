package com.yoprogramo.apibazar.service;

import com.yoprogramo.apibazar.model.Producto;
import com.yoprogramo.apibazar.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService implements IProductoService{
    @Autowired
    IProductoRepository repo;

    @Override
    public void guardarProducto(Producto producto) {
        repo.save(producto);
    }

    @Override
    public List<Producto> obtenerProductos() {
        return repo.findAll();
    }

    @Override
    public void eliminarProducto(Long id) {
        repo.deleteById(id);
    }

    @Override
    public void modificarProducto(Long id, Producto producto) {
        Producto productoActual = repo.findById(id).orElse(null);
        productoActual.setDescripcion(producto.getDescripcion());
        productoActual.setNombre(producto.getNombre());
        productoActual.setPrecio(producto.getPrecio());
        productoActual.setCantidadEnStock(producto.getCantidadEnStock());
        repo.save(productoActual);
    }

    @Override
    public Producto obtenerProductoPorId(Long id) {
        return repo.findById(id).orElse(null);
    }
}
