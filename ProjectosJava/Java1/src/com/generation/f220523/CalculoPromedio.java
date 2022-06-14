package com.generation.f220523;

public class CalculoPromedio {

	public static void main(String[] args) {

		int cantidadNotas = 12;

		Integer[] notas = { 15, 40, 80, 45, 65, 76, 49, 55, 0, 87, 43, 32 }; // creacion de arreglo

		int sumaTotal = 0;
		float promedio = 0;
		boolean estado = true;
		// promedio - suma de notas y dividido en la cantidad

		for (int i = 0; i < notas.length; i++) {

			sumaTotal += notas[i];

		}

		promedio = sumaTotal / notas.length;

		if (promedio >= 50 && promedio <= 100) {

			System.out.println("Aprobado");

		} else {

			estado = false;
			System.out.println("Reprobado");

		}

	}
}
