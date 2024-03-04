package com.diego_dj_producciones.springbootdiego_dj_producciones.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.diego_dj_producciones.springbootdiego_dj_producciones.models.Cliente;
import com.diego_dj_producciones.springbootdiego_dj_producciones.services.ClienteRepository;

@Controller
@RequestMapping("clientes")
public class ClientesController {
@Autowired
private ClienteRepository repo;

@GetMapping({"","/"})
public String mostrarlistaCliente(Model model) {
	List<Cliente> clientes = repo.findAll();
	model.addAttribute("clientes",clientes);
	return "clientes/index";
	
   }

}
