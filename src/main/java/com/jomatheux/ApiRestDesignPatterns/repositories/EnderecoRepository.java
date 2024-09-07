package com.jomatheux.ApiRestDesignPatterns.repositories;

import com.jomatheux.ApiRestDesignPatterns.model.Endereco;
import org.springframework.data.repository.CrudRepository;

public interface EnderecoRepository extends CrudRepository<Endereco, String> {
}
