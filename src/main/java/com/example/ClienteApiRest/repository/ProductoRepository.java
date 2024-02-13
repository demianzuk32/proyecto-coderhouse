package com.example.ClienteApiRest.repository;

import com.example.ClienteApiRest.entidad.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
