package com.colegioapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colegioapi.dao.IEstudiantesDAO;
import com.colegioapi.dto.Estudiantes;

//Implements the Methods from the Interface Service:
@Service
public class EstudiantesServiceImpl implements IEstudiantesService{
	
	@Autowired
	IEstudiantesDAO iEstudiantesDAO;
	
	//Method GET
	@Override
	public List<Estudiantes> listarEstudiantes() {
		return iEstudiantesDAO.findAll();
	}
	
	//Method POST
	@Override
	public Estudiantes guardarEstudiantes(Estudiantes estudiantes) {
		return iEstudiantesDAO.save(estudiantes);
	}
	
	//Method GET for ID
	@Override
	public Estudiantes estudiantesXID(Long id) {
		return iEstudiantesDAO.findById(id).get();
	}
	
	//Method PUT
	@Override
	public Estudiantes actualizarEstudiantes(Estudiantes estudiantes) {
		return iEstudiantesDAO.save(estudiantes);
	}
	
	//Method Delete
	@Override
	public void eliminarEstudiantes(Long id) {
		iEstudiantesDAO.deleteById(id);
	}
	
}
