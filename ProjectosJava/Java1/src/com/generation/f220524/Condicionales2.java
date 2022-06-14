package com.generation.f220524;

import java.util.Scanner;

public class Condicionales2 {
	
public static void main(String[] args) {
		
		// Definición de variables.
		int mayoriaEdad = 18;
		int saldoMinimo = 50000;
		int apuestaMinima = 10000;
		
		String nombre, apellido, direccion;
		Scanner entrada = new Scanner(System.in);
		int numeroTelefono, saldoActual;
		// Solicitud de edad
		System.out.println("Ingrese su edad");
		int edad = entrada.nextInt();
		
		
		if (edad < mayoriaEdad) {
			System.out.println("No está permitido su ingreso");
			
		} else { 
			
			System.out.println("Bienvenido");
			
			System.out.println("Por favor, ingrese su nombre");

			nombre = entrada.nextLine();
			
			System.out.println("Por favor, ingrese su dirección ej: Calle 123");
			
			direccion = entrada.nextLine();
			
			System.out.println("Ingrese su numero de telefono");
			
			numeroTelefono = entrada.nextInt();
			
			// Solicitar saldo
			System.out.println("Ingrese su saldo");
			
			 saldoActual = entrada.nextInt();
			
			if (saldoActual >= saldoMinimo) {
				
				System.out.println("Autorizado para apostar"); // Validar saldo, si puede o no realizar apuestas
				
				System.out.println("¿Cuanto desea apostar?");
				
				int montoApuesta = entrada.nextInt();
				
				saldoActual = saldoActual - montoApuesta;
				
				System.out.println("Tu saldo actual es: " + saldoActual);
				
			} else {
				System.out.println("No cumple con el saldo minimo");
			}
		}
	}

}
