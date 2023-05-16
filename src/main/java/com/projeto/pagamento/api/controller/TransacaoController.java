package com.projeto.pagamento.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.pagamento.domain.model.Transacao;
import com.projeto.pagamento.domain.repository.TransacaoRepository;
import com.projeto.pagamento.domain.service.GeraTransacaoService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/transacoes")

public class TransacaoController {
	
	private TransacaoRepository transacaoRepository;
	private GeraTransacaoService geraTransacaoService;
		
	@PostMapping("/pagamento")
	@ResponseStatus(HttpStatus.CREATED)
	public Transacao pagamento(@Valid @RequestBody Transacao transacao) {
		return geraTransacaoService.pagamento(transacao) ;
		
	}

	@GetMapping("/consulta")
	public List<Transacao> consulta() {
		return geraTransacaoService.listar() ;
		
	}
	
	@GetMapping("/consulta/{transacaoId}")
	public ResponseEntity<Transacao> consulta(@PathVariable Long transacaoId) {
		return transacaoRepository.findById(transacaoId)
				.map(ResponseEntity::ok)
				.orElse(ResponseEntity.notFound().build());
	}	
	
	@PutMapping("/estorno/{transacaoId}")
	public Transacao estorno(@PathVariable Long transacaoId) {
		return geraTransacaoService.estorno(transacaoId) ;
		
	}	
	
}
