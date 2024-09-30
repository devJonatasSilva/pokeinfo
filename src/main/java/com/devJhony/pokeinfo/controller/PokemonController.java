package com.devJhony.pokeinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.devJhony.pokeinfo.service.PokemonService;

import reactor.core.publisher.Mono;

@RestController
public class PokemonController {	
	
	@Autowired
	private PokemonService pokemonService;
	
	@GetMapping("/pokemon/{name}")
	public Mono<String> getListaPokemon(@PathVariable String name) {		
		return pokemonService.getPokemon(name);
	}

}
