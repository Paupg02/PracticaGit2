package ejercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class VentanaTexto extends JFrame implements ActionListener {
	public JLabel jlTitulo, jlRespuesta;
	public JTextArea area;
	public JButton btnvocales, btnconso, btnespacios, btnsimbolo, btnnumeros;

	public VentanaTexto() {

		setLayout(null);
		jlTitulo = new JLabel("INTRODUCE UNA FRASE");
		jlTitulo.setBounds(290, 20, 150, 30);
		
		area = new JTextArea();
		area.setLineWrap(true);
		area.setWrapStyleWord(true);
		JScrollPane barra = new JScrollPane(area);
		barra.setBounds(250, 70, 200, 150);
		
		jlRespuesta = new JLabel();
		jlRespuesta.setBounds(250, 220, 200, 30);
		
		btnvocales = new JButton("VOCALES?");
		btnvocales.setBounds(20, 270, 100, 20);
		btnvocales.addActionListener(this);
		
		btnconso = new JButton("CONSONANTES?");
		btnconso.setBounds(140, 270, 130, 20);
		btnconso.addActionListener(this);
		
		btnespacios = new JButton("ESPACIOS?");
		btnespacios.setBounds(290, 270, 100, 20);
		btnespacios.addActionListener(this);
		
		btnsimbolo = new JButton("SIMBOLOS?");
		btnsimbolo.setBounds(410, 270, 110, 20);
		btnsimbolo.addActionListener(this);
		
		btnnumeros = new JButton("NUMEROS?");
		btnnumeros.setBounds(540, 270, 100, 20);
		btnnumeros.addActionListener(this);

		add(jlTitulo);
		add(barra);
		add(jlRespuesta);
		add(btnvocales);
		add(btnconso);
		add(btnespacios);
		add(btnsimbolo);
		add(btnnumeros);
	}

	public static void main(String[] args) {
		VentanaTexto v = new VentanaTexto();
		v.setBounds(200, 200, 700, 500);
		v.setDefaultCloseOperation(EXIT_ON_CLOSE);
		v.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		String texto;
		texto=area.getText().toUpperCase().trim();
		int total=0,vocal=0,consonante=0;
		// Contamos el numero de letras de texto
		for(int i=0;i<texto.length();i++)
			if(Character.isLetter(texto.charAt(i)))
				total++;
		//CUENTA EL NUMERO DE VOCALES
		
		for(int i=0;i<texto.length();i++) {
			if(texto.charAt(i)=='A'||texto.charAt(i)=='E'||texto.charAt(i)=='I'||texto.charAt(i)=='O'||texto.charAt(i)=='U'||
					texto.charAt(i)=='�'||texto.charAt(i)=='�'||texto.charAt(i)=='�'||texto.charAt(i)=='�'||texto.charAt(i)=='�')
				vocal++;
			}
		
		if(ae.getSource()==btnvocales) 
			jlRespuesta.setText("El n�mero de vocales es "+vocal);
		
		if (ae.getSource()==btnconso) {
			consonante=total-vocal;	
			jlRespuesta.setText("El n�mero de consonantes es  "+consonante);
		}
		if(ae.getSource()==btnespacios) {
			int blancos=0;
			for(int i=0;i<area.getText().length();i++)
				if(Character.isSpaceChar(area.getText().charAt(i)))
					blancos++;
			jlRespuesta.setText("EL N�MERO DE ESPACIOS ES  "+blancos);	
		}
		if(ae.getSource()==btnsimbolo) {
			int simbolo=0;
			for(int i=0;i<area.getText().length();i++)
				if(!(Character.isLetterOrDigit(area.getText().charAt(i))|| Character.isSpaceChar(area.getText().charAt(i))))
					simbolo++;
			jlRespuesta.setText("EL N�MERO DE S�MBOLOS ES  "+simbolo);
		}
		if(ae.getSource()==btnnumeros) {
			int digito=0;
			for(int i=0;i<area.getText().length();i++)
				if(Character.isDigit(area.getText().charAt(i)))
					digito++;
			jlRespuesta.setText("EL N�MERO DE D�GITOS ES  "+digito);
		}
	}

}
