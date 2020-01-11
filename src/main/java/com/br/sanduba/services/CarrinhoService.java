package com.br.sanduba.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.sanduba.repositories.CarrinhoRepository;

@Service
public class CarrinhoService {

	@Autowired CarrinhoRepository repository;
	
	public String addCarrinho() {
		return "";
		
	}
	
	public String getCarrinho() {
		return "";
	}
	
	public void removeCarrinho() {
		
	}
	
}
