package interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Ventana extends JFrame {

	private JPanel contentPane;
	
	public PanelBienvenida panelBienvenida;
	public PanelHoteles panelHoteles;
	public PanelPago panelPago;
	
	
	public Ventana() {
		
		panelBienvenida=new PanelBienvenida();
		panelHoteles=new PanelHoteles();
		panelPago=new PanelPago();
		
		
		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
