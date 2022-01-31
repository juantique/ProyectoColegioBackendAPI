package com.colegioapi.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cursos")
public class Cursos {
	
	//Create table attributes
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@Column(name = "grado")
		private int grado;
		
		@Column(name = "salon")
		private String salon;
		
		@ManyToOne(fetch=FetchType.EAGER)
		@JoinColumns({
			@JoinColumn(name="colegioId",referencedColumnName="id")		
		})
		Colegio colegio;
		
		//Constructor empty
		public Cursos() {
			
		}
		
		//Constructor full
		public Cursos(Long id, int grado, String salon, Colegio colegio) {
			this.id = id;
			this.grado = grado;
			this.salon = salon;
			this.colegio = colegio;
		}
		
		//Generation of GET y Set
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public int getGrado() {
			return grado;
		}

		public void setGrado(int grado) {
			this.grado = grado;
		}

		public String getSalon() {
			return salon;
		}

		public void setSalon(String salon) {
			this.salon = salon;
		}

		public Colegio getColegio() {
			return colegio;
		}

		public void setColegio(Colegio colegio) {
			this.colegio = colegio;
		}
		
		//print filled object in console
		@Override
		public String toString() {
			return "Cursos [id=" + id + ", grado=" + grado + ", salon=" + salon + ", colegio=" + colegio + "]";
		}
		
		
		
}
