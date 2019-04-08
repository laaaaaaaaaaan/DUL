package vista;

import javax.swing.JPanel;

import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;

import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

import java.awt.Font;

public class PanelBuscador extends JPanel {

	public JLabel lblUbicacion;
	public JButton btnContinuar;
	public JComboBox comboBox;
	
	public PanelBuscador() {
		setBackground(new Color(255, 201, 164));
		setBounds(0, 0, 800, 600);
		setLayout(null);
		
		lblUbicacion = new JLabel("Ubicacion");
		lblUbicacion.setBounds(257, 304, 71, 23);
		add(lblUbicacion);

		btnContinuar = new JButton("Continuar");
		btnContinuar.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		btnContinuar.setBounds(653, 536, 101, 23);
		add(btnContinuar);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Vizcaya", "Madrid", "Otros"}));
		comboBox.setBounds(329, 304, 229, 22);
		add(comboBox);
		
		JLabel lblEscojaElDestino = new JLabel("Escoja el destino de su reserva");
		lblEscojaElDestino.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblEscojaElDestino.setHorizontalAlignment(SwingConstants.CENTER);
		lblEscojaElDestino.setBounds(187, 121, 451, 126);
		add(lblEscojaElDestino);
		
		
		
		
		
	}
}
