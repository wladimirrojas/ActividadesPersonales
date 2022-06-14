package com.generation.f220601.pruebasunitarias;

public class Calculadora {

	public int sumar(int num1, int num2) {
		int resultado = num1 + num2;
		return resultado;
	}

	public int restar(int num1, int num2) {
		int resultado = num1 - num2;
		return resultado;
	}

	public int multiplicar(int num1, int num2) {
		int resultado = num1 * num2;
		return resultado;
	}

	public String dividir(int num1, int num2) {

		if (num2 != 0) {
			String resultado = Integer.toString(num1 / num2);
			return resultado;

		}
		return "No se puede dividir por cero";
	}

	public Boolean par(int resultado) {

		if (resultado % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public Boolean impar(int resultado) {

		if (resultado % 2 != 0) {
			return true;
		} else {
			return false;
		}

	}

}
