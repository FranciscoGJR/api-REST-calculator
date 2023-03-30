package com.jr.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jr.api.model.Client;
import com.jr.api.services.ClientService;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;
     
    @GetMapping 
	public List<Client> listAll() {
		return clientService.listAll();
	}

    @PostMapping
    public Client create(){
        return clientService.create(null);
    }
    
    @PutMapping
    public Client update(Client client){
        return clientService.update(client);
    }

    @DeleteMapping(value = "/{id}")
    public Client delete(Client client, @PathVariable("id") Long id) {
    	return clientService.delete(id);
    }

}
