package com.generation.f220527;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EjercicioGrupo27 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int platoElegido, pureCon, arrozCon;

		ArrayList<String> arroz = new ArrayList<String>();
		ArrayList<String> pure = new ArrayList<String>();

		arroz.add("Chauf�");
		arroz.add("Pollo Arbejado");

		pure.add("Pescado");
		pure.add("Filete");

		HashMap platos = new HashMap();

		platos.put("Arroz", arroz);
		platos.put("Pur�", pure);

		System.out.println("*****************************");
		System.out.println("**********   Men�   *********");
		System.out.println("*****************************");
		System.out.println("******* Elija su plato ******");
		System.out.println("*****************************");
		System.out.println(platos);
		System.out.println("*****************************");
		System.out.println("******Arroz o Pur� 1-2*******");

		platoElegido = Integer.parseInt(entrada.nextLine());

		if (platoElegido == 1) {

			System.out.println(platos.get("Arroz"));
			System.out.println("Elija su agregado o tipo con 1-2");
			arrozCon = Integer.parseInt(entrada.nextLine());
			if (arrozCon == 1) {

				System.out.println("Usted a elegido arroz: " + arroz.get(0));
			} else if ((arrozCon == 2)) {

				System.out.println("Usted a elegido arroz: " + arroz.get(1));

			} else {
				System.out.println("Opci�n inv�lida, hasta luego");
			}

		} else if (platoElegido == 2) {

			System.out.println(platos.get("Pur�"));
			System.out.println("Elija su agregado o tipo con 1-2");
			pureCon = Integer.parseInt(entrada.nextLine());

			if (pureCon == 1) {

				System.out.println("Usted a elegido pur�: " + pure.get(0));
			} else if ((pureCon == 2)) {

				System.out.println("Usted a elegido pur�: " + pure.get(1));

			} else {
				System.out.println("Opci�n inv�lida, hasta luego");
			}

		} else {

			System.out.println("Opci�n inv�lida, hasta luego");

		}

	}

}
