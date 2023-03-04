package com.jr.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jr.api.model.Cliente;
import com.jr.api.repository.ClienteRepository;

@RestController
@RequestMapping("/hello")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;
	


    //Getters
	@GetMapping
	public List<Cliente> lista(){
        return clienteRepository.findAll();
	}

		
	
}
