package com.generation.modelos;

public class Torta {

	private Integer forma; // circular, rectangular, etc.
	private Integer alto;
	private Integer ancho;
	private Integer largo;
	private Integer diametro;
	private boolean conDiseno;
	private boolean esVegano;
	private boolean deEvento;
	
	public Torta() {
		
	}

	public Torta(Integer forma, Integer alto, Integer ancho, Integer largo, Integer diametro, boolean conDiseno,
			boolean esVegano, boolean deEvento) {
		super();
		this.forma = forma;
		this.alto = alto;
		this.ancho = ancho;
		this.largo = largo;
		this.diametro = diametro;
		this.conDiseno = conDiseno;
		this.esVegano = esVegano;
		this.deEvento = deEvento;
	}

	public Integer getForma() {
		return forma;
	}

	public void setForma(Integer forma) {
		this.forma = forma;
	}

	public Integer getAlto() {
		return alto;
	}

	public void setAlto(Integer alto) {
		this.alto = alto;
	}

	public Integer getAncho() {
		return ancho;
	}

	public void setAncho(Integer ancho) {
		this.ancho = ancho;
	}

	public Integer getLargo() {
		return largo;
	}

	public void setLargo(Integer largo) {
		this.largo = largo;
	}

	public Integer getDiametro() {
		return diametro;
	}

	public void setDiametro(Integer diametro) {
		this.diametro = diametro;
	}

	public boolean isConDiseno() {
		return conDiseno;
	}

	public void setConDiseno(boolean conDiseno) {
		this.conDiseno = conDiseno;
	}

	public boolean isEsVegano() {
		return esVegano;
	}

	public void setEsVegano(boolean esVegano) {
		this.esVegano = esVegano;
	}

	public boolean isDeEvento() {
		return deEvento;
	}

	public void setDeEvento(boolean deEvento) {
		this.deEvento = deEvento;
	}

	@Override
	public String toString() {
		return "Torta [forma=" + forma + ", alto=" + alto + ", ancho=" + ancho + ", largo=" + largo + ", diametro="
				+ diametro + ", conDiseno=" + conDiseno + ", esVegano=" + esVegano + ", deEvento=" + deEvento + "]";
	}
	
	

}
