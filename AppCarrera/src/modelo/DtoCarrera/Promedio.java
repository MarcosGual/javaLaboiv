package modelo.DtoCarrera;

public class Promedio {
	private String nombreCorredor;
	private float promedio;
	
	public Promedio(String nombre, float promedio) {
		this.nombreCorredor = nombre;
		this.promedio = promedio;
	}

	public String getNombre() {
		return nombreCorredor;
	}

	public void setNombre(String nombre) {
		this.nombreCorredor = nombre;
	}

	public float getPromedio() {
		return promedio;
	}

	public void setPromedio(float promedio) {
		this.promedio = promedio;
	}

	@Override
	public String toString() {
		return "Promedio [nombre=" + nombreCorredor + ", promedio=" + promedio + "]";
	}
}
