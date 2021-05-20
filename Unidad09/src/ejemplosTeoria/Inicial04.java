package ejemplosTeoria;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;

public class Inicial04 {
	public static void main(String[] args) {
		VentanaBorder ventana = new VentanaBorder();
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class VentanaBorder extends JFrame {
	private static final long serialVersionUID = 1L;

	public VentanaBorder() {
		setVisible(true);
		setSize(500, 400);
		setLocation(400, 400);
		setTitle("Ejemplo BorderLayout");
		PanelBorder p = new PanelBorder();
		add(p);
	}
}

//creaunpanelquecolocarásobrelaventana
class PanelBorder extends JPanel {
	private static final long serialVersionUID = 1L;

	public PanelBorder() {
		BorderLayout bl = new BorderLayout();
		setLayout(bl);
//setLayout(new BorderLayout()); 
//podriasustiruiralasdosanterioressinseparacionentrelosbordes
//setLayout(new BorderLayout(100,20));
//creaelbordelayoutconseparacionvertical y horizontal
		add(new JButton("Norte"), BorderLayout.NORTH);
		add(new JButton("Sur"), BorderLayout.SOUTH);
		add(new JButton("Centro"), BorderLayout.CENTER);
		add(new JButton("Oeste"), BorderLayout.WEST);
		add(new JButton("Este"), BorderLayout.EAST);
//System.out.println("separacionhorizontal"+getHeight());
//System.out.println("Separaciónvertical"+getWidth());
//cambiamoslaseparaciónhorizontal y verticaldeloselementosdellayout,losmétodostrabajansobreunobjetoBorderLayout
//bl.setHgap(0);
//bl.setVgap(0);
	}
}
