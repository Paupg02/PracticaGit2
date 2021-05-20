package ejemplosTeoria;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Inicial09 extends JFrame {
	static int ANCHO = 400;
	static int ALTO = 500;

	public Inicial09() {
		super("Mi marco03");
		setLayout(new GridLayout(3, 3, 10, 100));
		/*
		 * add(new JLabel(" Primera ")); add(new JLabel(" Segunda ")); add(new JLabel("
		 * Tercera ")); add(new JLabel(" Cuarta ")); add(new JLabel(" Quinta "));
		 * add(new JLabel(" Sexta ")); add(new JLabel(" Septima "));
		 */
//*Conbotones
		add(new JButton("Primera"));
		add(new JButton("Segunda"));
		add(new JButton("Tercera"));
		add(new JButton("Cuarta"));
		add(new JButton("Quinta"));
		add(new JButton("Sexta"));
		add(new JButton("Septima"));
		setBounds(400, 400, ANCHO, ALTO);
		setVisible(true);
	}

	public static void main(String args[]) {
		Inicial09 miMarco = new Inicial09();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
