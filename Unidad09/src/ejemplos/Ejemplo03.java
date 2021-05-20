package ejemplos;

import java.awt.FlowLayout;

import javax.swing.*;

@SuppressWarnings("serial")
public class Ejemplo03 extends JFrame {

	public static void main(String[] args) {
		Box cajaI = Box.createVerticalBox();
		Box cajaD = Box.createVerticalBox();

		// Caja Izquierda
		JLabel e1 = new JLabel("Etiqieta 1 ");
		JLabel e2 = new JLabel("Etiqieta 2 ");
		JLabel e3 = new JLabel("Etiqieta 3 ");

		JButton b1 = new JButton("Boton 1");
		JButton b2 = new JButton("Boton 2");
		JButton b3 = new JButton("Boton 3");

		// Cajas horizontales

		Box caja1 = Box.createHorizontalBox();
		caja1.add(e1);
		caja1.add(b1);

		Box caja2 = Box.createHorizontalBox();
		caja2.add(e2);
		caja2.add(b2);

		Box caja3 = Box.createHorizontalBox();
		caja3.add(e3);
		caja3.add(b3);

		cajaI.add(caja1);
		cajaI.add(caja2);
		cajaI.add(caja3);

		// Caja Derecha
		JLabel e4 = new JLabel("Etiqieta 4 ");
		JLabel e5 = new JLabel("Etiqieta 5 ");
		JLabel e6 = new JLabel("Etiqieta 6 ");

		JButton b4 = new JButton("Boton 4");
		JButton b5 = new JButton("Boton 5");
		JButton b6 = new JButton("Boton 6");

		// Cajas horizontales

		Box caja4 = Box.createHorizontalBox();
		caja4.add(e4);
		caja4.add(b4);

		Box caja5 = Box.createHorizontalBox();
		caja5.add(e5);
		caja5.add(b5);

		Box caja6 = Box.createHorizontalBox();
		caja6.add(e6);
		caja6.add(b6);

		cajaD.add(caja4);
		cajaD.add(caja5);
		cajaD.add(caja6);

		// Ventana
		JFrame ventana = new JFrame();
		ventana.setLayout(new FlowLayout(1, 5, 5));
		ventana.add(cajaI);
		ventana.add(cajaD);

		ventana.setTitle("Ejemplo Box");
		ventana.setBounds(200, 200, 500, 300);
		ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);

		ImageIcon icon = new ImageIcon("G:\\Programacion\\Java\\Java\\Unidad09\\Imagenes\\cerezo.png");
		ventana.setIconImage(icon.getImage());

		ventana.setVisible(true);

	}

}