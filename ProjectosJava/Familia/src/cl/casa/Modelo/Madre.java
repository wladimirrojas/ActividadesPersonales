package cl.casa.Modelo;

public class Madre extends Persona {

	Boolean peloLargo;
	String comidaHoy;

	public Madre() {

	}

	public Madre(Boolean peloLargo, String comidaHoy) {
		super();
		this.peloLargo = peloLargo;
		this.comidaHoy = comidaHoy;
	}

	public Boolean getPeloLargo() {
		return peloLargo;
	}

	public void setPeloLargo(Boolean peloLargo) {
		this.peloLargo = peloLargo;
	}

	public String getComidaHoy() {
		return comidaHoy;
	}

	public void setComidaHoy(String comidaHoy) {
		this.comidaHoy = comidaHoy;
	}

	@Override
	public String toString() {
		return "Madre [peloLargo=" + peloLargo + ", comidaHoy=" + comidaHoy + "]";
	}

	@Override
	public Boolean agradecidoComida(String genero) {

		if (genero == "Mujer") { // true = mujer / false = hombre
			System.out.println("La hice yo, estaba magnífica");
			return true;

		} else {

			System.out.println("No soy hombre estaba, muy rico");
			return false;

		}

	}
	
	public void cocinando() {
		
		System.out.println("Cocinando....Cocinando....Cocinando....");
	}

}
