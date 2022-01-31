package com.colegioapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.colegioapi.dto.Estudiantes;

public interface IEstudiantesDAO extends JpaRepository<Estudiantes, Long>{

}
