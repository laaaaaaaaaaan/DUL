package app_BiDaiOn;

import controlador.Controlador;
import modelo.Alojamiento;
import vista.Frame_BidaiOn;

public class Launcher_sprint1 {

	public static void main(String[] args) {
		
		// Instancia de las clases necesarias para el programa
		Frame_BidaiOn vista = new Frame_BidaiOn();
		Alojamiento modelo = new Alojamiento();
		Controlador controlador = new Controlador(vista,modelo);

		// Hacer la vista visible 
		vista.setVisible(true);
		
	    }
}
