package com.example.serviceregistrarclientes.dto;

import lombok.Data;

@Data
public class ClienteDTO {

    private Long id;

    private String nombre;

    private String apellido;

    private String dni;

    private String ruc;

    private String celular;

}