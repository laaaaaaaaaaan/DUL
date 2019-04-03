package modelo;

public class Hotel extends Alojamiento{
	private int nEstrellas;

	public Hotel(String nombreAloj, String ubicacion, int numHabitaciones, int nEstrellas) {
		super();
		this.nombreAloj = nombreAloj;
		this.ubicacion = ubicacion;
		this.numHabitaciones = numHabitaciones;
		this.nEstrellas = nEstrellas;
	}

	
	public int getnEstrellas() {
		return nEstrellas;
	}

	public void setnEstrellas(int nEstrellas) {
		this.nEstrellas = nEstrellas;
	}
	
	
}
