package interfaces;

import javax.swing.JPanel;

import javax.swing.JList;

import java.awt.Color;

import javax.swing.JButton;

public class PanelHoteles extends JPanel {

	public JList hoteles, infohoteles;
	public JButton btnAtras;
	
	public PanelHoteles() {
		setBackground(new Color(255, 201, 164));
		setBounds(0, 0, 800, 600);
		setLayout(null);
		
		btnAtras = new JButton("Atras");
		btnAtras.setBounds(27, 536, 89, 23);
		add(btnAtras);
		
		
		hoteles = new JList();
		hoteles.setBounds(27, 189, 194, 181);
		add(hoteles);
		
		
		infohoteles = new JList();
		infohoteles.setBounds(410, 189, 323, 317);
		add(infohoteles);
		
		
		
		
		
	}
}
