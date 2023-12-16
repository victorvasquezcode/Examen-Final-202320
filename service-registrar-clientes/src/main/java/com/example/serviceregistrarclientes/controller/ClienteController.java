package com.example.serviceregistrarclientes.controller;

import com.example.serviceregistrarclientes.dto.ClienteDTO;
import com.example.serviceregistrarclientes.servic.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public ClienteDTO registrar(@RequestBody ClienteDTO clienteDTO) {
        return clienteService.registrar(clienteDTO);
    }
}