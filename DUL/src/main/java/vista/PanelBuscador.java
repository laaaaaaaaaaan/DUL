package vista;

import javax.swing.JPanel;

import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class PanelBuscador extends JPanel {

	public JLabel lblUbicacion;
	public JButton btnContinuar;
	public JComboBox comboBox;
	
	public PanelBuscador() {

		setBounds(0, 0, 800, 600);
		setLayout(null);
		
		lblUbicacion = new JLabel("Ubicacion");
		lblUbicacion.setBounds(64, 158, 101, 23);
		add(lblUbicacion);

		btnContinuar = new JButton("Continuar");
		btnContinuar.setBounds(149, 414, 475, 23);
		add(btnContinuar);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Vizcaya", "Madrid", "Otros"}));
		comboBox.setBounds(137, 159, 229, 22);
		add(comboBox);
		
		
		
		
		
	}
}
