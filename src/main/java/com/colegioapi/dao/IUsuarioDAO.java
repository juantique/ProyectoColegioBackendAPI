package com.colegioapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.colegioapi.dto.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, Long>{

}
