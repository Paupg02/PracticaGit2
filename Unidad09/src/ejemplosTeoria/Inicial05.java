package ejemplosTeoria;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Inicial05 {
//FlowLayout
	public static void main(String[] args) {
		VentanaFlow ventana = new VentanaFlow();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class VentanaFlow extends JFrame {
	private static final long serialVersionUID = 1L;

	public VentanaFlow() {
		setVisible(true);
		setSize(800, 400);
		setLocation(400, 400);
		setTitle("Ejemplo FlowLayout");
		PanelFlow p = new PanelFlow();
		add(p);
	}
}

class PanelFlow extends JPanel {
	private static final long serialVersionUID = 1L;

	public PanelFlow() {
		setLayout(new FlowLayout(FlowLayout.CENTER, 100, 50));
//centradoconseparacionhorizontal y vertical
//setLayout(new FlowLayout(FlowLayout.LEFT));
//izquierda
//setLayout(new FlowLayout(FlowLayout.RIGHT));
//Derecha
//setLayout(new FlowLayout(FlowLayout.LEADING));
//izquierda
//setLayout(new FlowLayout(FlowLayout.TRAILING));
//derecha
		add(new JButton("UNO"));
		add(new JButton("DOS"));
		add(new JButton("TRES"));
		add(new JButton("CUATRO"));
	}
}
