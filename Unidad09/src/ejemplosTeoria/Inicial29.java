package ejemplosTeoria;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

//VenTanaPaasword
@SuppressWarnings("serial")
public class Inicial29 extends JFrame implements ActionListener {
	private JLabel et1, et2, et3;
	private JTextField usuario;
	private JPasswordField clave;
	private JButton boton1;

	public Inicial29() {
		setLayout(null);
		et1 = new JLabel("USUARIO");
		et1.setBounds(10, 10, 100, 30);
		add(et1);
		et2 = new JLabel("PASSWORD");
		et2.setBounds(10, 50, 100, 30);
		add(et2);
		usuario = new JTextField();
		usuario.setBounds(130, 10, 100, 30);
		add(usuario);
		clave = new JPasswordField();
		clave.setBounds(130, 50, 100, 30);
// clave.setEchoChar('#');
		add(clave);
		boton1 = new JButton("ENVIAR");
		boton1.setBounds(10, 100, 100, 30);
		add(boton1);
		boton1.addActionListener(this);
		et3 = new JLabel();
		et3.setBounds(10, 150, 200, 30);
		add(et3);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		boolean sw = false;
		String usuarios = "usuario1";
		String claves = "clave1";
		if (e.getSource() == boton1) {
			if (usuarios.equals(usuario.getText()))
				if (claves.equals(String.valueOf(clave.getPassword())))
					sw = true;
		}
		if (sw == true) {
			et3.setText("Adelante Password Aceptada");
			sw = false;
		} else
			et3.setText("Error Pasword y/o usuario");
	}

	public static void main(String[] args) {
		Inicial29 marco = new Inicial29();
		marco.setTitle("Password de usuario I");
		marco.setBounds(700, 500, 500, 300);
		marco.setVisible(true);
	}
}
