package com.curso.microservicios.spring.app.usuarios.services;

import java.util.Optional;

import com.curso.microservicios.spring.app.usuarios.models.entity.Alumno;

public interface AlumnoService {

	public Iterable<Alumno> findall();
	
	public Optional<Alumno> findbyId(Long id);
	
	public Alumno save(Alumno alumno);
	
	public void deleteById(Long id);
	
}
