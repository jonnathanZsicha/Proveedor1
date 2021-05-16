package com.proveedor.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data public class Transaccion {
	
	@Id
	private int id;
	private String numeroCuenta;
	private String tipoCuenta;
	private Double monto;
	@ManyToOne
	@JoinColumn(name="cuenta_id", nullable=false)
	private Cuenta cuenta;

}
