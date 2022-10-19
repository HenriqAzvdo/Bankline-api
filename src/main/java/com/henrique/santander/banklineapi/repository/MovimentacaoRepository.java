package com.henrique.santander.banklineapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henrique.santander.banklineapi.model.Movimentacao;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer>{

}
