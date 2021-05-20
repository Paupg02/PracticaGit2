package ejemplosTeoria;

import java.awt.*;
import javax.swing.*;

public class Inicial11 {
	public static void main(String[] args) {
		VentanaBoxBox ventana = new VentanaBoxBox();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class VentanaBoxBox extends JFrame {
	private static final long serialVersionUID = 1L;

	public VentanaBoxBox() {
		setVisible(true);
		setBounds(600, 400, 500, 400);
		setTitle("EJEMPLO BOXLAYOUT_BOX");
		JButton azul = new JButton("Azul");
		JButton amarillo = new JButton("Amarillo");
		JButton rojo = new JButton("Rojo");
		JButton blanco = new JButton("Blanco");
		JButton negro = new JButton("Negro");
		JButton verde = new JButton("Verde");
//M�todoFactoriaquecreaunacajahorizontal
		Box cajaH = Box.createHorizontalBox();
//a�adimoslosbotonesalacaja
		cajaH.add(azul);
		cajaH.add(Box.createHorizontalStrut(25));
//separaci�nhorizontal 25pixeles
		cajaH.add(amarillo);
		cajaH.add(Box.createRigidArea(new Dimension(100, 30)));
//zonar�gida,separaci�n
// horizontal y verticalqueafectaatodosloscomponentes
		cajaH.add(rojo);
		add(cajaH, BorderLayout.NORTH);
//zonanortedelborder layout
//M�todoFactoriaquecreaunacajaVertical
		Box cajaV = Box.createVerticalBox();
//a�adimoslosbotonesalacaja
		cajaV.add(blanco);
		cajaV.add(Box.createVerticalStrut(5));
//separaci�nhorizontal 25pixeles
		cajaV.add(negro);
		cajaV.add(Box.createRigidArea(new Dimension(10, 10)));
//zonar�gida,separaci�n
// horizontal y verticalqueafectaatodosloscomponentes
		cajaV.add(verde);
		add(cajaV, BorderLayout.EAST);
//zonaestedelBorderLayout
	}
}
