package ejemplosTeoria;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Inicial15 {
	public static void main(String[] args) {
		Ventana15 ventana = new Ventana15();
//Instanciamosunaetiqueta
		JLabel etiqueta = new JLabel("¡¡HOLA MUNDO!!");
//etiqueta.setHorizontalAlignment(JLabel.CENTER);Coloca la etiqueta en mitad de la pantalla
//etiqueta.setVerticalAlignment(JLabel.BOTTOM);Coloca la etiqueta en la pantalla abajo
		etiqueta.setHorizontalAlignment(JLabel.RIGHT);
//Coloca la etiqueta a la derecha de la pantalla
		ventana.add(etiqueta);
		ventana.setVisible(true);
	}
}

@SuppressWarnings("serial")
class Ventana15 extends JFrame {
	public Ventana15() {
		setBounds(600, 300, 500, 300);
		setTitle("Ventana con etiqueta");
		setSize(500, 300);
		setLocation(500, 500);
//setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
