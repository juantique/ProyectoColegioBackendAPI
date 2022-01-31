package com.colegioapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.colegioapi.dto.Usuario;
import com.colegioapi.service.UsuarioServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class UsuarioController {
	
	//Call Our Service
	@Autowired
	UsuarioServiceImpl usuarioServiceImpl;
	
	//Method GET type list
	@GetMapping("/usuario")
	public List<Usuario> listarUsuario(){
		return usuarioServiceImpl.listarUsuario();
	}
	
	//Method POST
	@PostMapping("/usuario")
	public Usuario guardarUsuario(@RequestBody Usuario usuario) {
			
		return usuarioServiceImpl.guardarUsuario(usuario);
	}
		
	//Method GET for ID
	@GetMapping("/usuario/{id}")
	//does the id to id conversion @PathVariable:
	public Usuario usuarioXID(@PathVariable(name = "id") Long id) {
			
		Usuario usuario_xid = new Usuario();
		//the whole object saves it in the variable:
		usuario_xid = usuarioServiceImpl.usuarioXID(id);
			
		//see in console
		System.out.println("Profesor Seleccionado: " + usuario_xid);
		return usuario_xid;
	}
		
	//Method PUT
	@PutMapping("/usuario/{id}")
	public Usuario actualizarUsuario(@PathVariable(name = "id") Long id, @RequestBody Usuario usuario) {
			
		Usuario usuario_seleccionado = new Usuario();
		Usuario usuario_actualizado = new Usuario();
			
		usuario_seleccionado = usuarioServiceImpl.usuarioXID(id);
			
		usuario_seleccionado.setNombre(usuario.getNombre());
		usuario_seleccionado.setPassword(usuario.getPassword());
			
		usuario_actualizado = usuarioServiceImpl.actualizarUsuario(usuario_seleccionado);
			
		//see in console
		System.out.println("Profesor Actualizado es: " + usuario_actualizado);
			
		return usuario_actualizado;
	}
		
		//Method DELETE
		@DeleteMapping("/usuario/{id}")
		public void eliminarUsuario(@PathVariable(name = "id") Long id) {
			
			usuarioServiceImpl.eliminarUsuario(id);
		}
}
