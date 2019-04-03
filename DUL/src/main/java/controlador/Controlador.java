package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import interfaces.Ventana;
import modelo.Alojamiento;

public class Controlador implements ActionListener {

	private Ventana vista;
	private Alojamiento modelo;
	
	
	public Controlador(Ventana vista, Alojamiento modelo) {
		this.vista = vista;
		this.modelo = modelo;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
	}

	
}
