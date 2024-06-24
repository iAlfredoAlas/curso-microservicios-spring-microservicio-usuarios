package com.curso.microservicios.spring.app.usuarios.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.curso.microservicios.spring.generic.alumnos.models.entity.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {	

}
