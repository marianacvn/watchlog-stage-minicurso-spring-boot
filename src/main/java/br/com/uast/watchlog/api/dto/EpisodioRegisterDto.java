package br.com.uast.watchlog.api.dto;

import br.com.uast.watchlog.domain.orm.Temporada;

public record EpisodioRegisterDto(Temporada temporadaId, int numero_episodio, String nome, String sinopse,
		String data_lancamento, int duracao) {

}
