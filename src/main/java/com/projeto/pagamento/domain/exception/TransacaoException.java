package com.projeto.pagamento.domain.exception;

public class TransacaoException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public TransacaoException(String message) {
		super(message);
	}

}

