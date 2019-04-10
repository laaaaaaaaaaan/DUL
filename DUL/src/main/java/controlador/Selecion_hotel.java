package controlador;
import modelo.Alojamiento;
import modelo.Hotel;
import modelo.Modelo;
import vista.Ventana;

public class Selecion_hotel {

	/*Mete los datos en el label correspondiente
	 * 
	 */
	public static void datosHotel(Ventana vis, String nombre, String ubicacion, double precio, int estrellas) {		
		vis.panelHoteles.labelNombreHotel.setText(nombre);
		vis.panelHoteles.labelUbicacion.setText(ubicacion);
		vis.panelHoteles.labelPrecio.setText(Double.toString(precio));
		vis.panelHoteles.labelEstrellas.setText(Integer.toString(estrellas));
	}
	
	/*Inserta los hoteles en el combobox de hoteles
	 * 
	 */
	public static void meterHotelesEnComboBox(Ventana vis,Modelo mod, Object[] hotel) {
		for (int i = 0; i <hotel.length; i++) {
			vis.panelHoteles.hoteles.setListData(hotel);
			
		}
	}
	
	/*Muestra los datos de cada hotel
	 * 
	 */
	public static void mostrarDatos(Ventana vis, Hotel [] hotel) {
		vis.panelHoteles.hoteles.setSelectedIndex(0);
		int seleccionado=vis.panelHoteles.hoteles.getSelectedIndex();	
		if(seleccionado==0) {
			datosHotel(vis, hotel[0].getNombreAloj(), hotel[0].getUbicacion(),4, hotel[0].getNEstrellas());
		}
		else if(seleccionado==1) {
			datosHotel(vis, hotel[1].getNombreAloj(), hotel[1].getUbicacion(),4, hotel[1].getNEstrellas());
		}
		else if(seleccionado==2) {
			datosHotel(vis, hotel[2].getNombreAloj(), hotel[2].getUbicacion(),4, hotel[2].getNEstrellas());
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
