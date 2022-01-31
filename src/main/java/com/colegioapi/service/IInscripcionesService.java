package com.colegioapi.service;

import java.util.List;

import com.colegioapi.dto.Inscripciones;

public interface IInscripcionesService {
	//Create the Methods:
	
		//Method GET
		public List<Inscripciones> listarInscripciones();
		
		//Method POST
		public Inscripciones guardarInscripciones(Inscripciones inscripciones);
		
		//Method Get for ID:
		public Inscripciones inscripcionesXID(Long id);
		
		//Method PUT
		public Inscripciones actualizarInscripciones(Inscripciones inscripciones);
		
		//Method DELETE
		public void eliminarIncripciones(Long id);
}
