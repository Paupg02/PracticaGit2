package ejemplosTeoria;

import java.awt.*;
//Color, FlowLayout
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

//JButton,JFrame
@SuppressWarnings("serial")
public class Inicial18 extends JFrame implements ActionListener {
	private JButton bt1, bt2, bt3;

	public Inicial18() {
		setTitle("Semaforo");
//UsamosflowLayoutcomoadministradordecomponentes
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
//funcionalidadboton1
		if (e.getSource() == bt1)
			this.getContentPane().setBackground(Color.RED);
//funcionalidadboton2
		if (e.getSource() == bt2)
			this.getContentPane().setBackground(Color.YELLOW);
//funcionalidadboton3
		if (e.getSource() == bt3)
			this.getContentPane().setBackground(Color.GREEN);
	}

	public static void main(String[] args) {
//generamoslaventana
		Inicial18 ventana = new Inicial18();
		ventana.setBounds(700, 500, 500, 300);
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
