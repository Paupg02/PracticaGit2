package ejercicios;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Ejer03 extends JFrame {

	public static void main(String[] args) {
		//Creo la ventana
		JFrame ventana = new JFrame("Larbolico");
		
		//Le pongo un tamaño y un lugar
		ventana.setBounds(200, 200, 400, 300);
		
		//No dejo cambiar el tamaño
		ventana.setResizable(false);
		
		
		//Creo dos etiquetas
		JLabel l1=new JLabel("UN ARBOLICO",0);
		JLabel l2=new JLabel("RESHULÓN",0);
		
		//Cambio la fuente de las etiquetas
		l1.setFont(new Font("Arial",0, 25));
		l1.setForeground(Color.WHITE);
		l2.setFont(new Font("Arial",0, 25));
		l2.setForeground(Color.WHITE);
		
		//Creo la imagen
		ImageIcon icon =new ImageIcon("E:\\Programacion\\Java\\Java\\Unidad09\\Imagenes\\cerezo.png");
		JLabel imagen=new JLabel(icon);
		
		//Añado las cosas a la ventana
		ventana.add(l1,BorderLayout.NORTH);
		ventana.add(imagen, BorderLayout.CENTER);
		ventana.add(l2,BorderLayout.SOUTH);
		
		
		//Cambio el fondo
		ventana.getContentPane().setBackground(Color.GREEN);
		
		//Configuro el cierre y hago la ventana visible
		ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ventana.setVisible(true);

	}
}
