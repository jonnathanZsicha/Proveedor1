package com.proveedor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proveedor.model.Persona;

public interface PersonaRepo  extends JpaRepository<Persona,Integer>{

}
