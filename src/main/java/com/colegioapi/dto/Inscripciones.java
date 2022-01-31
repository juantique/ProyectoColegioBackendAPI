package com.colegioapi.dto;

import java.io.Serializable;

import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "inscripciones")
@IdClass(RelacioIncripciones.class)
public class Inscripciones implements Serializable{
	
	@Id
	@Column(name = "estudianteId")
	private int estudianteId;
	@Id
	@Column(name = "asignaturaId")
	private int asignaturaId;
	
	//Create Constructor Empty
	public Inscripciones() {
		
	}

	//Create Constructor FULL
	public Inscripciones(int estudianteId, int asignaturaId) {
		this.estudianteId = estudianteId;
		this.asignaturaId = asignaturaId;
	}
	
	//Generate GET And SET
	public int getEstudianteId() {
		return estudianteId;
	}

	public void setEstudianteId(int estudianteId) {
		this.estudianteId = estudianteId;
	}

	public int getAsignaturaId() {
		return asignaturaId;
	}

	public void setAsignaturaId(int asignaturaId) {
		this.asignaturaId = asignaturaId;
	}
	
	//View Console Result
	@Override
	public String toString() {
		return "Inscripciones [estudianteId=" + estudianteId + ", asignaturaId=" + asignaturaId + "]";
	}
	
}
