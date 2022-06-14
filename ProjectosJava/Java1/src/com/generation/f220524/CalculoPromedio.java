package com.generation.f220524;

public class CalculoPromedio {

	public static void main(String[] args) {

		int cantidadNotas = 12;

		Integer[] notas = { 15, 40, 80, 45, 65, 76, 49, 55, 17, 87, 43, 31 }; // creacion de arreglo

		float sumaTotal = 0;
		float promedio = 0;
		boolean estado = true;
		int notasFueraRango = 0;
		// promedio - suma de notas y dividido en la cantidad

		for (int i = 0; i < notas.length; i++) {			
			
			if(notas[i] < 0 || notas[i] > 100) {
				
				System.out.println("la nota: " + notas[i] + " en la posición " + (i+1) + ", está fuera de rango");
				
				notasFueraRango++;
				
			}
			
			sumaTotal += notas[i];

		}

		promedio = sumaTotal / notas.length;

		//punto crítico
		if (promedio >= 50 && promedio <= 100) {

			System.out.println("Aprobado");
			
			System.out.println("Han sido ingresadas " + notasFueraRango + " notas fuera del rango 0-100");

		} else if (promedio >= 0 && promedio < 50){
						
			System.out.println("Han sido ingresadas " + notasFueraRango + " notas fuera del rango 0-100");
			
			estado = false;
			
			System.out.println("Reprobado");

		} else {
			
			System.out.println("El cálculo está fuera de los rangos");
			
		}

		System.out.println(promedio);
		
	}
}
