package modelo;

public class Hotel extends Alojamiento{
	protected int NEstrellas;

	public Hotel(String nombreAloj, String ubicacion, int nEstrellas) {
		super(nombreAloj, ubicacion, nEstrellas);
		NEstrellas = nEstrellas;
	}

	public int getNEstrellas() {
		return NEstrellas;
	}

	public void setNEstrellas(int nEstrellas) {
		NEstrellas = nEstrellas;
	}
	
	//Crea un hotel y lo mete en un array de hoteles
	public void crearYMeterHoteles() {
		
	}
	
}
