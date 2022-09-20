package modelo.DtoCarrera;

public class Carrera {
	private String nombreCorredor;
	private float tiempo;
	private String nombreClub;

	public Carrera(String nombreCorredor, float tiempo, String nombreClub) {
		super();
		this.nombreCorredor = nombreCorredor;
		this.tiempo = tiempo;
		this.nombreClub = nombreClub;
	}

	public String getNombreCorredor() {
		return nombreCorredor;
	}

	public void setNombreCorredor(String nombreCorredor) {
		this.nombreCorredor = nombreCorredor;
	}

	public float getTiempo() {
		return tiempo;
	}

	public void setTiempo(float tiempo) {
		this.tiempo = tiempo;
	}

	public String getNombreClub() {
		return nombreClub;
	}

	public void setNombreClub(String nombreClub) {
		this.nombreClub = nombreClub;
	}

	@Override
	public String toString() {
		return "Corredor=" + nombreCorredor + ", tiempo=" + tiempo + ", Club=" + nombreClub ;
	}

}
