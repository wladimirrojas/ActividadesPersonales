package com.generation.f220527;

import java.util.ArrayList;
import java.util.HashMap;

public class ColeccionesHash {

	public static void main(String[] args) {
		
		//colecciones map
		//clave - valor
		//HashMap<K, V> map = new HashMap<K, V>();
		//HashMap mapa = new HashMap();
		HashMap objHashMap = new HashMap();
		
		objHashMap.put("Nombre", "Wladimir");
		objHashMap.put("ApellidoP", "Rojas");
		objHashMap.put("ApellidoM", "Valenzuela");
		objHashMap.put("Número", "56930229752");
		objHashMap.put("Número", "56930229753");
		//System.out.println(objHashMap);
		
		//retorna el valor por llave específica
		//System.out.println(objHashMap.get("Número"));
		
		//elimina un dato por llave específica
		//System.out.println(objHashMap.remove("Número"));
		
		//retorna valores
		//System.out.println(objHashMap.values());
		
		//retorna llaves
		//System.out.println(objHashMap.keySet());
		
		ArrayList<String> vocales = new ArrayList<String>();
		
		vocales.add("a"); vocales.add("e"); vocales.add("i"); vocales.add("o"); vocales.add("u");
		
		
		objHashMap.put("vocales", vocales.get(0));
		
		//System.out.println(objHashMap);
		
		for (Object clave : objHashMap.keySet()) {
			System.out.println("clave: " + clave + " - valor: " + objHashMap.get(clave) );
			
			
		}
		
		
		

	}

}
