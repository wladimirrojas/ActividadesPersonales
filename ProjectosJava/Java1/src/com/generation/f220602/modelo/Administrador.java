package com.generation.f220602.modelo;

public class Administrador extends Empleado {

	private int nivelAcceso;
	private String areaCargo;

	public Administrador() {

	}

	public Administrador(String nombre, String apellido, int id, int sueldo, int nivelAcceso, String areaCargo) {
		super(nombre, apellido, id, sueldo);
		this.nivelAcceso = nivelAcceso;
		this.areaCargo = areaCargo;
	}

	public int getNivelAcceso() {
		return nivelAcceso;
	}

	public void setNivelAcceso(int nivelAcceso) {
		this.nivelAcceso = nivelAcceso;
	}

	public String getAreaCargo() {
		return areaCargo;
	}

	public void setAreaCargo(String areaCargo) {
		this.areaCargo = areaCargo;
	}

	@Override
	public String toString() {
		return "Administrador:\n" + super.toString() + "\nNivel de Acceso: " + nivelAcceso + "\n�rea a Cargo: "
				+ areaCargo + "\n";
	}

	public String cafesito(Boolean cafeDisp) {

		if (cafeDisp == true) {
			return "Pero qu� rico caf�!";

		} else {

			return "�Qui�n se tom� mi caf�?";

		}
	}
	
	
	@Override
	public String renunciarSN(Boolean contento) {

		if (contento == true) {
			return "Seguir� felizmente en el trabajo";
		} else {
			return "Me gustar�a renunciar pero no puedo, debo ser responsable :(";
		}
	}

}
