package com.medicina.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.medicina.models.Paciente;
import com.medicina.services.PacienteService;

@Controller
@RequestMapping("/paciente")
public class PacienteController {

	@Autowired
	PacienteService pacienteService;

	@RequestMapping("")
	public String despliegue(@ModelAttribute("paciente") Paciente paciente) {
		return "paciente.jsp";
	}

	@RequestMapping("/guardarPaciente")
	public String guardarPaciente(@Valid @ModelAttribute("paciente") Paciente paciente, Model model) {

		pacienteService.guardarPaciente(paciente);

		return "redirect:/paciente";
	}
	
	@RequestMapping("/mostrarPacientes")
	public String mostrarPacientes(@Valid @ModelAttribute("paciente") Paciente paciente, Model model) {
		
		List<Paciente> listaPacientes = pacienteService.findAll();
		
		model.addAttribute("listaPacientes", listaPacientes);
		
		return "mostrarPacientes.jsp";
	}
	
	@RequestMapping("/eliminar/{id}")
	public String eliminar (@PathVariable("id") Long id) {
		
		pacienteService.eliminar(id);
		
		return "redirect:/paciente/mostrarPacientes";		
		
	}
	
		
	

}
