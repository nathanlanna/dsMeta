package com.devSuperior.dsmeta.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devSuperior.dsmeta.entities.Venda;
import com.devSuperior.dsmeta.repositories.SalesRepository;

@Service
public class SaleService {

	@Autowired
	private SalesRepository repository;
	
	public Page<Venda> findSales(String minDate,String maxDate,Pageable pageable) {
		
		LocalDate today = LocalDate.now();
		
		LocalDate min = minDate.equals("") ? today.minusYears(1) : LocalDate.parse(minDate);
		LocalDate max = minDate.equals("") ? today : LocalDate.parse(maxDate);
		
		return repository.findSales(min,max,pageable);
		
	}
}
//Responsável pelas operações de negócio das Vendas, ex: buscar, cabe a ele fazer a comunicação com o banco de dados
//e chamar as funcionalidades pelo repository