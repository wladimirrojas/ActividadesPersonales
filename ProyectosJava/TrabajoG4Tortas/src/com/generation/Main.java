package com.generation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.generation.modelos.Torta;

public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		List<Torta> tortas = new ArrayList<Torta>();
		
		int opcion = 0;
		
		do {
			
		
		
		
		Torta tortaPrueba = new Torta(1, 15, null, null, 25, true, true, false);
		Torta tortaPrueba2 = new Torta();
		
		
		tortaPrueba2.setAncho(50);
		tortaPrueba2.setLargo(50);
		tortaPrueba2.setConDiseno(false);
		tortaPrueba2.setEsVegano(false);
		tortaPrueba2.setDeEvento(true);
				
		System.out.println(tortaPrueba);
		System.out.println(tortaPrueba2);
		
		//excepciones
		
		System.out.println("Ingrese forma de la torta");
		Integer forma = Integer.parseInt(entrada.nextLine()); 
		tortaPrueba2.setForma(forma);
		
		System.out.println("Ingrese alto de la torta");
		Integer alto = Integer.parseInt(entrada.nextLine());
		tortaPrueba2.setAlto(alto);
		
		} while (opcion == 1);
		
		
		
		
		
	}

}
