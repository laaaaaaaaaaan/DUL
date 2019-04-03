package app_BiDaiOn;

import controlador.Controlador;
import interfaces.Frame_BidaiOn;
import modelo.Alojamiento;

public class Launcher_sprint1 {

	public static void main(String[] args) {
		
		// Instancia de las clases necesarias para el programa
		Frame_BidaiOn vista = new vista();
		Alojamiento modelo = new modelo();
		Controlador controlador = new Controlador(vista,modelo);

		// Hacer la vista visible 
		vista.setVisible(true);
		
	    }
}
