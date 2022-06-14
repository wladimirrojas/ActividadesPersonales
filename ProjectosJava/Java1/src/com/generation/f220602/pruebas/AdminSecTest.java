package com.generation.f220602.pruebas;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.generation.f220602.modelo.Administrador;
import com.generation.f220602.modelo.Secretariado;

public class AdminSecTest {

	Administrador admin = new Administrador();
	Secretariado sec = new Secretariado();

	@Test
	public void testRenunciarSN() {

		String messageAdmin = "Seguiré felizmente en el trabajo";
		String messageAdmin2 = "Me gustaría renunciar pero no puedo, debo ser responsable :(";
		String messageSec = "Se demoran mucho en echarme, me voy de aquí indignado! RENUNCIO!";
		String messageSec2 = "Seguiré aquí, pero necesito hacer un drama para que me echen";

		String testAdmin = admin.renunciarSN(true);
		String testAdmin2 = admin.renunciarSN(false);
		String testSec = sec.renunciarSN(false);
		String testSec2 = sec.renunciarSN(true);

		assertEquals(testAdmin, messageAdmin);
		assertEquals(testAdmin2, messageAdmin2);
		assertEquals(testSec, messageSec);
		assertEquals(testSec2, messageSec2);
	}

	@Test
	public void testCafesito() {

		String messageAdmin = "Pero qué rico café!";
		String messageAdmin2 = "¿Quién se tomó mi café?";
		String testAdmin = admin.cafesito(true);
		String testAdmin2 = admin.cafesito(false);

		assertEquals(testAdmin, messageAdmin);
		assertEquals(testAdmin2, messageAdmin2);
	}

	@Test
	public void testContestarTelefono() {

		assertNotNull(sec.contestarTelefono(false));
		assertNotNull(sec.contestarTelefono(true));
	}
}
