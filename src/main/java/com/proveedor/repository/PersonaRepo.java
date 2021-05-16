package com.proveedor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.proveedor.model.Persona;

public interface PersonaRepo  extends JpaRepository<Persona,Integer>{
	
	@Query("SELECT u FROM Persona u WHERE u.usuario = :usuarioPortal and u.password = :passwordPortal ")
	 Persona verificarLogin(  @Param("usuarioPortal") String usuarioPortal,   @Param("passwordPortal") String passwordPortal);
}
