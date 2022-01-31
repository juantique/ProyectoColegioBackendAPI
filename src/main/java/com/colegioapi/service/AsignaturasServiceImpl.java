package com.colegioapi.service;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colegioapi.dao.IAsignaturasDAO;
import com.colegioapi.dto.Asignaturas;

@Service
public class AsignaturasServiceImpl implements IAsignaturasService{

//summon IAsignaturasDAO:
	@Autowired
	IAsignaturasDAO iAsignaturasDAO;
	
	//Method GET
	@Override
	public List<Asignaturas> listarAsignaturas() {
		
		return iAsignaturasDAO.findAll();
	}
	
	//Method POST
	@Override
	public Asignaturas guardarAsignaturas(Asignaturas asignaturas) {
		
		return iAsignaturasDAO.save(asignaturas);
	}
	
	//Method GET for ID
	@Override
	public Asignaturas asignaturasXID(Long id) {
		
		return iAsignaturasDAO.findById(id).get();
	}
	
	//Method PUT
	@Override
	public Asignaturas actualizarAsignaturas(Asignaturas asignaturas) {
		
		return iAsignaturasDAO.save(asignaturas);
	}
	
	//Method Delete
	@Override
	public void eliminarAsignaturas(Long id) {
		
		iAsignaturasDAO.deleteById(id);
	}
	
	
}
