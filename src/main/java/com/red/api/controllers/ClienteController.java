package com.red.api.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.red.api.entities.Cliente;
import com.red.api.services.IClienteService;

@Controller
public class ClienteController {
	@Autowired
	IClienteService clienteService;
	
	@GetMapping("/listar")
	public String listar(Model model, 
			@RequestParam(name="page", defaultValue="0") int page,
	        @RequestParam(name="size", defaultValue="5") int size,
	        @RequestParam(name="sort", defaultValue="id") String sort,
	        @RequestParam(name="dir",  defaultValue="asc") String dir) 
	{
		model.addAttribute("titulo", "Clientes");
		Sort orden = dir.equalsIgnoreCase("asc") ? Sort.by(sort).ascending() : Sort.by(sort).descending();
	    Pageable pageable = PageRequest.of(page, size, orden);
	    Page<Cliente> pagina = clienteService.findAll(pageable);

	    model.addAttribute("pagina", pagina);
	    model.addAttribute("lista", pagina.getContent());
	    model.addAttribute("sort", sort);
	    model.addAttribute("dir", dir);
		return "listar";
	}
}
