package com.jomatheux.ApiRestDesignPatterns.repositories;

import com.jomatheux.ApiRestDesignPatterns.model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
