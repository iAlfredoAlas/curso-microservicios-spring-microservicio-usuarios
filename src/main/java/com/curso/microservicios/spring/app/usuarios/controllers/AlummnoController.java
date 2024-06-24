package com.curso.microservicios.spring.app.usuarios.controllers;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.microservicios.spring.app.usuarios.services.AlumnoService;
import com.curso.microservicios.spring.commons.controllers.CommonController;
import com.curso.microservicios.spring.generic.alumnos.models.entity.Alumno;

@RestController
public class AlummnoController extends CommonController<Alumno, AlumnoService> {

	@PutMapping("/{id}")
	public ResponseEntity<?> editar(@RequestBody Alumno alumno, @PathVariable Long id) {
		Optional<Alumno> optAlumno = service.findbyId(id);
		if (optAlumno.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		Alumno alumnoDb = optAlumno.get();
		alumnoDb.setNombre(alumno.getNombre());
		alumnoDb.setApellido(alumno.getApellido());
		alumnoDb.setEmail(alumno.getEmail());
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(alumnoDb));
	}

}
