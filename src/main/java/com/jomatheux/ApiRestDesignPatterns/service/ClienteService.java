package com.jomatheux.ApiRestDesignPatterns.service;

import com.jomatheux.ApiRestDesignPatterns.model.Cliente;

public interface ClienteService {

    Iterable<Cliente> listarTodos();
    Cliente buscarPorId(Long id);
    void salvar(Cliente cliente);
    void atualizar(Long id, Cliente cliente);
    void deletar(Long id);

}
