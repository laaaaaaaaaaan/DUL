package controlador;

import interfaces.Ventana;
import modelo.Modelo;

public class LuncherSprint {

public static void main(String[] args) {
		
		// Instancia de las clases necesarias para el programa
		Ventana vista = new Ventana();
		Modelo modelo = new Modelo();
		Controlador controlador = new Controlador(vista,modelo);

		// Hacer la vista visible 
		vista.setVisible(true);
		
	    }
}
