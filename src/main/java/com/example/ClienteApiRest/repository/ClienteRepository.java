package com.example.ClienteApiRest.repository;

import com.example.ClienteApiRest.entidad.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
