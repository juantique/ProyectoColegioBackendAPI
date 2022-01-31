package com.colegioapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.colegioapi.dto.Cursos;

public interface ICursosDAO extends JpaRepository<Cursos, Long>{

}
