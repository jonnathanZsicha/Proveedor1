package com.proveedor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proveedor.model.Cuenta;

public interface CuentaRepo  extends JpaRepository<Cuenta, Integer>{

}
