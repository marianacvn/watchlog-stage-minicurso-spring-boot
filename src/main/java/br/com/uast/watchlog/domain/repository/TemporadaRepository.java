package br.com.uast.watchlog.domain.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import br.com.uast.watchlog.domain.orm.Temporada;

@Repository
public interface TemporadaRepository extends JpaRepository<Temporada, UUID> {
	Optional<Temporada> findByNome(String nome);
}
