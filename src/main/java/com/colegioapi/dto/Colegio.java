package com.colegioapi.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//Decorador Entity JPA Activa:
@Entity
@Table(name = "colegio")
public class Colegio {
	
	//Emula la Tabla con los atributos los trasforma en objetos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name = "id")
	private Long id;
	
	@Column(name = "nombre")
	private String nombre;
	
	//Constructor empty
	public Colegio() {
		
	}
	
	//Constructor full	
	public Colegio(Long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	//Generation of GET y Set
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
	
	//print filled object in console
	@Override
	public String toString() {
		return "Colegio [id=" + id + ", nombre=" + nombre + "]";
	}
	
	
}
