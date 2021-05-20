package ejemplos;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Ejemplo02 extends JFrame {
	public static void main(String[] args) {
		
			JFrame ventana=new JFrame("Mezclado Layout");
			BorderLayout bl=new BorderLayout();
			ventana.setLayout(bl);
			
			JLabel centro=new JLabel("Bolque Central");
			JLabel sur =new JLabel("Sur");
			Ejemplo02_Panel norte=new Ejemplo02_Panel();
			ventana.add(norte, BorderLayout.NORTH);
			ventana.add(centro, BorderLayout.CENTER);
			ventana.add(sur, BorderLayout.SOUTH);
			
			ventana.setBounds(200, 200, 500, 300);
			ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			ImageIcon icon =new ImageIcon("G:\\Programacion\\Java\\Java\\Unidad09\\Imagenes\\cerezo.png");
			ventana.setIconImage(icon.getImage());
			
			ventana.setVisible(true);
	}
	
}
