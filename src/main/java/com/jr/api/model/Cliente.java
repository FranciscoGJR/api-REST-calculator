package com.jr.api.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cliente {
	
	
	// TABLE
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false)
	private String name;

	
	
	//GETTERS
	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	

	
	//SETTERS
	public void setId(long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}





	
	
	

}