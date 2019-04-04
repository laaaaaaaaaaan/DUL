package app_BiDaiOn;

import controlador.Controlador;
import modelo.Alojamiento;
import vista.Frame_BidaiOn;

public class Launcher_sprint1 {

	public static void main(String[] args) {
		
		// Instancia de las clases necesarias para el programa
		Vista vista = new Vista();
		Modelo modelo = new Modelo();
		Controlador controlador = new Controlador(vista,modelo);

		// Hacer la vista visible 
		vista.setVisible(true);
		
	    }
}
