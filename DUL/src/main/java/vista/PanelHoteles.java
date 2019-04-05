package vista;

import javax.swing.JPanel;

import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class PanelHoteles extends JPanel {

	public JList hoteles;
	public JButton btnAtras;
	public JTextField textFieldNombre, textFieldUbicacion, textFieldPrecio, textFieldEstrellas;
	
	public PanelHoteles() {

		setBounds(0, 0, 800, 600);
		setLayout(null);
		
		
		hoteles = new JList();
		hoteles.setBounds(27, 163, 280, 143);
		add(hoteles);
		
		btnAtras = new JButton("Atras");
		btnAtras.setBounds(64, 513, 89, 23);
		add(btnAtras);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(574, 161, 182, 23);
		add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		JLabel lblNombreHotel = new JLabel("Nombre hotel");
		lblNombreHotel.setBounds(436, 161, 101, 23);
		add(lblNombreHotel);
		
		JLabel lblUbicacion = new JLabel("Ubicacion");
		lblUbicacion.setBounds(436, 208, 101, 23);
		add(lblUbicacion);
		
		textFieldUbicacion = new JTextField();
		textFieldUbicacion.setColumns(10);
		textFieldUbicacion.setBounds(574, 208, 182, 23);
		add(textFieldUbicacion);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(436, 252, 101, 23);
		add(lblPrecio);
		
		textFieldPrecio = new JTextField();
		textFieldPrecio.setColumns(10);
		textFieldPrecio.setBounds(574, 252, 182, 23);
		add(textFieldPrecio);
		
		JLabel lblEstrellas = new JLabel("Estrellas");
		lblEstrellas.setBounds(436, 303, 101, 23);
		add(lblEstrellas);
		
		textFieldEstrellas = new JTextField();
		textFieldEstrellas.setColumns(10);
		textFieldEstrellas.setBounds(574, 303, 182, 23);
		add(textFieldEstrellas);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.setBounds(574, 513, 101, 23);
		add(btnContinuar);
		
		
		
		
		
	}
}
