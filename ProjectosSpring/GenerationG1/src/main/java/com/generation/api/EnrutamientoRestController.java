package com.generation.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class EnrutamientoRestController {

/** Enrutamiento */
	
	//http://localhost:8080/usuario
	@RequestMapping("/usuario")
	public String usuario() {
		return "Estamos en la url usuario";		
	}
	
	@RequestMapping("/usuario/inscrito") //ruta completamente distinta, no proviene de /usuario
	public String inscrito() {
		return "Estamos en la url usuario/inscrito";		
	}
	
	@RequestMapping("/cliente")
	public String cliente() {
		return "Ruta de cliente";
	}
	
	@RequestMapping(value = "/proveedor/registrado", method = RequestMethod.GET) //otra forma de @RequestMapping
	public String proveedor() {
		return "Estamos en la url proveedor";		
	}
}
