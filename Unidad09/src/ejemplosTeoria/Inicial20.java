package ejemplosTeoria;

import java.awt.*;
//Color, FlowLayout
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

//JButton,JFrame
@SuppressWarnings("serial")
public class Inicial20 extends JFrame implements ActionListener {
	private JButton bt1, bt2, bt3;

	public Inicial20() {
		setTitle("SEMAFORO");
//Anulamoseladministrador
		setLayout(new FlowLayout());
//Instanciamoslosbotones
		bt1 = new JButton("Rojo");
		bt2 = new JButton("Amarillo");
		bt3 = new JButton("Verde");
//Loscolocamos
		add(bt1);
		add(bt2);
		add(bt3);
//Funcionalidad
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String titulo = "";
//funcionalidadboton1
		if (e.getSource() == bt1) {
			titulo = "PULSADO COLOR ROJO";
			bt1.setBackground(Color.RED);
		}
//funcionalidadboton2
		if (e.getSource() == bt2) {
			bt2.setBackground(Color.YELLOW);
			titulo = "PULSADO COLOR AMARILLO";
		}
//funcionalidadboton3
		if (e.getSource() == bt3) {
			titulo = "PULSADO COLOR VERDE";
			bt3.setBackground(Color.GREEN);
		}
		setTitle(titulo);
	}

	public static void main(String[] args) {
//generamoslaventanaylecambiamoseltítulo
		Inicial20 ventana = new Inicial20();
		ventana.setBounds(700, 500, 500, 300);
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
