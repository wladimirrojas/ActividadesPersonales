package com.generation.f220601.pruebasunitarias;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CalculadoraTest {

	Calculadora calc = new Calculadora();

	@Test
	public void testSumar() {

		int resultado = calc.sumar(12, 42);

		assertEquals(54, resultado);
	}

	@Test
	public void testRestar() {

		int resultado = calc.restar(12, 42);

		assertEquals(-30, resultado);
	}

	@Test
	public void testMultiplicar() {

		// utilizacion de assert Equals y Same

		int resultado = calc.multiplicar(2, 2);

		assertEquals(4, resultado);
		assertSame(4, resultado);
	}

	@Test
	public void testDividir() {

		String resultado = calc.dividir(0, 0);

		// utilización de assert NotNull

		assertEquals("No se puede dividir por cero", resultado);
		assertNotNull(resultado);

	}

	@Test
	public void testPar() {

		Boolean prueba = calc.par(4);
		Boolean prueba2 = calc.par(3);

		assertTrue(prueba);
		assertFalse(prueba2);

	}

	@Test
	public void testImpar() {

		Boolean prueba = calc.impar(3);
		Boolean prueba2 = calc.impar(4);

		assertTrue(prueba);
		assertFalse(prueba2);

	}
}
