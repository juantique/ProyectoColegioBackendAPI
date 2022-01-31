package com.colegioapi.service;

import java.util.List;

import com.colegioapi.dto.Profesores;

public interface IProfesoresService {
	//Create the Methods:
	
	//Method GET
	public List<Profesores> listarProfesores();
	
	//Method POST
	public Profesores guardarProfesores(Profesores profesores);
	
	//Method Get for ID:
	public Profesores profesoresXID(Long id);
	
	//Method PUT
	public Profesores actualizarProfesores(Profesores profesores);
	
	//Method DELETE
	public void eliminarProfesores(Long id);
}
