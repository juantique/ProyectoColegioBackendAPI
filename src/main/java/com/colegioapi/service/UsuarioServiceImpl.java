package com.colegioapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colegioapi.dao.IUsuarioDAO;
import com.colegioapi.dto.Usuario;

@Service
public class UsuarioServiceImpl implements IUsuarioService{
	
	//summon IAsignaturasDAO:
	@Autowired
	IUsuarioDAO iUsuarioDAO;
	
	//Method GET
	@Override
	public List<Usuario> listarUsuario() {
		
		return iUsuarioDAO.findAll();
	}
	
	//Method POST
	@Override
	public Usuario guardarUsuario(Usuario usuario) {
		
		return iUsuarioDAO.save(usuario);
	}
	
	//Method GET for ID
	@Override
	public Usuario usuarioXID(Long id) {
		
		return iUsuarioDAO.findById(id).get();
	}
	
	//Method PUT
	@Override
	public Usuario actualizarUsuario(Usuario usuario) {
		
		return iUsuarioDAO.save(usuario);
	}
	
	//Method Delete
	@Override
	public void eliminarUsuario(Long id) {
		
		iUsuarioDAO.deleteById(id);
	}

}
