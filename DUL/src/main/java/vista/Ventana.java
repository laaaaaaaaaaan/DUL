package vista;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Ventana extends JFrame {

	//private JPanel contentPane;
	
	public PanelBienvenida panelBienvenida;
	public PanelBuscador panelBuscador;
	public PanelHoteles panelHoteles;
	public PanelPago panelPago;
	
	
	public Ventana() {
		
		panelBienvenida=new PanelBienvenida();
		panelBuscador=new PanelBuscador();
		panelHoteles=new PanelHoteles();
		//panelPago=new PanelPago();
		getContentPane().add(panelBienvenida);
		getContentPane().add(panelBuscador);
		getContentPane().add(panelHoteles);
		
		
		
		
		
		//Inicializacion de variables
		
		setResizable(false);
		setBounds(0, 0, 800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new CardLayout(0, 0));
		setTitle("Termibus"); 
		setLocationRelativeTo(null);
		
		/*setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);*/
	}

}
