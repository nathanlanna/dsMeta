package com.devSuperior.dsmeta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devSuperior.dsmeta.entities.Venda;
import com.devSuperior.dsmeta.repositories.SalesRepository;

@Service
public class SaleService {

	@Autowired
	private SalesRepository repository;
	
	public List<Venda> findSales() {
		return repository.findAll();
		
	}
}
//Responsável pelas operações de negócio das Vendas, ex: buscar, cabe a ele fazer a comunicação com o banco de dados
//e chamar as funcionalidades pelo repository