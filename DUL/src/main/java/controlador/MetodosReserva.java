package controlador;

import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import modelo.Cama;
import modelo.Cliente;
import modelo.Habitacion;
import modelo.Modelo;
import vista.Ventana;

public class MetodosReserva {
	
	/*
	 * Registra al usuario si no lo está
	 */
	public Cama reserva(Ventana vis, Modelo mod) {
		int individual=vis.panelReserva.indspinn.getComponentCount();
		int matrimonio=vis.panelReserva.matrispinn.getComponentCount();
		int doble=vis.panelReserva.doblespinn.getComponentCount();
		return (new Cama( "", "", 6, "", "", individual, matrimonio, doble));
	}

}
