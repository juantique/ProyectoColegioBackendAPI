package com.colegioapi.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Entity Decorator: activate the JPA
@Entity
@Table(name = "profesores")
public class Profesores {
	
//Create table attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre")
	private String nombre;
	
	//Generate Empty Constructor For HIBERNATE:
	public Profesores() {
		
	}
	
	//Generate Constructor Full
	public Profesores(Long id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	
	//Generate Get and Set of all attributes
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Generate ToString in console and see what it shows
	@Override
	public String toString() {
		return "Profesores [id=" + id + ", nombre=" + nombre + "]";
	}
	
}
