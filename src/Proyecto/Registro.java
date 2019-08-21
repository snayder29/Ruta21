package Proyecto;

import java.awt.BorderLayout;
import Clases.Claseregistro;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.omg.PortableServer.ImplicitActivationPolicyOperations;

import Arreglos.ArregloRegistro;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JSlider;
import java.awt.ScrollPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Registro extends JFrame {

	private JPanel contentPane;
	private JTextField txtnombre;
	private JTextField txtnume;
	private JTextField txtedad;
	private JComboBox cboDocumento;
	private JComboBox cboSexo;
	private JTextArea txtS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro frame = new Registro();
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
	public Registro() {
		setResizable(false);
		setTitle("Registrar datos de Usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 565, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombres :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 51, 105, 22);
		contentPane.add(lblNewLabel);
		
		txtnombre = new JTextField();
		txtnombre.setBounds(125, 51, 262, 23);
		contentPane.add(txtnombre);
		txtnombre.setColumns(10);
		
		JLabel lblDni = new JLabel("Tipo de doc:");
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDni.setBounds(10, 18, 105, 22);
		contentPane.add(lblDni);
		
		cboDocumento = new JComboBox();
		cboDocumento.setModel(new DefaultComboBoxModel(new String[] {"DNI", "Pasaporte", "Carnet"}));
		cboDocumento.setBounds(125, 18, 105, 23);
		contentPane.add(cboDocumento);
		
		JLabel lblNumDoc = new JLabel("Num. doc:");
		lblNumDoc.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNumDoc.setBounds(283, 18, 105, 22);
		contentPane.add(lblNumDoc);
		
		txtnume = new JTextField();
		txtnume.setColumns(10);
		txtnume.setBounds(398, 18, 132, 23);
		contentPane.add(txtnume);
		
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEdad.setBounds(10, 84, 105, 22);
		contentPane.add(lblEdad);
		
		txtedad = new JTextField();
		txtedad.setColumns(10);
		txtedad.setBounds(125, 84, 70, 23);
		contentPane.add(txtedad);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSexo.setBounds(283, 84, 105, 22);
		contentPane.add(lblSexo);
		
		cboSexo = new JComboBox();
		cboSexo.setModel(new DefaultComboBoxModel(new String[] {"Hombre", "Mujer"}));
		cboSexo.setBounds(398, 84, 105, 23);
		contentPane.add(cboSexo);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(15, 140, 529, 240);
		contentPane.add(scrollPane);
		
		txtS = new JTextArea();
		txtS.setEditable(false);
		scrollPane.setViewportView(txtS);
		
		JButton button = new JButton("Atras");
		button.setIcon(new ImageIcon(Registro.class.getResource("/iconos22x22/edit-undo-6.png")));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Bus_Normal_1 retroceder = new Bus_Normal_1();
				retroceder.setVisible(true);
				dispose();
			}
		});
		button.setForeground(new Color(255, 0, 0));
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button.setBounds(52, 391, 116, 32);
		contentPane.add(button);
		
		JButton btnInicio = new JButton("Aceptar");
		btnInicio.setIcon(new ImageIcon(Registro.class.getResource("/iconos22x22/dialog-accept.png")));
		btnInicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				guardar();
			}
		});
		btnInicio.setForeground(new Color(0, 128, 0));
		btnInicio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnInicio.setBounds(388, 391, 116, 32);
		contentPane.add(btnInicio);
		
		JButton btnAceptar = new JButton("Mostrar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				mostar();
			}
		});
		btnAceptar.setForeground(Color.BLUE);
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAceptar.setBounds(220, 391, 116, 32);
		contentPane.add(btnAceptar);
		
		setLocationRelativeTo(null);
		
		
	}
	
	ArregloRegistro aa = new ArregloRegistro();
	
	
	public static double total_1 = 0;
	public static double total_2 = 0;
	public static double total_3 = 0;
	public static double total_4 = 0;
	public static double total_5 = 0;
	public static double total_6 = 0;
	public static double total_7 = 0;
	public static double total_8 = 0;
	public static double total_9 = 0;
	public static double total_10 = 0;
	public static double total_11 = 0;
	public static double total_12 = 0;
	
	
	public static int regalos1 = 0;
	public static int regalos2 = 0;
	public static int regalos3 = 0;
	public static int regalos4 = 0;
	public static int regalos5 = 0;
	public static int regalos6 = 0;
	public static int regalos7 = 0;
	public static int regalos8 = 0;
	public static int regalos9 = 0;
	public static int regalos10 = 0;
	public static int regalos11 = 0;
	public static int regalos12= 0;
	
	public static int polos1 = 0;
	public static int polos2 = 0;
	public static int polos3 = 0;
	public static int polos4 = 0;
	public static int polos5 = 0;
	public static int polos6 = 0;
	public static int polos7 = 0;
	public static int polos8 = 0;
	public static int polos9 = 0;
	public static int polos10 = 0;
	public static int polos11 = 0;
	public static int polos12 = 0;
	
	
	String nombre, num_doc, a, b, regalo = "Ningun Regalo", sorpresa = "Ninguna Sopresa";
	int tipo_doc, sexo,polo=0,edad, seleccion;
	double ip, desc, incremento, sub, total;
	
	String as = null, bus,ruta,hora;
	int cant = 0;

	
	void leerdato()
	{
		nombre = txtnombre.getText();
		tipo_doc = cboDocumento.getSelectedIndex();
		num_doc = txtnume.getText();
		edad = Integer.parseInt(txtedad.getText());
		sexo = cboSexo.getSelectedIndex();
		
		try {
	
		switch(tipo_doc)
		{
		case 0: a = "DNI";
			if(num_doc.length() != 8 || num_doc == null)
			{
				JOptionPane.showMessageDialog(null," Error al ingresar datos, \n intentelo de nuevo");
				txtnume.requestFocus();
			};break;
		case 1: a = "PASAPORTE";
			if(num_doc.length() != 8 || num_doc == null)
			{
				JOptionPane.showMessageDialog(null," Error al ingresar datos, \n intentelo de nuevo");
				txtnume.requestFocus();
			};break;
		case 2: a = "CARNET";
			if(num_doc.length() != 8 || num_doc == null)
			{
				JOptionPane.showMessageDialog(null," Error al ingresar datos, \n intentelo de nuevo");
				txtnume.requestFocus();
			};break;
		}
		
		if(edad < 18)
		{
			if(JOptionPane.showConfirmDialog(null, "¿Los datos ingresados pertenecen aun menor de edad \n"
					+ " tiene permiso de sus padres y/o tutor?","Confirmacion", JOptionPane.YES_NO_OPTION)==0)
			{
				mostar();
			}
			else
			{
				JOptionPane.showMessageDialog(null,"Imposible realizar operacion");
				txtedad.requestFocus();
			}
		}
	
		
		switch(sexo)
		{
		case 0: b = "Hombre";break;
		case 1: b = "Mujer";break;
		}
		
		/*
		Claseregistro r = new Claseregistro(nombre,a,num_doc,b,edad);
		aa.adicionar(r);
		aa.grabarregistro();
		*/
		//listar();
		
		}
		catch (Exception e) {
			error("Imposible realizar operacion \n faltan datos");
		}
		
		
		if(Vender.ruta == Inicio.nombre1)
		{
			if(Vender.hora == Inicio.Hora1)
			{
				seleccion=1;
				
				//calculando el importe a pagar
				ip = Inicio.precio1 * Bus_Normal_1.cantidad;
				
				//calculando el incremento por tipo de Bus
				incremento = ip * Inicio.incremento1;
				sub= ip + incremento;
				
				//calculando el descuento
				if(Bus_Normal_1.cantidad == 3)
				{
					desc = ip * Inicio.descuento1;
				}else if(Bus_Normal_1.cantidad == 5)
				{
					desc = ip * Inicio.descuento2;
				}else if(Bus_Normal_1.cantidad >=8)
				{
					desc = ip * Inicio.descuento3;
				}
				total = sub - desc;
				total_1+=total;
				
				//calculando para el obsequio
				if(total >Inicio.importeMinimoObsequiable)
				{
					regalo = Inicio.obsequio;
					regalos1++;
				}
				
				polo = Bus_Normal_1.cantidad/Inicio.numeroClienteSorpresa;
				if(polo != 0)
				{
					sorpresa = Inicio.premioSorpresa;
					polos1+=polo;
				}
				
			}else if(Vender.hora == Inicio.Hora3)
			{
				seleccion=2;
				
				//calculando el importe a pagar
				ip = Inicio.precio1 * Bus_DoblePiso_1.cantidad;
				
				//calculando el incremento por tipo de Bus
				incremento = ip * Inicio.incremento2;
				sub= ip + incremento;
				
				//calculando el descuento
				if(Bus_DoblePiso_1.cantidad == 3)
				{
					desc = ip * Inicio.descuento1;
				}else if(Bus_DoblePiso_1.cantidad == 5)
				{
					desc = ip * Inicio.descuento2;
				}else if(Bus_DoblePiso_1.cantidad >=8)
				{
					desc = ip * Inicio.descuento3;
				}
				total = sub - desc;
				total_2+=total;
				
				//calculando para el obsequio
				if(total >Inicio.importeMinimoObsequiable)
				{
					regalo = Inicio.obsequio;
					regalos2+=polo;
				}
				
				polo = Bus_DoblePiso_1.cantidad/Inicio.numeroClienteSorpresa;
				if(polo != 0)
				{
					sorpresa = Inicio.premioSorpresa;
					polos2++;
				}
				
			}else if(Vender.hora == Inicio.Hora4)
			{
				seleccion=3;
				
				//calculando el importe a pagar
				ip = Inicio.precio1 * Bus_Cama_1.cantidad;
				
				//calculando el incremento por tipo de Bus
				incremento = ip * Inicio.incremento3;
				sub= ip + incremento;
				
				//calculando el descuento
				if(Bus_Cama_1.cantidad == 3)
				{
					desc = ip * Inicio.descuento1;
				}else if(Bus_Cama_1.cantidad == 5)
				{
					desc = ip * Inicio.descuento2;
				}else if(Bus_Cama_1.cantidad >=8)
				{
					desc = ip * Inicio.descuento3;
				}
				total = sub - desc;
				total_3+=total;
				
				//calculando para el obsequio
				if(total >Inicio.importeMinimoObsequiable)
				{
					regalo = Inicio.obsequio;
					regalos3++;
				}
				
				polo = Bus_Cama_1.cantidad/Inicio.numeroClienteSorpresa;
				if(polo != 0)
				{
					sorpresa = Inicio.premioSorpresa;
					polos3+=polo;
				}
				
			}else
			{
				seleccion=4;
				//calculando el importe a pagar
				ip = Inicio.precio1 * Bus_Normal_2.cantidad;
				
				//calculando el incremento por tipo de Bus
				incremento = ip * Inicio.incremento2;
				sub= ip + incremento;
				
				//calculando el descuento
				if(Bus_Normal_2.cantidad == 3)
				{
					desc = ip * Inicio.descuento1;
				}else if(Bus_Normal_2.cantidad == 5)
				{
					desc = ip * Inicio.descuento2;
				}else if(Bus_Normal_2.cantidad >=8)
				{
					desc = ip * Inicio.descuento3;
				}
				total = sub - desc;
				total_4+=total;
				
				//calculando para el obsequio
				if(total >Inicio.importeMinimoObsequiable)
				{
					regalo = Inicio.obsequio;
					regalos4++;
				}
				
				polo = Bus_Normal_2.cantidad/Inicio.numeroClienteSorpresa;
				if(polo != 0)
				{
					sorpresa = Inicio.premioSorpresa;
					polos4+=polo;
				}
			}
			
		}else if(Vender.ruta == Inicio.nombre2)
		{
			if(Vender.hora == Inicio.Hora3)
			{
				seleccion=5;
				
				//calculando el importe a pagar
				ip = Inicio.precio2 * Bus_Normal_3.cantidad;
				
				//calculando el incremento por tipo de Bus
				incremento = ip * Inicio.incremento1;
				sub= ip + incremento;
				
				//calculando el descuento
				if(Bus_Normal_3.cantidad == 3)
				{
					desc = ip * Inicio.descuento1;
				}else if(Bus_Normal_3.cantidad == 5)
				{
					desc = ip * Inicio.descuento2;
				}else if(Bus_Normal_3.cantidad >=8)
				{
					desc = ip * Inicio.descuento3;
				}
				total = sub - desc;
				total_5+=total;
				
				//calculando para el obsequio
				if(total >Inicio.importeMinimoObsequiable)
				{
					regalo = Inicio.obsequio;
					regalos5++;
				}
				
				polo = Bus_Normal_3.cantidad/Inicio.numeroClienteSorpresa;
				if(polo != 0)
				{
					sorpresa = Inicio.premioSorpresa;
					polos5+=polo;
				}
				
			}else if(Vender.hora == Inicio.Hora4)
			{
				seleccion=6;
				
				//calculando el importe a pagar
				ip = Inicio.precio2 * Bus_DoblePiso_2.cantidad;
				
				//calculando el incremento por tipo de Bus
				incremento = ip * Inicio.incremento2;
				sub= ip + incremento;
				
				//calculando el descuento
				if(Bus_DoblePiso_2.cantidad == 3)
				{
					desc = ip * Inicio.descuento1;
				}else if(Bus_DoblePiso_2.cantidad == 5)
				{
					desc = ip * Inicio.descuento2;
				}else if(Bus_DoblePiso_2.cantidad >=8)
				{
					desc = ip * Inicio.descuento3;
				}
				total = sub - desc;
				total_6+=total;
				
				//calculando para el obsequio
				if(total >Inicio.importeMinimoObsequiable)
				{
					regalo = Inicio.obsequio;
					regalos6++;
				}
				
				polo = Bus_DoblePiso_2.cantidad/Inicio.numeroClienteSorpresa;
				if(polo != 0)
				{
					sorpresa = Inicio.premioSorpresa;
					polos6+=polo;
				}
				
			}else if(Vender.hora == Inicio.Hora5)
			{
				seleccion=7;
				
				//calculando el importe a pagar
				ip = Inicio.precio2 * Bus_DoblePiso_3.cantidad;
				
				//calculando el incremento por tipo de Bus
				incremento = ip * Inicio.incremento2;
				sub= ip + incremento;
				
				//calculando el descuento
				if(Bus_DoblePiso_3.cantidad == 3)
				{
					desc = ip * Inicio.descuento1;
				}else if(Bus_DoblePiso_3.cantidad == 5)
				{
					desc = ip * Inicio.descuento2;
				}else if(Bus_DoblePiso_3.cantidad >=8)
				{
					desc = ip * Inicio.descuento3;
				}
				total = sub - desc;
				total_7+=total;
				
				//calculando para el obsequio
				if(total >Inicio.importeMinimoObsequiable)
				{
					regalo = Inicio.obsequio;
					regalos7+=polo;
				}
				
				polo = Bus_DoblePiso_3.cantidad/Inicio.numeroClienteSorpresa;
				if(polo != 0)
				{
					sorpresa = Inicio.premioSorpresa;
					polos7++;
				}
				
			}else
			{
				seleccion=8;
				//calculando el importe a pagar
				ip = Inicio.precio2 * Bus_Cama_2.cantidad;
				
				//calculando el incremento por tipo de Bus
				incremento = ip * Inicio.incremento3;
				sub= ip + incremento;
				
				//calculando el descuento
				if(Bus_Cama_2.cantidad == 3)
				{
					desc = ip * Inicio.descuento1;
				}else if(Bus_Cama_2.cantidad == 5)
				{
					desc = ip * Inicio.descuento2;
				}else if(Bus_Cama_2.cantidad >=8)
				{
					desc = ip * Inicio.descuento3;
				}
				total = sub - desc;
				total_8+=total;
				
				//calculando para el obsequio
				if(total >Inicio.importeMinimoObsequiable)
				{
					regalo = Inicio.obsequio;
					regalos8++;
				}
				
				polo = Bus_Cama_2.cantidad/Inicio.numeroClienteSorpresa;
				if(polo != 0)
				{
					sorpresa = Inicio.premioSorpresa;
					polos8+=polo;
				}
			}
			
		}else if(Vender.ruta == Inicio.nombre3)
		{
			if(Vender.hora == Inicio.Hora1)
			{
				seleccion=9;
				
				//calculando el importe a pagar
				ip = Inicio.precio3 * Bus_Normal_4.cantidad;
				
				//calculando el incremento por tipo de Bus
				incremento = ip * Inicio.incremento1;
				sub= ip + incremento;
				
				//calculando el descuento
				if(Bus_Normal_4.cantidad == 3)
				{
					desc = ip * Inicio.descuento1;
				}else if(Bus_Normal_4.cantidad == 5)
				{
					desc = ip * Inicio.descuento2;
				}else if(Bus_Normal_4.cantidad >=8)
				{
					desc = ip * Inicio.descuento3;
				}
				total = sub - desc;
				total_9+=total;
				
				//calculando para el obsequio
				if(total >Inicio.importeMinimoObsequiable)
				{
					regalo = Inicio.obsequio;
					regalos9++;
				}
				
				polo = Bus_Normal_4.cantidad/Inicio.numeroClienteSorpresa;
				if(polo != 0)
				{
					sorpresa = Inicio.premioSorpresa;
					polos9+=polo;
				}
				
			}else if(Vender.hora == Inicio.Hora2)
			{
				seleccion=10;
				
				//calculando el importe a pagar
				ip = Inicio.precio3 * Bus_DoblePiso_4.cantidad;
				
				//calculando el incremento por tipo de Bus
				incremento = ip * Inicio.incremento2;
				sub= ip + incremento;
				
				//calculando el descuento
				if(Bus_DoblePiso_4.cantidad == 3)
				{
					desc = ip * Inicio.descuento1;
				}else if(Bus_DoblePiso_4.cantidad == 5)
				{
					desc = ip * Inicio.descuento2;
				}else if(Bus_DoblePiso_4.cantidad >=8)
				{
					desc = ip * Inicio.descuento3;
				}
				total = sub - desc;
				total_10+=total;
				
				//calculando para el obsequio
				if(total >Inicio.importeMinimoObsequiable)
				{
					regalo = Inicio.obsequio;
					regalos10++;
				}
				
				polo = Bus_DoblePiso_4.cantidad/Inicio.numeroClienteSorpresa;
				if(polo != 0)
				{
					sorpresa = Inicio.premioSorpresa;
					polos10+=polo;
				}
				
			}else if(Vender.hora == Inicio.Hora3)
			{
				seleccion=11;
				
				//calculando el importe a pagar
				ip = Inicio.precio3 * Bus_Cama_3.cantidad;
				
				//calculando el incremento por tipo de Bus
				incremento = ip * Inicio.incremento3;
				sub= ip + incremento;
				
				//calculando el descuento
				if(Bus_Cama_3.cantidad == 3)
				{
					desc = ip * Inicio.descuento1;
				}else if(Bus_Cama_3.cantidad == 5)
				{
					desc = ip * Inicio.descuento2;
				}else if(Bus_Cama_3.cantidad >=8)
				{
					desc = ip * Inicio.descuento3;
				}
				total = sub - desc;
				total_11+=total;
				
				//calculando para el obsequio
				if(total >Inicio.importeMinimoObsequiable)
				{
					regalo = Inicio.obsequio;
					regalos11++;
				}
				
				polo = Bus_Cama_3.cantidad/Inicio.numeroClienteSorpresa;
				if(polo != 0)
				{
					sorpresa = Inicio.premioSorpresa;
					polos11+=polo;
				}
				
			}else
			{
				seleccion=12;
				//calculando el importe a pagar
				ip = Inicio.precio3 * Bus_DoblePiso_5.cantidad;
				
				//calculando el incremento por tipo de Bus
				incremento = ip * Inicio.incremento2;
				sub= ip + incremento;
				
				//calculando el descuento
				if(Bus_DoblePiso_5.cantidad == 3)
				{
					desc = ip * Inicio.descuento1;
				}else if(Bus_DoblePiso_5.cantidad == 5)
				{
					desc = ip * Inicio.descuento2;
				}else if(Bus_DoblePiso_5.cantidad >=8)
				{
					desc = ip * Inicio.descuento3;
				}
				total = sub - desc;
				total_12+=total;
				
				//calculando para el obsequio
				if(total >Inicio.importeMinimoObsequiable)
				{
					regalo = Inicio.obsequio;
					regalos12++;
				}
				
				polo = Bus_DoblePiso_5.cantidad/Inicio.numeroClienteSorpresa;
				if(polo != 0)
				{
					sorpresa = Inicio.premioSorpresa;
					polos12+=polo;
				}
			}
			
		}
	}
	
	private void error(String string) {
		// TODO Auto-generated method stub
		
	}

	void mostar()
	{
		txtS.setText(null);
		leerdato();
		
		if(txtedad == null || txtnombre == null || txtnume == null)
		{
			JOptionPane.showInternalMessageDialog(null,"Datos incorrectos \n volver a ingresar");
		}
		
		txtS.append("\t\t**** Registro de Venta ****\n\n");
		//txtS.append("Vendedor : \t" + Inicio.Usuario + "\n\n");
		txtS.append("Nombre :   " + nombre +"\t" + "Tipo doc :   " + a + "\n");
		txtS.append("Numero doc :   " + num_doc + "\t" + "Edad :   " + edad + "\t" + "Sexo :   " + b + "\n");
		
		switch(seleccion)
		{
		case 1: 
			txtS.append("N°. Boletos:   " + Bus_Normal_1.asiento + "\n");
			as = Bus_Normal_1.asiento; 
			txtS.append("Cantidad :   " + Bus_Normal_1.cantidad + "\n");
			cant = Bus_Normal_1.cantidad;
			break;
		case 2: 
			txtS.append("N°. Boletos:   " + Bus_DoblePiso_1.asiento + "\n" );
			as = Bus_DoblePiso_1.asiento;
			txtS.append("Cantidad :   " + Bus_DoblePiso_1.cantidad + "\n");
			cant = Bus_DoblePiso_1.cantidad;
			break;
		case 3: 
			txtS.append("N°. Boletos:   " + Bus_Cama_1.asiento + "\n" );
			as = Bus_Cama_1.asiento;
			txtS.append("Cantidad :   " + Bus_Cama_1.cantidad + "\n");
			cant = Bus_Cama_1.cantidad;
			break;
		case 4: 
			txtS.append("N°. Boletos:   " + Bus_Normal_2.asiento + "\n" );
			as = Bus_Normal_2.asiento;
			txtS.append("Cantidad :   " + Bus_Normal_2.cantidad + "\n");
			cant = Bus_Normal_2.cantidad;
			break;
		case 5: 
			txtS.append("N°. Boletos:   " + Bus_Normal_3.asiento + "\n");
			as = Bus_Normal_3.asiento;
			txtS.append("Cantidad :   " + Bus_Normal_3.cantidad + "\n");
			cant = Bus_Normal_3.cantidad;
			break;
		case 6: 
			txtS.append("N°. Boletos:   " + Bus_DoblePiso_2.asiento + "\n");
			as = Bus_DoblePiso_2.asiento;
			txtS.append("Cantidad :   " + Bus_DoblePiso_2.cantidad + "\n");
			cant = Bus_DoblePiso_2.cantidad;
			break;
		case 7: 
			txtS.append("N°. Boletos:   " + Bus_DoblePiso_3.asiento + "\n");
			as = Bus_DoblePiso_3.asiento;
			txtS.append("Cantidad :   " + Bus_DoblePiso_3.cantidad + "\n");
			cant = Bus_DoblePiso_3.cantidad;
			break;
		case 8: 
			txtS.append("N°. Boletos:   " + Bus_Cama_2.asiento + "\n");
			as = Bus_Cama_2.asiento;
			txtS.append( "Cantidad :   " + Bus_Cama_2.cantidad + "\n");
			cant = Bus_Cama_2.cantidad;
			break;
		case 9: 
			txtS.append("N°. Boletos:   " + Bus_Normal_4.asiento + "\n");
			as = Bus_Normal_4.asiento;
			txtS.append("Cantidad :   " + Bus_Normal_4.cantidad + "\n");
			cant = Bus_Normal_4.cantidad;
			break;
		case 10: 
			txtS.append("N°. Boletos:   " + Bus_DoblePiso_4.asiento + "\n" );
			as = Bus_DoblePiso_4.asiento;
			txtS.append("Cantidad :   " + Bus_DoblePiso_4.cantidad + "\n");
			cant = Bus_DoblePiso_4.cantidad;
			break;
		case 11: 
			txtS.append("N°. Boletos:   " + Bus_Cama_3.asiento + "\n" );
			as = Bus_Cama_3.asiento;
			txtS.append("Cantidad :   " + Bus_Cama_3.cantidad + "\n");
			cant = Bus_Cama_3.cantidad;
			break;
		case 12: 
			txtS.append("N°. Boletos:   " + Bus_DoblePiso_5.asiento + "\n");
			as = Bus_DoblePiso_5.asiento;
			txtS.append("Cantidad :   " + Bus_DoblePiso_5.cantidad + "\n");
			cant = Bus_DoblePiso_5.cantidad;
			break;
		}
		txtS.append("Ruta :   " + Vender.ruta + "\t" + "Bus :   " + Vender.bus+ "\t" + "Hora :   " + Vender.hora + "\n");
		txtS.append("I. Pago :   " + String.format("%.2f", ip) + "\t" + "I. Descuento :   " + String.format("%.2f", desc) + "\t"+ "I. Incremento :   " + String.format("%.2f", incremento) + "\n");
		txtS.append("Total :   " + total + "\n");
		txtS.append("Regalo :   " + regalo + "\t" + "Sorpresa :   "+ polo + " "+ sorpresa + "\n");
		
		ruta = Vender.ruta; bus = Vender.bus; hora = Vender.hora;
		
	}
	
	void guardar()
	{
		Claseregistro r = new Claseregistro(nombre,num_doc,a,b,as,bus,ruta,hora,edad,cant,ip,desc,incremento,total);
		aa.adicionar(r);
		aa.grabarregistro();
		
		
		switch(seleccion)
		{
		case 1: 
			Vender.cantidad1 = Vender.cantidad1 - Bus_Normal_1.cantidad;
			Bus_Normal_1.cantidad  = 0;
			Bus_Normal_1.asiento = "";
			break;
		case 2: 
			Vender.cantidad2 = Vender.cantidad2 - Bus_DoblePiso_1.cantidad;
			Bus_DoblePiso_1.cantidad = 0;
			Bus_DoblePiso_1.asiento = "";
			break;
		case 3: 
			Vender.cantidad3 = Vender.cantidad3 - Bus_Cama_1.cantidad;
			Bus_Cama_1.cantidad = 0;
			Bus_Cama_1.asiento = "";
			break;
		case 4: 
			Vender.cantidad4 = Vender.cantidad4 - Bus_Normal_2.cantidad;
			Bus_Normal_2.cantidad  = 0;
			Bus_Normal_2.asiento = "";
			break;
		case 5: 
			Vender.cantidad5 = Vender.cantidad5 - Bus_Normal_3.cantidad;
			Bus_Normal_3.cantidad  = 0;
			Bus_Normal_3.asiento = "";
			break;
		case 6: 
			Vender.cantidad6 = Vender.cantidad6 - Bus_DoblePiso_2.cantidad;
			Bus_DoblePiso_2.cantidad = 0;
			Bus_DoblePiso_2.asiento = "";
			break;
		case 7: 
			Vender.cantidad7 = Vender.cantidad7 - Bus_DoblePiso_3.cantidad;
			Bus_DoblePiso_3.cantidad = 0;
			Bus_DoblePiso_3.asiento = "";
			break;
		case 8: 
			Vender.cantidad8 = Vender.cantidad8 - Bus_Cama_2.cantidad;
			Bus_Cama_2.cantidad = 0;
			Bus_Cama_2.asiento = "";
			break;
		case 9: 
			Vender.cantidad9 = Vender.cantidad9 - Bus_Normal_4.cantidad;
			Bus_Normal_4.cantidad  = 0;
			Bus_Normal_4.asiento = "";
			break;
		case 10: 
			Vender.cantidad10 = Vender.cantidad10 - Bus_DoblePiso_4.cantidad;
			Bus_DoblePiso_4.cantidad = 0;
			Bus_DoblePiso_4.asiento = "";
			break;
		case 11: 
			Vender.cantidad11 = Vender.cantidad11 - Bus_Cama_3.cantidad;
			Bus_Cama_3.cantidad = 0;
			Bus_Cama_3.asiento = "";
			break;
		case 12: 
			Vender.cantidad12 = Vender.cantidad12 - Bus_DoblePiso_5.cantidad;
			Bus_DoblePiso_5.cantidad = 0;
			Bus_DoblePiso_5.asiento = "";
			break;
		}
		
		JOptionPane.showMessageDialog(this,"Datos Guradados exitosamente");
		
		Inicio principal = new Inicio();
		principal.setVisible(true);
		dispose();
	}
	
}
