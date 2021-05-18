package com.proveedor.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data public class Persona {
	
	@Id
	@GeneratedValue
	private int id;
	private String nombre ;
	private String apellido;
	private String cedula;
	private String usuario;
	private  String password;
	
}
