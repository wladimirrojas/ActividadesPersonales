package com.generation.f220526;


public class FuncionesCalculadora {

	public static void main(String[] args) {

		// Math
		// elevar
		double numeroElevado = Math.pow(2, 3);

		// redondear a entero menor
		double enteroMayor = Math.ceil(numeroElevado);

		// redondear a entero mayor
		double enteroMenor = Math.floor(numeroElevado);

		// redondeo
		double enteroRedondeado = Math.round(numeroElevado);

		// aleatorio
		double aleatorio = Math.random();
		// System.out.println(aleatorio);

		//aleatorio de 0 a 10
		double entre0y10 = Math.random() * 10;

		// aleatorio entre 2 y 8
		double num28 = (Math.random() * (8 - 2) + 2);
		
		//numero aleatorio entre -4 y 4
		double nummen4a5 = (Math.random() * (4 - -4) + -4);
		
		//Math.random() * (max - min) + min;
		System.out.println(nummen4a5);

	}

	}

