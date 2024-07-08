package com.curso.microservicios.spring.app.usuarios.models.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.curso.microservicios.spring.generic.alumnos.models.entity.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {

	@Query("select alu from Alumno alu where alu.nombre like %?1% or alu.apellido like %?1%")
	public List<Alumno> findByNombreOrApellido(String term);

}
