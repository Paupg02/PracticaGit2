package ejercicios;

import java.awt.Color;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PanelTablero extends JPanel {
	public PanelTablero() {
		JButton[][] botones;
		botones = new JButton[8][8];

		for (int i = 0; i < botones.length; i++) {
			for (int j = 0; j < botones[i].length; j++) {
				botones[i][j] = new JButton();
// SE CREAN LOS BOTONES Y SE ESTABLECE SU TAMAÑO PREFERIDO
				botones[i][j].setPreferredSize(new Dimension(50, 50));
				if ((i + j + 1) % 2 == 0) {
					botones[i][j].setBackground(Color.BLACK);
				} else
					botones[i][j].setBackground(Color.WHITE);

				add(botones[i][j]);
			}
			setLayout(new GridLayout(8, 8));
			setBounds(50, 50, 450, 450);

		}

	}

	public static void main(String[] args) {
		JFrame ventana = new JFrame("Tablero ");
		PanelTablero tablero = new PanelTablero();
		ventana.add(tablero);
		ventana.setBounds(200, 200, 450, 450);
		ventana.setVisible(true);
	}
}
