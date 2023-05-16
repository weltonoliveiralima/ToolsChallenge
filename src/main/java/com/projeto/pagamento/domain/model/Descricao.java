package com.projeto.pagamento.domain.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable 
public class Descricao {

		@Column(name = "descricao_nome")
		private BigDecimal valor;
		
		@Column(name = "descricao_dataHora")
		private LocalDateTime dataHora;
		
		@Column(name = "descricao_estabelecimento")
		private String estabelecimento;
}
