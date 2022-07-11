package com.medicina.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.medicina.models.CitaMedica;
import com.medicina.models.Paciente;
import com.medicina.services.CitaMedicaService;
import com.medicina.services.PacienteService;

@Controller
@RequestMapping("cita")
public class CitaMedicaController {

	@Autowired
	CitaMedicaService citaMedicaService;

	@Autowired
	PacienteService pacienteService;

	@RequestMapping("")
	public String despliegue(@Valid @ModelAttribute("citaMedica") CitaMedica citaMedica, Model model){
		
		model.addAttribute("paciente", new Paciente());
		
		List<Paciente> listaPacientes = pacienteService.findAll();
		model.addAttribute("listaPacientes", listaPacientes);		

		return "citaMedica.jsp";
	}

	@PostMapping("/guardarCita")
	public String guardarCita(@Valid @ModelAttribute("citaMedica") CitaMedica citaMedica) {

		citaMedicaService.guardarCitaMedica(citaMedica);

		return "redirect:/cita";
	}

	@RequestMapping("/mostrarCitas")
	public String mostrarCitas(@Valid @ModelAttribute("citaMedica") CitaMedica citaMedica, Model model) {

		List<CitaMedica> listaCitas = citaMedicaService.findAll();
		model.addAttribute("listaCitas", listaCitas);

		return "mostrarCitas.jsp";
	}
	
	@RequestMapping("/eliminar/{id}")
	public String eliminarCita(@PathVariable("id") Long id) {
		
		citaMedicaService.eliminar(id);
		
		return "redirect:/cita/mostrarCitas";
	}
	
	
}