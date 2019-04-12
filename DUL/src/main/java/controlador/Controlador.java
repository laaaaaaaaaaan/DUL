package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import modelo.Alojamiento;
import modelo.Hotel;

import modelo.Modelo;
import vista.Ventana;

public class Controlador implements ActionListener, ContainerListener {

	private Ventana vista;
	private Modelo modelo;
	
	
	public Controlador(Ventana vista, Modelo modelo) {
		this.vista = vista;
		this.modelo = modelo;
		
		vista.setContentPane(vista.panelBienvenida);
		inicializarEventos();
		}
	
	public void inicializarEventos() {
	
		this.vista.panelBienvenida.btnContinuar.addActionListener(this);
		this.vista.panelBuscador.btnContinuar.addActionListener(this);
		this.vista.panelHoteles.btnAtras.addActionListener(this);
		this.vista.panelHoteles.btnContinuar.addActionListener(this);
		this.vista.panelHoteles.hoteles.addContainerListener(this);
		this.vista.panelPago.btnCancelar.addActionListener(this);
		this.vista.panelHoteles.btnSeleccionar.addActionListener(this);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {

		Hotel[] hotel = new Hotel[3];
		hotel [0]=new Hotel("hotel1", "Madrid", 20);
		hotel [1]=new Hotel("hotel2", "Madrid", 25);
		hotel [2]=new Hotel("hotel3", "Madrid", 22);
		if(e.getSource() == vista.panelBienvenida.btnContinuar) {		
			vista.setContentPane(vista.panelBuscador);
			Control_buscador.addUbicacionesCombo();
		}else if(e.getSource() == vista.panelBuscador.btnContinuar) {
			controlador.Seleccion_hotel.meterHotelesEnComboBox(vista, controlador.Seleccion_hotel.cosas(hotel));
			vista.setContentPane(vista.panelHoteles);
		}else if(e.getSource() == vista.panelHoteles.btnSeleccionar) {			
			controlador.Seleccion_hotel.mostrarDatos(vista, hotel);
		}else if(e.getSource() == vista.panelHoteles.hoteles) {			
			controlador.Seleccion_hotel.mostrarDatos(vista, hotel);
		}else if(e.getSource() == vista.panelHoteles.btnAtras) {			
			vista.setContentPane(vista.panelBuscador);
		}else if(e.getSource() == vista.panelHoteles.btnContinuar) {
			vista.setContentPane(vista.panelPago);						
		}else if(e.getSource() == vista.panelPago.btnCancelar) {
			vista.setContentPane(vista.panelHoteles);
		}
	}

	@Override
	public void componentAdded(ContainerEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentRemoved(ContainerEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
