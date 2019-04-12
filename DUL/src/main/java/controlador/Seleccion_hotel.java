package controlador;
import javax.swing.JOptionPane;

import modelo.Hotel;
import modelo.Modelo;
import vista.Ventana;

public class Seleccion_hotel {

	/*Mete los datos en el label correspondiente
	 * 
	 */
	public static void datosHotel(Ventana vis, String nombre, String ubicacion, double precio, int estrellas) {		
		vis.panelHoteles.labelNombreHotel.setText(nombre);
		vis.panelHoteles.labelUbicacion.setText(ubicacion);
		vis.panelHoteles.labelPrecio.setText(Double.toString(precio));
		vis.panelHoteles.labelCategoria.setText(Integer.toString(estrellas));
	}
	
	/*Inserta los hoteles en el combobox de hoteles
	 * 
	 */
<<<<<<< HEAD
	public static void meterHotelesEnComboBox(Ventana vis,Modelo mod, Hotel [] hotel) {
		for (int i = 0; i <hotel.length; i++) {
			vis.panelHoteles.jlistHoteles.setListData(hotel);
=======
	public static void meterHotelesEnComboBox(Ventana vis, String [] nombreHotel) {
		for (int i = 0; i <nombreHotel.length; i++) {
			vis.panelHoteles.hoteles.setListData(nombreHotel);
>>>>>>> 48e89b360ae3a2e70bf42332d664708879391a1d
		}
	}
	
	public static String [] cosas (Hotel [] hotel) {
		String[] cosas = new String[hotel.length];
		for (int i = 0; i <cosas.length; i++) {
			cosas[i]=hotel[i].getNombreAloj();
		}
		return cosas;
		
	}
	
	/*Muestra los datos de cada hotel
	 * 
	 */
	public static void mostrarDatos(Ventana vis, Hotel [] hotel) {
<<<<<<< HEAD
		vis.panelHoteles.jlistHoteles.setSelectedIndex(0);
		int seleccionado=vis.panelHoteles.jlistHoteles.getSelectedIndex();
		if(seleccionado==0) {
			datosHotel(vis, hotel[0].getNombreAloj(), hotel[0].getUbicacion(),4, hotel[0].getCategoria());
		}
		else if(seleccionado==1) {
			datosHotel(vis, hotel[1].getNombreAloj(), hotel[1].getUbicacion(),4, hotel[1].getCategoria());
		}
		else if(seleccionado==2) {
			datosHotel(vis, hotel[2].getNombreAloj(), hotel[2].getUbicacion(),4, hotel[2].getCategoria());
=======
		//vis.panelHoteles.hoteles.setSelectedIndex(0);
		int seleccionado=vis.panelHoteles.hoteles.getSelectedIndex();
		datosHotel(vis, hotel[seleccionado].getNombreAloj(), hotel[seleccionado].getUbicacion(),4, hotel[seleccionado].getCategoria());
	}
	
	public static void tres(Ventana vis) {
		String nombre="";
		if(nombre==vis.panelHoteles.labelNombreHotel.getText()) {
			if(JOptionPane.showConfirmDialog(null,"gxdd")==JOptionPane.YES_OPTION) {
				System.exit(0);
			}
			else {
				JOptionPane.showConfirmDialog(null,"no has cerrado nada");
			}
>>>>>>> 48e89b360ae3a2e70bf42332d664708879391a1d
		}
	}
	
	/*devuelve la ubicacion
	 * 
	 */
	public String devolverUbicacion(Ventana vis) {
		String ubicacion=(String) vis.panelBuscador.comboBox.getSelectedItem();
		return ubicacion;
	}
	
}
