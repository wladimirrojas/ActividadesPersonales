package com.generation.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.generation.models.Usuario;
import com.generation.services.UsuarioService;

@Controller
@RequestMapping("/registro")
public class RegistroController {
	
	//inyeccion de dependencias
	
	@Autowired
	UsuarioService usuarioService;

	// ruta para desplegar el jsp de registro
	@RequestMapping("")
	public String registro(@ModelAttribute("usuario") Usuario usuario) {  //para trabajar con atributos de moduleAttribute en el jsp //pasamos objeto vacío
		
		return "registro.jsp";
	}

	// caputar datos del formulario
	@PostMapping("/usuario/respaldo")  //post y no request, post solo usa post y no get, request ambos
	public String registroUsuarioRespaldo(@RequestParam(value="nombre") String  nombre,
			@RequestParam(value="apellido") String  apellido,
			@RequestParam(value="edad") String  edad) { //nombre viene de name= desde registro.jsp
		System.out.println("Estamos en el método de registro usuario de:  " + nombre +" "+ apellido +" "+ edad);

		return "registro.jsp";
	}
	
	@PostMapping("/usuario")  //post y no request, post solo usa post y no get, request ambos
public String guardarUsuario(@Valid @ModelAttribute("usuario") Usuario usuario, BindingResult resultado,
		Model model) {  //para trabajar con atributos de moduleAttribute en el jsp //pasamos objeto vacío
		if (resultado.hasErrors()) { //capturando si existe un error en el ingreso de datos desde el jsp
			model.addAttribute("msgError", "Debe realizar ingreso correcto de los datos");
			return "registro.jsp";
		}else {
		
		System.out.println(usuario.getNombre() + " " + usuario.getApellido() + " " + usuario.getEdad());
		
		//enviar objeto al service
		usuarioService.saveUsuario(usuario);
		
		
		return "ingresado.jsp";
		}
	}
	
}
