package Proyecto;

import java.awt.BorderLayout;



import java.awt.EventQueue;

import javax.naming.directory.ModificationItem;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import java.awt.Font;
import java.util.GregorianCalendar;
import java.awt.Toolkit;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Insets;
import java.awt.Label;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JInternalFrame;
import javax.swing.JButton;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JToolBar;


public class Inicio extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu menu_Archivo;
	private JMenuItem mnSalir;
	private JMenu menu_Mantenimiento;
	private JMenuItem mnModificar;
	private JMenuItem mn_Lista;
	private JMenu menu_Ventas;
	private JMenuItem mnVender;
	private JMenuItem mn_Reporte;
	private JMenu mnConfiguracin;
	private JMenuItem mnDescuentos;
	private JMenuItem mnObsequio;
	private JMenuItem mnOptimoVendido;
	private JMenu menu_Ayuda;
	private JMenuItem mnAcerca;
	private JLabel lblhora;
	private JLabel lbldia;
	private JMenuItem mntmCerrarAplicacin;
	private JLabel lblNewLabel;
	private JLabel lblUsuario;


	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					//hace visible el jframe
					Inicio menu = new Inicio();
					menu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	
	
	public Inicio() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(Inicio.class.getResource("/imagenes/carro1.png")));
		//evento para que cuando se presione la X de la ventana, salga un mensaje de alerta
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) 
			{
				//llamo al metodo cerrar
				cerrar();
			}
		});
		
		setResizable(false);
		setTitle("Ruta 21");
		
		//se coloca asi para que no se cierre la ventana al presionar la X
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 706, 513);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setForeground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setIcon(new ImageIcon(Inicio.class.getResource("/iconos16x16/system-shutdown-2.png")));
		btnSalir.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnSalir.setForeground(new Color(255, 0, 0));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				cerrar();
			}
		});
		btnSalir.setBounds(573, 353, 95, 25);
		contentPane.add(btnSalir);
		
		lblhora = new JLabel("Hora");
		lblhora.setForeground(Color.BLUE);
		lblhora.setFont(new Font("Verdana", Font.PLAIN, 12));
		lblhora.setBounds(567, 32, 101, 19);
		contentPane.add(lblhora);
		
		lbldia = new JLabel("6/<dynamic>/2018");
		lbldia.setForeground(Color.BLUE);
		lbldia.setFont(new Font("Verdana", Font.PLAIN, 12));
		lbldia.setBounds(528, 75, 140, 19);
		contentPane.add(lbldia);
		
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 703, 21);
		contentPane.add(menuBar);
		menuBar.setMargin(new Insets(5, 5, 5, 5));
		menuBar.setForeground(Color.BLUE);
		menuBar.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		menu_Archivo = new JMenu("Archivo");
		menu_Archivo.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		menu_Archivo.setForeground(Color.BLUE);
		menuBar.add(menu_Archivo);
		
		mnSalir = new JMenuItem("Salir");
		mnSalir.setIcon(new ImageIcon(Inicio.class.getResource("/iconos16x16/application-exit.png")));
		mnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//llama al jframe Contraseña
				Login atras = new Login();
				atras.setVisible(true);
				//hace que la ventana actual (Inicio se cierre) mas no se pare la ejecucion del programa
				dispose();
			}
		});
		menu_Archivo.add(mnSalir);
		
		mntmCerrarAplicacin = new JMenuItem("Cerrar Aplicaci\u00F3n");
		mntmCerrarAplicacin.setIcon(new ImageIcon(Inicio.class.getResource("/iconos16x16/system-shutdown-2.png")));
		mntmCerrarAplicacin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				cerrar();
			}
		});
		menu_Archivo.add(mntmCerrarAplicacin);
		
		menu_Mantenimiento = new JMenu("Mantenimiento");
		menu_Mantenimiento.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		menu_Mantenimiento.setForeground(Color.BLUE);
		menuBar.add(menu_Mantenimiento);
		
		mnModificar = new JMenuItem("Modificar Pasaje");
		mnModificar.setIcon(new ImageIcon(Inicio.class.getResource("/iconos16x16/modificar.png")));
		mnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				Modificar_Pasajes modifica = new Modificar_Pasajes();
				modifica.setVisible(true);
				dispose();
			}
		});
		menu_Mantenimiento.add(mnModificar);
		
		mn_Lista = new JMenuItem("Lista de Pasajes");
		mn_Lista.setIcon(new ImageIcon(Inicio.class.getResource("/iconos16x16/presentacion.png")));
		mn_Lista.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				Lista_Pasajes lista = new Lista_Pasajes();
				lista.setVisible(true);
				dispose();
			}
		});
		menu_Mantenimiento.add(mn_Lista);
		
		menu_Ventas = new JMenu("Ventas");
		menu_Ventas.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		menu_Ventas.setForeground(Color.BLUE);
		menuBar.add(menu_Ventas);
		
		mnVender = new JMenuItem("Vender");
		mnVender.setIcon(new ImageIcon(Inicio.class.getResource("/iconos16x16/carro.png")));
		mnVender.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				//llama al jframe vender
				Vender venta = new Vender();
				venta.setVisible(true);
				//hace que la ventana actual (Inicio se cierre) mas no se pare la ejecucion del programa
				dispose();
			}
		});
		menu_Ventas.add(mnVender);
		
		mn_Reporte = new JMenuItem("Generar Reportes");
		mn_Reporte.setIcon(new ImageIcon(Inicio.class.getResource("/iconos16x16/Reporte.png")));
		mn_Reporte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Reporte ir = new Reporte();
				ir.setVisible(true);
				dispose();
			}
		});
		
		mm_Consulta = new JMenuItem("Consultas");
		mm_Consulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Consultas ver = new Consultas();
				ver.setVisible(true);
				dispose();
			}
		});
		mm_Consulta.setIcon(new ImageIcon(Inicio.class.getResource("/iconos16x16/lista.png")));
		menu_Ventas.add(mm_Consulta);
		menu_Ventas.add(mn_Reporte);
		
		mnConfiguracin = new JMenu("Configuraci\u00F3n");
		mnConfiguracin.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		mnConfiguracin.setForeground(Color.BLUE);
		menuBar.add(mnConfiguracin);
		
		mnDescuentos = new JMenuItem("Configurar Descuentos");
		mnDescuentos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				Configurar_Descuentos ir = new Configurar_Descuentos();
				ir.setVisible(true);
				dispose();
			}
		});
		mnConfiguracin.add(mnDescuentos);
		
		mnObsequio = new JMenuItem("Configurar Obsequio");
		mnObsequio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				Configurar_Obsequio ir = new Configurar_Obsequio();
				ir.setVisible(true);
				dispose();
			}
		});
		mnConfiguracin.add(mnObsequio);
		
		mnOptimoVendido = new JMenuItem("Configurar Incremento de Pasaje");
		mnOptimoVendido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Configurar_Incremento ir = new Configurar_Incremento();
				ir.setVisible(true);
				dispose();
			}
		});
		mnConfiguracin.add(mnOptimoVendido);
		
		menu_Ayuda = new JMenu("Ayuda");
		menu_Ayuda.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		menu_Ayuda.setForeground(Color.BLUE);
		menuBar.add(menu_Ayuda);
		
		mnAcerca = new JMenuItem("Acerca de ruta 21");
		mnAcerca.setIcon(new ImageIcon(Inicio.class.getResource("/iconos16x16/system-file-manager-5.png")));
		mnAcerca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				//llama al jframe acerca
				Acerca_de menu= new Acerca_de();
				menu.setVisible(true);
				//hace que la ventana actual (Inicio se cierre) mas no se pare la ejecucion del programa
				dispose();
			}
		});
		menu_Ayuda.add(mnAcerca);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Inicio.class.getResource("/imagenes/Fondo.jpg")));
		lblNewLabel.setBounds(0, 21, 703, 430);
		contentPane.add(lblNewLabel);
		
		//para que nuestro GUI se muestre centrado
		setLocationRelativeTo(null);
		
		
		lblUsuario = new JLabel("");
		lblUsuario.setIcon(new ImageIcon(Inicio.class.getResource("/iconos22x22/edit-user.png")));
		lblUsuario.setBackground(new Color(0, 255, 0));
		lblUsuario.setForeground(new Color(0, 0, 255));
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsuario.setBounds(0, 450, 703, 34);
		contentPane.add(lblUsuario);
		
		
		//hilo de la hora -- llamo ala clase hora
		hora hilo= new hora(lblhora);
		//inicio el hilo
		hilo.start();
		//fecha
		fecha();
		
		lblUsuario.setText("USUARIO: " + Usuario);
	}
	
	public static String Usuario = "DESCONOCIDO";
	
	
	public void fecha()
	{
		//llamo al metodo fecha
		String fecha = Fecha();
		lbldia.setText(fecha);	
	}
	
	public String nombre(int mes)
	{
		switch (mes)
		{
		case 1: return "Enero";
		case 2: return "Febrero";
		case 3: return "Marzo";
		case 4: return "Abril";
		case 5: return "Mayo";
		case 6: return "Junio";
		case 7: return "Julio";
		case 8: return "Agosto";
		case 9: return "Septiembre";
		case 10: return "Octubre";
		case 11: return "Noviembre";
		case 12: return "Diciembre";
		}
		return "Error";
	}

	public String Fecha()
	{
		//importo la libreria GregorianCalendar para hacer la funcion de fecha
		GregorianCalendar fecha = new GregorianCalendar();
		//declaro como entero el dia
		int dia = fecha.get(fecha.DAY_OF_MONTH);
		//declaro como entero el mes
		int mes = fecha.get(fecha.MONTH);
		//declaro como entero el año
		int a�o = fecha.get(fecha.YEAR);
		// le asigno a mifecha el formtato dia/mes/año
		String mifecha = String.valueOf(dia)+"/"+nombre(mes)+"/"+String.valueOf(a�o);
		//retorna mifecha
		return mifecha;
	}
	
	
	void cerrar(){
		Object [] opciones ={"Aceptar","Cancelar"};
		int eleccion = JOptionPane.showOptionDialog(this,"En realidad desea realizar cerrar la aplicacion","Mensaje de Confirmacion",
		JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,opciones,"Aceptar");
		if (eleccion == JOptionPane.YES_OPTION)
		{
			Cerrar_Aplicacion cerrar = new Cerrar_Aplicacion();
			cerrar.setVisible(true);
			dispose();
		}
	}
	
	// Datos minimos de la Primera Ruta
	public static String nombre1 = "Trujillo - Chiclayo";
	public static double precio1 = 30.0;

	// Datos minimos de la Segunda Ruta
	public static String nombre2 = "Trujillo - Lima";
	public static double precio2 = 50.0;
	
	// Datos minimos de la Tercera Ruta
	public static String nombre3 = "Trujillo - Chimbote";
	public static double precio3 = 20.0;
	
	
	//incremento del pasaje segun el Bus Seleccionado
	
	public static String Bus1 = "Normal";
	public static double incremento1 = 0.0;
	
	public static String Bus2 = "Doble Piso";
	public static double incremento2 = 0.25;
	
	public static String Bus3 = "Bus Cama";
	public static double incremento3 = 0.50;
	
	
	
	//Descuento por cantidad de Pasajes adquiridos
	//si adquiere 3 pasajes
	public static double descuento1 = 0.05; 
	//si adquiere 5 pasajes
	public static double descuento2 = 0.07;
	//si adquiere mas de 8 pasajes
	public static double descuento3 = 0.09;

	
	//Salida del Bus pasaje segun la Hora Seleccionada
	
	public static String Hora1 = "8 AM";
	public static String Hora2 = "9 AM";
	public static String Hora3 = "10 AM";
	public static String Hora4 = "12 PM";
	public static String Hora5 = "3 PM";
	public static String Hora6 = "8 PM";
	
	// Cantidad optima de Pasajes vendidos por Bus
	public static int cantidadOptima1 = 52;
	public static int cantidadOptima2 = 64;
	public static int cantidadOptima3 = 60;

	
	// Importe a pagar minimo para obtener el obsequio
	public static int importeMinimoObsequiable = 140;
	
	// Obsequio por importe minimo
	public static String obsequio = "Billetera";
	
	// Número de cliente que recibe el premio sorpresa
	public static int numeroClienteSorpresa = 3;
	
	// Premio sorpresa
	public static String premioSorpresa = " Polo(s)";
	private JMenuItem mm_Consulta;
}
