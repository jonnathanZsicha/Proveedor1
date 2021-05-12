package com.proveedor.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;
@Entity
@Data
public class Cuenta {
	
	@Id
	private int id;
	private int codigo;
	private Double saldo;
	private String tipoCuenta;
	
	
	@ManyToOne
	@JoinColumn(name="per_id", nullable=false)
	private Persona persona;
	


}
