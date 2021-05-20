package ejemplosTeoria;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Inicial02Bis {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		VentanaCentrada ventana = new VentanaCentrada();
	}
}

@SuppressWarnings("serial")
class VentanaCentrada extends JFrame {
	public VentanaCentrada() {
		super("Centrar JFrame");
		Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		//devuelvelaresoluciondelapatalla
		int height = pantalla.height;
		int width = pantalla.width;
		setSize(width / 2, height / 2);
		//creaunaventanaconlamitaddearesolucióndelapantalla
		setLocation(width / 4, height / 4);
		// setLocationRelativeTo(null);
		setVisible(true);
	}
}
