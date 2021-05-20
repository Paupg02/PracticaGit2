package ejemplos;
//*******************************************************************************

//		5.	Crear una ventana con los botones que aparecen a continuación		*
//		•	sexo (Hombre o mujer)												*
//		•	Estudios (primarios, secundarios, superiores)						*
//		•	Vivienda (propia, alquilada)										*
//		Cada grupo mostrará una etiqueta con el valor del botón seleccionado.	*
//*******************************************************************************

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;

public class Ejemplo05 {
	// private JRadioButton
	// hombre,mujer,primario,secundarios,superiores,propia,alquilada;
	// private JLabel et1,et2,et3;

	public static void main(String[] args) {
		JFrame marco = new JFrame("Ejercicio06");
		marco.setBounds(200, 200, 500, 350);
		// marco.setLayout(null);
		// creamos la caja vertical
		Box caja = Box.createHorizontalBox();

		// primer grupo

		ButtonGroup grupoSexo = new ButtonGroup();
		JLabel etsexo = new JLabel("SEXO");
		etsexo.setHorizontalAlignment(SwingConstants.CENTER);
		etsexo.setFont(new Font("Arial", Font.ITALIC, 15));
		etsexo.setForeground(Color.RED);
		JRadioButton hombre = new JRadioButton("HOMBRE");
		grupoSexo.add(hombre);
		JRadioButton mujer = new JRadioButton("MUJER");
		JLabel et1 = new JLabel();
		et1.setForeground(Color.BLUE);

		// segundo grupo
		ButtonGroup grupoEstudios = new ButtonGroup();
		JLabel etEstudios = new JLabel("NIVEL DE ESTUDIOS");
		etEstudios.setHorizontalAlignment(SwingConstants.CENTER);
		etEstudios.setFont(new Font("Arial", Font.ITALIC, 15));
		etEstudios.setForeground(Color.RED);
		JRadioButton primario = new JRadioButton(" ESTUDIOS PRIMARIOS");
		grupoEstudios.add(primario);
		JRadioButton secundarios = new JRadioButton("ESTUDIOS SECUNDARIOS");
		grupoSexo.add(secundarios);
		JRadioButton superiores = new JRadioButton("ESTUDIOS SUPERIORES");
		grupoEstudios.add(superiores);
		JLabel et2 = new JLabel();
		et2.setForeground(Color.BLUE);

		// tercer grupo
		ButtonGroup grupoVivienda = new ButtonGroup();
		JLabel etVivienda = new JLabel("VIVIENDA");
		etVivienda.setHorizontalAlignment(SwingConstants.CENTER);
		etVivienda.setFont(new Font("Arial", Font.ITALIC, 15));
		etVivienda.setForeground(Color.RED);
		JRadioButton propia = new JRadioButton("PROPIA");
		grupoVivienda.add(propia);
		JRadioButton alquilada = new JRadioButton("ALQUILADA");
		grupoVivienda.add(alquilada);
		JLabel et3 = new JLabel();
		et3.setForeground(Color.BLUE);

		// creamos la caja vertical
		Box cajaSexo = Box.createVerticalBox();
		// añadimos contenido a la caja
		cajaSexo.add(etsexo);
		cajaSexo.add(hombre);
		cajaSexo.add(mujer);
		cajaSexo.add(Box.createVerticalStrut(50));
		cajaSexo.add(et1);

		Box cajaEstudios = Box.createVerticalBox();
		cajaEstudios.add(etEstudios);
		cajaEstudios.add(primario);
		cajaEstudios.add(secundarios);
		cajaEstudios.add(superiores);
		cajaEstudios.add(Box.createVerticalStrut(50));
		cajaEstudios.add(et2);

		Box cajaVivienda = Box.createVerticalBox();
		cajaVivienda.add(etVivienda);
		cajaVivienda.add(propia);
		cajaVivienda.add(alquilada);
		cajaVivienda.add(Box.createVerticalStrut(50));
		cajaVivienda.add(et3);

		// añadimos componentes
		caja.add(cajaSexo);
		caja.add(Box.createRigidArea(new Dimension(50, 50)));
		caja.add(cajaEstudios);
		caja.add(Box.createRigidArea(new Dimension(50, 50)));
		caja.add(cajaVivienda);

		class EventoBotonRadio implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == hombre)
					et1.setText("HOMBRE");
				if (e.getSource() == mujer)
					et1.setText("MUJER");

				if (e.getSource() == primario)
					et2.setText("ESTUDIOS PRIMARIOS");
				if (e.getSource() == secundarios)
					et2.setText("ESTUDIOS SECUNDARIOS");
				if (e.getSource() == superiores)
					et2.setText("ESTUDIOS SUPERIORES");

				if (e.getSource() == propia)
					et3.setText("VIVIENDA PROPIA");
				if (e.getSource() == alquilada)
					et3.setText("VIVIENDA ALQUILADA");

			}
		}
		EventoBotonRadio evento = new EventoBotonRadio();

		// Ponemos a la escuchalos botones
		// Sexo
		hombre.addActionListener(evento);
		mujer.addActionListener(evento);

		// Estudios
		primario.addActionListener(evento);
		secundarios.addActionListener(evento);
		superiores.addActionListener(evento);

		// vivienda
		propia.addActionListener(evento);
		alquilada.addActionListener(evento);

		marco.add(caja);
		marco.setVisible(true);

		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Falta funcionalidad

	}

}
