package com.colegioapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colegioapi.dao.IColegioDAO;
import com.colegioapi.dto.Colegio;

//the annotation to be recognized as a service
@Service
public class ColegioServiceImpl implements IColegioService{
	
//All interface methods are implemented
	
	//The notation instantiates the class
	@Autowired
	//call the DAO method of the jpaRepository
	IColegioDAO iColegioDAO;
	
	//Method GET College
	@Override
	public List<Colegio> listarColegios() {
		return iColegioDAO.findAll();
	}
	
	//Method PUT College
	@Override
	public Colegio guardarColegio(Colegio colegio) {
		return iColegioDAO.save(colegio);
	}
	
	//Method GET College for ID
	@Override
	public Colegio colegioXID(Long id) {
		return iColegioDAO.findById(id).get();
	}
	
	//Method POST College for ID
	@Override
	public Colegio actualizarColegio(Colegio colegio) {
		return iColegioDAO.save(colegio);
	}
	
	//Method Delete College for ID
	@Override
	public void eliminarColegio(Long id) {
		iColegioDAO.deleteById(id);		
	}
	
}
