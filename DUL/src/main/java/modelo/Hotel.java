package modelo;

public class Hotel extends Alojamiento{
	protected int categoria;

	public Hotel(String nombreAloj, String ubicacion, int categoria) {
		super(nombreAloj, ubicacion, categoria);
		
		this.categoria = categoria;
	}

	public int getNEstrellas() {
		return categoria;
	}

	public void setNEstrellas(int categoria) {
		this.categoria = categoria;
	}
	
	//Crea un hotel y lo mete en un array de hoteles
	public void add() {
		
	}
	
}
