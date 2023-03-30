package com.jr.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jr.api.services.CalculatorService;

@RestController
@RequestMapping("/jr")
public class MathController {
	CalculatorService service = new CalculatorService();
	
	//GET DIVISION
	@GetMapping(value = "/division/{num0}/{num1}")
	public Long division(@PathVariable("num0") Long num0, @PathVariable("num1") Long num1) {
		return service.division(num0, num1);
	}
	
	//GET MULTIPLICATION
   	@GetMapping(value = "/multiplication/{num0}/{num1}")
    public Long multiplication(@PathVariable("num0") Long num0, @PathVariable("num1") Long num1) {
		return  service.multiplication(num0, num0);
	}
	
	// GET SUM
	@GetMapping(value = "/sum/{num0}/{num1}")
	public Long sum(@PathVariable("num0") Long num0, @PathVariable("num1") Long num1) {
		return service.sum(num0, num0);
	}

	// GET SUBTRACTION
	@GetMapping(value = "/subtract/{num0}/{num1}")
	public Long subtraction(@PathVariable("num0") Long num0, @PathVariable("num1") Long num1) {
		return service.subtraction(num0, num0);
	}
	
}
