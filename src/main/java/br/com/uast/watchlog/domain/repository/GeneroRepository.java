package br.com.uast.watchlog.domain.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import br.com.uast.watchlog.domain.orm.Genero;

@Repository
public interface GeneroRepository extends JpaRepository<Genero, UUID> {
	Optional<Genero> findByNome(String nome);
}
