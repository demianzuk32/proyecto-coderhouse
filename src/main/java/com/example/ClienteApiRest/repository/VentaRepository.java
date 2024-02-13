package com.example.ClienteApiRest.repository;

import com.example.ClienteApiRest.entidad.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<Venta, Long> {
}
