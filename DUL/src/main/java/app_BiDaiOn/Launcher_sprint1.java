package app_BiDaiOn;

import controlador.Controlador;
import interfaces.Ventana;
import modelo.Alojamiento;

public class Launcher_sprint1 {

	public static void main(String[] args) {
		
		// Instancia de las clases necesarias para el programa
		Ventana vista = new vista();
		Alojamiento modelo = new modelo();
		Controlador controlador = new Controlador(vista,modelo);

		// Hacer la vista visible 
		vista.setVisible(true);
		
	    }
}
