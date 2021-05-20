package ejercicios;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")

public class Ejer04 extends JFrame implements ActionListener {

	private JButton rojo1, verde1, amarillo1, res1, rojo2, verde2, amarilo2, res2, res3;

	public Ejer04() {

		setLayout(null);

		rojo1 = new JButton("Rojo");
		amarillo1 = new JButton("Amarillo");
		verde1 = new JButton("Verde");
		res1 = new JButton("Restaurar fondo");
		rojo2 = new JButton("Rojo");
		amarilo2 = new JButton("Amarillo");
		verde2 = new JButton("Verde");
		res2 = new JButton("Restaurar botones");
		res3 = new JButton("Restaurar todo");

		rojo1.setBounds(25, 50, 100, 20);
		amarillo1.setBounds(150, 50, 100, 20);
		verde1.setBounds(270, 50, 100, 20);
		res1.setBounds(150, 100, 100, 20);
		rojo2.setBounds(25, 150, 100, 20);
		amarilo2.setBounds(150, 150, 100, 20);
		verde2.setBounds(270, 150, 100, 20);
		res2.setBounds(150, 200, 100, 20);
		res3.setBounds(150, 250, 100, 20);

		add(rojo1);
		add(amarillo1);
		add(verde1);
		add(res1);
		add(rojo2);
		add(amarilo2);
		add(verde2);
		add(res2);
		add(res3);

		rojo1.addActionListener(this);
		amarillo1.addActionListener(this);
		verde1.addActionListener(this);
		res1.addActionListener(this);
		rojo2.addActionListener(this);
		amarilo2.addActionListener(this);
		verde2.addActionListener(this);
		res2.addActionListener(this);
		res3.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String titulo = "";
		Color inicial;
		inicial=res3.getBackground();

		if (e.getSource() == rojo1) {
			titulo = "Rojo";
			getContentPane().setBackground(Color.red);
		}

		if (e.getSource() == amarillo1) {
			titulo = "Amarillo";
			getContentPane().setBackground(Color.yellow);
		}

		if (e.getSource() == verde1) {
			titulo = "Verde";
			getContentPane().setBackground(Color.green);
		}

		if (e.getSource() == res1) {
			titulo = "Semaforo";
			getContentPane().setBackground(null);
		}

		if (e.getSource() == rojo2) {
			titulo = "Rojo";
			rojo2.setBackground(Color.red);
		}

		if (e.getSource() == amarilo2) {
			titulo = "Amarillo";
			amarilo2.setBackground(Color.yellow);
		}

		if (e.getSource() == verde2) {
			titulo = "Verde";
			verde2.setBackground(Color.green);
		}

		if (e.getSource() == res2) {
			titulo = "Semaforo";
			rojo2.setBackground(inicial);
			amarilo2.setBackground(inicial);
			verde2.setBackground(inicial);
		}

		if (e.getSource() == res3) {
			titulo = "Semaforo";
			getContentPane().setBackground(null);
			rojo2.setBackground(inicial);
			amarilo2.setBackground(inicial);
			verde2.setBackground(inicial);
		}
		setTitle(titulo);
	}

	public static void main(String[] args) {
		Ejer04 ventana = new Ejer04();
		ventana.setBounds(200, 200, 500, 500);
		ventana.setVisible(true);

	}

}
