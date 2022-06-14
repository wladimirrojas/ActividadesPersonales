package com.generation.f220530;

public class Alumno {
	
	//atributos    //private, usados en la misma clase, protected para todos dentro del package, public puede acceder todo
	private String nombre;
	private String apellido;
	private int edad;
	private String curso;
	//constructores
	//get y set
	//funciones
	
	public Alumno() {
		
	}
	
	public Alumno (String nombre, String apellido, int edad, String curso) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.curso = curso;
		
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	
	public String datos() {
		
		return "Los datos son los siguientes: Nombre: " + this.nombre + ", Apellido: " + this.apellido + ", Edad: " + this.edad + ", Curso: " + this.curso;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", curso=" + curso + "]";
	}

	
}
