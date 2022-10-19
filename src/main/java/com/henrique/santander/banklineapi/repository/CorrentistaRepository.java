package com.henrique.santander.banklineapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.henrique.santander.banklineapi.model.Correntista;

public interface CorrentistaRepository extends JpaRepository<Correntista, Integer> {

}
