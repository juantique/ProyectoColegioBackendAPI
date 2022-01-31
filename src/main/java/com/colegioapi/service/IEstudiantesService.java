package com.colegioapi.service;

import java.util.List;

import com.colegioapi.dto.Estudiantes;

public interface IEstudiantesService {
	//Create the Methods:
	
		//Method GET
		public List<Estudiantes> listarEstudiantes();
		
		//Method POST
		public Estudiantes guardarEstudiantes(Estudiantes estudiantes);
		
		//Method Get for ID:
		public Estudiantes estudiantesXID(Long id);
		
		//Method PUT
		public Estudiantes actualizarEstudiantes(Estudiantes estudiantes);
		
		//Method DELETE
		public void eliminarEstudiantes(Long id);
}
