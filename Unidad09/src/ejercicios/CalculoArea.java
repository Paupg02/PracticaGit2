package ejercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class CalculoArea extends JFrame implements ActionListener {
	public JLabel l1, l2, l3;
	public JTextField t1, t2, t3, t4;
	public JButton btn1, btn2, btn3;

	public CalculoArea() {
		setLayout(null);
		l1 = new JLabel("BASE");
		l1.setBounds(10, 10, 130, 20);
		l2 = new JLabel("ALTURA");
		l2.setBounds(10, 40, 130, 20);
		btn1 = new JButton("AREA");
		btn2 = new JButton("PERIMETRO");
		btn2.setBounds(10, 130, 130, 20);
		btn1.setMnemonic(KeyEvent.VK_A);
		btn1.setBounds(10, 100, 130, 20);
		btn2 = new JButton("PERIMETRO");
		btn2.setMnemonic(KeyEvent.VK_A);
		btn2.setBounds(10, 130, 130, 20);
		t1 = new JTextField();
		t1.setBounds(150, 10, 270, 20);
		t2 = new JTextField();
		t2.setBounds(150, 40, 270, 20);
		t3 = new JTextField();
		t3.setBounds(150, 100, 270, 20);
		t4 = new JTextField();
		t4.setBounds(150, 130, 270, 20);
		l3 = new JLabel();
		l3.setBounds(10, 130, 410, 20);
		btn3 = new JButton("LIMPIAR");
		btn3.setMnemonic(KeyEvent.VK_A);
		btn3.setBounds(10, 210, 410, 20);

		add(l1);
		add(l2);
		add(l3);
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		add(btn1);
		add(btn2);
		add(btn3);

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
	}

	public static void main(String[] args) {
		CalculoArea v = new CalculoArea();
		v.setBounds(200, 200, 470, 300);
		v.setTitle("AREA Y PERIMETRO");
		v.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		try {
			if (ae.getSource() == btn1) {
				double area = Double.parseDouble(t1.getText()) * Double.parseDouble(t2.getText());
				t3.setText("" + area);
			}
			if (ae.getSource() == btn2) {
				double peri = 2 * (Double.parseDouble(t1.getText()) + Double.parseDouble(t2.getText()) + Math.sqrt(
						Math.pow(Double.parseDouble(t1.getText()), 2) + Math.pow(Double.parseDouble(t2.getText()), 2)));
				t4.setText("" + peri);
			}
			if (ae.getSource() == btn3) {
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
			}
		} catch (NumberFormatException nfe) {
			t3.setText("ERR");
			t4.setText("ERR");
		}

	}

}
