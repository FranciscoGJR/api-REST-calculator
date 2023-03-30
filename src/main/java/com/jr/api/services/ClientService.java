package com.jr.api.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jr.api.model.Client;
import com.jr.api.repository.ClientRepository;

@Service
public class ClientService {
	ClientRepository clientRepository = new ClientRepository();

	public List<Client> listAll() {
		return clientRepository.listAll();
	}
	
	public Client create(Client client) {
		return clientRepository.create(client);
	}

	public Client update(Client client) {
		return clientRepository.update(client);
	}

	public Client delete(Long id) {
		return clientRepository.delete(id);
	}

	
}
