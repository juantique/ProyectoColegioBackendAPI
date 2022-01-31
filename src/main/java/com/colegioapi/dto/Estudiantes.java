package com.colegioapi.dto;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;



@Entity
@Table(name = "estudiantes")
public class Estudiantes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nombre")
	private String nombre;
	
	@ManyToMany(mappedBy = "estudiantes")
    private Set<Asignaturas> asignaturas = new HashSet<Asignaturas>();
	
	//Constructor
	public Estudiantes() {

	}
	
	//Constructor FULL	
	public Estudiantes(Long id, String nombre, Set<Asignaturas> asignaturas) {
		this.id = id;
		this.nombre = nombre;
		this.asignaturas = asignaturas;
	}

	//Generation Get and Set

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
	
	//View in Console
	//@Override
	//public String toString() {
		//return "Estudiantes [id=" + id + ", nombre=" + nombre + ", asignaturas=" + asignaturas + "]";
	//}
	
	
}
