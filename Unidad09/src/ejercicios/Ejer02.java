package ejercicios;

import javax.swing.*;

@SuppressWarnings("serial")
public class Ejer02 extends JFrame {

	public static void main(String[] args) {
		//Creo la ventana
		JFrame ventana = new JFrame("Ventana churrusquera");
		
		//Le pongo un tamaño y un lugar
		ventana.setBounds(0, 0, 1024, 800);
		
		//No dejo cambiar el tamaño
		ventana.setResizable(false);
		
		//Configuro el cierre y hago la ventana visible
		ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ventana.setVisible(true);

	}

}

