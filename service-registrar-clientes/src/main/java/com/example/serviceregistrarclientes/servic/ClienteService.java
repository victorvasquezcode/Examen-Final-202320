package com.example.serviceregistrarclientes.servic;

import com.example.serviceregistrarclientes.dto.ClienteDTO;

public interface ClienteService {

    /**
     * Registra un nuevo cliente.
     *
     * @param clienteDTO El DTO del cliente a registrar.
     * @return El cliente registrado.
     */
    ClienteDTO registrar(ClienteDTO clienteDTO);

    /**
     * Encuentra un cliente por su DNI o RUC.
     *
     * @param dniOrRuc El DNI o RUC del cliente a buscar.
     * @return El cliente encontrado, o `null` si no se encuentra.
     */
//    ClienteDTO encontrarPorDniOrRuc(String dniOrRuc);

    /**
     * Actualiza los datos de un cliente.
     *
     * @param clienteDTO El DTO del cliente con los datos actualizados.
     * @return El cliente actualizado.
     */
//    ClienteDTO actualizar(ClienteDTO clienteDTO);

    /**
     * Elimina un cliente.
     *
     * @param dniOrRuc El DNI o RUC del cliente a eliminar.
     */
//    void eliminar(String dniOrRuc);

}