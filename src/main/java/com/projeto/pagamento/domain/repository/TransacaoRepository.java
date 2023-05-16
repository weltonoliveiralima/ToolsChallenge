package com.projeto.pagamento.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.pagamento.domain.model.Transacao;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Long>{

}