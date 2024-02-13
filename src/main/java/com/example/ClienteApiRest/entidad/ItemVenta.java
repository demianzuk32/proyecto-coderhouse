package com.example.ClienteApiRest.entidad;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class ItemVenta {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @ManyToOne
    @JoinColumn(name = "producto_id")
    @Getter
    @Setter
    private Producto producto;

    @Getter
    @Setter
    private int cantidad;

    @Getter
    @Setter
    private double subtotal;

    @ManyToOne
    @JsonIgnore
    @Getter
    @Setter
    private Venta venta;
}
