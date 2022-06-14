package Ejercicio.Main;

import Ejercicio.Modelo.Flauta;

public class Main {

	public static void main(String[] args) {
		
		
		Flauta flauta = new Flauta();
		
		//desde clase Instrumento
		flauta.setTipoInstrumento("Viento");
		flauta.setTamano(30);
		flauta.setMaterial("Acero inoxidable");
		
		//desde clase Viento
		flauta.setTipoBoquilla("Lengüeta");
		flauta.setCantidadOrificios(13);
		
		//desde Flauta
		flauta.setTipoFlauta("Traversa");
		flauta.setNroModelo("Flauta traversa 1000 v2.0");
		
		System.out.println(flauta);

	}

}
