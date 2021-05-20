package ejemplosTeoria;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class Inicial31 extends JFrame implements ActionListener {
	private JTextArea jt, jt1;
	private JLabel et;
	private JButton bt;

	public Inicial31() {
		setLayout(null);
		Font fuente = new Font("Arial", Font.BOLD, 25);
		jt = new JTextArea();
		jt1 = new JTextArea();
		et = new JLabel("AREA DE TEXTO");
		bt = new JButton("COPIAR");
		et.setBounds(10, 10, 300, 30);
		jt.setBounds(10, 50, 300, 200);
		bt.setBounds(350, 10, 300, 30);
		jt1.setBounds(350, 50, 300, 200);
		et.setFont(fuente);
		jt.setFont(fuente);
		bt.setFont(fuente);
		jt1.setFont(fuente);
		add(et);
		add(jt);
		add(bt);
		add(jt1);
		bt.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String texto = "";
		if (e.getSource() == bt) {
			texto += jt.getText();
			jt1.setText(texto);
		}
	}

	public static void main(String[] args) {
		Inicial31 ventana = new Inicial31();
		ventana.setBounds(200, 200, 700, 300);
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
