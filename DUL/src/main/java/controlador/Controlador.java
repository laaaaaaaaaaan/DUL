package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import interfaces.Frame_BidaiOn;
import modelo.Alojamiento;

public class Controlador implements ActionListener {

	private Frame_BidaiOn vista;
	private Alojamiento modelo;
	
	
	public Controlador(Frame_BidaiOn vista, Alojamiento modelo) {
		this.vista = vista;
		this.modelo = modelo;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		
	}

	
}
