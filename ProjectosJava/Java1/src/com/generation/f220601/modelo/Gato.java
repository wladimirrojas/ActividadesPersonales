package com.generation.f220601.modelo;

public class Gato extends Mascota{
	
	private Boolean garrasRetractil;
	private Boolean visionNocturna;
	private String sonidoVocal;
	
	
	public Gato() {
		super();
	}
	
	public Gato(Boolean garrasRetractil, Boolean visionNocturna, String sonidoVocal) {
		super();
		this.garrasRetractil = garrasRetractil;
		this.visionNocturna = visionNocturna;
		this.sonidoVocal = sonidoVocal;
	}

	public Boolean getGarrasRetractil() {
		return garrasRetractil;
	}

	public void setGarrasRetractil(Boolean garrasRetractil) {
		this.garrasRetractil = garrasRetractil;
	}

	public Boolean getVisionNocturna() {
		return visionNocturna;
	}

	public void setVisionNocturna(Boolean visionNocturna) {
		this.visionNocturna = visionNocturna;
	}

	public String getSonidoVocal() {
		return sonidoVocal;
	}

	public void setSonidoVocal(String sonidoVocal) {
		this.sonidoVocal = sonidoVocal;
	}

	@Override
	public String toString() {
		return "Gato Valores: " + garrasRetractil + ", " + visionNocturna + ", "
				+ sonidoVocal + super.toString();
	}
	
	@Override
	public void hacerSonido() {
		
		System.out.println("Miau...");
	}
	
}
