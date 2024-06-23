package com.curso.microservicios.spring.app.usuarios.services;

import org.springframework.stereotype.Service;

import com.curso.microservicios.spring.app.usuarios.models.entity.Alumno;
import com.curso.microservicios.spring.app.usuarios.models.repository.AlumnoRepository;
import com.curso.microservicios.spring.commons.services.CommonServiceImpl;

@Service
public class AlumnoServiceImpl extends CommonServiceImpl<Alumno, AlumnoRepository> implements AlumnoService {

}
