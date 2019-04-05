package modelo;

import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;

/**
 * Clase que permite conectar con la base de datos
 */

public class Conexion {
	Connection cnx = null;
	
	String bd="bidiaon_g5";
	String url="jdbc:mysql://localhost:3306/" + bd;
	String user="bidaiongrupo5";
	String pssw="bidaiong5";
	
	public Connection conectar() {
		try{
			Class.forName("com.mysql.jdbc.Driver");
			cnx=(Connection) DriverManager.getConnection(url, user, pssw);
			System.out.println("Coneión establecida...");
		} catch (ClassNotFoundException | SQLException ex) {
			ex.printStackTrace();
			System.out.println("¡Error al conectarse!");
		}
		return cnx;
	}
	
	public void desconectar() {
		try {
			cnx.close();
		} catch (SQLException e) {
			// TODO Bloque catch generado automáticamente
			e.printStackTrace();
			System.out.println("[ERROR] No se pudo terminar la conexión");
		}
	}
}
