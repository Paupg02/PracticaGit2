package ejercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class FechaValida extends JFrame implements ActionListener {
	public JLabel lDia, lMes, lAnio, lfechac, lfechal;
	public JComboBox<String> cbMes;
	public JComboBox<Integer> cbDia, cbAnio;
	public JTextField fechac, fechal;
	public JButton comprobar, limpiar;

	public FechaValida() {
		String[] mes = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };
		Integer[] dia = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
				27, 28, 29, 30, 31 };
		Integer[] anio = { 1999, 2000, 2001, 2002, 2003, 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011, 2012, 2013,
				2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021 };

		setLayout(null);
		lDia = new JLabel("Dia:");
		lDia.setBounds(20, 20, 30, 20);
		lMes = new JLabel("Mes: ");
		lMes.setBounds(20, 50, 30, 20);
		lAnio = new JLabel("Año: ");
		lAnio.setBounds(20, 80, 30, 20);
		lfechac = new JLabel("Fecha Corta: ");
		lfechac.setBounds(20, 180, 90, 20);
		lfechal = new JLabel("Fecha Larga: ");
		lfechal.setBounds(20, 210, 90, 20);

		cbDia = new JComboBox<Integer>(dia);
		cbDia.setBounds(60, 20, 130, 20);
		cbMes = new JComboBox<String>(mes);
		cbMes.setBounds(60, 50, 130, 20);
		cbAnio = new JComboBox<Integer>(anio);
		cbAnio.setBounds(60, 80, 130, 20);

		fechac = new JTextField();
		fechac.setBounds(110, 180, 120, 20);
		fechal = new JTextField();
		fechal.setBounds(110, 210, 150, 20);

		comprobar = new JButton("COMPROBAR");
		comprobar.setBounds(20, 130, 120, 20);
		comprobar.addActionListener(this);

		limpiar = new JButton("LIMPIAR");
		limpiar.setBounds(150, 130, 120, 20);
		limpiar.addActionListener(this);

		add(lDia);
		add(lMes);
		add(lAnio);
		add(lfechac);
		add(lfechal);
		add(cbDia);
		add(cbMes);
		add(cbAnio);
		add(fechac);
		add(fechal);
		add(comprobar);
		add(limpiar);

	}

	public static void main(String[] args) {
		FechaValida ventana = new FechaValida();
		ventana.setTitle("Fecha");
		ventana.setBounds(300, 300, 300, 300);
		ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ventana.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == limpiar) {
			fechac.setText("");
			fechal.setText("");
		}

		if (ae.getSource() == comprobar) {
			int dia = (Integer) cbDia.getSelectedItem();
			int anio = (Integer) cbAnio.getSelectedItem();
			String mes = cbMes.getSelectedItem().toString();
			switch (mes) {
			case "Abril":
			case "Junio":
			case "Septiembre":
			case "Noviembre":
				if (dia > 30) {
					fechac.setText("ERROR");
					fechal.setText("ERROR");
				} else {
					fechac.setText(dia + "/" + mes + "/" + anio);
					fechal.setText(dia + " de " + mes + " de " + anio);
				}
				break;
			case "Febrero":
				if (anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0)) {
					if (dia > 29) {
						fechac.setText("ERROR");
						fechal.setText("ERROR");
					} else {
						fechac.setText(dia + "/" + mes + "/" + anio);
						fechal.setText(dia + " de " + mes + " de " + anio);
					}
				} else {
					if (dia > 28) {
						fechac.setText("ERROR");
						fechal.setText("ERROR");
					} else {
						fechac.setText(dia + "/" + mes + "/" + anio);
						fechal.setText(dia + " de " + mes + " de " + anio);
					}
				}
				break;
			default:
				fechac.setText(dia + "/" + mes + "/" + anio);
				fechal.setText(dia + " de " + mes + " de " + anio);
			}
		}
	}
}
