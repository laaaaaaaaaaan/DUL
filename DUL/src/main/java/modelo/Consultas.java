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
	public ArrayList<Hotel> getUbicaciones() {
		Hotel ubicHotel = null;
		ArrayList<Hotel> ubicaciones = null;
		PreparedStatement stmt = null;
		ResultSet result = null;
		
		String query = "select DISTINCT(Ubicacion)FROM hoteles";

		try {
			//levantar la conexion
			connection = conexion.conectar();
			
			//preparar la consulta SQL a la base de datos
			stmt = connection.prepareStatement(query);
			
			//execute la consulta y guardarla en un ResultSet
			result = stmt.executeQuery();
			
			//crear un objeto Hotel y añade los hoteles que limita la consulta a un ArrayList
			while (result.next()) {
				ubicHotel = new Hotel(query, query, 0);
				ubicHotel.setNombreAloj(result.getString("Nombre"));
				ubicHotel.setUbicacion(result.getString("Ubicacion"));
				ubicaciones.add(ubicHotel);
			}
		} catch (SQLException e) {
				e.printStackTrace();
			} finally {
			    //cerrar la conexion
			    conexion.desconectar();
			    try { connection.close(); } catch (Exception e) { e.printStackTrace(); }
			} 
		return ubicaciones;
	}
	
	//Cargar ubicaciones disponibles
		public ArrayList<String> getUbicaciones2() {
			ArrayList<String> ubicaciones = new ArrayList<String>();
			PreparedStatement stmt = null;
			ResultSet result = null;
			
			String query = "select DISTINCT(Ubicacion)FROM hoteles";

			try {
				//levantar la conexion
				connection = conexion.conectar();
				
				//preparar la consulta SQL a la base de datos
				stmt = connection.prepareStatement(query);
				
				//execute la consulta y guardarla en un ResultSet
				result = stmt.executeQuery();
				
				//crear un objeto Hotel y añade los hoteles que limita la consulta a un ArrayList
				while (result.next()) {
					ubicaciones.add(result.getString("Ubicacion"));
				}
			} catch (SQLException e) {
					e.printStackTrace();
				} finally {
				    //cerrar la conexion
				    conexion.desconectar();
				    try { connection.close(); } catch (Exception e) { e.printStackTrace(); }
				} 
			return ubicaciones;
		}	
	
	//Cargar la lista de hoteles segun ubicacion seleccionada
	public ArrayList<Hotel> getHoteles(String nomHoteles) throws SQLException{
		//read * hotels
		Hotel hotel = null;
		ArrayList<Hotel> listaHoteles = new ArrayList<Hotel>();
		PreparedStatement stmt = null;
		ResultSet result = null;
		
		String query = "SELECT Nombre, Tarifa FROM hotel WHERE Ubicacion=?";

		
		try {
			//levantar la conexion
			connection = conexion.conectar();
			
			//preparar la consulta SQL a la base de datos
			stmt = connection.prepareStatement(query);
			stmt.setString(1, nomHoteles);
			System.out.println("00"+ nomHoteles+"00");
			
			//execute la consulta y guardarla en un ResultSet
			result = stmt.executeQuery();
			
			//crear un objeto Hotel y añade los hoteles que limita la consulta a un ArrayList
			while (result.next()) {
				hotel = new Hotel(query, query, 0);
				hotel.setNombreAloj(result.getString("Nombre"));
				hotel.setUbicacion(result.getString("Ubicacion"));
				hotel.setCategoria(result.getInt(0));
				listaHoteles.add(hotel);
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
			    try { result.close(); } catch (Exception e) { e.printStackTrace(); }
			    try { stmt.close(); } catch (Exception e) { e.printStackTrace(); }
			    try { connection.close(); } catch (Exception e) { e.printStackTrace(); }
			} 
		//return ArrayList
		return listaHoteles;
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
