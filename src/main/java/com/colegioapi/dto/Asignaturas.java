package com.colegioapi.dto;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "asignaturas")
public class Asignaturas {
	
	//Create table attributes
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column(name = "nombre")
		private String nombre;
	
	//Relation profesorId with table PROFESORES
		@ManyToOne(fetch=FetchType.EAGER)
		@JoinColumns({
			@JoinColumn(name="profesorId",referencedColumnName="id")		
		})
		Profesores profesores;
	
	//Relation profesorId with table CURSOS
		@ManyToOne(fetch=FetchType.EAGER)
		@JoinColumns({
			@JoinColumn(name="cursoid",referencedColumnName="id")		
		})
		Cursos cursos;
		
	//Relation cursoId with table INSCRIPCIONES
		@ManyToMany(fetch=FetchType.EAGER, cascade = {CascadeType.ALL})
	    @JoinTable(
	        name = "inscripciones", 
	        joinColumns = { @JoinColumn(name = "estudianteId") }, 
	        inverseJoinColumns = { @JoinColumn(name = "asignaturaId") }
	    )
	    Set<Estudiantes> estudiantes = new HashSet<Estudiantes>();
	
	//Constructor Empty
	public Asignaturas() {
		
	}
	//Constructor FULL
	public Asignaturas(Long id, String nombre, Profesores profesores, Cursos cursos, Set<Estudiantes> estudiantes) {
		this.id = id;
		this.nombre = nombre;
		this.profesores = profesores;
		this.cursos = cursos;
		this.estudiantes = estudiantes;
	}
	
	//Method GET And SET	
	
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
	public Profesores getProfesores() {
		return profesores;
	}
	public void setProfesores(Profesores profesores) {
		this.profesores = profesores;
	}
	public Cursos getCursos() {
		return cursos;
	}
	public void setCursos(Cursos cursos) {
		this.cursos = cursos;
	}
	public Set<Estudiantes> getEstudiantes() {
		return estudiantes;
	}
	public void setEstudiantes(Set<Estudiantes> estudiantes) {
		this.estudiantes = estudiantes;
	}
	
}
