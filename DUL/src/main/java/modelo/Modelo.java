package modelo;

import java.util.ArrayList;

import com.sun.jndi.ldap.Connection;

public class Modelo {

	public Connection conexion;
	
	public Modelo() {
		//Creo la conexion
		conexion = new Connection(null, null, 0, null, 0, 0, null);
	}
	
	public ArrayList<Alojamiento> LeerHoteles(){
		//Leee todos los hoteles
		//crear SQL
		//crear el Statement
		//Ejecutar el Satatemesnt
		//Pasar del RS a ArrayList de Hoteles
		//Devoolver el ArrayList
		return null;
	}
	
	public Alojamiento LeerHoteles(String id){
		//Leee el hotel con ese ID
		return null;
	}
	
	public ArrayList<String> LeerUbicaciones(){
		//Devuelve las diferentes ubicaciones de un hotel
		return null;
	}
}
