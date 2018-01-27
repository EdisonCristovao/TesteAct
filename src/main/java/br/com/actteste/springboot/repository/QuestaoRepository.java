package br.com.actteste.springboot.repository;

import br.com.actteste.springboot.modelo.Questao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestaoRepository extends JpaRepository<Questao, Long> {
}
