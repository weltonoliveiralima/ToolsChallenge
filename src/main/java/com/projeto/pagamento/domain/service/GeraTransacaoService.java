package com.projeto.pagamento.domain.service;

import java.util.List;
import javax.transaction.Transactional;


import org.springframework.stereotype.Service;

import com.projeto.pagamento.domain.exception.TransacaoException;
import com.projeto.pagamento.domain.model.StatusTransacao;
import com.projeto.pagamento.domain.model.Transacao;
import com.projeto.pagamento.domain.repository.TransacaoRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class GeraTransacaoService {

		private TransacaoRepository transacaoRepository;
		
		
		@Transactional
		public Transacao pagamento(Transacao transacao)  {
			if ( (!transacao.getFormaPagamento().getTipo().equals("AVISTA") ) &&
				(!transacao.getFormaPagamento().getTipo().equals("PARCELADO LOJA") ) &&
				(!transacao.getFormaPagamento().getTipo().equals("PARCELADO EMISSOR") )
				) {
				throw new TransacaoException("Tipo Invalido");
			}
			transacao.setStatus(StatusTransacao.AUTORIZADO);
			return transacaoRepository.save(transacao);
		}
		
		@Transactional
		public Transacao estorno(Long transacaoId)  {
			Transacao transacao = transacaoRepository.findById(transacaoId).get();
			transacao.setStatus(StatusTransacao.CANCELADO);
			return transacaoRepository.save(transacao);
		}
		

		public List<Transacao> listar(){ 
			  return transacaoRepository.findAll(); 
			  }	
		 
}
