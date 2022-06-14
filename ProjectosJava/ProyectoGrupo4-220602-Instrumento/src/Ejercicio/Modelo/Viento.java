package Ejercicio.Modelo;

public class Viento extends Instrumento {

	private String tipoBoquilla;
	private Integer cantidadOrificios;

	public Viento() {

	}

	public Viento(String tipoBoquilla, Integer cantidadOrificios) {
		super();
		this.tipoBoquilla = tipoBoquilla;
		this.cantidadOrificios = cantidadOrificios;
	}

	public String getTipoBoquilla() {
		return tipoBoquilla;
	}

	public void setTipoBoquilla(String tipoBoquilla) {
		this.tipoBoquilla = tipoBoquilla;
	}

	public Integer getCantidadOrificios() {
		return cantidadOrificios;
	}

	public void setCantidadOrificios(Integer cantidadOrificios) {
		this.cantidadOrificios = cantidadOrificios;
	}

	@Override
	public String toString() {
		return "Viento [tipoBoquilla=" + tipoBoquilla + ", cantidadOrificios=" + cantidadOrificios + "] "
				+ super.toString();
	}

}
