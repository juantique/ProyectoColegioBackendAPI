package com.colegioapi.service;

import java.util.List;

import com.colegioapi.dto.Usuario;

public interface IUsuarioService {
	//Create the Methods:
	
		//Method GET
		public List<Usuario> listarUsuario();
		
		//Method POST
		public Usuario guardarUsuario(Usuario usuario);
		
		//Method Get for ID:
		public Usuario usuarioXID(Long id);
		
		//Method PUT
		public Usuario actualizarUsuario(Usuario usuario);
		
		//Method DELETE
		public void eliminarUsuario(Long id);
}
