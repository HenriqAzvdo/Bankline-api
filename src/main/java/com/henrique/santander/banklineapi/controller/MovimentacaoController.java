package com.henrique.santander.banklineapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.henrique.santander.banklineapi.dto.NovaMovimentacao;
import com.henrique.santander.banklineapi.model.Movimentacao;
import com.henrique.santander.banklineapi.repository.MovimentacaoRepository;
import com.henrique.santander.banklineapi.service.MovimentacaoService;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {

	@Autowired
	private MovimentacaoRepository repository;
	
	@Autowired
	private MovimentacaoService service;
	
	@GetMapping
	public List<Movimentacao> findAll() {
		return repository.findAll();
	}
	
	@PostMapping
	public void save (@RequestBody NovaMovimentacao movimentacao) {
		service.save(movimentacao);
	}
}
