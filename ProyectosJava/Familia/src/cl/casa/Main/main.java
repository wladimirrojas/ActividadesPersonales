package cl.casa.Main;

import java.util.Scanner;

import cl.casa.Modelo.Hijo;
import cl.casa.Modelo.Madre;
import cl.casa.Modelo.Padre;
import cl.casa.Modelo.Persona;

public class main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Persona persona = new Persona();
		Madre madre = new Madre();
		Padre padre = new Padre();
		Hijo hijo = new Hijo();

		System.out.println("Ingrese el Boolean del vicio padre");

		padre.setVicio(sc.nextBoolean());

		sc.nextLine();

		System.out.println("Ingrese el género de persona");

		persona.setGenero(sc.nextLine());

		System.out.println("Ingrese el género de madre");

		madre.setGenero(sc.nextLine());

		persona.agradecidoComida(persona.getGenero());
		
		madre.agradecidoComida(madre.getGenero());
		madre.cocinando();
		
		padre.agradecidoComida("Hombre");
		padre.teSacoLaCTM(padre.getVicio());
		
		
		hijo.agradecidoComida("Hombre");
		hijo.estudiar(true);

	}

}
