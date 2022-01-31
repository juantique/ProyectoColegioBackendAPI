package com.colegioapi.service;

import java.util.List;

import com.colegioapi.dto.Cursos;

public interface ICursosService {

//Create the Methods:
	//Method GET
	public List<Cursos> listarCursos();
	
	//Method POST
	public Cursos guardarCursos(Cursos cursos);
	
	//Method Get for ID:
	public Cursos cursosXID(Long id);
	
	//Method PUT
	public Cursos actualizarCursos(Cursos cursos);
	
	//Method DELETE
	public void eliminarCursos(Long id);

}
