package com.colegioapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colegioapi.dao.IInscripcionesDAO;
import com.colegioapi.dto.Inscripciones;



//Implements the Methods from the Interface Service:
@Service
public class InscripcionesServiceImpl implements IInscripcionesService {
	
	//The notation instantiates the class
	@Autowired
	//call the DAO method of the jpaRepository
	IInscripcionesDAO iInscripcionesDAO;
	
	//Method GET College
	@Override
	public List<Inscripciones> listarInscripciones() {
		
		return iInscripcionesDAO.findAll();
	}
	
	//Method POST College
	@Override
	public Inscripciones guardarInscripciones(Inscripciones inscripciones) {
		
		return iInscripcionesDAO.save(inscripciones);
	}
	
	//Method GET College for ID
	@Override
	public Inscripciones inscripcionesXID(Long id) {
		
		return iInscripcionesDAO.findById(id).get();
	}

	@Override
	public Inscripciones actualizarInscripciones(Inscripciones inscripciones) {
		
		return iInscripcionesDAO.save(inscripciones);
	}
	
	//Method Delete College for ID
	@Override
	public void eliminarIncripciones(Long id) {
		
		iInscripcionesDAO.deleteById(id);
	}
	

	
}
