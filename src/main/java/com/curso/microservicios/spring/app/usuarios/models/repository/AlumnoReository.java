package com.curso.microservicios.spring.app.usuarios.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.curso.microservicios.spring.app.usuarios.models.entity.Alumno;

public interface AlumnoReository extends CrudRepository<Alumno, Long> {	

}
