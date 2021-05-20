package ejercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class CalculadoraComboBox extends JFrame implements ActionListener {
	private JLabel lN1, lN2;
	private JTextField tfNum1, tfNum2, tfSolu;
	private JComboBox<String> cb;

	public CalculadoraComboBox() {
		JFrame ventana = new JFrame("Calculadora Combo Box");
		ventana.setBounds(200, 200, 300, 300);

		ventana.setLayout(null);

		lN1 = new JLabel("Num 1:");
		lN1.setBounds(20, 20, 50, 20);
		tfNum1 = new JTextField();
		tfNum1.setBounds(90, 20, 190, 20);
		lN2 = new JLabel("Num 2:");
		lN2.setBounds(20, 60, 50, 20);
		tfNum2 = new JTextField();
		tfNum2.setBounds(90, 60, 190, 20);
		cb = new JComboBox<String>();
		cb.setBounds(20, 100, 260, 20);
		cb.addItem("Suma");
		cb.addItem("Resta");
		cb.addItem("Multiplicación");
		cb.addItem("División");
		tfSolu = new JTextField();
		tfSolu.setBounds(20, 140, 260, 20);

		ventana.add(lN1);
		ventana.add(tfNum1);
		ventana.add(lN2);
		ventana.add(tfNum2);
		ventana.add(cb);
		ventana.add(tfSolu);

		cb.addActionListener(this);

		ventana.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ventana.setVisible(true);
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		CalculadoraComboBox ccb = new CalculadoraComboBox();
	}

	@Override
	public void actionPerformed(ActionEvent ae) {

		try {
			if (cb.getSelectedItem().toString().equalsIgnoreCase("Suma")) {
				double suma = Double.parseDouble(tfNum1.getText()) + Double.parseDouble(tfNum2.getText());
				tfSolu.setText("" + suma);

			}
			if (cb.getSelectedItem().toString().equalsIgnoreCase("Resta")) {
				double resta = Double.parseDouble(tfNum1.getText()) - Double.parseDouble(tfNum2.getText());
				tfSolu.setText("" + resta);

			}
			if (cb.getSelectedItem().toString().equalsIgnoreCase("Multiplicación")) {
				double multi = Double.parseDouble(tfNum1.getText()) * Double.parseDouble(tfNum2.getText());
				tfSolu.setText("" + multi);

			}
			if (cb.getSelectedItem().toString().equalsIgnoreCase("División")) {
				if (Integer.parseInt(tfNum2.getText()) == 0)
					tfSolu.setText("ERR");
				else {
					double num1=Double.parseDouble(tfNum1.getText());
					double num2 =Double.parseDouble(tfNum2.getText());
					double div = num1 /num2 ;
					tfSolu.setText("" + div);
				}

			}
		} catch (NumberFormatException nfe) {
			tfSolu.setText("ERR");
		}
	}

}
