package controlador;

import modelo.Modelo;
import vista.Ventana;

public class Launcher_sprint1 {

	public static void main(String[] args) {
		
		// Instancia de las clases necesarias para el programa
		Ventana vista = new Ventana();
		Modelo modelo = new Modelo();
		Controlador controlador = new Controlador(vista,modelo);

		// Hacer la vista visible 
		vista.setVisible(true);
		
	    }
}
