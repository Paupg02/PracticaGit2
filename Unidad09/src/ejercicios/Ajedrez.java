package ejercicios;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Ajedrez extends JFrame {

	// private JButton tablero[][];
	private JLabel[] fil = new JLabel[9];
	private JLabel[] col = new JLabel[9];
	private PanelTablero tableroP;
	Box panelNorte;
	Box panelOeste;

	public Ajedrez() {
		String columnas[] = { "1", "2", "3", "4", "5", "6", "7", "8" };
		String filas[] = { "A", "B", "C", "D", "E", "F", "G", "H" };

		panelNorte = Box.createHorizontalBox();

		for (int i = 0; i < filas.length; i++) {
			fil[i] = new JLabel(filas[i]);
			fil[i].setBounds(50 * (i + 1), 10, 50, 50);
			panelNorte.add(Box.createRigidArea(new Dimension(75, 30)));
			panelNorte.add(fil[i]);
		}
		add(panelNorte, BorderLayout.NORTH);

		panelOeste = Box.createVerticalBox();
		for (int i = 0; i < columnas.length; i++) {
			col[i] = new JLabel(columnas[i]);
			col[i].setBounds(50 * (i + 1), 10, 50, 50);
			panelOeste.add(Box.createRigidArea(new Dimension(30, 60)));
			panelOeste.add(col[i]);
		}

		add(panelOeste, BorderLayout.WEST);

		tableroP = new PanelTablero();
		tableroP.setLocation(75, 75);
		add(tableroP, BorderLayout.CENTER);

	}

	public static void main(String[] args) {
		Ajedrez marco = new Ajedrez();
		marco.setTitle("Ajedrez");
		marco.setBounds(200, 100, 750, 750);
		// marco.setResizable(false);
		marco.setVisible(true);
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	;
}