package com.colegioapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colegioapi.dao.ICursosDAO;
import com.colegioapi.dto.Cursos;

@Service
public class CursosServiceImpl implements ICursosService {

//Call Method DAO
	@Autowired
	ICursosDAO iCursosDAO;
	
	//Method GET
	@Override
	public List<Cursos> listarCursos() {
		
		return iCursosDAO.findAll();
	}

	//Method POST
	@Override
	public Cursos guardarCursos(Cursos cursos) {
		
		return iCursosDAO.save(cursos);
	}

	//Method GET for ID
	@Override
	public Cursos cursosXID(Long id) {
		
		return iCursosDAO.findById(id).get();
	}

	//Method PUT
	@Override
	public Cursos actualizarCursos(Cursos cursos) {
		
		return iCursosDAO.save(cursos);
	}
	
	//Method DELETE
	@Override
	public void eliminarCursos(Long id) {
		
		iCursosDAO.deleteById(id);
	}

}
