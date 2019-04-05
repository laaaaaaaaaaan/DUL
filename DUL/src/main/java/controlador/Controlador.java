package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Alojamiento;
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
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == vista.panelBienvenida.btnContinuar) {
			//crear panel buscador
			//ir a la BBDD y distintas ubicaciones
			//rellenar el combo de panel Buscador con el RS
			//mostrar el panel buscador
		if(e.getSource() == vista.panelBienvenida.btnContinuar) {		
			vista.setContentPane(vista.panelBuscador);
		}else if(e.getSource() == vista.panelBuscador.btnContinuar) {
			vista.setContentPane(vista.panelHoteles);
		}
		else if(e.getSource() == vista.panelHoteles.btnAtras) {			
			vista.setContentPane(vista.panelBuscador);
		}
		
		}
	}
}
