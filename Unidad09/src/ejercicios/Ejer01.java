package ejercicios;

import javax.swing.*;

@SuppressWarnings("serial")
public class Ejer01 extends JFrame {

	public static void main(String[] args) {
		//Creo la ventana
		JFrame ventana = new JFrame("Ventana churrusquera");
		
		//Le pongo un tamaño y un lugar
		ventana.setBounds(200, 200, 300, 200);
		
		//Creo una etiqueta
		JLabel titulo=new JLabel("Ventana churrusquera");
		
		//Añado la etiqueta a la ventana
		ventana.add(titulo);
		
		//Configuro el cierre y hago la ventana visible
		ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ventana.setVisible(true);

	}

}
