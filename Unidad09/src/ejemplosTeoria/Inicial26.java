package ejemplosTeoria;

import javax.swing.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Inicial26 extends JFrame implements ItemListener {
	private JComboBox<String> combo;

	public Inicial26() {
		setLayout(null);
		combo = new JComboBox<String>();
		combo.setBounds(10, 10, 80, 20);
		add(combo);
		combo.addItem("rojo");
		combo.addItem("amarillo");
		combo.addItem("verde");
		combo.addItem("azul");
		combo.addItem("morado");
		combo.addItem("negro");
//añadeunitemenunadeterminadaposición
//primerposicion
		combo.insertItemAt("BLANCO", 0);
		combo.setEditable(true);
		combo.addItemListener(this);
	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == combo) {
			String seleccionado = (String) combo.getSelectedItem();
			setTitle(seleccionado);
		}
	}

	public static void main(String[] ar) {
		Inicial26 ventana = new Inicial26();
		ventana.setBounds(700, 500, 500, 300);
		ventana.setVisible(true);
	}
}
