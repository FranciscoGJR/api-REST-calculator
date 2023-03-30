package com.jr.api.services;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

	// DIVISON
	public Long division(Long num0, Long num1) {
		return num0 / num1;
	}
		
	// MULTIPLICATION
	public Long multiplication(Long num0, Long num1) {
		return num0 * num1;
	}
	
	// SUM
	public Long sum(Long num0, Long num1) {
		return num0 + num1;
	}
	
	// SUBTRACTION
	public Long subtraction(Long num0, Long num1) {
		return num0 - num1;
	}
}
