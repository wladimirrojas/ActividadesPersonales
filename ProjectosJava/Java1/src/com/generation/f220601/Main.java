package com.generation.f220601;

import java.util.ArrayList;
import java.util.List;

import com.generation.f220601.modelo.Gato;
import com.generation.f220601.modelo.Mascota;
import com.generation.f220601.modelo.Perro;

public class Main {

	public static void main(String[] args) {
		
	Mascota mascota = new Mascota();
	
	mascota.setColor("Gris");
	mascota.setNombre("El nomishi");
	
	Perro perro = new Perro();
	perro.setColor("Rojo");
	
	Mascota perro1 = new Perro();	
		
	Gato gato = new Gato();
	
	List<Mascota> listaMascotas = new ArrayList<Mascota>();
	
	Mascota regalon = new Mascota("Negro", "Canes", "Pelo", "Firulais", 15.5f, "Masculino");
	
	listaMascotas.add(regalon);
	
	Mascota felix = new Gato();
	
	felix.setNombre("Felix");
	felix.setColor("Negro");
	felix.setPeso(3);
	felix.hacerSonido();
	listaMascotas.add(felix);
	
	Mascota chocolo = new Perro();
	
	chocolo.setNombre("Chocolo");
	chocolo.setColor("Cafesito");
	chocolo.setPeso(17);
	chocolo.hacerSonido();
	listaMascotas.add(chocolo);
	
	regalon.hacerSonido();
	
	for (Mascota mascotas2 : listaMascotas) {
		
		mascotas2.hacerSonido();
	}
	
	Perro perroChocolo = (Perro) chocolo;
	perro.setTamanoHocico(22f);
	
	listaMascotas.add(perroChocolo);
	
	}

}
