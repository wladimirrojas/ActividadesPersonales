package com.generation.f220524;

import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {
		
		
		/* ingreso de nombre
		 * solicitar todos los string nombre, apellido, direcci�n, 
		 * solicitar num�ricos  edad direccionnro
		 * ingrese un saldo  billullo
		 * 
		 * validar que usuario sea mayor de edad  / no puede ingresar
		 * que tenga saldo minimo de 50000 / no puede apostar
		 * dispuesta a apuesta / cuanto a apostar, no apostar mayor al monto / minimo de apuesta 10k
		 * 
		 * */
		Scanner entrada = new Scanner(System.in);
		
		String nombre, apellido, direccion, recargaSN;
		int nroCasa, edad, saldo, edadMayoria, montoApuesta, saldoMin, apuestaMin, saldoRec;
		edadMayoria = 18;
		saldoMin = 50000;
		apuestaMin = 10000;
		
		
		//pedido de los datos
		
		System.out.println("Ingrese su nombre, por favor");
		nombre = entrada.nextLine();
		
		System.out.println("Ingrese su apellido, por favor");
		apellido = entrada.nextLine();
		
		System.out.println("Ingrese su direcci�n sin n�mero, por favor");
		direccion = entrada.nextLine();
		
		System.out.println("Ingrese el n�mero de su direcci�n, por favor");
		nroCasa = entrada.nextInt();
		
		//
		
		System.out.println("Ingrese su edad, por favor");
		edad = entrada.nextInt();
		
		System.out.println("Ingrese su saldo, por favor");
		saldo = entrada.nextInt();
		
		/*if (saldo < saldoMin) {
			
			System.out.println("Saldo no cumple el m�nimo, Deseas recargar tu saldo?, ingrese S o N");
			recargaSN = entrada.nextLine();
			
			if (recargaSN == "S") {
				
				saldoRec = entrada.nextInt();
			
				saldo += saldoRec;	
			
		}*/
		
		
		//validaciones
		
		if (edad >= edadMayoria) {
			
			System.out.println("Usted cumple con la edad requerida");
			
			if (saldo >= saldoMin) {
				
				System.out.println("Su saldo est� dentro del rango para apostar");
				
				System.out.println("Por favor, ingrese el monto a apostar");
				montoApuesta =  entrada.nextInt();
				

				if (montoApuesta >= apuestaMin) {
					
					System.out.println("Apuesta registrada con �xito, BUENA SUERTE!");
					
				} else {
					
					System.out.println("Su apuesta no cumple el m�nimo requerido");
					
				}
								
			} else {
				
				System.out.println("No se permite el ingreso dado que hay un monto m�nimo de saldo / Saldo Insuficiente");
				
			}
			
		} else {
			
			System.out.println("No est� permitido el ingreso a menores de edad");
			
		}

	}

}

