package com.proveedor.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proveedor.model.Cuenta;
import com.proveedor.model.Persona;
import com.proveedor.repository.CuentaRepo;
import com.proveedor.repository.PersonaRepo;
import com.proveedor.repository.TransaccionRepo;

@RestController
@RequestMapping("/cooperativa")
public class ControllerJep {

	@Autowired
	PersonaRepo serviceper;
	
	@Autowired
	CuentaRepo servicecuenta;
	
	@Autowired
	TransaccionRepo servicetrans;
	
	@GetMapping("/newUsuario")
	public ResponseEntity<Persona> newPersona (@RequestBody Persona persona ){
		serviceper.save(persona);
		return new ResponseEntity<Persona>(serviceper.verificarLogin(persona.getUsuario(),persona.getPassword()) , HttpStatus.OK);
	} 
	
	@GetMapping("/verificarUsuario")
	public ResponseEntity<Persona> verificarlogin (@RequestParam String usuario , @RequestParam String password ){
		return new ResponseEntity<Persona>(serviceper.verificarLogin(usuario, password) , HttpStatus.OK);
	} 
	
	@GetMapping("/newCuenta")
	public ResponseEntity<Cuenta> newCuenta (@RequestBody Cuenta cuenta ){
		servicecuenta.save(cuenta);
		return new ResponseEntity<Cuenta>(servicecuenta.findCuentabyid(cuenta.getId()) , HttpStatus.OK);
	} 
	
	@GetMapping("/findCuenta")
	public ResponseEntity<Cuenta> findcuenta (@RequestParam int id  ){
		return new ResponseEntity<Cuenta>(servicecuenta.findCuentabyid(id) , HttpStatus.OK);
	} 

}
	
	
	

