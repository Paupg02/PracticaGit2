package ejemplosTeoria;

import java.awt.event.ActionEvent;
//para dar funcionalidad al botón
import java.awt.event.ActionListener;
//para dar funcionalidad al botón
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Inicial17 extends JFrame implements ActionListener {
	private JButton boton1, boton2;

//nombre de los botones
	public Inicial17() {
//cambiamoseladministrador,vamosaanularlo
		setLayout(null);
//Instanciamoslosbotones
		boton1 = new JButton("BOTÓN 1");
		boton2 = new JButton("BOTÓN 2");
//Colocamoslosbotonesdondedeseeemospuesnotenemosadministrador
		boton1.setBounds(125, 100, 100, 50);
		boton2.setBounds(275, 100, 100, 50);
//añadimoslosbotones
		add(boton1);
		add(boton2);
//FUNCIONALIDAD
		boton1.addActionListener(this);
		boton2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//Quéhacemossisepresionael boton1
		if (e.getSource() == boton1)
			setTitle("HA SELECCIONADO EL BOTÓN 1");
//Quéhacemossisepresionael boton2
		if (e.getSource() == boton2)
			setTitle("HA SELECCIONADO EL BOTÓN 2");
	}

	public static void main(String[] args) {
//generamoslaventanaylecambiamoseltítulo
		Inicial17 ventana = new Inicial17();
		ventana.setTitle("Ejemplo Botones");
		ventana.setBounds(600, 300, 500, 300);
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
