package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Consultas {
	
	private Conexion conexion;
	private Connection connection;
	
	
	public Consultas(Conexion conexion) {
		this.conexion = conexion;
		this.connection = null;
	}

	//Cargar ubicaciones disponibles
	public String getUbicaciones() {
		String ubicacion = null;
		return ubicacion;
	}
	
	//Cargar la lista de hoteles
	public ArrayList<Alojamiento> getHoteles() throws SQLException{
		//read * hotels
		Hotel hotel = null;
		ArrayList<Alojamiento> listAlojs = new ArrayList<Alojamiento>();
		PreparedStatement stmt = null;
		ResultSet result = null;
		
		String query = "SELECT * FROM hotel";
		
		try {
			//levantar la conexion
			conexion.conectar();
			
			//preparar la consulta SQL a la base de datos
			stmt = connection.prepareStatement(query);
			
			//execute la consulta y guardarla en un ResultSet
			result = stmt.executeQuery();
			
			//crear un objeto Hotel y añade los hoteles que limita la consulta a un ArrayList
			while (result.next()) {
				hotel = new Hotel(query, query, 0);
				hotel.setNombreAloj(result.getString("Nombre"));
				hotel.setUbicacion(result.getString("Ubicacion"));
				listAlojs.add(hotel);
			}
//			while (result.next()) {
//				hotel = new Hotel(
//					result.getString("Nombre"),
//					result.getString("Ubicacion"),
//					result.getInt("Tarifa")
//				);
//				listAlojs.add(hotel);
//			}
		} catch (SQLException e) {
				e.printStackTrace();
			} finally {
			    //cerrar la conexion
			    conexion.desconectar();
//			    try { connection.close(); } catch (Exception e) { e.printStackTrace(); }
			} 
		//return ArrayList
		return listAlojs;
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
