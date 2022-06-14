package cl.casa.Modelo;

public class Padre extends Persona {

	Float sueldo;
	Boolean vicio;

	public Padre() {

		super();

	}

	public Padre(Float sueldo, Boolean vicio) {
		super();
		this.sueldo = sueldo;
		this.vicio = vicio;
	}

	public Float getSueldo() {
		return sueldo;
	}

	public void setSueldo(Float sueldo) {
		this.sueldo = sueldo;
	}

	public Boolean getVicio() {
		return vicio;
	}

	public void setVicio(Boolean vicio) {
		this.vicio = vicio;
	}

	@Override
	public String toString() {
		return "Padre [sueldo=" + sueldo + ", vicio=" + vicio + "]";
	}

	@Override
	public Boolean agradecidoComida(String genero) {

		if (genero == "Hombre") { // true = mujer / false = hombre
			System.out.println("No me interesa");
			return true;

		} else {
			System.out.println("Muy rico todo");
			return false;
		}

	}

	public Boolean teSacoLaCTM(Boolean vicio) {

		if (vicio == true) {
			return true;

		} else {
			return false;
		}

	}

}
