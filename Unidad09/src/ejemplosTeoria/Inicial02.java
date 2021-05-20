package ejemplosTeoria;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Inicial02 {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		MiVentana ventana = new MiVentana();
		//ventana.setVisible(true);
		//ventana.setSize(750,500);
		//ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//ventana.setLocation(500, 300);
		//ventana.setBounds(500, 300, 750, 500);
		//ventana.setResizable(false);
		//ventana.setExtendedState(Frame.NORMAL);//ventana.setExtendedState(0);
		//ventana.setTitle("MI 1ª VENTANA");
	}
}

class MiVentana extends JFrame {
	private static final long serialVersionUID = 1L;

	public MiVentana() {
		//visibilidad
		setVisible(true);
		//tamaño
		//setSize(750,500);
		//quehacer
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//localización
		//setLocation(500,300);
		//localizaciónytamaño
		setBounds(500, 300, 750, 500);
		//redimensionado
		setResizable(false);
		//modoinicialdeapertura
		//setExtendedState(JFrame.NORMAL);
		//setExtendedState(JFrame.ICONIFIED);
		//setExtendedState(JFrame.MAXIMIZED_BOTH);
		//Ponemostituloalaventana
		setTitle("MI 2ª VENTANA");
		//Cambiamoselicono
		//getImagedelaclasetoolkit*/
		ImageIcon icon = new ImageIcon("C:\\java19_20\\TEMA09\\Imagenes\\casita.png");
		setIconImage(icon.getImage());
	}
}
