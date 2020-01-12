package com.br.sanduba.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor

@Document(collection = "carrinho")
public class Carrinho {

	@Id
	private String id;
	private String local;
	private String name;
}
