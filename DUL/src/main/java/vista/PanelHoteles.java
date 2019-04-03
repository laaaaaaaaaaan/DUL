package vista;

import javax.swing.JPanel;

import javax.swing.JList;
import javax.swing.JButton;

public class PanelHoteles extends JPanel {

	public JList hoteles;
	public JButton btnAtras;
	
	public PanelHoteles() {

		setBounds(0, 0, 800, 600);
		setLayout(null);
		
		
		hoteles = new JList();
		hoteles.setBounds(27, 163, 280, 143);
		add(hoteles);
		
		btnAtras = new JButton("Atras");
		btnAtras.setBounds(596, 510, 89, 23);
		add(btnAtras);
		
		
		
		
		
	}
}
