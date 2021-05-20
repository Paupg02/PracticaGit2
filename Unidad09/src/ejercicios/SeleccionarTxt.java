package ejercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;

@SuppressWarnings("serial")
public class SeleccionarTxt extends JFrame implements ActionListener {
	public JButton seleccion;
	public JTextArea area;

	public SeleccionarTxt() {
		setLayout(null);

		// Instancio el botón
		seleccion = new JButton("SELECCIONAR");
		seleccion.setBounds(20, 20, 120, 30);
		seleccion.addActionListener(this);

		// Instancio el text area con un scroll panel
		area = new JTextArea();
		area.setBounds(190, 20, 240, 240);
		JScrollPane barra = new JScrollPane(area);
		barra.setBounds(190, 20, 240, 240);

		// añado el botton y el text area
		add(seleccion);
		add(barra);
	}

	public static void main(String[] args) {
		SeleccionarTxt v = new SeleccionarTxt();
		v.setTitle("Seleccionar un txt");
		v.setBounds(200, 200, 500, 500);
		v.setDefaultCloseOperation(EXIT_ON_CLOSE);
		v.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == seleccion) {
			FileNameExtensionFilter text = new FileNameExtensionFilter(".txt", "txt");
			JFileChooser fc = new JFileChooser("C:" + File.separator + "Pruebas1");
			fc.setFileFilter(text);
			int respuestausuario = fc.showOpenDialog(this);
			if (respuestausuario == JFileChooser.CANCEL_OPTION)
				area.setText("El usuario canceló la selección");
			if (respuestausuario == JFileChooser.APPROVE_OPTION) {
				String fichero = fc.getSelectedFile().toString();
				File f = new File(fichero);
				String cadena;
				try (BufferedReader br = new BufferedReader(new FileReader(f))) {
					while ((cadena = br.readLine()) != null) {
						area.append(cadena + "\n");
					}
				} catch (IOException ioe) {
					area.setText("ERROR E/S");
				}
			}
		}
	}
}
