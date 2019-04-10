package vista;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import modelo.Hotel;
import javax.swing.JList;
import java.awt.Color;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;

public class PanelHoteles extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public JList<Object> hoteles;
	public DefaultListModel<Object> modeloHoteles = new DefaultListModel<Object>();
	public JButton btnAtras, btnContinuar;
	public JLabel labelNombreHotel, labelUbicacion, labelPrecio, labelCategoria, lblNombreHotel, lblUbicación, lblPrecio, lblCategoría;
	
	public PanelHoteles() {
		setBackground(new Color(255, 201, 164));
		setBounds(0, 0, 800, 600);
		setLayout(null);
		
		btnAtras = new JButton("Atras");
		btnAtras.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		btnAtras.setBounds(27, 536, 89, 23);
		add(btnAtras);
				
		hoteles = new JList<Object>();
		hoteles.setBounds(48, 164, 194, 181);
		add(hoteles);
		
		lblNombreHotel = new JLabel("Nombre hotel");
		lblNombreHotel.setBounds(436, 161, 101, 23);
		add(lblNombreHotel);
		
		lblUbicación = new JLabel("Ubicacion");
		lblUbicación.setBounds(436, 208, 101, 23);
		add(lblUbicación);
		
		lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(436, 252, 101, 23);
		add(lblPrecio);
		
		lblCategoría = new JLabel("Categoria");
		lblCategoría.setBounds(436, 303, 101, 23);
		add(lblCategoría);
		
		btnContinuar = new JButton("Continuar");
		btnContinuar.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		btnContinuar.setBounds(653, 536, 101, 23);
		add(btnContinuar);
		
		labelNombreHotel = new JLabel("");
		labelNombreHotel.setBounds(574, 161, 101, 23);
		add(labelNombreHotel);
		
		labelUbicacion = new JLabel("");
		labelUbicacion.setBounds(574, 208, 101, 23);
		add(labelUbicacion);
		
		labelPrecio = new JLabel("");
		labelPrecio.setBounds(574, 252, 101, 23);
		add(labelPrecio);
		
		labelCategoria = new JLabel("");
		labelCategoria.setBounds(574, 303, 101, 23);
		add(labelCategoria);
		
		

		
		
	}
}
