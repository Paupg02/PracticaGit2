package ejemplosTeoria;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Inicial06 {
//FlowLayout
	public static void main(String[] args) {
		NuevaVentana ventana = new NuevaVentana();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class NuevaVentana extends JFrame {
	private static final long serialVersionUID = 1L;

	public NuevaVentana() {
		setVisible(true);
		setSize(500, 400);
		setLocation(400, 400);
		setTitle("Ejemplo FlowLayout");
		NuevoPanel p = new NuevoPanel();
		add(p);
	}
}

class NuevoPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	public NuevoPanel() {
		setLayout(new FlowLayout(FlowLayout.CENTER, 100, 50));
		FlowLayout f = new FlowLayout();
		f.setHgap(5);
		f.setVgap(5);
		setLayout(f);
		add(new JButton("UNO"));
		add(new JButton("DOS"));
		add(new JButton("TRES"));
		add(new JButton("CUATRO"));
	}
}
