package vista;

import javax.swing.JPanel;

import modelo.Hotel;

import javax.swing.JList;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;

public class PanelHoteles extends JPanel {

	public JList<Object> hoteles;
	public JButton btnAtras, btnContinuar;
	public JLabel labelNombreHotel, labelUbicacion, labelPrecio, labelEstrellas, lblNombreHotel, lblUbicacion, lblPrecio, lblEstrellas;
	
	public PanelHoteles() {
		setBackground(new Color(255, 201, 164));
		setBounds(0, 0, 800, 600);
		setLayout(null);
		
		btnAtras = new JButton("Atras");
		btnAtras.setBounds(27, 536, 89, 23);
		add(btnAtras);
				
		hoteles = new JList<Object>();
		hoteles.setBounds(27, 189, 194, 181);
		add(hoteles);
		
		lblNombreHotel = new JLabel("Nombre hotel");
		lblNombreHotel.setBounds(436, 161, 101, 23);
		add(lblNombreHotel);
		
		lblUbicacion = new JLabel("Ubicacion");
		lblUbicacion.setBounds(436, 208, 101, 23);
		add(lblUbicacion);
		
		lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(436, 252, 101, 23);
		add(lblPrecio);
		
		lblEstrellas = new JLabel("Estrellas");
		lblEstrellas.setBounds(436, 303, 101, 23);
		add(lblEstrellas);
		
		btnContinuar = new JButton("Continuar");
		btnContinuar.setBounds(653, 536, 101, 23);
		add(btnContinuar);
		
		labelNombreHotel = new JLabel("");
		labelNombreHotel.setBounds(574, 161, 101, 23);
		add(labelNombreHotel);
		
		labelUbicacion = new JLabel("");
		labelUbicacion.setBounds(574, 208, 101, 23);
		add(labelUbicacion);
		
		labelPrecio = new JLabel("");
		labelPrecio.setBounds(574, 256, 101, 23);
		add(labelPrecio);
		
		labelEstrellas = new JLabel("");
		labelEstrellas.setBounds(574, 303, 101, 23);
		add(labelEstrellas);
		
		
		
		
		
	}
}
