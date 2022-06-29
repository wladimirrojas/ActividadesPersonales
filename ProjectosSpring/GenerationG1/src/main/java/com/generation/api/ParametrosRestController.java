package com.generation.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api2")
public class ParametrosRestController {
	
	//localhost:8080/api?fecha=20220613
	@RequestMapping("")
	public String fecha(@RequestParam(value="fecha") String fecha ) {
		
		return "la fecha es: " + fecha;
	}
	
	//localhost:8080/api/seccion?modulo=3&seccion=5
	@RequestMapping("/seccion")
	public String seccion(@RequestParam(value="modulo") String modulo,  //deben estar los dos parámetros, puede ser conmutativo
			@RequestParam(value="seccion") String seccion) {
		
		return "el modulo es: " + modulo + " y la seccion es: " + seccion;
	}
	
	@RequestMapping("/nombre")
	public String nombre(@RequestParam(value="nombre") String nombre ) {
		
		return "tu nombre es: " + nombre;
	}
	
	/** rutas con parametros no obligatorios*/
	
	//localhost:8080/api/date?anio=2022&mes=06&dia=13
	@RequestMapping("/date")
	public String capturarParametros(@RequestParam(value="anio", required= false) String anio,
			@RequestParam(value="mes", required= false) String mes,
			@RequestParam(value="dia", required= false) String dia) {
		return "El año es: " + anio + ", el mes es: " + mes + ", el día es: " + dia;
	}
}
