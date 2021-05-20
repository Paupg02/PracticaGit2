package ejemplosTeoria;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

// elmismoejercicioperosobreunpanel
public class Inicial25Bis {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Ventana25Bis ventana = new Ventana25Bis();
	}
}

//Marcoprincipal (ventana)
@SuppressWarnings("serial")
class Ventana25Bis extends JFrame {
	public Ventana25Bis() {
		setBounds(200, 200, 400, 200);
		setTitle("MEDIOS DE TRANSPORTE");
		setResizable(false);
//añadimosel panel alaventana
		MiPanel panel = new MiPanel();
		add(panel);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

@SuppressWarnings("serial")
//Panel
class MiPanel extends JPanel {
	public MiPanel() {
//anulamosel layoutdelpanel ycolocamoselpropio
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
//añadimoselgrupo
		ButtonGroup grupo1 = new ButtonGroup();
//creamoslosbotonesylosinstanciamos
		JRadioButton jr1 = new JRadioButton("AVION");
		JRadioButton jr2 = new JRadioButton("BARCO");
		JRadioButton jr3 = new JRadioButton("TREN");
		JRadioButton jr4 = new JRadioButton("AUTOMOVIL");
//creamosunaetiquetaqueserálaquemuestralaopciónseleccionada
		JLabel etiqueta = new JLabel();
//donde
//funcionalidad
//creamoselevento
//AÑADIMOS LOS BOTONES AL GRUPO
		grupo1.add(jr1);
		grupo1.add(jr2);
		grupo1.add(jr3);
		grupo1.add(jr4);
//añadimoslosbotonesalpanel
		add(jr1);
		add(jr2);
		add(jr3);
		add(jr4);
		add(etiqueta);
		class EventoBotonRadio implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == jr1)
					etiqueta.setText("SELECCIONADO AVION");
				if (e.getSource() == jr2)
					etiqueta.setText("SELECCIONADO BARCO");
				if (e.getSource() == jr3)
					etiqueta.setText("SELECCIONADO TREN");
				if (e.getSource() == jr4)
					etiqueta.setText("SELECCIONADO AUTOMOVIL");
			}
		}
		EventoBotonRadio evento = new EventoBotonRadio();
//ponemosalaescuchalosbotones
		jr1.addActionListener(evento);
		jr2.addActionListener(evento);
		jr3.addActionListener(evento);
		jr4.addActionListener(evento);
	}
}
