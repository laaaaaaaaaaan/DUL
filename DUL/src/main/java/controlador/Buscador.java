package controlador;

import java.util.ArrayList;

import modelo.Hotel;
import modelo.Modelo;
import vista.Ventana;

public class Buscador {
	
	/*Inserta los hoteles en el combobox de hoteles
	 * 
	 */
	public void meterHotelesEnComboBox(Ventana vis,Modelo mod, ArrayList<Hotel> hotel) {
		for (int i = 0; i <hotel.size(); i++) {
			vis.panelHoteles.hoteles.addElement(hotel.get(i));
		}
	}
}
