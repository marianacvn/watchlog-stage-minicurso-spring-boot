package br.com.uast.watchlog.domain.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import br.com.uast.watchlog.domain.orm.Episodio;

@Repository
public interface EpisodioRepository extends JpaRepository<Episodio, UUID>{
	Optional<Episodio> findByNome(String nome);

}
