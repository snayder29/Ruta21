package Proyecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import javax.swing.JToggleButton;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class Acerca_de extends JFrame {

	private JPanel contentPane;
	private JLabel lblCreadores;
	private JLabel lblSanyder;
	private JLabel lblDanielaValverde;
	private JLabel lblKevinLlauriLlauri;
	private JLabel lblFlorLecaAltamirano;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Acerca_de frame = new Acerca_de();
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
	public Acerca_de() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Acerca_de.class.getResource("/imagenes/Fondo2.jpg")));
		setResizable(false);
		setTitle("Acerca de Ruta 21");
		setFont(new Font("Times New Roman", Font.PLAIN, 15));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 335, 307);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnAtras = new JButton("Aceptar\t");
		btnAtras.setBounds(115, 240, 89, 23);
		btnAtras.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				Inicio atras = new Inicio();
				atras.setVisible(true);
				dispose();
			}

		});
		contentPane.setLayout(null);
		contentPane.add(btnAtras);
		
		lblCreadores = new JLabel("Creadores:");
		lblCreadores.setForeground(Color.WHITE);
		lblCreadores.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreadores.setBounds(118, 11, 82, 23);
		lblCreadores.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		contentPane.add(lblCreadores);
		
		lblSanyder = new JLabel("Snayder Rosario Miranda");
		lblSanyder.setForeground(Color.WHITE);
		lblSanyder.setHorizontalAlignment(SwingConstants.CENTER);
		lblSanyder.setBounds(59, 69, 201, 23);
		lblSanyder.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		contentPane.add(lblSanyder);
		
		lblDanielaValverde = new JLabel("David Vargas Dominguez");
		lblDanielaValverde.setForeground(Color.WHITE);
		lblDanielaValverde.setHorizontalAlignment(SwingConstants.CENTER);
		lblDanielaValverde.setBounds(59, 91, 201, 23);
		lblDanielaValverde.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		contentPane.add(lblDanielaValverde);
		
		lblKevinLlauriLlauri = new JLabel("Ivan Moncada Rodriguez");
		lblKevinLlauriLlauri.setForeground(Color.WHITE);
		lblKevinLlauriLlauri.setHorizontalAlignment(SwingConstants.CENTER);
		lblKevinLlauriLlauri.setBounds(59, 115, 201, 23);
		lblKevinLlauriLlauri.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		contentPane.add(lblKevinLlauriLlauri);
		
		lblFlorLecaAltamirano = new JLabel("Flor Lecca Altamirano");
		lblFlorLecaAltamirano.setForeground(Color.WHITE);
		lblFlorLecaAltamirano.setHorizontalAlignment(SwingConstants.CENTER);
		lblFlorLecaAltamirano.setBounds(59, 138, 201, 23);
		lblFlorLecaAltamirano.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		contentPane.add(lblFlorLecaAltamirano);
		
		JLabel lblVersin = new JLabel("Versi\u00F3n: 3.0.240");
		lblVersin.setForeground(Color.WHITE);
		lblVersin.setHorizontalAlignment(SwingConstants.CENTER);
		lblVersin.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblVersin.setBounds(97, 172, 124, 23);
		contentPane.add(lblVersin);
		
		JLabel lblContactoIcibertecedupe = new JLabel("Contacto: i201815535@cibertec.edu.pe");
		lblContactoIcibertecedupe.setForeground(Color.WHITE);
		lblContactoIcibertecedupe.setHorizontalAlignment(SwingConstants.CENTER);
		lblContactoIcibertecedupe.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		lblContactoIcibertecedupe.setBounds(14, 206, 291, 23);
		contentPane.add(lblContactoIcibertecedupe);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Acerca_de.class.getResource("/imagenes/Fondo2.jpg")));
		lblNewLabel.setBounds(0, 0, 329, 278);
		contentPane.add(lblNewLabel);
		
		setLocationRelativeTo(null);

	}
}
