package Ejercicio.Modelo;

public class Flauta extends Viento {

	private String nroModelo;
	private String tipoFlauta;

	public Flauta() {

	}

	public Flauta(String modelo, String tipoFlauta) {
		super();
		this.nroModelo = modelo;
		this.tipoFlauta = tipoFlauta;
	}

	public String getNroModelo() {
		return nroModelo;
	}

	public void setNroModelo(String nroModelo) {
		this.nroModelo = nroModelo;
	}

	public String getTipoFlauta() {
		return tipoFlauta;
	}

	public void setTipoFlauta(String tipoFlauta) {
		this.tipoFlauta = tipoFlauta;
	}

	@Override
	public String toString() {
		return "Flauta [modelo=" + nroModelo + ", tipoFlauta=" + tipoFlauta + "] " + super.toString();
	}

}
