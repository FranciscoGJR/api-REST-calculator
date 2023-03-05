package com.jr.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jr.api.model.Cliente;
import com.jr.api.repository.ClienteRepository;

@RestController
@RequestMapping("/cliente")
public class ClienteController {


    // ACESSO AO BANCO
    @Autowired
    private ClienteRepository clienteRepository;

    
    //GET 
    @GetMapping 
    public List<Cliente> lista(){ 
        return clienteRepository.findAll();
	}

    //POST
    @PostMapping
    public Cliente create(@RequestBody Cliente cliente){
        return clienteRepository.save(cliente);
    }

}
