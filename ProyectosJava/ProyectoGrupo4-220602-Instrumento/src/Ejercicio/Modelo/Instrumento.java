package Ejercicio.Modelo;

public class Instrumento {

	private String tipoInstrumento;
	private Integer tamano;
	private String material;

	public Instrumento() {

	}

	public Instrumento(String nombre, Integer tamano, String material) {
		super();
		this.tipoInstrumento = nombre;
		this.tamano = tamano;
		this.material = material;
	}

	public String getTipoInstrumento() {
		return tipoInstrumento;
	}

	public void setTipoInstrumento(String tipoInstrumento) {
		this.tipoInstrumento = tipoInstrumento;
	}

	public Integer getTamano() {
		return tamano;
	}

	public void setTamano(Integer tamano) {
		this.tamano = tamano;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Instrumento [nombre=" + tipoInstrumento + ", tamano=" + tamano + ", material=" + material + "]";
	}
}
