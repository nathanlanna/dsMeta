package com.devSuperior.dsmeta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devSuperior.dsmeta.entities.Venda;
import com.devSuperior.dsmeta.service.SaleService;

@RestController
@RequestMapping(value="/sales")
public class SalesController {

	@Autowired
	private SaleService service;
	
	@GetMapping
	public List<Venda> findSales(){
		return service.findSales();
	}
}
//faz a implementação da api, gera os endPoints para uso do BackEnd;
// fazendo a chamada de um método do Service, que se comunica com o Repository, Controller>Service>Repository