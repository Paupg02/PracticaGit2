package ejercicios;


import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

public class Spinner2 {
	public static void main(String[] args) {
		VentanaSpinner ventana = new VentanaSpinner();
		ventana.setTitle("EJEMPLO SPINNER");
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

@SuppressWarnings("serial")
class VentanaSpinner extends JFrame {
	PanelDefecto panelDefecto;
	PanelFecha panelFecha;
	PanelLista panelLista;
	PanelOtro panelOtro;

	public VentanaSpinner() {
		setLayout(null);
		setTitle("EJEMPLO SPINNER");
		setBounds(200, 200, 500, 500);
		// usando el constructor por defecto crea un spinner que empieza en 0 y aumenta
		// hasta infiito y disminuye hasta menos infinito de uno en uno
		panelDefecto = new PanelDefecto();
		panelDefecto.setBounds(0, 0, 500, 100);
		add(panelDefecto);
		panelFecha = new PanelFecha();
		panelFecha.setBounds(0, 100, 500, 100);
		add(panelFecha);
		panelLista = new PanelLista();
		panelLista.setBounds(0, 200, 500, 100);
		add(panelLista);
		panelOtro = new PanelOtro();
		panelOtro.setBounds(0, 300, 500, 100);
		add(panelOtro);
	}
}

@SuppressWarnings("serial")
class PanelDefecto extends JPanel {
	JSpinner jsDefecto;

	public PanelDefecto() {
		jsDefecto = new JSpinner();
		// cambiar el tamaño para ajustar al contenido usamos el método
		// setPreferrentSize(Dimension dimension)
		jsDefecto.setPreferredSize(new Dimension(100, 30));
		add(jsDefecto);
	}
}

@SuppressWarnings("serial")
class PanelFecha extends JPanel {
	JSpinner jsFecha;

	public PanelFecha() {
		// usaremos el constructor JSpinner(SpinnerModel model)
		// El Spinner Model que vamos a usar es la clase SpinnerDateModelconsultarlasApi
		jsFecha = new JSpinner(new SpinnerDateModel());
		jsFecha.setPreferredSize(new Dimension(100, 30));
		add(jsFecha);
	}
}

@SuppressWarnings("serial")
class PanelLista extends JPanel {
	JSpinner jsLista;

	public PanelLista() {
		String dias[] = { "LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO" };
		// usaremos el constructor JSpinner(SpinnerModel model)
		// El Spinner Model que vamos a usar es la clase SpinnerListModelconsultarlasApi
		jsLista = new JSpinner(new SpinnerListModel(dias));
		jsLista.setPreferredSize(new Dimension(100, 30));
		add(jsLista);
	}
}

@SuppressWarnings("serial")
class PanelOtro extends JPanel {
	JSpinner js;

	public PanelOtro() {
		js = (new JSpinner(new SpinnerNumberModel(10, 0, 20, 1)));
		// cambiar el tamaño para ajustar al contenido usamos el método
		// setPreferrentSize(Dimension dimension)
		js.setPreferredSize(new Dimension(100, 30));
		add(js);
	}
}
