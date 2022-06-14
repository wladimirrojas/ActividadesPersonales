package com.generation.f220526;

import java.util.Arrays;

public class ColeccionArray {

	public static void main(String[] args) {


		String[] colores = {"blue", "red", "black", "white", "purple", "yellow", "green", "brown"} ;
		Integer[] numerosPares = {2,4,6,8,10,12,14,16,18,20};
		int[] numeros = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		//imprimir arreglo
		System.out.println(Arrays.toString(colores));
		
		//recorrer arreglo
		for(int i = 0; i < colores.length; i++) {
			System.out.println(colores[i]);
		}
		
		//utilizando foreach
		for (int i : numerosPares) {
			
			System.out.println(i);
		}
		
		
		
		
		
	}

}
