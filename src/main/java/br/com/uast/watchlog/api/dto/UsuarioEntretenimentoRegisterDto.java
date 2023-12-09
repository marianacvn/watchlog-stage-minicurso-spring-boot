package br.com.uast.watchlog.api.dto;

import br.com.uast.watchlog.domain.orm.Entretenimento;
import br.com.uast.watchlog.domain.orm.Episodio;
import br.com.uast.watchlog.domain.orm.Temporada;
import br.com.uast.watchlog.domain.orm.Usuario;

public record UsuarioEntretenimentoRegisterDto(Entretenimento entretenimentoId, Usuario usuarioId, Temporada temporadaId,
		Episodio episodioId, double nota_avaliacao, String comentario, boolean assistido) {

}
