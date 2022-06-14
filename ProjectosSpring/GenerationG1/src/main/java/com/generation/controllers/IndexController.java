package com.generation.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.generation.models.Usuario;

@Controller
public class IndexController {
	// http://localhost:8080/
	@RequestMapping("/") // anotacion para capturar rutas
	public String index(Model model) {

		model.addAttribute("apellido", "Rojas");
		model.addAttribute("nombre", "Wladimir");

		// pasando el objeto a la vista
		Usuario usuario = new Usuario("Wladimir", "Rojas", 27);

		model.addAttribute("usuario", usuario);
		return "index.jsp";

	}

}