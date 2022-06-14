package com.generation.f220602.Main;

import java.util.ArrayList;
import java.util.List;

import com.generation.f220602.modelo.Administrador;
import com.generation.f220602.modelo.Empleado;
import com.generation.f220602.modelo.Secretariado;

public class Main {

	public static void main(String[] args) {

		List<Empleado> listaEmpleados = new ArrayList<>();

		Administrador admin = new Administrador();
		Secretariado sec = new Secretariado();
		Empleado emp = new Empleado();
		admin.setNombre("Julio");
		admin.setApellido("Julianes");
		admin.setSueldo(5500);
		admin.setId(1);
		admin.setNivelAcceso(9);
		admin.setAreaCargo("Secretariado");

		listaEmpleados.add(admin);

		sec.setNombre("Wladimir");
		sec.setApellido("Rojas");
		sec.setSueldo(1000);
		sec.setId(2);
		sec.setEncargadoLlamada(false);
		sec.setBonoAsist(true);

		listaEmpleados.add(sec);

		for (Empleado empleadito : listaEmpleados) {
			System.out.println(empleadito);
		}
		
		System.out.println("Qué nos dice el Admin?!");
		//funciones administrador
		System.out.println(admin.cafesito(false));
		System.out.println(admin.renunciarSN(false));
		
		
		System.out.println("Qué nos dice el Secretario?!");
		//funciones secretariado
		sec.contestarTelefono(sec.getEncargadoLlamada());
		System.out.println(sec.renunciarSN(sec.getBonoAsist()));

	}

}
