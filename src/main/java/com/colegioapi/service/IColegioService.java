package com.colegioapi.service;

import java.util.List;

import com.colegioapi.dto.Colegio;

public interface IColegioService {
	
	//Method Get
	public List<Colegio> listarColegios();
	
	//Method Put
	public Colegio guardarColegio(Colegio colegio);
	
	//Method Get Id
	public Colegio colegioXID(Long id);
	
	//Method Post
	public Colegio actualizarColegio(Colegio colegio);
	
	//Method Delete
	public void eliminarColegio(Long id);
}
