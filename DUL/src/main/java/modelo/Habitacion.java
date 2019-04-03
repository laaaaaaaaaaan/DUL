package modelo;

public class Habitacion extends Alojamiento {
	private String cod_Habitacion;
	private String tipoHabitacion;
	
	public Habitacion(String nombreAloj, String ubicacion, int numHabitaciones, String cod_Habitacion, String tipoHabitacion) {
		super();
		this.nombreAloj = nombreAloj;
		this.ubicacion = ubicacion;
		this.numHabitaciones = numHabitaciones;
		this.cod_Habitacion = cod_Habitacion;
		this.tipoHabitacion = tipoHabitacion;
	}

	public String getCod_Habitacion() {
		return cod_Habitacion;
	}

	public void setCod_Habitacion(String cod_Habitacion) {
		this.cod_Habitacion = cod_Habitacion;
	}

	public String getTipoHabitacion() {
		return tipoHabitacion;
	}

	public void setTipoHabitacion(String tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}
	
	
	
}
