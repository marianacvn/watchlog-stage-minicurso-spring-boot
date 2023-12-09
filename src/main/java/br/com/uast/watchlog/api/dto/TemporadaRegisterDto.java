package br.com.uast.watchlog.api.dto;

import br.com.uast.watchlog.domain.orm.Entretenimento;

public record TemporadaRegisterDto(Entretenimento entretenimentoId, int numero_temporada) {

}
