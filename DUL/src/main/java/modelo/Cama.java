package modelo;

public class Cama extends Habitacion{
	
	private String tipoCama;

	public Cama(String nombreAloj, String ubicacion, int numHabitaciones, String cod_Habitacion, String habitacion,
			String tipoCama) {
		super(nombreAloj, ubicacion, numHabitaciones, cod_Habitacion, habitacion);
		this.tipoCama = tipoCama;
	}

	public String getTipoCama() {
		return tipoCama;
	}

	public void setTipoCama(String tipoCama) {
		this.tipoCama = tipoCama;
	}
	
}
