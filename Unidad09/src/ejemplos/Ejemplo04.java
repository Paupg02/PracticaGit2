package ejemplos;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
//Mezcla ejercicios anteriores
@SuppressWarnings("serial")
public class Ejemplo04 extends JFrame implements ActionListener{
	private JButton bt11,bt12,bt13,restauraF,bt21,bt22,bt23,restauraB,restaura;
	
	public Ejemplo04() {
		setTitle("SEMAFORO TOTAL");
		//Anulamos el administrador
		setLayout(null);
			
		//Instanciamos los botones
		//FONDO VENTANA
		bt11=new JButton ("ROJO");
		bt11.setMnemonic(KeyEvent.VK_R);
		bt11.setBounds(40, 10, 100, 20);
		bt12=new JButton ("AMARILLO");
		bt12.setMnemonic(KeyEvent.VK_A);
		bt12.setBounds(170, 10, 100, 20);
		bt13=new JButton ("VERDE");
		bt13.setMnemonic(KeyEvent.VK_V);
		bt13.setBounds(300, 10, 100, 20);
		restauraF=new JButton("RESTAURAR FONDO VENTANA");
		restauraF.setMnemonic(KeyEvent.VK_F);
		restauraF.setBounds(120, 50, 250, 20);
		
		//FONDO BOTONES
		bt21=new JButton ("ROJO ");
		bt21.setMnemonic(KeyEvent.VK_J);
		bt21.setBounds(40, 80, 100, 20);
		bt22=new JButton ("AMARILLO ");
		bt22.setMnemonic(KeyEvent.VK_M);
		bt22.setBounds(170, 80, 100, 20);
		bt23=new JButton ("VERDE ");
		bt23.setMnemonic(KeyEvent.VK_D);
		bt23.setBounds(300, 80, 100, 20);
		restauraB=new JButton("RESTAURAR FONDO BOTONES");
		restauraB.setMnemonic(KeyEvent.VK_B);
		restauraB.setBounds(120, 120, 250, 20);
		
		//RESTAURA 
		restaura=new JButton("RESTAURAR TODO");
		restaura.setMnemonic(KeyEvent.VK_T);
		restaura.setBounds(120, 200, 250, 20);
		
			
		
			//Los colocamos
			
			add(bt11);
			add(bt12);
			add(bt13);
			add(restauraF);
			add(bt21);
			add(bt22);
			add(bt23);
			add(restauraB);
			add(restaura);
			
			
			//Funcionalidad
			bt11.addActionListener(this);
			bt12.addActionListener(this);
			bt13.addActionListener(this);
			restauraF.addActionListener(this);
			bt21.addActionListener(this);
			bt22.addActionListener(this);
			bt23.addActionListener(this);
			restauraB.addActionListener(this);
			restaura.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String titulo="";
		Color inicialBoton= restaura.getBackground();
		//Botones del fondo de la ventana
		//funcionalidad boton 11
		if(e.getSource()==bt11) {
			titulo="PULSADO COLOR ROJO";
			getContentPane().setBackground(Color.RED);	
		}
		
		//funcionalidad boton 12
		if(e.getSource()==bt12) {
			titulo="PULSADO COLOR AMARILLO";
			getContentPane().setBackground(Color.YELLOW);	
		}	
		
		//funcionalidad boton 13
		if(e.getSource()==bt13) {
			titulo="PULSADO COLOR VERDE";
			getContentPane().setBackground(Color.GREEN);	
		}
		
		if(e.getSource()==restauraF) {
			titulo="SEMAFORO";
			getContentPane().setBackground(null);
		}
		
		//botones de fondo de botón
		//funcionalidad boton 21
		if(e.getSource()==bt21) {
			titulo="PULSADO COLOR ROJO";
			bt21.setBackground(Color.RED);	
		}
		
		//funcionalidad boton 22
		if(e.getSource()==bt22) {
			titulo="PULSADO COLOR AMARILLO";
			bt22.setBackground(Color.YELLOW);	
		}	
		
		//funcionalidad boton 23
		if(e.getSource()==bt23) {
			titulo="PULSADO COLOR VERDE";
			bt23.setBackground(Color.GREEN);	
		}
		
		if(e.getSource()==restauraB) {
			titulo="SEMAFORO";
			bt21.setBackground(inicialBoton);
			bt22.setBackground(inicialBoton);
			bt23.setBackground(inicialBoton);
		}
		
		//Restaura todo
		if(e.getSource()==restaura) {
			titulo="SEMAFORO";
			getContentPane().setBackground(null);
			bt21.setBackground(null);
			bt22.setBackground(null);
			bt23.setBackground(null);
		}
		setTitle(titulo);
		
	}

	public static void main(String[] args) {
		//generamos la ventana y le cambiamos el título
		Ejemplo04 ventana=new Ejemplo04 ();
		ventana.setBounds(700,500,500,300);
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	

}
