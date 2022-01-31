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

import com.colegioapi.dto.Asignaturas;
import com.colegioapi.service.AsignaturasServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class AsignaturasController {

	//Call Our Service
	@Autowired
	AsignaturasServiceImpl asignaturasServiceImpl;
	
	//Method GET type list
	@GetMapping("/asignaturas")
	public List<Asignaturas> listarAsignaturas(){
		return asignaturasServiceImpl.listarAsignaturas();
	}
	
	//Method PUT
	@PostMapping("/asignaturas")
	public Asignaturas guardarAsignaturas(@RequestBody Asignaturas asignaturas) {
				
		return asignaturasServiceImpl.guardarAsignaturas(asignaturas);
	}
			
	//Method GET for ID
	@GetMapping("/asignaturas/{id}")
	//does the id to id conversion @PathVariable:
	public Asignaturas asignaturasXID(@PathVariable(name = "id") Long id) {
				
		Asignaturas asignaturas_xid = new Asignaturas();
		//the whole object saves it in the variable:
		asignaturas_xid = asignaturasServiceImpl.asignaturasXID(id);
				
		//see in console
		System.out.println("Asignatura Seleccionado: " + asignaturas_xid);
		return asignaturas_xid;
	}
			
	//Method POST
	@PutMapping("/asignaturas/{id}")
	public Asignaturas actualizarAsignaturas(@PathVariable(name = "id") Long id, @RequestBody Asignaturas asignaturas) {
				
		Asignaturas asignaturas_seleccionado = new Asignaturas();
		Asignaturas asignaturas_actualizado = new Asignaturas();
				
		asignaturas_seleccionado = asignaturasServiceImpl.asignaturasXID(id);
		
		asignaturas_seleccionado.setNombre(asignaturas.getNombre());
		//asignaturas_seleccionado.setCursos(asignaturas.getCursos());
		asignaturas_seleccionado.setProfesores(asignaturas.getProfesores());
				
		asignaturas_actualizado = asignaturasServiceImpl.actualizarAsignaturas(asignaturas_seleccionado);
				
		//see in console
		System.out.println("Asignatura Actualizada es: " + asignaturas_actualizado);
				
		return asignaturas_actualizado;
	}
			
	//Method DELETE
	@DeleteMapping("/asignaturas/{id}")
	public void eliminarAsignaturas(@PathVariable(name = "id") Long id) {
		asignaturasServiceImpl.eliminarAsignaturas(id);
	}
	
}
