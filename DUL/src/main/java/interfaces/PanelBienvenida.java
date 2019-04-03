package interfaces;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class PanelBienvenida extends JPanel {

	public JLabel lblBienvenido;
	public JButton btnContinuar;
	
	public PanelBienvenida() {
		
		setBounds(0, 0, 800, 600);
		setLayout(null);
		
		btnContinuar = new JButton("Continuar");
		btnContinuar.setBounds(345, 496, 89, 23);
		add(btnContinuar);
		
		lblBienvenido = new JLabel("Bienvenido");
		lblBienvenido.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenido.setBounds(303, 275, 163, 37);
		add(lblBienvenido);

	}
}
