package ejemplosTeoria;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Inicial28 extends JFrame implements ActionListener {
	JTextField tf, tf1;
	JLabel et, et1;
	JButton bt1, bt2;
	JTextField tfMayusculas, tfMinusculas;

	public Inicial28() {
//anulamosel layout
		setLayout(null);
//titulodelaventana
		setTitle("EJEMPLO TEXTFIELD Y BOTONES");
//CREAMOS LAS ETIQUETA
		et = new JLabel("NOMBRE");
		et1 = new JLabel("APELLIDOS");
//CREAMOS LOS CAMPOS DE TEXTO
		tf = new JTextField("introduce nombre");
		tf1 = new JTextField("introduce apellidos");
		tfMayusculas = new JTextField();
		tfMinusculas = new JTextField();
//CREAMOS LOS BOTONES
		bt1 = new JButton("A MAYÚSCULAS");
		bt2 = new JButton("A MINÚSCULAS");
//Font font = new Font("Arial", Font.BOLD, 14);
//COLOCAMOS LAS COMPONENTES
		et.setBounds(50, 10, 100, 20);
//et.setFont(font);
		tf.setBounds(150, 10, 175, 20);
//tf.setFont(font);
		et1.setBounds(50, 70, 100, 20);
//et1.setFont(font);
		tf1.setBounds(150, 70, 175, 20);
//tf1.setFont(font);
		bt1.setBounds(50, 150, 150, 20);
//bt1.setFont(font);
		tfMayusculas.setBounds(210, 150, 300, 20);
//tfMayusculas.setFont(font);
		bt2.setBounds(50, 200, 150, 20);
//bt2.setFont(font);
		tfMinusculas.setBounds(210, 200, 300, 20);
//tfMinusculas.setFont(font);
//AÑADIMOS
		add(et);
		add(tf);
		add(et1);
		add(tf1);
		add(bt1);
		add(tfMayusculas);
		add(bt2);
		add(tfMinusculas);
//añadimosfuncionalidadalosbotones
		bt1.addActionListener(this);
		bt2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cadenaSalida = "";
		if (e.getSource() == bt1) {
//Mayúsculas
			cadenaSalida = tf1.getText() + ", " + tf.getText();
//Loescribimosensutextfieldconvertidoamayúsculas
			tfMayusculas.setText(cadenaSalida.toUpperCase());
		} else if (e.getSource() == bt2) {
//Mínuscculas
			cadenaSalida = tf1.getText() + ", " + tf.getText();
//Loescribimosensutextfieldconvertidoamayúsculas
			tfMinusculas.setText(cadenaSalida.toLowerCase());
		}
	}

	public static void main(String[] args) {
		Inicial28 ventana = new Inicial28();
		ventana.setBounds(200, 200, 700, 300);
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
