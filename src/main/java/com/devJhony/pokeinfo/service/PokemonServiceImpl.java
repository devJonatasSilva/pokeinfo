package com.devJhony.pokeinfo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Service
public class PokemonServiceImpl implements PokemonService{
	
	
	private final WebClient webClient;
	
	@Autowired
	public PokemonServiceImpl(WebClient.Builder webClietBuilder) {
		 this.webClient = webClietBuilder.baseUrl("https://pokeapi.co/api/v2").build();
	}

	@Override
	public Mono<String> getPokemon(String pokemonName) {
		return this.webClient.get()
				.uri("/pokemon/" + pokemonName)
				.retrieve()
				.bodyToMono(String.class);
	}
	
	

}
