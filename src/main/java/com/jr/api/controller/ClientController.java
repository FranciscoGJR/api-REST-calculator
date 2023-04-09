package com.jr.api.controller;

import org.springframework.http.MediaType;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jr.api.model.Client;
import com.jr.api.services.ClientService;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;
     
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Client create(@RequestBody Client client) throws Exception{
    	return clientService.create(client);
    }

    @GetMapping 
	public List<Client> listAll() {
		return clientService.listAll();
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
