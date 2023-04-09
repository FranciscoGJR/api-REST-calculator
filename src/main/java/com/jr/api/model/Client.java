package com.jr.api.model;

import java.time.LocalDate;

public class Client{

	// TABLE
	private Long id;
	private String name;
	private String lastName;
	private String gander;
	private String address;
	private Long balance;
	private LocalDate dateBirth;


	//GETTERS
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public Long getBalance() {
		return balance;
	}
	
	public String getGander() {
		return gander;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getLastName() {
		return lastName;
	}

	public LocalDate getDateBirth() {
		return dateBirth;
	}
	
	//SETTERS
	public void setId(Long i) {
		this.id = i;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}	

	public void setBalance(Long balance) {
		this.balance = balance;
	}

	public void setGander(String gander) {
		this.gander = gander;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setDateBirth(LocalDate dateBirth) {
		this.dateBirth = dateBirth;
	}

}