package com.jomatheux.ApiRestDesignPatterns.service.impl;

import com.jomatheux.ApiRestDesignPatterns.model.Cliente;
import com.jomatheux.ApiRestDesignPatterns.service.ClienteService;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {



    @Override
    public Iterable<Cliente> listarTodos() {
        return null;
    }

    @Override
    public Cliente buscarPorId(Long id) {
        return null;
    }

    @Override
    public void salvar(Cliente cliente) {

    }

    @Override
    public void atualizar(Long id, Cliente cliente) {

    }

    @Override
    public void deletar(Long id) {

    }
}
