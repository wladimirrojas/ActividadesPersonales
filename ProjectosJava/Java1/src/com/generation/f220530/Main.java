package com.generation.f220530;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Alumno> grupo4 = new ArrayList<Alumno>(); //interfaz
		
		//intancia de una clase
		Alumno alumno = new Alumno();
		Alumno alumno1 = new Alumno();
		Alumno alumno2 = new Alumno();
		Alumno alumno3 = new Alumno();
		Alumno alumno4 = new Alumno();
				
		alumno = new Alumno("Danko", "Abarca", 25, "G1");
		alumno1 = new Alumno("Catalina", " Martínez", 25, "G1");
		alumno2 = new Alumno("Esteban", "Castañeda", 22, "G1");
		alumno3 = new Alumno("Katherina", "Orellana", 24, "G1");
		alumno4 = new Alumno("Wladimir", "Rojas", 27, "G1");
		
		grupo4.add(alumno);
		grupo4.add(alumno1);
		grupo4.add(alumno2);
		grupo4.add(alumno3);
		grupo4.add(alumno4);
		
		
		System.out.println("Alumno 1" + " " + alumno.datos());
		System.out.println("Alumno 2" + " " + alumno1.datos());
		System.out.println("Alumno 3" + " " + alumno2.datos());
		System.out.println("Alumno 4" + " " + alumno3.datos());
		System.out.println("Alumno 5" + " " + alumno4.datos());
		
		System.out.println(grupo4);
		
		for (Alumno dato : grupo4) {
			System.out.println(dato);
			
		}

		
	}
	
}
