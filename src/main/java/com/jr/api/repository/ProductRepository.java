package com.jr.api.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.jr.api.model.Product;

@Repository
public class ProductRepository {
	
	public Product create(Product product) {
		return product;
	}
	
	public List<Product> listAll(){
		List<Product> listProduct = new ArrayList<>();
		
		for (long i = 0; i <= 5; i++) {
			Product product = new Product();
			
			product.setId(i);
			product.setName("pen");
			product.setDescription("red");
			product.setDateBuy(LocalDate.of(2010, 01, 1));
			product.setAmount(42l);
			
			listProduct.add(product);
		}
		
		return listProduct;
	}
	
	public Product update(Product product) {
		return product;
	}
	
	public Product delete(Product product) {
		return product;
	}
}
