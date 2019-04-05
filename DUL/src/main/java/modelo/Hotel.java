package modelo;

public class Hotel extends Alojamiento{
	protected int NEstrellas;

	public Hotel(String nombre, String ubicacion, int nEstrellas) {
		super(nombre, ubicacion, nEstrellas);
		NEstrellas = nEstrellas;
	}

	public int getNEstrellas() {
		return NEstrellas;
	}

	public void setNEstrellas(int nEstrellas) {
		NEstrellas = nEstrellas;
	}
	
	public void add() {
		
	}
	
	
	
}
