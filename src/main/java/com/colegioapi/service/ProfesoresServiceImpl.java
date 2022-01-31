package com.colegioapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colegioapi.dao.IProfesoresDAO;
import com.colegioapi.dto.Profesores;

//Implements the Methods from the Interface Service:
@Service
public class ProfesoresServiceImpl implements IProfesoresService{
	
//summon IProfesoresDAO:
	@Autowired
	IProfesoresDAO iProfesoresDAO;
	
	//Method GET
	@Override
	public List<Profesores> listarProfesores() {
		
		return iProfesoresDAO.findAll();
	}
	
	//Method POST
	@Override
	public Profesores guardarProfesores(Profesores profesores) {
		
		return iProfesoresDAO.save(profesores);
	}
	
	//Method GET for ID
	@Override
	public Profesores profesoresXID(Long id) {
		
		return iProfesoresDAO.findById(id).get();
	}
	
	//Method PUT
	@Override
	public Profesores actualizarProfesores(Profesores profesores) {
		
		return iProfesoresDAO.save(profesores);
	}
	
	//Method Delete
	@Override
	public void eliminarProfesores(Long id) {
		iProfesoresDAO.deleteById(id);	
	}
	
}
