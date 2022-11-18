package com.devSuperior.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devSuperior.dsmeta.entities.Venda;

public interface SalesRepository extends JpaRepository<Venda,Long>{

}
//Guarda as informações do banco de dados, salva, deleta, modifica...