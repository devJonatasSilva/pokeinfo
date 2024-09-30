package com.devJhony.pokeinfo.service;

import reactor.core.publisher.Mono;

public interface PokemonService {
	
	public Mono<String> getPokemon(String pokemonName);

}
