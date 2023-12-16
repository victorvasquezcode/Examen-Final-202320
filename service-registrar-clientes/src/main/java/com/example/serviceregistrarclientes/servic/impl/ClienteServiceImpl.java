package com.example.serviceregistrarclientes.servic.impl;

import com.example.serviceregistrarclientes.dto.ClienteDTO;
import com.example.serviceregistrarclientes.model.Cliente;
import com.example.serviceregistrarclientes.repository.ClienteRepository;
import com.example.serviceregistrarclientes.servic.ClienteService;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Data
@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    private final ModelMapper modelMapper;

    @Override
    public ClienteDTO registrar(ClienteDTO clienteDTO) {
        // Convierte el DTO a entidad Cliente
        Cliente cliente = new Cliente();
        cliente.setNombre(clienteDTO.getNombre());
        cliente.setApellido(clienteDTO.getApellido());
        cliente.setDni(clienteDTO.getDni());
        cliente.setRuc(clienteDTO.getRuc());
        cliente.setCelular(clienteDTO.getCelular());
        Cliente savedCliente = clienteRepository.save(cliente);
        return modelMapper.map(savedCliente, ClienteDTO.class);
    }
}

