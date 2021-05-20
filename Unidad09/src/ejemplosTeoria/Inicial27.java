package ejemplosTeoria;

import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

//Ejemploventanasdecaptura
@SuppressWarnings("serial")
public class Inicial27 extends JFrame {
	JTextField tf, tf1;
	JLabel et, et1;

	public Inicial27() {
//anulamosel layout
		setLayout(null);
//titulodelaventana
		setTitle("EJEMPLO TEXTFIELD");
//CREAMOS LASETIQUETA
		et = new JLabel("NOMBRE");
		et1 = new JLabel("APELLIDOS");
//CREAMOS LOS CAMPOS DE TEXTO
		tf = new JTextField("NOMBRE");
// LO QUE APARECERÁ DENTRO DE LA VENTANA DE CAPTURA, noseindicaeltamaño
		tf1 = new JTextField("APELLIDOS");
		Font font = new Font("Arial", Font.BOLD, 14);
//COLOCAMOS LAS COMPONENTES
		et.setBounds(50, 50, 175, 25);
		et.setFont(font);
		tf.setBounds(200, 50, 275, 25);
		tf.setFont(font);
		et1.setBounds(50, 150, 200, 25);
		et1.setFont(font);
		tf1.setBounds(200, 150, 275, 25);
		tf1.setFont(font);
//AÑADIMOS
		add(et);
		add(tf);
		add(et1);
		add(tf1);
	}

	public static void main(String[] args) {
		Inicial27 ventana = new Inicial27();
		ventana.setBounds(200, 200, 500, 300);
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
