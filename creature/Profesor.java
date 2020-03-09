package creature;

public class Profesor extends Human {

	private String asignatura;
	private String nombre;
	private String apellido;
	private int aexperiencia;
	
	public Profesor() {}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
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

	public int getAexperiencia() {
		return aexperiencia;
	}

	public void setAexperiencia(int aexperiencia) {
		this.aexperiencia = aexperiencia;
	}
	
}
