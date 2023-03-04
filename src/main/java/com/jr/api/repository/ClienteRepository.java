package com.jr.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jr.api.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{
        
}
