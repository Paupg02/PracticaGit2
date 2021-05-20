package ejemplos;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class Ejemplo01_Ventana extends JFrame{
	
	public Ejemplo01_Ventana() {
		setBounds(0, 0, 250, 150);
		//setLocation(0, 0);
		//setSize(250, 150);
		setTitle("Paula Plaza Guirado");
		//setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setExtendedState(MAXIMIZED_BOTH);
		//Por alguna razón no fufa
	//	Color color=new Color(139, 0, 255);
		getContentPane().setBackground(Color.BLUE);
		ImageIcon icon =new ImageIcon("G:\\Programacion\\Java\\Java\\Unidad09\\Imagenes\\cerezo.png");
		setIconImage(icon.getImage());
		Ejemplo01_Panel p=new Ejemplo01_Panel();
		add(p);
	}
}
