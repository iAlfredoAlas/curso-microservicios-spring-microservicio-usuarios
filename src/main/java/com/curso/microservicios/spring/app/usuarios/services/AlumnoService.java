package com.curso.microservicios.spring.app.usuarios.services;

import java.util.List;

import com.curso.microservicios.spring.commons.services.CommonService;
import com.curso.microservicios.spring.generic.alumnos.models.entity.Alumno;

public interface AlumnoService extends CommonService<Alumno> {

	public List<Alumno> findByNombreOrApellido(String term);
	
}
