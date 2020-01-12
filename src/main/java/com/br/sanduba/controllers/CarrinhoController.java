package com.br.sanduba.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.sanduba.dtos.CarrinhoDTO;
import com.br.sanduba.entities.Carrinho;
import com.br.sanduba.services.CarrinhoService;

@RestController
@RequestMapping("/carrinho")
public class CarrinhoController {
	
	@Autowired CarrinhoService service;

	@PostMapping()
    public Carrinho addCarrinho(CarrinhoDTO dto) {          
          return service.addCarrinho(dto);
    }
	
	@GetMapping()
    public Carrinho getCarrinho(CarrinhoDTO dto) {          
          return service.getCarrinho(dto);
    }
	
	@DeleteMapping()
    public void removeCarrinho() {
		service.removeCarrinho();
    }
}
