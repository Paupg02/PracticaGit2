package ejercicios;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class TresEnRaya extends JPanel implements ActionListener {
	private JButton[][] botones = new JButton[3][3];
	int cont = 0;
	static JLabel arriba = new JLabel("Truno azul");
	static JLabel abajo = new JLabel("Resultado :");

	public TresEnRaya() {

		for (int i = 0; i < botones.length; i++) {
			for (int j = 0; j < botones[i].length; j++) {
				botones[i][j] = new JButton();
				botones[i][j].setPreferredSize(new Dimension(50, 50));
				botones[i][j].setBackground(Color.WHITE);
				botones[i][j].addActionListener(this);

				add(botones[i][j]);
			}
			setLayout(new GridLayout(3, 3));
			setBounds(50, 50, 450, 450);
		}
	}

	public static void main(String[] args) {
		JFrame ventana = new JFrame("Tres En Raya ");

		ventana.add(arriba, BorderLayout.NORTH);
		ventana.add(abajo, BorderLayout.SOUTH);
		TresEnRaya tablero = new TresEnRaya();
		ventana.add(tablero, BorderLayout.CENTER);
		ventana.setBounds(200, 200, 450, 450);
		ventana.setVisible(true);

	}

	public void inicio() {
		for (int i = 0; i < botones.length; i++) {
			for (int j = 0; j < botones[i].length; j++) {
				botones[i][j].setBackground(Color.WHITE);
				arriba.setText("Truno azul");
				abajo.setText("Resultado:");
			}
		}
		cont = 0;
	}

	public boolean gana(Color c) {
		boolean sw = false;
		for (int i = 0; i == 2; i++) {
			if (botones[i][0].getBackground() == c && botones[i][0].getBackground() == botones[i][1].getBackground()
					&& botones[i][0].getBackground() == botones[i][2].getBackground()) {
				sw = true;
			}
		}
		for (int i = 0; i == 2; i++) {
			if (botones[0][i].getBackground() == c && botones[0][i].getBackground() == botones[1][i].getBackground()
					&& botones[0][i].getBackground() == botones[2][i].getBackground()) {
				sw = true;
			}
		}

		for (int i = 0; i == 2; i++) {
			for (int j = 0; j == 2; j++) {
				if (botones[i][j].getBackground() == c && (i + j == 2 || i == j)) {
					sw = true;
				}
			}

		}
		return sw;

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		boolean sw = false;
		if (cont != 9) {
			for (int i = 0; i < botones.length; i++) {
				for (int j = 0; j < botones[i].length; j++) {
					if (ae.getSource() == botones[i][j]) {
						if (botones[i][j].getBackground() == Color.WHITE) {
							if (cont % 2 == 0) {
								botones[i][j].setBackground(Color.BLUE);
								arriba.setText("Truno rojo");

								sw = gana(Color.BLUE);
								if (sw == true) {
									abajo.setText("Resultado : Gana Azul");
									//inicio();
								}
							} else {
								botones[i][j].setBackground(Color.RED);
								arriba.setText("Truno azul");

								sw = gana(Color.RED);
								if (sw == true) {
									abajo.setText("Resultado : Gana Rojo");
									//inicio();
								}
							}
							cont++;
						}
					}
				}
			}
		} else {
			if (sw == false) {
				abajo.setText("Resultado: empate");
			}
			if (cont == 8) {

				cont++;
			}
			//inicio();
		}
	}
}
