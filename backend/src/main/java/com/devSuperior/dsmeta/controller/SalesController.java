package com.devSuperior.dsmeta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.devSuperior.dsmeta.entities.Venda;
import com.devSuperior.dsmeta.service.SaleService;
import com.devSuperior.dsmeta.service.SmsService;

@RestController
@RequestMapping(value="/sales")
public class SalesController {

	@Autowired
	private SaleService service;
	
	@Autowired
	private SmsService smsService;
	
	@GetMapping
	public Page<Venda> findSales(
			@RequestParam(value="minDate",defaultValue = "") String minDate, 
			@RequestParam(value="maxDate",defaultValue = "") String maxDate,
			Pageable page){
		return service.findSales(minDate,maxDate,page);
	}
	//{id} representa um parâmetro
	@GetMapping("{id}/notification")
	public void notificar(@PathVariable Long id) {
		smsService.sendSms(id);
	}
	
}
//faz a implementação da api, gera os endPoints para uso do BackEnd;
// fazendo a chamada de um método do Service, que se comunica com o Repository, Controller>Service>Repository