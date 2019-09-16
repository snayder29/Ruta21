package Proyecto;

import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JTextField;

import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class Cerrar_Aplicacion extends JFrame {

	private JPanel contentPane;
	private JTextField txtuser;
	private JPasswordField txtpass;
	private Timer tiempo;
	private JLabel lblCerrando;
	private JProgressBar barrita;

	/**
	 * Launch the application.
	 */
	public final static int TWO_SECOND=10;
	int cont;
	private JLabel label;
	
	
	
	class TimerListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			cont++;
			barrita.setValue(cont);
			if(cont==100)
			{
				esconder();
				System.exit(0);
			}
		}
	}
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cerrar_Aplicacion frame = new Cerrar_Aplicacion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Cerrar_Aplicacion() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Cerrar_Aplicacion.class.getResource("/imagenes/Logo.jpg")));
		setTitle("Saliendo...");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 272, 251);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblCerrando = new JLabel("Cerrando. . . . . . . ");
		lblCerrando.setBounds(73, 43, 119, 21);
		contentPane.add(lblCerrando);
		
		JLabel lblEsperePorfavor = new JLabel("Espere porfavor");
		lblEsperePorfavor.setBounds(78, 11, 110, 21);
		contentPane.add(lblEsperePorfavor);
		
		barrita = new JProgressBar();
		barrita.setBounds(41, 124, 183, 14);
		contentPane.add(barrita);
		
		label = new JLabel("");
		label.setIcon(new ImageIcon(Cerrar_Aplicacion.class.getResource("/imagenes/Logo.jpg")));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(0, 0, 268, 225);
		contentPane.add(label);
		barrita.setVisible(false);
		
		//para que nuestro GUI se muestre centrado
		setLocationRelativeTo(null);
		
		
		cerrar();
	}


	void cerrar()
	{
		cont=-1;
		barrita.setValue(0);
		barrita.setStringPainted(true);
		tiempo=new Timer(TWO_SECOND, new TimerListener());
		activar();
	}
	

	void esconder()
	{
		this.setVisible(false);
	}
	
	void activar()
	{
		tiempo.start();
	}
}
