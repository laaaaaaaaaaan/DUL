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
//		vista.setContentPane(vista.panelBuscador);
//		vista.setContentPane(vista.panelHoteles);
//		vista.setContentPane(vista.panelPago);
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
<<<<<<< HEAD
=======

		Hotel[] hotel = new Hotel[3];
		hotel [0]=new Hotel("hotel1", "Madrid", 20);
		hotel [1]=new Hotel("hotel2", "Madrid", 25);
		hotel [2]=new Hotel("hotel3", "Madrid", 22);
>>>>>>> 48e89b360ae3a2e70bf42332d664708879391a1d
		if(e.getSource() == vista.panelBienvenida.btnContinuar) {		
			Control_buscador.addUbicacionesCombo();
<<<<<<< HEAD
			vista.setContentPane(vista.panelBuscador);
			System.out.println("dfsdfsdfsdfsfsdfsdf");
		}
		else if(e.getSource() == vista.panelBuscador.btnContinuar) {
//			Hotel[] hotel = new Hotel[3];
//			hotel [0]=new Hotel("hotel1", "Madrid", 20);
//			hotel [1]=new Hotel("hotel2", "Madrid", 25);
//			hotel [2]=new Hotel("hotel3", "Madrid", 22);
//			controlador.Seleccion_hotel.meterHotelesEnComboBox(vista, modelo, hotel);
//			controlador.Seleccion_hotel.mostrarDatos(vista, hotel);
			System.out.println("vaaa bennneeeee");
			Control_hoteles.addHotelesJList();		
			vista.setContentPane(vista.panelHoteles);
=======
		}else if(e.getSource() == vista.panelBuscador.btnContinuar) {
			controlador.Seleccion_hotel.meterHotelesEnComboBox(vista, controlador.Seleccion_hotel.cosas(hotel));
			vista.setContentPane(vista.panelHoteles);
		}else if(e.getSource() == vista.panelHoteles.btnSeleccionar) {			
			controlador.Seleccion_hotel.mostrarDatos(vista, hotel);
>>>>>>> 48e89b360ae3a2e70bf42332d664708879391a1d
		}else if(e.getSource() == vista.panelHoteles.btnAtras) {			
			vista.setContentPane(vista.panelBuscador);
		}else if(e.getSource() == vista.panelHoteles.btnContinuar) {
			vista.setContentPane(vista.panelPago);
			//vista.VistaPrincipal();
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
