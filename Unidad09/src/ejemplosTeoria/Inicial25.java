package ejemplosTeoria;

//***********************************************************
//*Indicaelbotónpulsadoenlabarradetítulo*
//***********************************************************
import java.awt.event.KeyEvent;
//controldepulsacionessobreteclado
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.event.*;

//Ejemplobotonesderadio
@SuppressWarnings("serial")
public class Inicial25 extends JFrame implements ChangeListener {
	private JRadioButton jr1, jr2, jr3, jr4;
	private ButtonGroup bg;

	public Inicial25() {
//anulamosel layout
		setLayout(null);
//declaramoselgrupo
		bg = new ButtonGroup();
//declaramos,colocamos,añadimosfucionalidad,añadimoselbotonyloañadimosalgrupos
		jr1 = new JRadioButton("AVIÓN");
		jr1.setMnemonic(KeyEvent.VK_A);
		jr2 = new JRadioButton("BARCO");
		jr2.setMnemonic(KeyEvent.VK_B);
		jr3 = new JRadioButton("TREN");
		jr3.setMnemonic(KeyEvent.VK_T);
		jr4 = new JRadioButton("AUTOMOVIL");
		jr4.setMnemonic(KeyEvent.VK_U);
//decidimoslaposiciónenlaqueloscolocamos
		jr1.setBounds(10, 50, 100, 20);
		jr2.setBounds(10, 80, 100, 20);
		jr3.setBounds(10, 110, 100, 20);
		jr4.setBounds(10, 140, 100, 20);
		add(jr1);
		add(jr2);
		add(jr3);
		add(jr4);
//AÑADIMOS LOS BOTONES AL GRUPO
		bg.add(jr1);
		bg.add(jr2);
		bg.add(jr3);
		bg.add(jr4);
		jr1.addChangeListener(this);
		jr2.addChangeListener(this);
		jr3.addChangeListener(this);
		jr4.addChangeListener(this);
	}

//clase interna
	public void stateChanged(ChangeEvent e) {
		String Title = "";
		if (jr1.isSelected())
			Title = "SELECCIONÓ AVIÓN";
		if (jr2.isSelected() == true)
			Title = "SELECCIONÓ BARCO";
		if (jr3.isSelected() == true)
			Title = "SELECCIONÓ TREN";
		if (jr4.isSelected() == true)
			Title = "SELECCIONÓ AUTOMOVIL";
		setTitle(Title);
	}

	public static void main(String[] args) {
//generamoslaventanaylecambiamoseltítulo
		Inicial25 ventana = new Inicial25();
		ventana.setTitle("MEDIOS DE TRANSPORTE");
		ventana.setBounds(200, 200, 500, 300);
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
