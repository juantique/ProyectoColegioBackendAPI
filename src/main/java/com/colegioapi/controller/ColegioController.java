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

import com.colegioapi.dto.Colegio;
import com.colegioapi.service.ColegioServiceImpl;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ColegioController {
	
	//Call Archive ColegioService implement
	@Autowired
	ColegioServiceImpl colegioServiceImpl; 
	
	//Method GET List College
	@GetMapping("/colegios")
	public List<Colegio> listarColegio(){
		return colegioServiceImpl.listarColegios();
	}
	
	//Method POST College
	@PostMapping("/colegios")
	public Colegio guardarColegio(@RequestBody Colegio colegio){
		return colegioServiceImpl.guardarColegio(colegio);
	}
	//@CrossOrigin(origins = "http://localhost:4200/editar/")
	//Method GET College for ID
	@GetMapping("/colegios/{id}")
	public Colegio colegioXID(@PathVariable(name = "id") Long id) {
		
		Colegio colegio_xid = new Colegio();
		
		colegio_xid = colegioServiceImpl.colegioXID(id);
		//view selection College
		System.out.println("colegio seleccionado: " + colegio_xid);
		return colegio_xid;
	}
	
	//Method Put College
	
	@PutMapping("/colegios/{id}")
	public Colegio actualizarColegio(@PathVariable(name = "id") Long id,@RequestBody Colegio colegio) {
	
		//Two variables of type College are created. One to select the school and the other to update
		Colegio colegio_seleccionado = new Colegio();
		Colegio colegio_actualizado = new Colegio();
		
		//select the id through the colegioServiceImpl.colegioXID(id) and capture it
		colegio_seleccionado = colegioServiceImpl.colegioXID(id);
		//fill the variable colegio_seleccionado:
		colegio_seleccionado.setNombre(colegio.getNombre());
		
		colegio_actualizado = colegioServiceImpl.actualizarColegio(colegio_seleccionado);
		
		System.out.println("El Colegio Actualizado es: " + colegio_actualizado);
		
		return colegio_actualizado;
	}
	
	//Method Delete College
	@DeleteMapping("/colegios/{id}")
	public void eliminarColegio(@PathVariable(name = "id") Long id) {
		colegioServiceImpl.eliminarColegio(id);
	}
	
}
