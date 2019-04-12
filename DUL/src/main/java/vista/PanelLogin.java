package vista;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PanelLogin extends JPanel {

	/**
	 * Create the panel.
	 */
	
	public JLabel lblRegistroUsuario, lblNombre, lblApellido, lblDni, lblSexo, lblLogin, lblDniLogin, lblContraseaLogin, lblContrasea, lblFechaNacimiento;
	public JTextField textFieldNombre, textFieldApellido, textFieldDNI, textFieldDNILogin;
	
	public PanelLogin() {
		setLayout(null);
		setBounds(0,0,800,600);
		setBackground(new Color(255, 201, 164));
		
		lblRegistroUsuario = new JLabel("REGISTRO");
		lblRegistroUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistroUsuario.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblRegistroUsuario.setBounds(58, 35, 269, 48);
		add(lblRegistroUsuario);
		
		lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(47, 106, 78, 39);
		add(lblNombre);
		
		textFieldNombre = new JTextField();
		textFieldNombre.setBounds(135, 108, 192, 39);
		add(textFieldNombre);
		textFieldNombre.setColumns(10);
		
		lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(47, 170, 78, 41);
		add(lblApellido);
		
		textFieldApellido = new JTextField();
		textFieldApellido.setColumns(10);
		textFieldApellido.setBounds(135, 170, 192, 39);
		add(textFieldApellido);
		
		lblDni = new JLabel("DNI:");
		lblDni.setBounds(51, 313, 65, 43);
		add(lblDni);
		
		textFieldDNI = new JTextField();
		textFieldDNI.setBounds(135, 313, 190, 43);
		add(textFieldDNI);
		
		lblFechaNacimiento = new JLabel("Fecha de nacimiento:");
		lblFechaNacimiento.setBounds(47, 245, 160, 39);
		add(lblFechaNacimiento);
	}

}
