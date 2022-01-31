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

import com.colegioapi.dto.Profesores;
import com.colegioapi.service.ProfesoresServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ProfesoresController {
	
	//Call Our Service
	@Autowired
	ProfesoresServiceImpl profesoresServiceImpl;
	
	//Method GET type list
	@GetMapping("/profesores")
	public List<Profesores> listarProfesores(){
		return profesoresServiceImpl.listarProfesores();
	}
	
	//Method POST
	@PostMapping("/profesores")
	public Profesores guardarProfesores(@RequestBody Profesores profesores) {
		
		return profesoresServiceImpl.guardarProfesores(profesores);
	}
	
	//Method GET for ID
	@GetMapping("/profesores/{id}")
	//does the id to id conversion @PathVariable:
	public Profesores profesoresXID(@PathVariable(name = "id") Long id) {
		
		Profesores profesores_xid = new Profesores();
		//the whole object saves it in the variable:
		profesores_xid = profesoresServiceImpl.profesoresXID(id);
		
		//see in console
		System.out.println("Profesor Seleccionado: " + profesores_xid);
		return profesores_xid;
	}
	
	//Method PUT
	@PutMapping("/profesores/{id}")
	public Profesores actualizarProfesores(@PathVariable(name = "id") Long id, @RequestBody Profesores profesores) {
		
		Profesores profesores_seleccionado = new Profesores();
		Profesores profesores_actualizado = new Profesores();
		
		profesores_seleccionado = profesoresServiceImpl.profesoresXID(id);
		
		profesores_seleccionado.setNombre(profesores.getNombre());
		
		profesores_actualizado = profesoresServiceImpl.actualizarProfesores(profesores_seleccionado);
		
		//see in console
		System.out.println("Profesor Actualizado es: " + profesores_actualizado);
		
		return profesores_actualizado;
	}
	
	//Method DELETE
	@DeleteMapping("/profesores/{id}")
	public void eliminarProfesores(@PathVariable(name = "id") Long id) {
		profesoresServiceImpl.eliminarProfesores(id);
	}
}
