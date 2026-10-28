package com.red.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.red.api.entities.Cliente;
import com.red.api.repositories.IClienteRepository;

@Service
public class ClienteService implements IClienteService {
	@Autowired
	IClienteRepository repo;

	@Transactional
	@Override
	public Cliente save(Cliente t) {
		return repo.save(t);
	}

	@Transactional
	@Override
	public List<Cliente> findAll() {

		return (List<Cliente>)repo.findAll();
	}

	@Transactional
	@Override
	public Cliente findById(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Transactional
	@Override
	public Page<Cliente> findAll(Pageable page) {
		// TODO Auto-generated method stub
		return repo.findAll(page);
	}

}
