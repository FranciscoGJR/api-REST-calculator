package com.jr.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jr.api.model.Product;
import com.jr.api.services.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;
     
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Product create(@RequestBody Product product) {
    	return productService.create(product);
    }
    
    @GetMapping
    public List<Product> listAll(){
    	return productService.listAll();
    }
    
    @PutMapping
    public Product update(Product product) {
    	return productService.update(product);
    }
    
    @DeleteMapping
    public Product delete(Product product) {
    	return productService.delete(product);
    }
    
}
