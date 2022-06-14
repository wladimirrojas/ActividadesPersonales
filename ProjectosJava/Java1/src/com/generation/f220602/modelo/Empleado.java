package com.generation.f220602.modelo;

public class Empleado {

	private String nombre;
	private String apellido;
	private int id;
	private int sueldo;

	public Empleado() {

	}

	public Empleado(String nombre, String apellido, int id, int sueldo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.id = id;
		this.sueldo = sueldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado Nombre: " + nombre + "\nApellido: " + apellido + "\nID: " + id + "\nSueldo: $" + sueldo;
	}

	public String renunciarSN(Boolean contento) {

		if (contento == true) {
			return "Seguiré felizmente en el trabajo";
		} else {
			return "Detesto este trabajo, RENUNCIO!";
		}

	}
		
}
