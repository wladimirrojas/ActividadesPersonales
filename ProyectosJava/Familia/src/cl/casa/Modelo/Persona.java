package cl.casa.Modelo;

public class Persona {

	String nombre;
	String apellido;
	Integer edad;
	String genero;

	public Persona() {

	}

	public Persona(String nombre, String apellido, Integer edad, String genero) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", genero=" + genero + "]";
	}

	public Boolean agradecidoComida(String genero) {

		if (genero == "Mujer") { // true = mujer / false = hombre
			return true;

		} else {
			return false;
		}

	}

}
