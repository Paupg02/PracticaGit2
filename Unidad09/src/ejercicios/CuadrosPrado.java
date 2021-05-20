package ejercicios;
/*
 * 9 y 10 de la practica 02*/

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToolBar;

@SuppressWarnings("serial")
public class CuadrosPrado extends JFrame implements ActionListener{
	public JToolBar tb;
	public JButton meninas, fusilamiento, otro;
	public JLabel cuadros;
	
	public CuadrosPrado() {
		tb =new JToolBar();
		
		//meninas =new JButton("Meninas");
		meninas =new JButton(new ImageIcon("E:\\Programacion\\Java\\Java\\Unidad09\\Imagenes\\meninas_Fondo.jpg"));
		tb.add(meninas);
		//fusilamiento =new JButton("Fusilamiento");
		fusilamiento =new JButton(new ImageIcon("E:\\Programacion\\Java\\Java\\Unidad09\\Imagenes\\fusilamientos fondo.jpg"));
		tb.add(fusilamiento);
		//otro = new JButton("Otro");
		otro = new JButton(new ImageIcon("E:\\Programacion\\Java\\Java\\Unidad09\\Imagenes\\stigia_1.jpg"));
		tb.add(otro);
		
		tb.setFloatable(false);
		meninas.addActionListener(this);
		fusilamiento.addActionListener(this);
		otro.addActionListener(this);
		
		cuadros =new JLabel();
		
		add(tb, BorderLayout.NORTH);
		add(cuadros, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		CuadrosPrado v= new CuadrosPrado();
		v.setBounds(200,200,360,350);
		v.setResizable(false);
		v.setDefaultCloseOperation(EXIT_ON_CLOSE);
		v.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==meninas) {
			ImageIcon icon =new ImageIcon("E:\\Programacion\\Java\\Java\\Unidad09\\Imagenes\\meninas.jpg");
			cuadros.setIcon(icon);
		}
		if(ae.getSource()==fusilamiento) {
			ImageIcon icon =new ImageIcon("E:\\Programacion\\Java\\Java\\Unidad09\\Imagenes\\Fusilamiento.jpg");
			cuadros.setIcon(icon);
		}
		if(ae.getSource()==otro) {
			ImageIcon icon =new ImageIcon("E:\\Programacion\\Java\\Java\\Unidad09\\Imagenes\\otro.jpg");
			cuadros.setIcon(icon);
		}
	}

}
