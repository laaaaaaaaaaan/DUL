package vista;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;

import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;

import java.awt.Scrollbar;
import javax.swing.JButton;

public class PanelReserva extends JPanel {

	/**
	 * Create the panel.
	 */
	
	public JLabel lblHotelSelc, lblIndivudial, lblMatrimonio, lbldoble;
	public JSpinner indspinn, matrispinn,doblespinn;
	public JButton btnReservar;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	
	
	public PanelReserva() {
		setLayout(null);
		setBounds(0, 0, 800, 600);
		setBackground(new Color(255, 201, 164));
		
		lblHotelSelc = new JLabel("El Hotel Seleccionado");
		lblHotelSelc.setHorizontalAlignment(SwingConstants.CENTER);
		lblHotelSelc.setBounds(37, 41, 210, 62);
		add(lblHotelSelc);
		
		lblIndivudial = new JLabel("Indivudial");
		lblIndivudial.setBounds(51, 231, 62, 27);
		add(lblIndivudial);
		
		lblMatrimonio = new JLabel("Matrimonio");
		lblMatrimonio.setBounds(51, 325, 62, 27);
		add(lblMatrimonio);
		
		lbldoble = new JLabel("Doble");
		lbldoble.setBounds(51, 418, 62, 27);
		add(lbldoble);
		
		indspinn = new JSpinner();
		indspinn.setModel(new SpinnerNumberModel(new Integer(1), null, null, new Integer(1)));
		indspinn.setBounds(139, 229, 70, 30);
		add(indspinn);
		
		matrispinn = new JSpinner();
		matrispinn.setBounds(139, 323, 70, 30);
		add(matrispinn);
		
		doblespinn = new JSpinner();
		doblespinn.setBounds(139, 416, 70, 30);
		add(doblespinn);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(219, 234, 62, 20);
		add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(219, 328, 62, 20);
		add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(219, 421, 53, 20);
		add(lblNewLabel_2);
		
		btnReservar= new JButton("Reservar");
		btnReservar.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		btnReservar.setAlignmentY(Component.TOP_ALIGNMENT);
		btnReservar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnReservar.setBounds(653, 536, 101, 23);
		add(btnReservar);
		
		

	}
}
