package br.com.uast.watchlog.api.dto;

import br.com.uast.watchlog.domain.orm.Categoria;
import br.com.uast.watchlog.domain.orm.Genero;

public record EntretenimentoRegisterDto(String nome, Categoria categoriaId, Genero generoId, int anoLancamento, int duracao,
		int classificacao, String sinopse, double avaliacao) {

}
