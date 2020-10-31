package com.helloworld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello")
public class AtividadeUm {
	@GetMapping
	public String atvum(){
		return "Atenção aos Detalhes, Orientação ao Futuro e Persistência";	
	}

}
