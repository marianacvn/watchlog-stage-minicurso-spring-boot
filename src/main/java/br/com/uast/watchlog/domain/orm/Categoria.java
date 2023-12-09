package br.com.uast.watchlog.domain.orm;

import java.util.UUID;

import br.com.uast.watchlog.api.dto.CategoriaRegisterDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Categoria {
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID Id;
	@Column(length = 100, nullable = false)
	private String nome;

	public Categoria() {
	}

	public Categoria(CategoriaRegisterDto dto) {
		this.nome = dto.nome();

	}

	public Categoria(UUID id, String nome) {
		Id = id;
		this.nome = nome;
	}

	public UUID getId() {
		return Id;
	}

	public void setId(UUID id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
