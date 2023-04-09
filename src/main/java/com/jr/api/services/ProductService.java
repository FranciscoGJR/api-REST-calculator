package com.jr.api.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jr.api.model.Product;
import com.jr.api.repository.ProductRepository;

@Service
public class ProductService {
	ProductRepository productRepository = new ProductRepository();
	
	public Product create(Product product) {
		return productRepository.create(product);
	}
	
	public List<Product> listAll(){
		return productRepository.listAll();
	}
	
	public Product update(Product product) {
		return productRepository.update(product);
	}
	
	public Product delete(Product product) {
		return productRepository.delete(product);
	}

}
