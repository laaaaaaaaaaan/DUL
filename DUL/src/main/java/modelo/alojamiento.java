package modelo;

public class alojamiento {
	protected String nombre;
	protected String ubicacion;
	protected int nhabitaciones;
		
	public alojamiento(String nombre, String ubicacion, int nhabitaciones) {
		super();
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.nhabitaciones = nhabitaciones;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public int getNhabitaciones() {
		return nhabitaciones;
	}
	public void setNhabitaciones(int nhabitaciones) {
		this.nhabitaciones = nhabitaciones;
	}
	
}
