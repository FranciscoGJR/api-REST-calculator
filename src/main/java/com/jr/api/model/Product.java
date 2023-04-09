package com.jr.api.model;

import java.time.LocalDate;

public class Product {

	private Long id;
	private String name;
	private String description;
	private LocalDate dateBuy;
	private Long amount;

	// GETTERS
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDescription() {
		return description;
	}
	public LocalDate getDateBuy() {
		return dateBuy;
	}
	public Long getAmount() {
		return amount;
	}

	//SETTERS
	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setDateBuy(LocalDate dateBuy) {
		this.dateBuy = dateBuy;
	}
	public void setAmount(Long amount) {
		this.amount = amount;
	}

}
