package ejemplos;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Ejemplo01_Panel extends JPanel {
	public Ejemplo01_Panel() {
		/*
		//0 Centrado
		BorderLayout bL=new BorderLayout();
		setLayout(bL);
		add(new JLabel("Norte", 0),BorderLayout.NORTH);
		add(new JLabel("Sur", 0),BorderLayout.SOUTH);
		add(new JLabel("Este", 0),BorderLayout.EAST);
		add(new JLabel("Oeste", 0),BorderLayout.WEST);
		add(new JLabel("Centro", 0),BorderLayout.CENTER);
		*/
		
		///*
		//0Izquierda 1Centrado 2Derecha
		FlowLayout fL=new FlowLayout(/*1, 3, 3*/);
		//fL.setAlignment(1);
		//fL.setHgap(3);
		//fL.setVgap(3);
		setLayout(fL);
		add(new JButton("Boton1"));
		add(new JButton("Boton2"));
		add(new JButton("Boton3"));
		add(new JButton("Boton4"));
		add(new JButton("Boton5"));
		//*/

	}

}
