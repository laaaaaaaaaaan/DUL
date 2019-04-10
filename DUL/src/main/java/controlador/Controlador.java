package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Alojamiento;
import modelo.Hotel;
import modelo.Modelo;
import vista.Ventana;

public class Controlador implements ActionListener {

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
		this.vista.panelPago.btnCancelar.addActionListener(this);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if(e.getSource() == vista.panelBienvenida.btnContinuar) {		
			vista.setContentPane(vista.panelBuscador);
			Control_buscador.rellenarubicacionescombo();
		}else if(e.getSource() == vista.panelBuscador.btnContinuar) {
			Hotel[] hotel = new Hotel[3];
			hotel [0]=new Hotel("hotel1", "Madrid", 20);
			hotel [1]=new Hotel("hotel2", "Madrid", 25);
			hotel [2]=new Hotel("hotel3", "Madrid", 22);
			controlador.Seleccion_hotel.meterHotelesEnComboBox(vista, modelo, hotel);
			controlador.Seleccion_hotel.mostrarDatos(vista, hotel);
			vista.setContentPane(vista.panelHoteles);
		}else if(e.getSource() == vista.panelHoteles.btnAtras) {			
			vista.setContentPane(vista.panelBuscador);
		}else if(e.getSource() == vista.panelHoteles.btnContinuar) {
			vista.setContentPane(vista.panelPago);			
		}
		else if(e.getSource() == vista.panelPago.btnCancelar) {
			vista.setContentPane(vista.panelHoteles);
		}
	}
}
