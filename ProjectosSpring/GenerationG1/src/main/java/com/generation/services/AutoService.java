package com.generation.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.generation.models.Auto;
import com.generation.repositories.AutoRepository;

@Service
@Transactional
public class AutoService {

	@Autowired
	AutoRepository autoRepository;
	
	public void guardarAuto(Auto auto) {
		autoRepository.save(auto);
	}

	public List<Auto> findAll() {

		return autoRepository.findAll();
	}

	public Auto buscarId(Integer id) {

		return autoRepository.findById(id).get();

	}

	public void eliminarPorId(Integer id) {

		autoRepository.deleteById(id);

	}

	public List<Auto> buscarMarca(String marca) {
		
		return autoRepository.buscarMarca(marca);
	}

	public List<Auto> buscarMarca2(String marca) {
		
		return autoRepository.findAllAutoMarca(marca);
	}
	
//paginacion
//variable estatica
	private static final int LOTE = 5; //cantidad datos a mostrar por pagina
	
	public Page<Auto> paginarAutos(int numeroPagina){ 
		PageRequest pageRequest = PageRequest.of(numeroPagina, LOTE,  Sort.Direction.ASC, "velocidad");
		//Page<Auto> autos = autoRepository.findAll(pageRequest);
		return autoRepository.findAll(pageRequest);
	}
}
