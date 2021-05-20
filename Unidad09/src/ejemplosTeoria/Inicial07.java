package ejemplosTeoria;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Inicial07 extends JFrame {
	static int ANCHO = 400;
	static int ALTO = 500;

	public Inicial07() {
//constuctorsuper("Mi marco01-Grid");
//filascolumnasseparaciónhorizontal,separaciónvertical
		setLayout(new GridLayout(3, 2, 15, 15));
		add(new JLabel("Primera"));
		add(new JLabel("Segunda"));
		add(new JLabel("Tercera"));
		add(new JLabel("Cuarta"));
		add(new JLabel("Quinta"));
		add(new JLabel("Sexta"));
		setBounds(400, 400, ANCHO, ALTO);
		setVisible(true);
	}

	public static void main(String args[]) {
		Inicial07 miMarco = new Inicial07();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
