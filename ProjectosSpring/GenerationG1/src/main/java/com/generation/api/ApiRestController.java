package com.generation.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.models.Auto;
import com.generation.services.AutoService;

@RestController
@RequestMapping("/api")
public class ApiRestController {
	
	Auto auto;
	
	@Autowired //inyeccion dependencias de clase para usar sus metodos, cuando la clase no tiene atributos
	AutoService autoService;
	
	@RequestMapping("/obtener/auto")
	public List<Auto> obtenerListaAutos(){	
		List<Auto> listaAutos = autoService.findAll();
		
		return listaAutos;
		
	}
		
	
	
	
	
	

}
