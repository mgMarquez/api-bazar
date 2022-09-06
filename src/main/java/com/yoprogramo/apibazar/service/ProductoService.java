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

    }

    @Override
    public List<Producto> obtenerProductos() {
        return null;
    }

    @Override
    public void eliminarProducto(Long id) {

    }

    @Override
    public void modificarProducto(Producto producto) {

    }

    @Override
    public Producto obtenerProductoPorId(Long id) {
        return null;
    }
}
