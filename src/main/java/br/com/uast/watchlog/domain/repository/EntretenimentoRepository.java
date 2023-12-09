package br.com.uast.watchlog.domain.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.uast.watchlog.domain.orm.Entretenimento;

@Repository
public interface EntretenimentoRepository extends JpaRepository<Entretenimento, UUID> {
	Optional<Entretenimento> findByNome(String nome);

}
