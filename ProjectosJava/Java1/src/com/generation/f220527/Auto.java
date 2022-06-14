package com.generation.f220527;

public class Auto {

	// atributos
	private String color;
	private String marca;
	private String modelo;
	private Double velocidad;

	// constructor
	public Auto(String color, String marca, String modelo, Double velocidad) {

		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.velocidad = velocidad;

	}
	//accesadores y mutadores

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}
	
	//metodos
	
	public void aumentarVelocidad() {
		this.velocidad = 10d;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
