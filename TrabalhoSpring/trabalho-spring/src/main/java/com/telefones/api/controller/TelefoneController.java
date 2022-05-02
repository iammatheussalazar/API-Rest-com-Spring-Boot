package com.telefones.api.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telefones.domain.exception.NegocioException;
import com.telefones.domain.model.Cliente;
import com.telefones.domain.model.Telefone;
import com.telefones.domain.repository.ClienteRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/telefones")
public class TelefoneController {
	private ClienteRepository clienteRepository;
	
	@PostMapping
	public Telefone adicionar(@PathVariable Long clienteId,@RequestBody String numero) {
		Cliente cliente = clienteRepository.findById(clienteId)
				.orElseThrow(() -> new NegocioException("Telefone não encontrado"));
		
		return cliente.adicionarTelefone(numero);
	}
}