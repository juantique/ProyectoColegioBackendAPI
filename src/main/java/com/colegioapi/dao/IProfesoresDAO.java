package com.colegioapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.colegioapi.dto.Profesores;

//extends from the JPA library send the object class and id type as parameters:
public interface IProfesoresDAO extends JpaRepository<Profesores, Long>{
	
}
