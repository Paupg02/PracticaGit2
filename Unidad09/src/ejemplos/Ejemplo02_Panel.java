package ejemplos;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Ejemplo02_Panel extends JPanel {
	public Ejemplo02_Panel() {
		setLayout(new FlowLayout(1, 3, 3));
		add(new JButton("Boton1"));
		add(new JButton("Boton2"));
		add(new JButton("Boton3"));
		add(new JButton("Boton4"));
		add(new JButton("Boton5"));
	}

}
