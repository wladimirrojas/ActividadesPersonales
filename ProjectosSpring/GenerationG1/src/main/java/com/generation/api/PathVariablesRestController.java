package com.generation.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/var") //localhost:8080/var --> path for default
public class PathVariablesRestController {
	/** capturar variables desde la ruta o path*/
	
	
	@RequestMapping("/fecha/anio{a}/mes{m}/dia{d}")
	public String capturarVariablesPathLargo(@PathVariable("a") String anio,
			@PathVariable("m") String mes, @PathVariable("d") String dia) {
		
		return "fecha: "+anio+mes+dia;
	}
	
	@RequestMapping("/fecha/{a}/{m}/{d}")
	public String capturarVariablesPathCorto(@PathVariable("a") String anio,
			@PathVariable("m") String mes, @PathVariable("d") String dia) {
		
		return "fecha: "+anio+mes+dia;
	}
	
	@RequestMapping("/fecha+{a}+{m}+{d}")
	public String capturarVariablesPathAmper(@PathVariable("a") String anio,
			@PathVariable("m") String mes, @PathVariable("d") String dia) {
		
		return "fecha: "+anio+mes+dia;
	}
	
}
