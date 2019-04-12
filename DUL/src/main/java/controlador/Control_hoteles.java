package controlador;

import java.util.ArrayList;
import modelo.Hotel;

public class Control_hoteles {

<<<<<<< HEAD
	
	public static void addHotelesJList() {

		//Panel esta creado en el constructor de vista.
=======
	public Ventana vista;
	public Modelo modelo;
	private ArrayList<Alojamiento> hotelesList;
	Hotel ubicacion;
	Hotel hotel;
	
	//Constructor
	public Control_hoteles(Ventana vista, Modelo modelo) {
		this.vista = vista;
		this.modelo = modelo;
	}
	
	//Añadir listeners a los botones del panel 'hoteles'
	public void addListeners() {
		vista.panelHoteles.hoteles.addListSelectionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) throws SQLException {
>>>>>>> 48e89b360ae3a2e70bf42332d664708879391a1d
		//Guardar ubicacion seleccionada
		String ubicacion = Launcher_sprint1.vista.panelBuscador.comboBox.getSelectedItem().toString();
		System.out.println("1 ubicacion seleccionada");

		//Lamar ala funcion que lee los hoteles de la BBDD en el modelo
		ArrayList <Hotel> hotelesList =	Launcher_sprint1.modelo.consulta.getHotelesUbicacion(ubicacion);
		System.out.println("2 listado hoteles");
		
		//Limpiar el JList de hoteles
		Launcher_sprint1.vista.panelHoteles.jlistHoteles.removeAll();
		System.out.println("3 borrar listado anterior del jlist");
			
		//Mostrar hoteles en JList
		for(int i=0; i<hotelesList.size(); i++) {
			Launcher_sprint1.vista.panelHoteles.modeloHoteles.addElement(hotelesList.get(i));
			System.out.println("4 imprimir hoteles en jlist");
		}
		Launcher_sprint1.vista.panelHoteles.jlistHoteles.setModel(Launcher_sprint1.vista.panelHoteles.modeloHoteles);
	}
}
