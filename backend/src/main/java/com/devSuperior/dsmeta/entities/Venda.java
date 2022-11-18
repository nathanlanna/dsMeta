package com.devSuperior.dsmeta.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_sales")
public class Venda {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="seller_name")
	private String sellerName;
	
	@Column(name="visited")
	private Integer visited;
	
	@Column(name="deals")
	private Integer deals;
	
	@Column(name="amount")
	private Double amount;
	
	@Column(name="date")
	private Date date;
	
	
	public Venda() {
		super();
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public int getVisited() {
		return visited;
	}
	public void setVisited(int visited) {
		this.visited = visited;
	}
	public int getDeals() {
		return deals;
	}
	public void setDeals(int deals) {
		this.deals = deals;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
}
