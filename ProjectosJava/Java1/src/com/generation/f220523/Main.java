package com.generation.f220523;

public class Main {

	public static void main(String[] args) {
		// variables
		
		String nombre = "Wladimir";
		
		char letra = 'a';
		
		boolean variableBool = true;
		
		int numero = 27;
		
		//8 bits
		byte numeroByte = 127;
		
		//16bits
		short numeroShort = 32767;
		
		//64bits
		long numeroLong = 2147483647;
		
		//128bits
		int numeroInt = 1;
		
		char genero = 'M';
		
		String colorDePelo = "Negro";
		
		boolean comprometido = true;
		
		long poblacion = 5456468;
		
		byte edad2 = 127;
		
		String nombre2 = "Wladimir";
		
		String ocupacion = "Programador";
		
		char genero2 = 'M';
		
		
		System.out.println("Mi nombre es " + nombre + " y tengo " + numero + " años");
		System.out.println(numeroByte);
		
		nombre.codePointAt(3);
		System.out.println(nombre.codePointAt(3));
		
		//los strings se comparan con equals
		
		String curso = "G1";
		
		if(curso.equals("g1")) {
			System.out.println("iguales");
		}else {
			System.out.println("distintos");
		}
		
		if(curso.equalsIgnoreCase("g1")) {
			System.out.println("iguales");
		}else {
			System.out.println("distintos");
		}
		
		if(curso.toLowerCase().equals("g1")) {
			
		}
		
		if(curso.equals("g1".toUpperCase())) {
			
		}
		
		String curso2 = ""; //vacia
		String curso3 = null;
		
		curso.isBlank();
		curso.isEmpty();
		
		//para evaluar null, primero null
		if(null == curso3) {
			System.out.println("hehe");
		}
		
		//float y double
		
		float altura = 1.81f;
		
		Float peso = 85.5F;
		
		//ejercicio casting
		
		int num1 = 12;
		
		Double doble = 1.8;
		
		long numeroALong = (long) num1;
		
		byte numeroAByte = (byte) num1;
		
		short numeroAShort = (short) num1;
		
		float numeroAfloat = (float) num1;
		
		double numeroAdouble = (double) num1;
		
		//Float doubleAFloat = (Float) doble;
		
		
		
		System.out.println(num1);
		System.out.println(numeroALong);
		System.out.println(numeroAByte);
		System.out.println(numeroAShort);
		System.out.println(numeroAfloat);
		System.out.println(numeroAdouble);
		
		Double peso4 = 75.9;
		
		Float floatsitohehe = new Float(peso4);
		
		System.out.println(floatsitohehe);
		
		peso4.floatValue();
		
		int peso3 = 75;
		
		Double doblao = new Double(peso3);
		
		System.out.println(doblao);
		
		Double experimento = peso3 + 0.0;
		
		System.out.println(experimento);
		
		Integer numeraco = 5;
		
		
		
		
		

		
		
		
		
		//no permite castear dato primitivo a objeto
		//String charAString = (String) letra;
		//Float numeroAFloat = (Float) num1;     
		//Double numeroADouble = (Double) num1;
		//String numeroAString = (String) num1;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
