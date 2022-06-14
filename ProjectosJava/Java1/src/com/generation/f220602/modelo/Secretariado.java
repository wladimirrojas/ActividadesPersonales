package com.generation.f220602.modelo;

public class Secretariado extends Empleado {

	private Boolean bonoAsist;
	private Boolean encargadoLlamada;

	public Secretariado() {

	}

	public Secretariado(String nombre, String apellido, int id, int sueldo, Boolean bonoAsist,
			Boolean encargadoLlamada) {
		super(nombre, apellido, id, sueldo);
		this.bonoAsist = bonoAsist;
		this.encargadoLlamada = encargadoLlamada;
	}

	public Boolean getBonoAsist() {
		return bonoAsist;
	}

	public void setBonoAsist(Boolean bonoAsist) {
		this.bonoAsist = bonoAsist;
	}

	public Boolean getEncargadoLlamada() {
		return encargadoLlamada;
	}

	public void setEncargadoLlamada(Boolean encargadoLlamada) {
		this.encargadoLlamada = encargadoLlamada;
	}

	@Override
	public String toString() {
		return "Secretariado:\n" + super.toString() + "\nBono de Asistencia: " + bonoAsist + "\nEncargado de Llamadas: "
				+ encargadoLlamada + "\n";
	}

	public Boolean contestarTelefono(Boolean encargadoLlamada) {

		if (encargadoLlamada == true) {

			System.out.println("Contestando llamada...");
			return true;
		} else {
			System.out.println("Por favor, delege la llamada a un encargado de teléfono");
			return false;
		}

	}

	@Override
	public String renunciarSN(Boolean bono) {

		if (bono == true) {
			return "Seguiré aquí, pero necesito hacer un drama para que me echen";
		} else {
			return "Se demoran mucho en echarme, me voy de aquí indignado! RENUNCIO!";
		}

	}
}
