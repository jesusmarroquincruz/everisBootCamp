package com.microservicio.afp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.microservicio.afp.modelo.Client;
import com.microservicio.afp.repository.*;



@RestController
@RequestMapping("/api/insertSelectClient")
public class ClientController {
	private static final Logger logger = LoggerFactory.getLogger(ClientController.class);
	
	@Autowired
	private IclientRepository clienteRepository;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Client> getAllName() {
		logger.info("Inicio de metodo de getAllName()");
		try {
			return clienteRepository.findAll();
		} catch (Exception e) {
			logger.info("Error en el metodo getAllName() : "+e);
			// TODO: handle exception
			return null;
		}
		
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public void createClient(@RequestBody Client clienteEntity){
		logger.info("Inicio de metodo de createClient()");
		try {
			clienteRepository.save(clienteEntity);
		} catch (Exception e) {
			// TODO: handle exception
			logger.info("Error en el metodo createClient() : "+e);
		}
		
	}
}
