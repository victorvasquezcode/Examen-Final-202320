package com.example.serviceregistrarclientes.repository;

import com.example.serviceregistrarclientes.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Cliente findByDniOrRuc(String dniOrRuc);
}

