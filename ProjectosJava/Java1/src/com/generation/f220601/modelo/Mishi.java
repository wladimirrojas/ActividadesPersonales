package com.generation.f220601.modelo;

public class Mishi extends Gato{
	
	private Boolean famoso;
	
	public Mishi() {
		
	}
	
	public Mishi(Boolean famoso) {
		super();
		this.famoso = famoso;
	}

	public Boolean getFamoso() {
		return famoso;
	}

	public void setFamoso(Boolean famoso) {
		this.famoso = famoso;
	}

	@Override
	public String toString() {
		return "Mishi Valores: " + famoso + ", " + super.toString();
	}
	
}
