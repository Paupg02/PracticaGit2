package ejemplosTeoria;

import javax.swing.*;
import java.awt.*;

public class Inicial03 extends JFrame {
	private static final long serialVersionUID = 1L;
	static int ANCHO = 500;
	static int ALTO = 300;

	public Inicial03() {
//constructordelaclasesuper("Mi marco");
//nombredelapantalla,invocaalconstructordeJFrame
//(Etiquetaaescribir,posicióndelaetiqueta,marcodondecolocarlo)
		add(new JLabel("Norte", SwingConstants.CENTER), BorderLayout.NORTH);
		add(new JLabel("Sur", SwingConstants.CENTER), BorderLayout.SOUTH);
		add(new JLabel("Centro", SwingConstants.CENTER), BorderLayout.CENTER);
		add(new JLabel("Oeste", SwingConstants.CENTER), BorderLayout.WEST);
		add(new JLabel("Este", SwingConstants.CENTER), BorderLayout.EAST);
//setSize(ANCHO,ALTO);
		setBounds(500, 500, ANCHO, ALTO);
		setVisible(true);
	}

	public static void main(String args[]) {
		Inicial03 miMarco = new Inicial03();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}