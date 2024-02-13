package com.example.ClienteApiRest.controller;

import com.example.ClienteApiRest.entidad.Venta;
import com.example.ClienteApiRest.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/ventas")
public class VentaController {

    @Autowired
    private VentaService ventaService;

}
