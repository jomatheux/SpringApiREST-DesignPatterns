package com.jomatheux.ApiRestDesignPatterns.service;

import com.jomatheux.ApiRestDesignPatterns.model.Cliente;

import java.util.Optional;

public interface ClienteService {

    Iterable<Cliente> listarTodos();
    Optional<Cliente> buscarPorId(Long id);
    void inserir(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);

}
