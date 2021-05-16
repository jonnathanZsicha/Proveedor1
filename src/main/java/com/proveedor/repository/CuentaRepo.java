package com.proveedor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.proveedor.model.Cuenta;
import com.proveedor.model.Persona;

public interface CuentaRepo  extends JpaRepository<Cuenta, Integer>{
	
	@Query("SELECT u FROM Cuenta u WHERE u.id = :idCuenta")
	 Cuenta findCuentabyid(  @Param("idCuenta") int id);

}
