package com.generation.f220525;

import java.util.Scanner;

public class Reforzamiento {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // para poder pedir datos

		int num1, num2, suma, nextNum; // datos de entrada del usuario

		num1 = Integer.parseInt(sc.nextLine());
		num2 = Integer.parseInt(sc.nextLine());
		nextNum = 0;

		while (num1 > num2) {

			System.out.println("El primer n�mero debe ser menor que el segundo, por favor, reingrese el primer n�mero:");

			num1 = Integer.parseInt(sc.nextLine());

		}

		// codigo que nos pide volver a ingresar el n�mero 1

		do {

			suma = num1 + num2;

			System.out.println(suma);

		} while (nextNum != 0);
	}

}