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

import com.colegioapi.dto.Cursos;
import com.colegioapi.service.CursosServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")

public class CursosController {

	@Autowired
	CursosServiceImpl cursosServiceImpl;
	
	//Method GET
	@GetMapping("/cursos")
	public List<Cursos> listarCursos(){
		
		return cursosServiceImpl.listarCursos();
	}
	
	//Method POST
	@PostMapping("/cursos")
	public Cursos guardarCursos(@RequestBody Cursos cursos) {
			
		return cursosServiceImpl.guardarCursos(cursos);
	}
	
	
	//Method GET for ID
	@GetMapping("/cursos/{id}")
	//does the id to id conversion @PathVariable:
	public Cursos cursosXID(@PathVariable(name = "id") Long id) {
			
		Cursos cursos_xid = new Cursos();
		//the whole object saves it in the variable:
		cursos_xid = cursosServiceImpl.cursosXID(id);
			
		//see in console
		System.out.println("Curso Seleccionado: " + cursos_xid);
		return cursos_xid;
	}
		
	//Method PUT
	@PutMapping("/cursos/{id}")
	public Cursos actualizarCursos(@PathVariable(name = "id") Long id, @RequestBody Cursos cursos) {
			
		Cursos cursos_seleccionado = new Cursos();
		Cursos cursos_actualizado = new Cursos();
			
		cursos_seleccionado = cursosServiceImpl.cursosXID(id);
			
		cursos_seleccionado.setGrado(cursos.getGrado());
		cursos_seleccionado.setSalon(cursos.getSalon());
		cursos_seleccionado.setColegio(cursos.getColegio());
			
		cursos_actualizado = cursosServiceImpl.actualizarCursos(cursos_seleccionado);
			
		//see in console
		System.out.println("Profesor Actualizado es: " + cursos_actualizado);
			
		return cursos_actualizado;
	}
		
	//Method DELETE
	@DeleteMapping("/cursos/{id}")
	public void eliminarCursos(@PathVariable(name = "id") Long id) {
		cursosServiceImpl.eliminarCursos(id);
	}
}
