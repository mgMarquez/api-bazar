package com.yoprogramo.apibazar.controller;

import com.yoprogramo.apibazar.model.Producto;
import com.yoprogramo.apibazar.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BazarController {

    @Autowired
    IProductoService service;

    @PostMapping("/productos/crear")
    public void agregarProducto(@RequestBody Producto producto) {
        service.guardarProducto(producto);
    }

    @GetMapping("/productos/traer")
    @ResponseBody
    public List<Producto> traerProductos() {
        return service.obtenerProductos();
    }

    @DeleteMapping("/productos/eliminar/{id}")
    public void eliminarProducto(@PathVariable Long id) {
        service.eliminarProducto(id);
    }

    @PutMapping("/productos/editar/{id}")
    public void modificarProducto(@PathVariable Long id, @RequestBody Producto productoModificado) {
        service.modificarProducto(id, productoModificado);
    }

    @GetMapping("/productos/traer/{id}")
    @ResponseBody
    public Producto obtenerProductoPorId(@PathVariable Long id) {
        return service.obtenerProductoPorId(id);
    }
}
