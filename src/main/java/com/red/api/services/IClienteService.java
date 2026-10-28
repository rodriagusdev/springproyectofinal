package com.red.api.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.red.api.entities.Cliente;

public interface IClienteService extends IService<Cliente> {
	Page<Cliente> findAll (Pageable page);
}
