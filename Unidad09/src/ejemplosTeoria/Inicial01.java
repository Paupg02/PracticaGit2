package ejemplosTeoria;

import javax.swing.JFrame;

public class Inicial01 {
	public static void main(String[] args) {
		Ventana01 miVentana = new Ventana01();
		miVentana.setTitle("MI PRIMERA VENTANA");
		miVentana.setVisible(true);
		miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Ventana01 extends JFrame {
	private static final long serialVersionUID = 1L;

	public Ventana01() {
		//Coloca la ventana en la posición x=200 e Y= 200 desde la esquina superior izquierda de la pantalla
		//su tamaño es de 500*300
		setBounds(200, 200, 500, 300);
		//setSize(500,300);
		//setLocation(500,500);
		//Añadimos el titulo a la ventana
		//setTitle("Miprimeraventana");
		//la hacemos visible Podriamos hacerlo en main
		//setVisible(true);
		//le indicamos que hacer al cierre
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
