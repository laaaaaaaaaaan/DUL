package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import modelo.Hotel;
import modelo.Modelo;
import vista.Ventana;

public class Control_buscador implements ActionListener{
	
	private Ventana vista;
	private Modelo modelo;
	private ArrayList<Hotel> ubicaciones;
	
	//Constructor
	public Control_buscador(Ventana vista, Modelo modelo) {
		this.vista = vista;
		this.modelo = modelo;
	}

	//Añadir listeners a los botones del panel 'buscador'
	public void addListeners() {
		vista.panelBuscador.comboBox.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		//Cargar las ciudades de la bbdd y mostrar
		ubicaciones = modelo.consulta.getUbicaciones();
		
		//Limpiar combobox de ubicaciones de la interfaz
		vista.panelBuscador.comboBox.removeAllItems();
		
		//Recorrer el arraylist de ubicaciones y 
		//rellenarlos con las ubicaciones disponibles
		for(int i=0; i < ubicaciones.size(); i++) {
			Hotel ubicHotel = ubicaciones.get(i);
			vista.panelBuscador.comboBox.addItem(ubicHotel);
//			System.out.println(ubicHotel);
		}
		
	}
}
