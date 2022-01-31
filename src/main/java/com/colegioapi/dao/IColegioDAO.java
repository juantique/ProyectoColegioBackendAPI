package com.colegioapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.colegioapi.dto.Colegio;

//extends class JPA Method
public interface IColegioDAO extends JpaRepository<Colegio, Long>{
	
}
