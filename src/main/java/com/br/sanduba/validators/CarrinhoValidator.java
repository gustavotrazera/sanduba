package com.br.sanduba.validators;

import org.springframework.beans.factory.annotation.Autowired;

import com.br.sanduba.dtos.CarrinhoDTO;
import com.br.sanduba.repositories.CarrinhoRepository;

public class CarrinhoValidator {

	@Autowired
	private CarrinhoRepository repository;

	public boolean validateCarrinho(CarrinhoDTO dto) {
		if (repository.findByName(dto.getName()).isPresent()) {
			return false;
		}

		if (repository.findByLocal(dto.getLocal()).isPresent()) {
			return false;
		}
		return true;
	}

}
