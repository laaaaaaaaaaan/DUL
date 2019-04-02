package app_bukIN;

import controlador.*;
import modelo.alojamiento;
import vista.frame_bukIN;

public class main_sp1 {

	public static void main(String[] args) {
		
		// Instancia de las clases necesarias para el programa
		frame_bukIN vista = new frame_bukIN();
		alojamiento modelo = new alojamiento();
		Controlador controlador = new Controlador(vista,modelo);

		// Hacer la vista visible 
		vista.setVisible(true);
		
	    }
}
