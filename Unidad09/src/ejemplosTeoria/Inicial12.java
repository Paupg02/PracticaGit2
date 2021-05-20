package ejemplosTeoria;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Inicial12 extends JFrame {
	static int ANCHO = 300;
	static int ALTO = 300;

	public Inicial12() {
		super("Mi marco_Ejemplo12");
		JButton b1 = new JButton("Boton 1");
		JButton b2 = new JButton("Boton 2");
		JButton b3 = new JButton("Boton 3");
		JButton b4 = new JButton("Boton 4");
		JButton b5 = new JButton("Boton 5");
		JButton b6 = new JButton("Boton 6");
		Box cajaH = Box.createHorizontalBox();
//métodofactoríacreacajahorizontal
		cajaH.add(b1);
//separaciónhorizontalde10pixeles
		cajaH.add(Box.createHorizontalStrut(10));
		cajaH.add(b2);
//zonarígida,separaciónhorizontal
		cajaH.add(Box.createRigidArea(new Dimension(5, 5)));
		cajaH.add(b3);
//Añadealazonanortedelborder Layout
		add(cajaH, BorderLayout.NORTH);
		Box cajaV = Box.createVerticalBox();
//métodofactoriacreacajavertical
		cajaV.add(Box.createHorizontalStrut(50));
		cajaV.add(b4);
//separaciónhorizontal 10pixeles
		cajaV.add(Box.createVerticalStrut(10));
		cajaV.add(b5);
		cajaV.add(Box.createRigidArea(new Dimension(5, 5)));
		cajaV.add(b6);
		add(cajaV, BorderLayout.CENTER);
		setSize(ANCHO, ALTO);
		setVisible(true);
	}

	public static void main(String args[]) {
		Inicial12 miMarco = new Inicial12();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
