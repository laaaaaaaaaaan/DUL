package controlador;
import modelo.Alojamiento;
import modelo.Modelo;
import vista.Ventana;

public class Selecion_hotel {

	/*Mete los datos en el label correspondiente
	 * 
	 */
	public void datosHotel(Ventana vis, String nombre, String ubicacion, double precio, int estrellas) {
		vis.panelHoteles.lblNombreHotel.setText(nombre);
		vis.panelHoteles.lblNombreHotel.setText(ubicacion);
		vis.panelHoteles.lblNombreHotel.setText(Double.toString(precio));
		vis.panelHoteles.lblNombreHotel.setText(Integer.toString(estrellas));
	}
	
	/*Inserta los hoteles en el combobox de hoteles
	 * 
	 */
	public static void meterHotelesEnComboBox(Ventana vis,Modelo mod, Alojamiento [] alojamiento) {
		for (int i = 0; i <alojamiento.length; i++) {
			vis.panelHoteles.hoteles.setListData(alojamiento);
		}
	}
}
