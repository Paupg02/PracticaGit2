package ejemplosTeoria;

import java.awt.event.KeyEvent;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

@SuppressWarnings("serial")
public class Inicial25Verificacion extends JFrame implements ChangeListener {
	JCheckBox cv1, cv2, cv3, cv4;

	public Inicial25Verificacion() {
		setLayout(null);
		setTitle("MEDIOS DE TRANASPORTE");
//Instanciamos
		cv1 = new JCheckBox("AVIÓN");
		cv1.setMnemonic(KeyEvent.VK_A);
		cv2 = new JCheckBox("BARCO");
		cv2.setMnemonic(KeyEvent.VK_B);
		cv3 = new JCheckBox("TREN");
		cv3.setMnemonic(KeyEvent.VK_T);
		cv4 = new JCheckBox("AUTOMOVIL");
		cv4.setMnemonic(KeyEvent.VK_U);
//colocamos
		cv1.setBounds(10, 50, 100, 20);
		cv2.setBounds(10, 80, 100, 20);
		cv3.setBounds(10, 110, 100, 20);
		cv4.setBounds(10, 140, 100, 20);
//añadimos
		add(cv1);
		add(cv2);
		add(cv3);
		add(cv4);
//Funcionalidad
		cv1.addChangeListener(this);
		cv2.addChangeListener(this);
		cv3.addChangeListener(this);
		cv4.addChangeListener(this);
	}

	@Override
	public void stateChanged(ChangeEvent arg0) {
		String titulo = "Preferidos: ";
		if (cv1.isSelected())
			titulo += "AVIÓN ";
		if (cv2.isSelected() == true)
			titulo += "BARCO ";
		if (cv3.isSelected() == true)
			titulo += "TREN ";
		if (cv4.isSelected() == true)
			titulo += "AUTOMOVIL";
		setTitle(titulo);
	}

	public static void main(String[] args) {
//generamoslaventanaylecambiamoseltítulodependiendodelaselección
		Inicial25Verificacion ventana = new Inicial25Verificacion();
		ventana.setTitle("MEDIOS DE TRANSPORTE");
		ventana.setBounds(700, 500, 500, 300);
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
