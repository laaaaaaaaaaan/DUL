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
		for (int i = 0; i <hotel.length; i++) {
			vis.panelHoteles.hoteles.setListData(hotel);
		}
	}
	
	public void mostrarDatos(Ventana vis, Hotel [] hotel) {
		int seleccionado=vis.panelHoteles.hoteles.getSelectedIndex();
		Hotel hotel1=new Hotel("hotel1", "Madrid", 20);
		Hotel hotel2=new Hotel("hotel2", "Madrid", 25);
		Hotel hotel3=new Hotel("hotel3", "Madrid", 22);
		if(seleccionado==1) {
			datosHotel(vis, hotel1.getNombreAloj(), hotel1.getUbicacion(),4, hotel1.getNEstrellas());
		}
		else if(seleccionado==2) {
			datosHotel(vis, hotel1.getNombreAloj(), hotel2.getUbicacion(),4, hotel1.getNEstrellas());
		}
		else if(seleccionado==3) {
			datosHotel(vis, hotel1.getNombreAloj(), hotel3.getUbicacion(),4, hotel1.getNEstrellas());
		}
	}
	
	public static String devolverUbicacion(Ventana vis) {
		String ubicacion=(String) vis.panelBuscador.comboBox.getSelectedItem();
		return ubicacion;
	}
	
	
}
