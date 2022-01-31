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

import com.colegioapi.dto.Inscripciones;
import com.colegioapi.service.InscripcionesServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class InscripcionesController {
	
	//Call Our Service
	@Autowired
	InscripcionesServiceImpl inscripcionesServiceImpl;
	
	//Method GET type list
	@GetMapping("/inscipciones")
	public List<Inscripciones> listarInscripciones(){
		return inscripcionesServiceImpl.listarInscripciones();
	}
	
	//Method POST
	@PostMapping("/inscipciones")
	public Inscripciones guardarInscripciones(@RequestBody Inscripciones inscripciones) {
		
		return inscripcionesServiceImpl.guardarInscripciones(inscripciones);
	}
	
	//Method GET for ID
	@GetMapping("/inscipciones/{id}")
	//does the id to id conversion @PathVariable:
	public Inscripciones inscripcionesXID(@PathVariable(name = "id") Long id) {
			
		Inscripciones inscripcione_xid = new Inscripciones();
		//the whole object saves it in the variable:
		inscripcione_xid = inscripcionesServiceImpl.inscripcionesXID(id);
			
		//see in console
		System.out.println("Profesor Seleccionado: " + inscripcione_xid);
		return inscripcione_xid;
	}
	
	//Method PUT
	@PutMapping("/inscipciones/{id}")
	public Inscripciones actualizarInscripciones(@PathVariable(name = "id") Long id, @RequestBody Inscripciones inscripciones) {
		
		Inscripciones inscripciones_seleccionado = new Inscripciones();
		Inscripciones inscripciones_actualizado = new Inscripciones();
			
		inscripciones_seleccionado = inscripcionesServiceImpl.inscripcionesXID(id);
		
		inscripciones_seleccionado.setAsignaturaId(inscripciones.getAsignaturaId());
		inscripciones_seleccionado.setEstudianteId(inscripciones.getEstudianteId());
		
		inscripciones_actualizado = inscripcionesServiceImpl.actualizarInscripciones(inscripciones_seleccionado);
		
		//see in console
		System.out.println("Profesor Actualizado es: " + inscripciones_actualizado);
			
		return inscripciones_actualizado;
	}
	
	//Method DELETE
	@DeleteMapping("/inscipciones/{id}")
	public void eliminarInscripciones(@PathVariable(name = "id") Long id) {
		inscripcionesServiceImpl.eliminarIncripciones(id);
	}
	
}
