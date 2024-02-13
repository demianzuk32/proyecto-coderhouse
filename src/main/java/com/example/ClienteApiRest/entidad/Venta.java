package com.example.ClienteApiRest.entidad;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "venta")
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private LocalDateTime fecha;

    @ManyToOne
    @Getter
    @Setter
    private Cliente cliente;

    @OneToMany(mappedBy = "venta", cascade = CascadeType.ALL)
    @Getter
    @Setter
    private List<ItemVenta> items;

    @Getter
    @Setter
    private double total;

}
