package vista;

import javax.swing.JPanel;

import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class PanelBuscador extends JPanel {
	public JTextField textFieldUbicacion;
	public JButton btnContinuar;
	
	public PanelBuscador() {

		setBounds(0, 0, 800, 600);
		setLayout(null);
		
		JLabel lblUbicacion = new JLabel("Ubicacion");
		lblUbicacion.setBounds(64, 158, 101, 23);
		add(lblUbicacion);
		
		textFieldUbicacion = new JTextField();
		textFieldUbicacion.setColumns(10);
		textFieldUbicacion.setBounds(202, 158, 182, 23);
		add(textFieldUbicacion);
		
		JButton btnContinuar = new JButton("Continuar");
		btnContinuar.setBounds(149, 414, 475, 23);
		add(btnContinuar);
		
		
		
		
		
	}
}
