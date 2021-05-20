package ejemplosTeoria;

import java.awt.event.ActionEvent;
//para dar funcionalidad al bot�n
import java.awt.event.ActionListener;
//para dar funcionalidad al bot�n
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
		boton1 = new JButton("BOT�N 1");
		boton2 = new JButton("BOT�N 2");
//Colocamoslosbotonesdondedeseeemospuesnotenemosadministrador
		boton1.setBounds(125, 100, 100, 50);
		boton2.setBounds(275, 100, 100, 50);
//a�adimoslosbotones
		add(boton1);
		add(boton2);
//FUNCIONALIDAD
		boton1.addActionListener(this);
		boton2.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//Qu�hacemossisepresionael boton1
		if (e.getSource() == boton1)
			setTitle("HA SELECCIONADO EL BOT�N 1");
//Qu�hacemossisepresionael boton2
		if (e.getSource() == boton2)
			setTitle("HA SELECCIONADO EL BOT�N 2");
	}

	public static void main(String[] args) {
//generamoslaventanaylecambiamoselt�tulo
		Inicial17 ventana = new Inicial17();
		ventana.setTitle("Ejemplo Botones");
		ventana.setBounds(600, 300, 500, 300);
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
