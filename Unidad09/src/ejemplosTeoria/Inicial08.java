package ejemplosTeoria;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Inicial08 extends JFrame {
	static int ANCHO = 400;
	static int ALTO = 500;

	public Inicial08() {
		super("Mi marco02");
		setLayout(new GridLayout());
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
		Inicial08 miMarco = new Inicial08();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
