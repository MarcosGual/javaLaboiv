package modelo;

public class Tiempo {

	private Corredor corredor;
	private float tiempo;
	private String club;
	private String clima;

	public Tiempo(Corredor corredor, float tiempo, String club, String clima) {
		this.corredor = corredor;
		this.tiempo = tiempo;
		this.club = club;
		this.clima = clima;
	}

	public Corredor getCorredor() {
		return corredor;
	}

	public void setCorredor(Corredor corredor) {
		this.corredor = corredor;
	}

	public float getTiempo() {
		return tiempo;
	}

	public void setTiempo(float tiempo) {
		this.tiempo = tiempo;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public String getClima() {
		return clima;
	}

	public void setClima(String clima) {
		this.clima = clima;
	}

	@Override
	public String toString() {
		return "Tiempo [corredor=" + corredor + ", tiempo=" + tiempo + ", club=" + club + ", clima=" + clima + "]";
	}

}
