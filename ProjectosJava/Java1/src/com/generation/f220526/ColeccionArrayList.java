package com.generation.f220526;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ColeccionArrayList {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		ArrayList<String> colores = new ArrayList<String>();
		
		
		/*for (int i = 0; i < 10; i++) {
			
			System.out.println("Ingrese un color nro " + (i+1) + ": " );
			colores.add(entrada.nextLine());
			
			
		}
		
		System.out.println(colores);*/
		
		
		colores.add(0, "Azul");
		colores.add(1, "Celeste");
		colores.add(2, "Rojo");
		colores.add(3, "Verde");
		colores.add(4, "Negro");
		colores.add(2, "prueba");
		
		System.out.println(colores);
		
		
		
		//tamaño setHash
		colores.size();	
		
		//modificar dato en ArrayList
		colores.set(2, "prueba2");
		
		//quitar elemento
		colores.remove(2);
		
		//quitar todos los elementos
		//colores.clear();
		
		//recorrer el arreglo
		for (int i = 0; i < colores.size(); i++) {
			
			System.out.println(colores.get(i));
			
		}
		
		for (String color : colores) {
			
			System.out.println(color);
			
		}
		
		//desordenar de forma aleatoria
		Collections.shuffle(colores);
		
		
		//ordenar de forma ascendente
		Collections.sort(colores);
		
		//ordenar al reves del ultimo orden
		Collections.reverse(colores);
		
		
		
	
		
	}

}
