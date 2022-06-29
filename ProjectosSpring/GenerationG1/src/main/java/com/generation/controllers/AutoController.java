package com.generation.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.generation.models.Auto;
import com.generation.services.AutoService;

@Controller
@RequestMapping("/registrar")
public class AutoController {

	@Autowired
	AutoService autoService;

	@RequestMapping("")
	public String registrar(@ModelAttribute("auto") Auto auto) {

		return "registroAuto.jsp";
	}

	@PostMapping("/auto")
	public String registrarAuto(@Valid @ModelAttribute("auto") Auto auto, BindingResult resultado, Model model) {
		if (resultado.hasErrors()) {
			model.addAttribute("mensaje", "Hay datos mal ingresados, por favor, intente nuevamente");
			return "registroAuto.jsp";
		} else {
			autoService.guardarAuto(auto);
			// obtener lista de autos
			List<Auto> listaAutos = autoService.findAll();
			// pasamos la lista de autos al jsp
			model.addAttribute("autosCapturados", listaAutos);
			return "mostrarAutosBoot.jsp";

		}
	}

	// solo mostrar el listado de autos
	@RequestMapping("/mostrar")
	public String mostrar(Model model) {
		List<Auto> listaAutos = autoService.findAll();
		// pasamos la lista de autos al jsp
		model.addAttribute("autosCapturados", listaAutos);
		return "mostrarAutosBoot.jsp";
	}

	@RequestMapping("/editar/{id}")
	public String editar(@PathVariable("id") Integer id, Model model) {

		Auto auto = autoService.buscarId(id);
		model.addAttribute("auto", auto);

		return "editarAuto.jsp";
	}
	
	@PostMapping("/actualizar/{id}")
	public String actualizarAuto(@PathVariable("id") Integer id, @Valid @ModelAttribute("auto") Auto auto, BindingResult resultado, Model model) {
		
		if (resultado.hasErrors()) {
			model.addAttribute("mensaje", "Hay datos mal ingresados, por favor, intente nuevamente");
			return "editarAuto.jsp";
		} else {
			auto.setId(id);
			autoService.guardarAuto(auto);
			// obtener lista de autos
			return "redirect:/registrar/mostrar";

		}
	}
	
	@RequestMapping("/eliminar/{id}")
	public String eliminarAuto(@PathVariable("id") Integer id) {
		
		autoService.eliminarPorId(id);
		
		return "redirect:/registrar/mostrar";
		
	}
	
	@PostMapping("/buscar")
	public String buscar(@RequestParam(value="marca") String marca, Model model) {
		//List<Auto> listaMarca = autoService.buscarMarca(marca); con version query native desde repository
		List<Auto> listaMarca = autoService.buscarMarca2(marca);
		model.addAttribute("autosCapturados", listaMarca);
		return "mostrarAutosBoot.jsp";		
	}
	
	@RequestMapping("/pagina/{numeroPagina}")
	public String paginarAutos(@PathVariable("numeroPagina") int numeroPagina, Model model) {
		
		//los iterables siempre empiezan en indice 0
		Page<Auto> listaAutos = autoService.paginarAutos(numeroPagina -1); //la paginacion empieza en 1. por eso hay que restar
		
		model.addAttribute("autosCapturados", listaAutos);
		model.addAttribute("totalPaginas" ,listaAutos.getTotalPages());
		
		return "paginacionAutos.jsp";
	}
}
