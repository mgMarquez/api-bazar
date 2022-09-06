package com.yoprogramo.apibazar.repository;

import com.yoprogramo.apibazar.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductoRepository extends JpaRepository<Producto, Long> {
}
