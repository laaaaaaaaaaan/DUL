package controlador;
import modelo.Alojamiento;
import modelo.Hotel;
import modelo.Modelo;
import vista.Ventana;

public class Selecion_hotel {

	/*Mete los datos en el label correspondiente
	 * 
	 */
	public void datosHotel(Ventana vis, String nombre, String ubicacion, double precio, int estrellas) {		
		vis.panelHoteles.lblNombreHotel.setText(nombre);
		vis.panelHoteles.lblUbicacion.setText(ubicacion);
		vis.panelHoteles.lblPrecio.setText(Double.toString(precio));
		vis.panelHoteles.lblEstrellas.setText(Integer.toString(estrellas));
	}
	
	/*Inserta los hoteles en el combobox de hoteles
	 * 
	 */
	public static void meterHotelesEnComboBox(Ventana vis,Modelo mod, Hotel [] hotel) {
		hotel [0]=new Hotel("hotel1", "Madrid", 20);
		hotel [1]=new Hotel("hotel2", "Madrid", 25);
		hotel [2]=new Hotel("hotel3", "Madrid", 22);
		for (int i = 0; i <hotel.length; i++) {
			vis.panelHoteles.hoteles.setListData(hotel);
		}
	}
	
	/*Muestra los datos de cada hotel
	 * 
	 */
	public void mostrarDatos(Ventana vis, Hotel [] hotel) {
		int seleccionado=vis.panelHoteles.hoteles.getSelectedIndex();
		hotel [0]=new Hotel("hotel1", "Madrid", 20);
		hotel [1]=new Hotel("hotel2", "Madrid", 25);
		hotel [2]=new Hotel("hotel3", "Madrid", 22);
		if(seleccionado==1) {
			datosHotel(vis, hotel[0].getNombreAloj(), hotel[0].getUbicacion(),4, hotel[0].getNEstrellas());
		}
		else if(seleccionado==2) {
			datosHotel(vis, hotel[1].getNombreAloj(), hotel[1].getUbicacion(),4, hotel[1].getNEstrellas());
		}
		else if(seleccionado==3) {
			datosHotel(vis, hotel[2].getNombreAloj(), hotel[2].getUbicacion(),4, hotel[2].getNEstrellas());
		}
	}
	
	/*devuelve la ubicacion
	 * 
	 */
	public static String devolverUbicacion(Ventana vis) {
		String ubicacion=(String) vis.panelBuscador.comboBox.getSelectedItem();
		return ubicacion;
	}
	
	
}
