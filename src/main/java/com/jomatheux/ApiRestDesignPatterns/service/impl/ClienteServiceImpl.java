package com.jomatheux.ApiRestDesignPatterns.service.impl;

import com.jomatheux.ApiRestDesignPatterns.model.Cliente;
import com.jomatheux.ApiRestDesignPatterns.model.Endereco;
import com.jomatheux.ApiRestDesignPatterns.repositories.ClienteRepository;
import com.jomatheux.ApiRestDesignPatterns.repositories.EnderecoRepository;
import com.jomatheux.ApiRestDesignPatterns.service.ClienteService;
import com.jomatheux.ApiRestDesignPatterns.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {
    @Autowired
    ClienteRepository clienteRepository;

    @Autowired
    EnderecoRepository enderecoRepository;

    @Autowired
    ViaCepService viaCepService;


    @Override
    public Iterable<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Optional<Cliente> buscarPorId(Long id) {
        Optional<Cliente> cliente = Optional.ofNullable(clienteRepository.findById(id).orElseThrow(() -> new RuntimeException("Cliente não encontrado")));
        return  cliente;
    }

    @Override
    public void inserir(Cliente cliente) {
        Endereco endereco = enderecoRepository.findById(cliente.getEndereco().getCep()).orElseGet(() -> {
            Endereco novoEndereco = viaCepService.consultarCep(cliente.getEndereco().getCep());
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        Optional<Cliente> clienteBd = buscarPorId(id);
        if (clienteBd.isPresent()) {
            Endereco endereco = enderecoRepository.findById(cliente.getEndereco().getCep()).orElseGet(() -> {
                Endereco novoEndereco = viaCepService.consultarCep(cliente.getEndereco().getCep());
                enderecoRepository.save(novoEndereco);
                return novoEndereco;
            });
            cliente.setEndereco(endereco);
            clienteRepository.save(cliente);
        }
    }

    @Override
    public void deletar(Long id) {
        clienteRepository.deleteById(id);
    }
}
