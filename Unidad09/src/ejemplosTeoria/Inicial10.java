package ejemplosTeoria;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Inicial10 {
	public static void main(String[] args) {
		VentanaBox ventana = new VentanaBox();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class VentanaBox extends JFrame {
	private static final long serialVersionUID = 1L;

	public VentanaBox() {
		setVisible(true);
		setBounds(600, 300, 500, 400);
		setTitle("EJEMPLO BOXLAYOUT");
		PanelBox panel = new PanelBox();
		add(panel);
	}
}

class PanelBox extends JPanel {
	private static final long serialVersionUID = 1L;

	public PanelBox() {
//this.setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(new JButton("1 "));
		add(new JButton(" 2 "));
		add(new JButton(" 3 "));
		add(new JButton(" 4 "));
		add(new JButton(" 5 "));
	}
}
