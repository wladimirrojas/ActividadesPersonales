package com.medicina.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicina.models.CitaMedica;
import com.medicina.repositories.CitaMedicaRepository;

@Service
public class CitaMedicaService {

	@Autowired
	CitaMedicaRepository citaMedicaRepository;

	public void guardarCitaMedica(CitaMedica citaMedica) {
		citaMedicaRepository.save(citaMedica);
	}

	public List<CitaMedica> findAll() {
		return citaMedicaRepository.findAll();
	}
	
	public void eliminar(Long id) {
		
		citaMedicaRepository.deleteById(id);
		
	}
}
