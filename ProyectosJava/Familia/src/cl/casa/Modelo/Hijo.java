package cl.casa.Modelo;

public class Hijo extends Persona {

	Integer curso;
	Boolean estupido;

	public Hijo() {

	}

	public Hijo(Integer curso, Boolean estupido) {
		super();
		this.curso = curso;
		this.estupido = estupido;
	}

	public Integer getCurso() {
		return curso;
	}

	public void setCurso(Integer curso) {
		this.curso = curso;
	}

	public Boolean getEstupido() {
		return estupido;
	}

	public void setEstupido(Boolean estupido) {
		this.estupido = estupido;
	}

	@Override
	public String toString() {
		return "Hijo [curso=" + curso + ", estupido=" + estupido + "]";
	}

	public void estudiar(Boolean estupido) {

		if (estupido == true) {
			System.out.println("No sé estudiar");
		} else {
			System.out.println("Ya estudié Termodinámica");
		}

	}

	@Override
	public Boolean agradecidoComida(String genero) {

		if (genero == "Mujer" || genero == "Hombre") { // true = mujer / false = hombre
			System.out.println("Un asco");
			return true;

		} else {
			System.out.println("Aunque no sea ni mujer ni hombre, un asco");
			return false;
		}

	}

}
