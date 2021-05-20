package ejemplosTeoria;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

//Primerejemploareadetexto
@SuppressWarnings("serial")
public class Inicial30 extends JFrame {
	private JTextArea jt;
	private JLabel et;

	public Inicial30() {
		setLayout(null);
		Font fuente = new Font("Arial", Font.BOLD, 20);
		jt = new JTextArea();
		et = new JLabel("AREA DE TEXTO");
		et.setBounds(10, 10, 300, 30);
		jt.setBounds(10, 50, 300, 200);
		et.setFont(fuente);
		jt.setFont(fuente);
		jt.setLineWrap(true);//saltodelíneaautomático
		jt.setWrapStyleWord(true);// norompelapalabraensaltodelínea
		// noseactivanbarrasdescroll
		add(et);
		add(jt);
	}

	public static void main(String[] args) {
		Inicial30 ventana = new Inicial30();
		ventana.setBounds(200, 200, 500, 300);
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}