package com.generation.controllers;

import java.time.LocalDateTime;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.generation.models.Licencia;
import com.generation.models.Usuario;
import com.generation.services.LicenciaService;
import com.generation.services.UsuarioService;

@Controller
@RequestMapping("/licencia")
public class LicenciaController {

	@Autowired
	LicenciaService licenciaService;

	@Autowired
	UsuarioService usuarioService;

	@RequestMapping("")
	public String despliegue(Model model) {
		model.addAttribute("licencia", new Licencia());
		
		// lista de usuarios para desplegar
		List<Usuario> listaUsuarios = usuarioService.findAll();
		model.addAttribute("listaUsuarios", listaUsuarios);
		
		//enviar la lista de Licencias
		List<Licencia> listaLicencias = licenciaService.findAll();
		model.addAttribute("listaLicencias", listaLicencias);
		
		
		return "licencia.jsp";
	}
	
	@PostMapping("/guardar")
	public String guardarLicencia(@Valid @ModelAttribute("licencia") Licencia licencia) {
		
		licenciaService.save(licencia);
		
		return "redirect:/licencia";
		
	}
}
