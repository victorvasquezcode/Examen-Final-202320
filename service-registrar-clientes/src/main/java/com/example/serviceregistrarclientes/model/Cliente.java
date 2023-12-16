package com.example.serviceregistrarclientes.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "tbl_cliente")
@Data
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String apellido;

    private String dni;

    private String ruc;

    private String celular;

}
