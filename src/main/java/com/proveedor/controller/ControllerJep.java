package com.proveedor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proveedor.repository.PersonaRepo;

@RestController
@RequestMapping("/banco")
public class ControllerJep {

	@Autowired
	PersonaRepo serviceper;
	
	@Autowired
	PersonaRepo servicecuenta;
	
	@Autowired
	PersonaRepo servicetrans;
	
	@GetMapping("/usuario")
	public String hola() {
		return "Juana Del rocio";
	}
	
	
	
}
