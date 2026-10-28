package com.red.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.red.api.entities.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Long>{

}	
