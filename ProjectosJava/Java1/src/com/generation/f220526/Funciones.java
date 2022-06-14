package com.generation.f220526;

public class Funciones {

	public static void main(String[] args) {
		
		//recursiva(5);
		
	}
	
	public static int edad() {
		return 18;
	}
	
	public static boolean mayorEdad(int edad) {
		
		if (edad >= edad()) {
			return true;
		} else {
			return false;
		}
	}

	
	public static void recursiva(int num1) {
		
		
		num1 -= 1;
		if (num1 > 0) {
			System.out.println("hehe nro: " + num1);
			
			recursiva(num1);
			
		} else {
			System.out.println("cataplum");
		}
		
	}
	
	public static Integer obtenerEdad() {
		
		Integer edad = 18;
		return edad;
	}
	
}





