package com.br.sanduba.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.sanduba.dtos.CarrinhoDTO;
import com.br.sanduba.entities.Carrinho;
import com.br.sanduba.mappers.CarrinhoMapper;
import com.br.sanduba.repositories.CarrinhoRepository;
import com.br.sanduba.validators.CarrinhoValidator;

@Service
public class CarrinhoService {

	@Autowired
	private CarrinhoRepository repository;

	@Autowired
	private CarrinhoValidator validator;

	@Autowired
	private CarrinhoMapper mapper;

	public Carrinho addCarrinho(CarrinhoDTO dto) {
		if (validator.validateCarrinho(dto)) {
			return repository.save(mapper.toEntity(dto));
		}
		return null;

	}

	public Carrinho getCarrinho(CarrinhoDTO dto) {
		Carrinho entity = mapper.toEntity(dto);
		return repository.find(entity.getName(), entity.getLocal());
	}

	public void removeCarrinho() {

	}

}
