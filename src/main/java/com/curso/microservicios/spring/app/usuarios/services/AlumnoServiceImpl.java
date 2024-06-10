package com.curso.microservicios.spring.app.usuarios.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.curso.microservicios.spring.app.usuarios.models.entity.Alumno;
import com.curso.microservicios.spring.app.usuarios.models.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoService {
	
	@Autowired
	private AlumnoRepository alumnoRepository;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Alumno> findall() {
		return alumnoRepository.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Alumno> findbyId(Long id) {
		return alumnoRepository.findById(id);
	}

	@Override
	@Transactional
	public Alumno save(Alumno alumno) {
		return alumnoRepository.save(alumno);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		alumnoRepository.deleteById(id);
	}

}
