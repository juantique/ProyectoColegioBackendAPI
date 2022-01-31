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

import com.colegioapi.dto.Estudiantes;
import com.colegioapi.service.EstudiantesServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class EstudiantesController {
	
//Call Our Service
		@Autowired
		EstudiantesServiceImpl estudiantesServiceImpl;
		
		//Method GET type list
		@GetMapping("/estudiantes")
		public List<Estudiantes> listarestudiantes(){
			return estudiantesServiceImpl.listarEstudiantes();
		}
		
		//Method POST
		@PostMapping("/estudiantes")
		public Estudiantes guardarEstudiantes(@RequestBody Estudiantes estudiantes) {
			
			return estudiantesServiceImpl.guardarEstudiantes(estudiantes);
		}
		
		//Method GET for ID
		@GetMapping("/estudiantes/{id}")
		//does the id to id conversion @PathVariable:
		public Estudiantes estudiantesXID(@PathVariable(name = "id") Long id) {
			
			Estudiantes estudiantes_xid = new Estudiantes();
			//the whole object saves it in the variable:
			estudiantes_xid = estudiantesServiceImpl.estudiantesXID(id);
			
			//see in console
			System.out.println("Profesor Seleccionado: " + estudiantes_xid);
			return estudiantes_xid;
		}
		
		//Method PUT
		@PutMapping("/estudiantes/{id}")
		public Estudiantes actualizarEstudiantes(@PathVariable(name = "id") Long id, @RequestBody Estudiantes estudiantes) {
			
			Estudiantes estudiantes_seleccionado = new Estudiantes();
			Estudiantes estudiantes_actualizado = new Estudiantes();
			
			estudiantes_seleccionado = estudiantesServiceImpl.estudiantesXID(id);
			
			estudiantes_seleccionado.setNombre(estudiantes.getNombre());
			
			estudiantes_actualizado = estudiantesServiceImpl.actualizarEstudiantes(estudiantes_seleccionado);
			
			//see in console
			System.out.println("Profesor Actualizado es: " + estudiantes_actualizado);
			
			return estudiantes_actualizado;
		}
		
		//Method DELETE
		@DeleteMapping("/estudiantes/{id}")
		public void eliminarEstudiantes(@PathVariable(name = "id") Long id) {
			estudiantesServiceImpl.eliminarEstudiantes(id);
		}

}
