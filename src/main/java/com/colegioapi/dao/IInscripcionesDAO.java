package com.colegioapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.colegioapi.dto.Inscripciones;

//extends from the JPA library send the object class and id type as parameters:
public interface IInscripcionesDAO extends JpaRepository<Inscripciones, Long>{

}
