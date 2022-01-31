package com.colegioapi.dto;

import java.io.Serializable;

public class RelacioIncripciones implements Serializable {
	
	protected Integer estudianteId;
    protected Integer asignaturaId;
    
    public RelacioIncripciones() {}

    public RelacioIncripciones(Integer estudianteId, Integer asignaturaId) {
        this.estudianteId = estudianteId;
        this.asignaturaId = asignaturaId;
    }
}
