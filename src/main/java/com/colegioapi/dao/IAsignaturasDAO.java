package com.colegioapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.colegioapi.dto.Asignaturas;

public interface IAsignaturasDAO extends JpaRepository<Asignaturas, Long>{

}
