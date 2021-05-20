package ejemplosTeoria;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

public class Inicial16 {
	public static void main(String[] args) {
		Ventana01 ventana = new Ventana01();
		ventana.setLayout(null);// anumalosel layout
//titulodelaventana
		ventana.setTitle("VENTANA CON ETIQUETA");
//Instanciamosunaetiqueta
		JLabel etiqueta = new JLabel();
//damosvalor alaetiqueta
		etiqueta.setText("¡¡HOLAMUNDO!!");
//colocamoslaetiquetadondequeramos
		etiqueta.setBounds(30, 10, 400, 200);
//Cambiamoslafuentedeltexto
		etiqueta.setFont(new Font("Arial", 1, 40));
//cambiamosel colordelafuente
		etiqueta.setForeground(Color.GREEN);
//laañadimosalaventana
		ventana.add(etiqueta);
		ventana.setVisible(true);
	}
}
