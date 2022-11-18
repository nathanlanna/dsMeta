package com.devSuperior.dsmeta.repositories;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devSuperior.dsmeta.entities.Venda;

public interface SalesRepository extends JpaRepository<Venda,Long>{

	@Query("SELECT obj FROM Venda obj WHERE obj.date BETWEEN :min AND :max ORDER BY obj.amount DESC")
	Page<Venda> findSales(LocalDate min,LocalDate max,Pageable pageable);
}
//Guarda as informações do banco de dados, salva, deleta, modifica...