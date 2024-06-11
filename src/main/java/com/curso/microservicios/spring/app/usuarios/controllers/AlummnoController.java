package com.curso.microservicios.spring.app.usuarios.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.curso.microservicios.spring.app.usuarios.models.entity.Alumno;
import com.curso.microservicios.spring.app.usuarios.services.AlumnoService;

@RestController
public class AlummnoController {

	@Autowired
	private AlumnoService alumnoService;

	@GetMapping("/")
	public ResponseEntity<?> listar() {
		return ResponseEntity.ok().body(alumnoService.findall());
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> ver(@PathVariable Long id) {
		Optional<Alumno> optAlumno = alumnoService.findbyId(id);
		if (optAlumno.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(optAlumno.get());
	}

	@PostMapping("/")
	public ResponseEntity<?> crear(@RequestBody Alumno alumno) {
		Alumno alumnoDb = alumnoService.save(alumno);
		return ResponseEntity.status(HttpStatus.CREATED).body(alumnoDb);
	}

	@PutMapping("/{id}")
	public ResponseEntity<?> editar(@RequestBody Alumno alumno, @PathVariable Long id) {
		Optional<Alumno> optAlumno = alumnoService.findbyId(id);
		if (optAlumno.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		Alumno alumnoDb = optAlumno.get();
		alumnoDb.setNombre(alumno.getNombre());
		alumnoDb.setApellido(alumno.getApellido());
		alumnoDb.setEmail(alumno.getEmail());
		return ResponseEntity.status(HttpStatus.CREATED).body(alumnoService.save(alumnoDb));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> eliminar(@PathVariable Long id) {
		alumnoService.deleteById(id);
		return ResponseEntity.noContent().build();
	}

}
