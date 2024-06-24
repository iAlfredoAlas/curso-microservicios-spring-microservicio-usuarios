package com.curso.microservicios.spring.app.usuarios.services;

import org.springframework.stereotype.Service;

import com.curso.microservicios.spring.app.usuarios.models.repository.AlumnoRepository;
import com.curso.microservicios.spring.commons.services.CommonServiceImpl;
import com.curso.microservicios.spring.generic.alumnos.models.entity.Alumno;

@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements AlumnoService {

}
