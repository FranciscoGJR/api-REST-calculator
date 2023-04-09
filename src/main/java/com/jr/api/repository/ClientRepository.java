package com.jr.api.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.jr.api.model.Client;

@Repository
public class ClientRepository {

	public Client create(Client client) {
		return client;
	}
	
	public List<Client> listAll() {
		List<Client> listClient = new ArrayList<>();

		for (long i = 0; i <= 5; i++) {
			Client client = new Client();
			client.setId(i);
			client.setName("Carlos");
			client.setLastName("Silva");
			client.setGander("Single");
			client.setAddress("Rua x");
			client.setBalance(1000l);
			client.setDateBirth(LocalDate.of(2000, 01, 1));
			
			listClient.add(client);
		}
		
		return listClient;
	}

	public Client update(Client client) {
		return client;
	}

	public Client delete(Long id) {
        return null;        
	}

}
