package com.jr.api.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.jr.api.model.Client;

@Repository
public class ClientRepository {

	public List<Client> listAll() {
		List<Client> listClient = new ArrayList<>();

		for (long i = 0; i <= 5; i++) {
			Client client = new Client(i, "Francisco", "Gomes", "Silgle", "Rua Guajajaras", 500 + i);
			listClient.add(client);
		}
		
		return listClient;
	}

	public Client create(Client client) {
		return client;
	}

	public Client update(Client client) {
		return client;
	}

	public Client delete(Long id) {
        return null;        
	}

}
