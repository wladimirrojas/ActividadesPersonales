package com.medicina.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicina.models.Paciente;
import com.medicina.repositories.PacienteRepository;

@Service
public class PacienteService {

	@Autowired
	PacienteRepository pacienteRepository;

	public void guardarPaciente(Paciente paciente) {

		pacienteRepository.save(paciente);
	}

	public List<Paciente> findAll() {

		return pacienteRepository.findAll();

	}

	public void eliminar(Long id) {

		pacienteRepository.deleteById(id);

	}

}
