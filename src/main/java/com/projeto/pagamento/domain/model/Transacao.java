package com.projeto.pagamento.domain.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Transacao {

	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String cartao;
	
	@Embedded
	private Descricao descricao;
	
	@Enumerated(EnumType.STRING)
	private StatusTransacao status;
	
	@Embedded
	private FormaPagamento formaPagamento; 
	
}
