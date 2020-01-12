package com.br.sanduba.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.br.sanduba.entities.Carrinho;

public interface CarrinhoRepository extends MongoRepository<Carrinho, String> {

	public Optional<Carrinho> findByName(String name);

	public Optional<Carrinho> findByLocal(String local);

	public Carrinho find(String name, String local);
}
