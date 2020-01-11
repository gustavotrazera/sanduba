package com.br.sanduba.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.br.sanduba.services.CarrinhoService;

@Controller
@RequestMapping("/carrinho")
public class CarrinhoController {
	
	@Autowired CarrinhoService service;

	@RequestMapping(value = "/", method = RequestMethod.POST)
    public String addCarrinho() {          
          return service.addCarrinho();
    }
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String getCarrinho() {          
          return service.getCarrinho();
    }
	
	@RequestMapping(value = "/", method = RequestMethod.DELETE)
    public void removeCarrinho() {
		service.removeCarrinho();
    }
}
