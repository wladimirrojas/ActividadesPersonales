package com.generation.f220525;

import java.util.Scanner;

public class ActividadSeguros {

	public static void main(String[] args) {

		String nombre;
		int edadUsuario, edad, primaSeguro, sueldo, opcionMenu, rango;
		float tasaSueldo;
		opcionMenu = 0;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Por favor indique su edad: ");

		edadUsuario = Integer.parseInt(entrada.nextLine());
		
		if (edadUsuario > 70) {
			
			rango = 1;
			
		} else if (edadUsuario >= 50 && edadUsuario <= 69 ) {
			
			rango = 2;
			
		}else if (edadUsuario >= 30 && edadUsuario <= 49) {
			
			rango = 3;
			
		}else if (edadUsuario <= 29) {
			
			rango = 4;
			
		}else {
			
			rango = 0;
			
		}

		do {

			switch(rango) {
			
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			default:
				break;
			

			}

			} while (opcionMenu != 0);


		
entrada.close();
	}

}
