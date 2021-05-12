package com.proveedor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proveedor.model.Transaccion;



public interface TransaccionRepo extends JpaRepository<Transaccion, Integer>{

}
