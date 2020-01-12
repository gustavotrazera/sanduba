package com.br.sanduba.mappers;

import com.br.sanduba.dtos.CarrinhoDTO;
import com.br.sanduba.entities.Carrinho;

public class CarrinhoMapper {

	public Carrinho toEntity(CarrinhoDTO dto) {
		return new Carrinho("", dto.getLocal(), dto.getName());
	}

}
