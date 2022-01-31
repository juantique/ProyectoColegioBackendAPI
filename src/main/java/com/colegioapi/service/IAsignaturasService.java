package com.colegioapi.service;

import java.util.List;

import com.colegioapi.dto.Asignaturas;

public interface IAsignaturasService {
	//Create the Methods:
	
		//Method GET
		public List<Asignaturas> listarAsignaturas();
		
		//Method PUT
		public Asignaturas guardarAsignaturas(Asignaturas asignaturas);
		
		//Method Get for ID:
		public Asignaturas asignaturasXID(Long id);
		
		//Method POST
		public Asignaturas actualizarAsignaturas(Asignaturas asignaturas);
		
		//Method DELETE
		public void eliminarAsignaturas(Long id);
}
