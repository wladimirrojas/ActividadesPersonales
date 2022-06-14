package com.generation.f220525;
import java.util.Scanner;

public class BucleWhile {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int cantidadImpares = entrada.nextInt();
		int contadorImpares = 0;
		int sumaTotal = 0;
		
		while (contadorImpares <= cantidadImpares) {			
			
			if (isOdd(contadorImpares) == true) {
				
				sumaTotal += contadorImpares;
				
			}
			contadorImpares++;			
		}
		
		System.out.println(sumaTotal);
		
		}

		public static boolean isOdd (int numero) {
			return numero % 2 != 0;
		   }

	}