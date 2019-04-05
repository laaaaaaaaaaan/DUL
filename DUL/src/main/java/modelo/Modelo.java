package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Modelo {

	public Conexion conexion;
	public Hotel hotel;
	
	
	public Modelo() {
		//create connection
		conexion = new Conexion();
	}
	
	public ArrayList<Alojamiento> LeerHoteles(){
		//read * hotels
		Hotel hotel = null;
		ArrayList<Alojamiento> aloj = new ArrayList<Alojamiento>();
		PreparedStatement stmt = null;
		ResultSet result = null;
		
		String query = "SELECT * FROM hotel";
		
		//create SQL
		conexion = conexion.conectar();
		
		//create the Statement
		stmt = conexion.prepareStatement(query);
		
		//execute el Statements
		result = stmt.executeQuery();
		
		//from RS of ArrayList to Hotel
		while (result.next()) {
			hotel = new Hotel(query, query, 0);
			hotel.setNombreAloj(result.getString("Nombre"));
			hotel.setUbicacion(result.getString("Ubicacion"));				
		}
		
		//return ArrayList
		return null;
	}
	
	public Alojamiento LeerHoteles(String id){
		//Read hotel with this.ID
		return null;
	}
	
	public ArrayList<String> LeerUbicaciones(){
		//return different locations of a hotel
		return null;
	}
}
