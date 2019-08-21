package Proyecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JDesktopPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.security.Principal;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Vender extends JFrame {

	private JPanel contentPane;
	private JLabel lblNumero;
	private JLabel lblbus1;
	private JLabel lblbus2;
	private JLabel lblhora1;
	private JLabel lblhora2;
	private JLabel lblCapacidad1;
	private JLabel lblCapacidad2;
	private JLabel lblRutas;
	private JLabel lblBus;
	private JLabel lblSalidas;
	private JLabel lblDisponibilidad;
	private JLabel lblbus3;
	private JLabel lblbus4;
	private JLabel lblhora3;
	private JLabel lblhora4;
	private JLabel lblCapacidad3;
	private JLabel lblCapacidad4;
	private JPanel panel_1;
	private JLabel lblbus5;
	private JLabel lblbus6;
	private JLabel lblhora5;
	private JLabel lblhora6;
	private JLabel lblCapacidad5;
	private JLabel lblCapacidad6;
	private JLabel lblbus7;
	private JLabel lblbus8;
	private JLabel lblhora7;
	private JLabel lblhora8;
	private JLabel lblCapacidad7;
	private JLabel lblCapacidad8;
	private JPanel panel_2;
	private JLabel lblbus9;
	private JLabel lblbus10;
	private JLabel lblhora9;
	private JLabel lblhora10;
	private JLabel lblCapacidad9;
	private JLabel lblCapacidad10;
	private JLabel lblbus11;
	private JLabel lblbus12;
	private JLabel lblhora11;
	private JLabel lblhora12;
	private JLabel lblCapacidad11;
	private JLabel lblCapacidad12;
	private JRadioButton rbtRuta1;
	private JRadioButton rbtRuta2;
	private JRadioButton rbtRuta3;
	private JRadioButton rbtBus1;
	private JRadioButton rbtBus2;
	private JRadioButton rbtBus3;
	private JRadioButton rbtBus4;
	private JRadioButton rbtBus8;
	private JRadioButton rbtBus7;
	private JRadioButton rbtBus6;
	private JRadioButton rbtBus5;
	private JRadioButton rbtBus12;
	private JRadioButton rbtBus11;
	private JRadioButton rbtBus10;
	private JRadioButton rbtBus9;
	private JButton btnCancelar;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vender frame = new Vender();
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
	public Vender() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Vender.class.getResource("/imagenes/carro(1).png")));
		setResizable(false);
		
		
		setTitle("Venta de Pasajes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 614, 570);
		contentPane = new JPanel();
		contentPane.setLocation(-225, -325);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRuta = new JLabel("Selecione la Ruta:");
		lblRuta.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblRuta.setBounds(10, 12, 156, 21);
		contentPane.add(lblRuta);
		
		lblNumero = new JLabel("");
		lblNumero.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNumero.setBounds(470, 12, 48, 21);
		contentPane.add(lblNumero);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		panel.setBounds(181, 63, 404, 134);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		lblbus1 = new JLabel("af");
		lblbus1.setHorizontalAlignment(SwingConstants.CENTER);
		lblbus1.setBounds(46, 11, 93, 21);
		lblbus1.setBackground(Color.WHITE);
		lblbus1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		panel.add(lblbus1);
		
		lblbus2 = new JLabel("fghj");
		lblbus2.setHorizontalAlignment(SwingConstants.CENTER);
		lblbus2.setBounds(46, 42, 93, 21);
		lblbus2.setBackground(Color.WHITE);
		lblbus2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		panel.add(lblbus2);
		
		lblhora1 = new JLabel("asd");
		lblhora1.setHorizontalAlignment(SwingConstants.CENTER);
		lblhora1.setBounds(180, 11, 67, 21);
		lblhora1.setBackground(Color.WHITE);
		lblhora1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		panel.add(lblhora1);
		
		lblhora2 = new JLabel("ghj");
		lblhora2.setHorizontalAlignment(SwingConstants.CENTER);
		lblhora2.setBounds(180, 42, 67, 21);
		lblhora2.setBackground(Color.WHITE);
		lblhora2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		panel.add(lblhora2);
		
		lblCapacidad1 = new JLabel("retf");
		lblCapacidad1.setHorizontalAlignment(SwingConstants.CENTER);
		lblCapacidad1.setBounds(300, 11, 40, 21);
		lblCapacidad1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		panel.add(lblCapacidad1);
		
		lblCapacidad2 = new JLabel("fghjk");
		lblCapacidad2.setHorizontalAlignment(SwingConstants.CENTER);
		lblCapacidad2.setBounds(300, 42, 40, 21);
		lblCapacidad2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		panel.add(lblCapacidad2);
		
		lblbus3 = new JLabel("Normal");
		lblbus3.setHorizontalAlignment(SwingConstants.CENTER);
		lblbus3.setBounds(46, 73, 93, 21);
		lblbus3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblbus3.setBackground(Color.WHITE);
		panel.add(lblbus3);
		
		lblbus4 = new JLabel("Doble Piso");
		lblbus4.setHorizontalAlignment(SwingConstants.CENTER);
		lblbus4.setBounds(46, 104, 93, 21);
		lblbus4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblbus4.setBackground(Color.WHITE);
		panel.add(lblbus4);
		
		lblhora3 = new JLabel("7 AM");
		lblhora3.setHorizontalAlignment(SwingConstants.CENTER);
		lblhora3.setBounds(180, 73, 67, 21);
		lblhora3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblhora3.setBackground(Color.WHITE);
		panel.add(lblhora3);
		
		lblhora4 = new JLabel("8 AM");
		lblhora4.setHorizontalAlignment(SwingConstants.CENTER);
		lblhora4.setBounds(180, 104, 67, 21);
		lblhora4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblhora4.setBackground(Color.WHITE);
		panel.add(lblhora4);
		
		lblCapacidad3 = new JLabel("40");
		lblCapacidad3.setHorizontalAlignment(SwingConstants.CENTER);
		lblCapacidad3.setBounds(300, 73, 40, 21);
		lblCapacidad3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		panel.add(lblCapacidad3);
		
		lblCapacidad4 = new JLabel("36");
		lblCapacidad4.setHorizontalAlignment(SwingConstants.CENTER);
		lblCapacidad4.setBounds(300, 104, 40, 21);
		lblCapacidad4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		panel.add(lblCapacidad4);
		
		rbtBus1 = new JRadioButton("");
		rbtBus1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtBus1.setHorizontalAlignment(SwingConstants.CENTER);
		rbtBus1.setBounds(6, 10, 23, 23);
		panel.add(rbtBus1);
		
		rbtBus2 = new JRadioButton("");
		rbtBus2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtBus2.setHorizontalAlignment(SwingConstants.CENTER);
		rbtBus2.setBounds(6, 41, 23, 23);
		panel.add(rbtBus2);
		
		rbtBus3 = new JRadioButton("");
		rbtBus3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtBus3.setHorizontalAlignment(SwingConstants.CENTER);
		rbtBus3.setBounds(6, 72, 23, 23);
		panel.add(rbtBus3);
		
		rbtBus4 = new JRadioButton("");
		rbtBus4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtBus4.setHorizontalAlignment(SwingConstants.CENTER);
		rbtBus4.setBounds(6, 103, 23, 23);
		panel.add(rbtBus4);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				seleccion();
			}
		});
		btnSiguiente.setForeground(Color.BLUE);
		btnSiguiente.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSiguiente.setBounds(358, 484, 142, 35);
		contentPane.add(btnSiguiente);
		
		lblRutas = new JLabel("Rutas");
		lblRutas.setForeground(Color.BLUE);
		lblRutas.setHorizontalAlignment(SwingConstants.CENTER);
		lblRutas.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblRutas.setBounds(86, 42, 68, 21);
		contentPane.add(lblRutas);
		
		lblBus = new JLabel("Bus");
		lblBus.setForeground(Color.BLUE);
		lblBus.setHorizontalAlignment(SwingConstants.CENTER);
		lblBus.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblBus.setBounds(226, 42, 68, 21);
		contentPane.add(lblBus);
		
		lblSalidas = new JLabel("Salidas");
		lblSalidas.setForeground(Color.BLUE);
		lblSalidas.setHorizontalAlignment(SwingConstants.CENTER);
		lblSalidas.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblSalidas.setBounds(348, 42, 68, 21);
		contentPane.add(lblSalidas);
		
		lblDisponibilidad = new JLabel("Disponibilidad");
		lblDisponibilidad.setForeground(Color.BLUE);
		lblDisponibilidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblDisponibilidad.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblDisponibilidad.setBounds(456, 42, 86, 21);
		contentPane.add(lblDisponibilidad);
		
		panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		panel_1.setBounds(181, 193, 404, 134);
		contentPane.add(panel_1);
		
		lblbus5 = new JLabel("Normal");
		lblbus5.setHorizontalAlignment(SwingConstants.CENTER);
		lblbus5.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblbus5.setBackground(Color.WHITE);
		lblbus5.setBounds(46, 11, 93, 21);
		panel_1.add(lblbus5);
		
		lblbus6 = new JLabel("Doble Piso");
		lblbus6.setHorizontalAlignment(SwingConstants.CENTER);
		lblbus6.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblbus6.setBackground(Color.WHITE);
		lblbus6.setBounds(46, 42, 93, 21);
		panel_1.add(lblbus6);
		
		lblhora5 = new JLabel("7 AM");
		lblhora5.setHorizontalAlignment(SwingConstants.CENTER);
		lblhora5.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblhora5.setBackground(Color.WHITE);
		lblhora5.setBounds(179, 11, 67, 21);
		panel_1.add(lblhora5);
		
		lblhora6 = new JLabel("8 AM");
		lblhora6.setHorizontalAlignment(SwingConstants.CENTER);
		lblhora6.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblhora6.setBackground(Color.WHITE);
		lblhora6.setBounds(179, 42, 67, 21);
		panel_1.add(lblhora6);
		
		lblCapacidad5 = new JLabel("40");
		lblCapacidad5.setHorizontalAlignment(SwingConstants.CENTER);
		lblCapacidad5.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblCapacidad5.setBounds(299, 11, 41, 21);
		panel_1.add(lblCapacidad5);
		
		lblCapacidad6 = new JLabel("36");
		lblCapacidad6.setHorizontalAlignment(SwingConstants.CENTER);
		lblCapacidad6.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblCapacidad6.setBounds(299, 42, 41, 21);
		panel_1.add(lblCapacidad6);
		
		lblbus7 = new JLabel("Normal");
		lblbus7.setHorizontalAlignment(SwingConstants.CENTER);
		lblbus7.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblbus7.setBackground(Color.WHITE);
		lblbus7.setBounds(46, 73, 93, 21);
		panel_1.add(lblbus7);
		
		lblbus8 = new JLabel("Doble Piso");
		lblbus8.setHorizontalAlignment(SwingConstants.CENTER);
		lblbus8.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblbus8.setBackground(Color.WHITE);
		lblbus8.setBounds(46, 104, 93, 21);
		panel_1.add(lblbus8);
		
		lblhora7 = new JLabel("7 AM");
		lblhora7.setHorizontalAlignment(SwingConstants.CENTER);
		lblhora7.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblhora7.setBackground(Color.WHITE);
		lblhora7.setBounds(179, 73, 67, 21);
		panel_1.add(lblhora7);
		
		lblhora8 = new JLabel("8 AM");
		lblhora8.setHorizontalAlignment(SwingConstants.CENTER);
		lblhora8.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblhora8.setBackground(Color.WHITE);
		lblhora8.setBounds(179, 104, 67, 21);
		panel_1.add(lblhora8);
		
		lblCapacidad7 = new JLabel("40");
		lblCapacidad7.setHorizontalAlignment(SwingConstants.CENTER);
		lblCapacidad7.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblCapacidad7.setBounds(299, 73, 41, 21);
		panel_1.add(lblCapacidad7);
		
		lblCapacidad8 = new JLabel("36");
		lblCapacidad8.setHorizontalAlignment(SwingConstants.CENTER);
		lblCapacidad8.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblCapacidad8.setBounds(299, 104, 41, 21);
		panel_1.add(lblCapacidad8);
		
		rbtBus5 = new JRadioButton("");
		rbtBus5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtBus5.setHorizontalAlignment(SwingConstants.CENTER);
		rbtBus5.setBounds(6, 10, 23, 23);
		panel_1.add(rbtBus5);
		
		rbtBus6 = new JRadioButton("");
		rbtBus6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtBus6.setHorizontalAlignment(SwingConstants.CENTER);
		rbtBus6.setBounds(6, 41, 23, 23);
		panel_1.add(rbtBus6);
		
		rbtBus7 = new JRadioButton("");
		rbtBus7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtBus7.setHorizontalAlignment(SwingConstants.CENTER);
		rbtBus7.setBounds(6, 72, 23, 23);
		panel_1.add(rbtBus7);
		
		rbtBus8 = new JRadioButton("");
		rbtBus8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtBus8.setHorizontalAlignment(SwingConstants.CENTER);
		rbtBus8.setBounds(6, 103, 23, 23);
		panel_1.add(rbtBus8);
		
		panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		panel_2.setBounds(181, 325, 404, 134);
		contentPane.add(panel_2);
		
		lblbus9 = new JLabel("Normal");
		lblbus9.setHorizontalAlignment(SwingConstants.CENTER);
		lblbus9.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblbus9.setBackground(Color.WHITE);
		lblbus9.setBounds(46, 11, 93, 21);
		panel_2.add(lblbus9);
		
		lblbus10 = new JLabel("Doble Piso");
		lblbus10.setHorizontalAlignment(SwingConstants.CENTER);
		lblbus10.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblbus10.setBackground(Color.WHITE);
		lblbus10.setBounds(46, 42, 93, 21);
		panel_2.add(lblbus10);
		
		lblhora9 = new JLabel("7 AM");
		lblhora9.setHorizontalAlignment(SwingConstants.CENTER);
		lblhora9.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblhora9.setBackground(Color.WHITE);
		lblhora9.setBounds(179, 11, 67, 21);
		panel_2.add(lblhora9);
		
		lblhora10 = new JLabel("8 AM");
		lblhora10.setHorizontalAlignment(SwingConstants.CENTER);
		lblhora10.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblhora10.setBackground(Color.WHITE);
		lblhora10.setBounds(179, 42, 67, 21);
		panel_2.add(lblhora10);
		
		lblCapacidad9 = new JLabel("40");
		lblCapacidad9.setHorizontalAlignment(SwingConstants.CENTER);
		lblCapacidad9.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblCapacidad9.setBounds(299, 11, 41, 21);
		panel_2.add(lblCapacidad9);
		
		lblCapacidad10 = new JLabel("36");
		lblCapacidad10.setHorizontalAlignment(SwingConstants.CENTER);
		lblCapacidad10.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblCapacidad10.setBounds(299, 42, 41, 21);
		panel_2.add(lblCapacidad10);
		
		lblbus11 = new JLabel("Normal");
		lblbus11.setHorizontalAlignment(SwingConstants.CENTER);
		lblbus11.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblbus11.setBackground(Color.WHITE);
		lblbus11.setBounds(46, 73, 93, 21);
		panel_2.add(lblbus11);
		
		lblbus12 = new JLabel("Doble Piso");
		lblbus12.setHorizontalAlignment(SwingConstants.CENTER);
		lblbus12.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblbus12.setBackground(Color.WHITE);
		lblbus12.setBounds(46, 104, 93, 21);
		panel_2.add(lblbus12);
		
		lblhora11 = new JLabel("7 AM");
		lblhora11.setHorizontalAlignment(SwingConstants.CENTER);
		lblhora11.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblhora11.setBackground(Color.WHITE);
		lblhora11.setBounds(179, 73, 67, 21);
		panel_2.add(lblhora11);
		
		lblhora12 = new JLabel("8 AM");
		lblhora12.setHorizontalAlignment(SwingConstants.CENTER);
		lblhora12.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblhora12.setBackground(Color.WHITE);
		lblhora12.setBounds(179, 104, 67, 21);
		panel_2.add(lblhora12);
		
		lblCapacidad11 = new JLabel("40");
		lblCapacidad11.setHorizontalAlignment(SwingConstants.CENTER);
		lblCapacidad11.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblCapacidad11.setBounds(299, 73, 41, 21);
		panel_2.add(lblCapacidad11);
		
		lblCapacidad12 = new JLabel("36");
		lblCapacidad12.setHorizontalAlignment(SwingConstants.CENTER);
		lblCapacidad12.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblCapacidad12.setBounds(299, 104, 41, 21);
		panel_2.add(lblCapacidad12);
		
		rbtBus9 = new JRadioButton("");
		rbtBus9.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtBus9.setHorizontalAlignment(SwingConstants.CENTER);
		rbtBus9.setBounds(6, 10, 23, 23);
		panel_2.add(rbtBus9);
		
		rbtBus10 = new JRadioButton("");
		rbtBus10.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtBus10.setHorizontalAlignment(SwingConstants.CENTER);
		rbtBus10.setBounds(6, 41, 23, 23);
		panel_2.add(rbtBus10);
		
		rbtBus11 = new JRadioButton("");
		rbtBus11.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtBus11.setHorizontalAlignment(SwingConstants.CENTER);
		rbtBus11.setBounds(6, 72, 23, 23);
		panel_2.add(rbtBus11);
		
		rbtBus12 = new JRadioButton("");
		rbtBus12.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtBus12.setHorizontalAlignment(SwingConstants.CENTER);
		rbtBus12.setBounds(6, 103, 23, 23);
		panel_2.add(rbtBus12);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(20, 63, 163, 396);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		rbtRuta1 = new JRadioButton("");
		rbtRuta1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtRuta1.setBounds(6, 49, 144, 23);
		panel_3.add(rbtRuta1);
		
		rbtRuta2 = new JRadioButton("");
		rbtRuta2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtRuta2.setBounds(6, 188, 144, 23);
		panel_3.add(rbtRuta2);
		
		rbtRuta3 = new JRadioButton("");
		rbtRuta3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rbtRuta3.setBounds(6, 316, 144, 23);
		panel_3.add(rbtRuta3);
		
		
		//para que nuestro GUI se muestre centrado
		setLocationRelativeTo(null);
		
		
		//Crea un ejemplar de ButtonGroup.
		ButtonGroup grupo1 = new ButtonGroup();
		grupo1.add(rbtRuta1);
		grupo1.add(rbtRuta2);
		grupo1.add(rbtRuta3);
		
		ButtonGroup grupo2 = new ButtonGroup();
		grupo2.add(rbtBus1);
		grupo2.add(rbtBus2);
		grupo2.add(rbtBus3);
		grupo2.add(rbtBus4);
		grupo2.add(rbtBus5);
		grupo2.add(rbtBus6);
		grupo2.add(rbtBus7);
		grupo2.add(rbtBus8);
		grupo2.add(rbtBus9);
		grupo2.add(rbtBus10);
		grupo2.add(rbtBus11);
		grupo2.add(rbtBus12);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setIcon(new ImageIcon(Vender.class.getResource("/iconos22x22/dialog-cancel-3.png")));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Inicio ir = new Inicio();
				ir.setVisible(true);
				dispose();
			}
		});
		btnCancelar.setForeground(Color.RED);
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCancelar.setBounds(108, 484, 142, 35);
		contentPane.add(btnCancelar);
		
		
		CargarDatos();
		
	}
	public static String ruta="";
	public static String bus= "";
	public static String hora= "";
	public static int cantidad1 = Inicio.cantidadOptima1;
	public static int cantidad2 = Inicio.cantidadOptima2;
	public static int cantidad3 = Inicio.cantidadOptima3;
	public static int cantidad4 = Inicio.cantidadOptima1;
	public static int cantidad5 = Inicio.cantidadOptima1;
	public static int cantidad6 = Inicio.cantidadOptima2;
	public static int cantidad7 = Inicio.cantidadOptima2;
	public static int cantidad8 = Inicio.cantidadOptima3;
	public static int cantidad9 = Inicio.cantidadOptima1;
	public static int cantidad10 = Inicio.cantidadOptima2;
	public static int cantidad11 = Inicio.cantidadOptima3;
	public static int cantidad12 = Inicio.cantidadOptima2;
	
	
	void CargarDatos()
	{

		//Cargar Ruta
		rbtRuta1.setText(Inicio.nombre1);
		rbtRuta2.setText(Inicio.nombre2);
		rbtRuta3.setText(Inicio.nombre3);
		
		//Carga de Buses
		lblbus1.setText(Inicio.Bus1);
		lblbus2.setText(Inicio.Bus2);
		lblbus3.setText(Inicio.Bus3);
		lblbus4.setText(Inicio.Bus1);
		lblbus5.setText(Inicio.Bus1);
		lblbus6.setText(Inicio.Bus2);
		lblbus7.setText(Inicio.Bus2);
		lblbus8.setText(Inicio.Bus3);
		lblbus9.setText(Inicio.Bus1);
		lblbus10.setText(Inicio.Bus2);
		lblbus11.setText(Inicio.Bus3);
		lblbus12.setText(Inicio.Bus2);
		
		//Carga de Horas de Salidas
		lblhora1.setText(Inicio.Hora1);
		lblhora2.setText(Inicio.Hora3);
		lblhora3.setText(Inicio.Hora4);
		lblhora4.setText(Inicio.Hora5);
		lblhora5.setText(Inicio.Hora3);
		lblhora6.setText(Inicio.Hora4);
		lblhora7.setText(Inicio.Hora5);
		lblhora8.setText(Inicio.Hora6);
		lblhora9.setText(Inicio.Hora1);
		lblhora10.setText(Inicio.Hora2);
		lblhora11.setText(Inicio.Hora3);
		lblhora12.setText(Inicio.Hora4);
		
		//Carga de Capacidad
		lblCapacidad1.setText("" + cantidad1);
		lblCapacidad2.setText("" + cantidad2);
		lblCapacidad3.setText("" + cantidad3);
		lblCapacidad4.setText("" + cantidad4);
		lblCapacidad5.setText("" + cantidad5);
		lblCapacidad6.setText("" + cantidad6);
		lblCapacidad7.setText("" + cantidad7);
		lblCapacidad8.setText("" + cantidad8);
		lblCapacidad9.setText("" + cantidad9);
		lblCapacidad10.setText("" + cantidad10);
		lblCapacidad11.setText("" + cantidad11);
		lblCapacidad12.setText("" + cantidad12);
		
	}
	
	void seleccion()
	{
		// evaluando la seleccion de la ruta 1 y el tipo de Bus
		if(rbtRuta1.isSelected() && rbtBus1.isSelected())
		{
			ruta = Inicio.nombre1;
			bus = Inicio.Bus1;
			hora = Inicio.Hora1;
			if(cantidad1==0)
			{
				JOptionPane.showMessageDialog(this, "El Bus ya esta Lleno\neliga otra opcion\nGracias");
			}else
			{
				Bus_Normal_1 ir = new Bus_Normal_1();
				ir.setVisible(true);
				dispose();
			}
		}else if(rbtRuta1.isSelected() && rbtBus2.isSelected())
		{
			ruta = Inicio.nombre1;
			bus = Inicio.Bus2;
			hora = Inicio.Hora3;
			if(cantidad2==0)
			{
				JOptionPane.showMessageDialog(this, "El Bus ya esta Lleno\neliga otra opcion\nGracias");
			}else
			{
				Bus_DoblePiso_1 ir = new Bus_DoblePiso_1();
				ir.setVisible(true);
				dispose();
			}
		}else if(rbtRuta1.isSelected() && rbtBus3.isSelected())
		{
			ruta = Inicio.nombre1;
			bus = Inicio.Bus3;
			hora = Inicio.Hora4;
			if(cantidad3==0)
			{
				JOptionPane.showMessageDialog(this, "El Bus ya esta Lleno\neliga otra opcion\nGracias");
			}else
			{
				Bus_Cama_1 ir = new Bus_Cama_1();
				ir.setVisible(true);
				dispose();
			}
		}else if(rbtRuta1.isSelected() && rbtBus4.isSelected())
		{
			ruta = Inicio.nombre1;
			bus = Inicio.Bus1;
			hora = Inicio.Hora5;
			if(cantidad4==0)
			{
				JOptionPane.showMessageDialog(this, "El Bus ya esta Lleno\neliga otra opcion\nGracias");
			}else
			{
				Bus_Normal_2 ir = new Bus_Normal_2();
				ir.setVisible(true);
				dispose();			
			}
		}
		// evaluando la seleccion de la ruta 2 y el tipo de Bus
		else if(rbtRuta2.isSelected() && rbtBus5.isSelected())
		{
			ruta = Inicio.nombre2;
			bus = Inicio.Bus1;
			hora = Inicio.Hora3;
			if(cantidad5==0)
			{
				JOptionPane.showMessageDialog(this, "El Bus ya esta Lleno\neliga otra opcion\nGracias");
			}else
			{
				Bus_Normal_3 ir = new Bus_Normal_3();
				ir.setVisible(true);
				dispose();	
			}
		}else if(rbtRuta2.isSelected() && rbtBus6.isSelected())
		{
			ruta = Inicio.nombre2;
			bus = Inicio.Bus2;
			hora = Inicio.Hora4;
			if(cantidad6==0)
			{
				JOptionPane.showMessageDialog(this, "El Bus ya esta Lleno\neliga otra opcion\nGracias");
			}else
			{
				Bus_DoblePiso_2 ir = new Bus_DoblePiso_2();
				ir.setVisible(true);
				dispose();
			}
			
		}else if(rbtRuta2.isSelected() && rbtBus7.isSelected())
		{
			ruta = Inicio.nombre2;
			bus = Inicio.Bus2;
			hora = Inicio.Hora5;
			if(cantidad7==0)
			{
				JOptionPane.showMessageDialog(this, "El Bus ya esta Lleno\neliga otra opcion\nGracias");
			}else
			{
				Bus_DoblePiso_3 ir = new Bus_DoblePiso_3();
				ir.setVisible(true);
				dispose();
			}
		}else if(rbtRuta2.isSelected() && rbtBus8.isSelected())
		{
			ruta = Inicio.nombre2;
			bus = Inicio.Bus3;
			hora = Inicio.Hora6;
			if(cantidad8==0)
			{
				JOptionPane.showMessageDialog(this, "El Bus ya esta Lleno\neliga otra opcion\nGracias");
			}else
			{
				Bus_Cama_2 ir = new Bus_Cama_2();
				ir.setVisible(true);
				dispose();
			}
		}
		// evaluando la seleccion de la ruta 3 y el tipo de Bus
		else if(rbtRuta3.isSelected() && rbtBus9.isSelected())
		{
			ruta = Inicio.nombre3;
			bus = Inicio.Bus1;
			hora = Inicio.Hora1;
			if(cantidad9==0)
			{
				JOptionPane.showMessageDialog(this, "El Bus ya esta Lleno\neliga otra opcion\nGracias");
			}else
			{
				Bus_Normal_4 ir = new Bus_Normal_4();
				ir.setVisible(true);
				dispose();	
			}
			
		}else if(rbtRuta3.isSelected() && rbtBus10.isSelected())
		{
			ruta = Inicio.nombre3;
			bus = Inicio.Bus2;
			hora = Inicio.Hora2;
			if(cantidad10==0)
			{
				JOptionPane.showMessageDialog(this, "El Bus ya esta Lleno\neliga otra opcion\nGracias");
			}else
			{
				Bus_DoblePiso_4 ir = new Bus_DoblePiso_4();
				ir.setVisible(true);
				dispose();
			}
			
		}else if(rbtRuta3.isSelected() && rbtBus11.isSelected())
		{
			ruta = Inicio.nombre3;
			bus = Inicio.Bus3;
			hora = Inicio.Hora3;
			if(cantidad11==0)
			{
				JOptionPane.showMessageDialog(this, "El Bus ya esta Lleno\neliga otra opcion\nGracias");
			}else
			{
				Bus_Cama_3 ir = new Bus_Cama_3();
				ir.setVisible(true);
				dispose();
			}
		}else if(rbtRuta3.isSelected() && rbtBus12.isSelected())
		{
			ruta = Inicio.nombre3;
			bus = Inicio.Bus2;
			hora = Inicio.Hora4;
			if(cantidad12==0)
			{
				JOptionPane.showMessageDialog(this, "El Bus ya esta Lleno\neliga otra opcion\nGracias");
			}else
			{
				Bus_DoblePiso_5 ir = new Bus_DoblePiso_5();
				ir.setVisible(true);
				dispose();
			}
		}else
		{
			JOptionPane.showMessageDialog(null, "Error Intente de nuevo");
		}
		
	}
	
}
