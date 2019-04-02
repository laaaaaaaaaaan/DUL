package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.alojamiento;
import vista.frame_bukIN;

public class Controlador implements ActionListener {

	private frame_bukIN vista;
	private alojamiento modelo;
	
	
	public Controlador(frame_bukIN vista, alojamiento modelo) {
		this.vista = vista;
		this.modelo = modelo;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
	}

	
}
