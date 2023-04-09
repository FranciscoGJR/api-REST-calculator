package com.jr.api.services;

import java.time.LocalDate;
import java.util.List;
import java.time.temporal.ChronoUnit;

import org.springframework.stereotype.Service;

import com.jr.api.model.Client;
import com.jr.api.repository.ClientRepository;

@Service
public class ClientService {
	ClientRepository clientRepository = new ClientRepository();

	public Client create(Client client) throws Exception {
		LocalDate currentDate = LocalDate.now();

		long years = ChronoUnit.YEARS.between(client.getDateBirth(), currentDate);

		if (years >= 18) {
			return clientRepository.create(client);
		} else {
			throw new Exception("Deu rim");
		}
	}
	
	public List<Client> listAll() {
		return clientRepository.listAll();
	}

	public Client update(Client client) {
		return clientRepository.update(client);
	}

	public Client delete(Long id) {
		return clientRepository.delete(id);
	}
	
}