package com.projeto.pagamento.domain.model;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class FormaPagamento {
    private String tipo;
    private int parcelas;
    
}
