package ejercicios;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

@SuppressWarnings("serial")
public class Monedas extends JFrame implements ActionListener {
	public static void main(String[] args) {

		@SuppressWarnings("unused")
		Monedas ventana = new Monedas();
	}

	private JRadioButton jr1Dolar, jr1Lira, jr1Euro, jr1Yen;
	private JRadioButton jr2Dolar, jr2Lira, jr2Euro, jr2Yen;
	private JTextField jt1cantidad, jt2resultado;
	private JButton jbtCambiar, jbtLimpiar;
	private JLabel jlResultado, jlCantidad, jl1Moneda, jl2Moneda;
	private ButtonGroup bg1, bg2;

	public Monedas() {

		// ventana
		setLayout(null);
		setBounds(50, 50, 600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Ejercicio06-Monedas");

		// botones radio

		bg1 = new ButtonGroup();// creamos el botongroup para agrupar los botones de opciones de moneda que
								// tenemos
		bg2 = new ButtonGroup();// grupo de monenas que queremos cambiar

		// creamos los botones de opciones de las monedas para cambiar
		jr1Dolar = new JRadioButton("Dolar", false);
		jr1Lira = new JRadioButton("Lira", false);
		jr1Euro = new JRadioButton("Euros", false);
		jr1Yen = new JRadioButton("Yen", false);
		// creamos los botones para elegir a que convertirlos
		jr2Dolar = new JRadioButton("Dolar", false);
		jr2Lira = new JRadioButton("Lira", false);
		jr2Euro = new JRadioButton("Euros", false);
		jr2Yen = new JRadioButton("Yen", false);
		// creaos etquietas
		jl1Moneda = new JLabel();
		jl1Moneda.setText("Elige Moneda");
		jl2Moneda = new JLabel();
		jl2Moneda.setText("Convertir a");
		jlCantidad = new JLabel();
		jlCantidad.setText("Introduce cantidad");
		// texto
		jt1cantidad = new JTextField(10);
		jlResultado = new JLabel();
		jlResultado.setText("el cambio es");
		jt2resultado = new JTextField();

		// botones
		jbtCambiar = new JButton("Cambiar");
		jbtLimpiar = new JButton("Limpiar");

		// le damos tamñao a todos los botones de opciones

		jr1Dolar.setBounds(50, 50, 100, 20);
		jr1Euro.setBounds(50, 100, 100, 20);
		jr1Lira.setBounds(50, 150, 100, 20);
		jr1Yen.setBounds(50, 200, 100, 20);
		jr2Dolar.setBounds(200, 50, 100, 20);
		jr2Euro.setBounds(200, 100, 100, 20);
		jr2Lira.setBounds(200, 150, 100, 20);
		jr2Yen.setBounds(200, 200, 100, 20);
		jl1Moneda.setBounds(50, 25, 100, 25);
		jl2Moneda.setBounds(200, 25, 100, 25);

		jlCantidad.setBounds(50, 250, 150, 25);
		jt1cantidad.setBounds(300, 250, 200, 25);

		jlResultado.setBounds(50, 300, 150, 25);
		jt2resultado.setBounds(300, 300, 200, 25);

		jbtCambiar.setBounds(50, 350, 100, 30);
		jbtLimpiar.setBounds(300, 350, 100, 40);

		// añadimos al grupo
		bg1.add(jr1Dolar);
		bg1.add(jr1Euro);
		bg1.add(jr1Lira);
		bg1.add(jr1Yen);
		bg2.add(jr2Dolar);
		bg2.add(jr2Euro);
		bg2.add(jr2Lira);
		bg2.add(jr2Yen);

		// añadimos los botones a la ventana
		add(jr1Dolar);
		add(jr1Euro);
		add(jr1Lira);
		add(jr1Yen);
		add(jr2Dolar);
		add(jr2Euro);
		add(jr2Lira);
		add(jr2Yen);
		add(jl1Moneda);
		add(jl2Moneda);
		add(jlCantidad);
		add(jt1cantidad);
		add(jlResultado);
		add(jt2resultado);
		add(jbtCambiar);
		add(jbtLimpiar);

		// dar funcionalidad a los botones de opcion

//			jr1Dolar.addActionListener(this);
//			jr1Euro.addActionListener(this);
//			jr1Lira.addActionListener(this);
//			jr1Yen.addActionListener(this);
//			jr2Dolar.addActionListener(this);
//			jr2Euro.addActionListener(this);
//			jr2Lira.addActionListener(this);
//			jr2Yen.addActionListener(this);
		//
		jbtCambiar.addActionListener(this);
		jbtLimpiar.addActionListener(this);

		setVisible(true);

		// validamos el contenido de jtext
		jt1cantidad.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent ke) {
				if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyChar() == '.') {
					jt1cantidad.setEditable(true);
					jt2resultado.setText("");
				} else {
					jt1cantidad.setEditable(false);
					jt2resultado.setText("Error: no has introducido un numero");

				}
			}

		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		try {

			int n = Integer.parseInt(jt1cantidad.getText());
			final double EURO_DOLAR = 1.22;
			final double EURO_LIRA = 10.02;
			final double EURO_YEN = 132.11;
			final double DOLAR_LIRA = 8.24;
			final double DOLAR_YEN = 108.59;
			final double LIRA_YEN = 13.18;

			if (e.getSource() == jbtCambiar) {
				if (jt1cantidad.getText().equals(""))
					;
				jt2resultado.setText("No has introducido cantidad");

				if (jr1Euro.isSelected() && jr2Dolar.isSelected() && !jt1cantidad.equals(""))
					jt2resultado.setText(String.valueOf(n * EURO_DOLAR));

				if (jr1Euro.isSelected() && jr2Lira.isSelected() && !jt1cantidad.equals(""))
					jt2resultado.setText(String.valueOf(n * EURO_LIRA));

				if (jr1Euro.isSelected() && jr2Yen.isSelected() && !jt1cantidad.equals(""))
					jt2resultado.setText(String.valueOf(n * EURO_YEN));

				if (jr1Euro.isSelected() && jr2Euro.isSelected() && !jt1cantidad.equals(""))
					jt2resultado.setText(String.valueOf(n * 1));

				if (jr1Dolar.isSelected() && jr2Dolar.isSelected() && !jt1cantidad.equals(""))
					jt2resultado.setText(String.valueOf(n * 1));

				if (jr1Dolar.isSelected() && jr2Euro.isSelected() && !jt1cantidad.equals(""))
					jt2resultado.setText(String.valueOf(n / EURO_DOLAR));

				if (jr1Dolar.isSelected() && jr2Lira.isSelected() && !jt1cantidad.equals(""))
					jt2resultado.setText(String.valueOf(n * DOLAR_LIRA));

				if (jr1Dolar.isSelected() && jr2Yen.isSelected() && !jt1cantidad.equals(""))
					jt2resultado.setText(String.valueOf(n * DOLAR_YEN));

				if (jr1Lira.isSelected() && jr2Lira.isSelected() && !jt1cantidad.equals(""))
					jt2resultado.setText(String.valueOf(n * 1));

				if (jr1Lira.isSelected() && jr2Yen.isSelected() && !jt1cantidad.equals(""))
					jt2resultado.setText(String.valueOf(n * LIRA_YEN));

				if (jr1Lira.isSelected() && jr2Dolar.isSelected() && !jt1cantidad.equals(""))
					jt2resultado.setText(String.valueOf(n / DOLAR_LIRA));

				if (jr1Lira.isSelected() && jr2Euro.isSelected() && !jt1cantidad.equals(""))
					jt2resultado.setText(String.valueOf(n / EURO_LIRA));

				if (jr1Yen.isSelected() && jr2Yen.isSelected() && !jt1cantidad.equals(""))
					jt2resultado.setText(String.valueOf(n * 1));

				if (jr1Yen.isSelected() && jr2Dolar.isSelected() && !jt1cantidad.equals(""))
					jt2resultado.setText(String.valueOf(n / DOLAR_YEN));

				if (jr1Yen.isSelected() && jr2Euro.isSelected() && !jt1cantidad.equals(""))
					jt2resultado.setText(String.valueOf(n / EURO_YEN));

				if (jr1Yen.isSelected() && jr2Lira.isSelected() && !jt1cantidad.equals(""))
					jt2resultado.setText(String.valueOf(n / LIRA_YEN));
			}

			if (e.getSource() == jbtLimpiar) {
				jr1Dolar.setSelected(false);
				jr1Euro.setSelected(false);
				jr1Lira.setSelected(false);
				jr1Yen.setSelected(false);

				jr2Dolar.setSelected(false);
				jr2Euro.setSelected(false);
				jr2Lira.setSelected(false);
				jr2Yen.setSelected(false);

				jt1cantidad.setText("");
				jt2resultado.setText("");

			}

		} catch (NumberFormatException nfe) {
			jt2resultado.setText("Error: no has introducido un numero");
		}

	}

}
