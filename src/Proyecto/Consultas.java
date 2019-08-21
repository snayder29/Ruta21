package Proyecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Arreglos.ArregloRegistro;

import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Consultas extends JFrame {

	private JPanel contentPane;
	private JTextArea txtA;
	private JComboBox cbodato;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consultas frame = new Consultas();
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
	public Consultas() {
		setResizable(false);
		setTitle("Consulta de Pasajes");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Consultas.class.getResource("/iconos16x16/lista.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 610, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBuscarPor = new JLabel("Buscar por :");
		lblBuscarPor.setBounds(37, 22, 98, 21);
		contentPane.add(lblBuscarPor);
		
		cbodato = new JComboBox();
		cbodato.setModel(new DefaultComboBoxModel(new String[] {"Ruta", "Tipo Bus"}));
		cbodato.setBounds(142, 22, 98, 20);
		contentPane.add(cbodato);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int a = cbodato.getSelectedIndex();
				switch (a) {
				case 0: consulta1();break;
				case 1: consulta2();default:
					break;
				}
				
				
			}
		});
		btnBuscar.setBounds(318, 21, 89, 23);
		contentPane.add(btnBuscar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 64, 575, 382);
		contentPane.add(scrollPane);
		
		txtA = new JTextArea();
		scrollPane.setViewportView(txtA);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inicio ir = new Inicio();
				ir.setVisible(true);
				dispose();
			}
		});
		btnVolver.setForeground(Color.RED);
		btnVolver.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnVolver.setIcon(new ImageIcon(Consultas.class.getResource("/iconos22x22/edit-undo-6.png")));
		btnVolver.setBounds(231, 457, 124, 31);
		contentPane.add(btnVolver);
		
		
	}
	ArregloRegistro aa = new ArregloRegistro();
	
	public void consulta1()
	{
		for(int i = 0; i<aa.tamaño();i++)
		{
			txtA.append("  RUTA :\t\t " + aa.obtener(i).getRuta() + "\n");
			txtA.append("  CLIENTE :\t\t " + aa.obtener(i).getNombre()+ "\n");
			txtA.append("  EDAD :\t\t " + aa.obtener(i).getEdad()+ "\n");
			txtA.append("  T. DOCUMENTO :\t " + aa.obtener(i).getA()+ "\n");
			txtA.append("  N° DOCUMENTO :\t " + aa.obtener(i).getNum_doc()+ "\n");
			txtA.append("  SEXO :\t\t " + aa.obtener(i).getB()+ "\n");
			txtA.append("  BUS :\t\t " + aa.obtener(i).getBus()+ "\n");
			txtA.append("  H. SALIDA :\t\t " + aa.obtener(i).getHora()+ "\n");
			txtA.append("  N° BOLETOS :\t\t " + aa.obtener(i).getCant()+ "\n");
			txtA.append("  I. PAGO :\t\t " + aa.obtener(i).getIp()+ "\n");
			txtA.append("  DESCUENTO :\t " + aa.obtener(i).getDesc()+ "\n");
			txtA.append("  INCREMENTO :\t " + aa.obtener(i).getIncremento()+ "\n");
			txtA.append("  I. FACTURADO :\t " + aa.obtener(i).getTotal()+ "\n");
			txtA.append("  -------------------------------------------------"+ "\n");
		}
	}
	
	public void consulta2()
	{
		txtA.setText(null);
		txtA.append("Prueba exitosa");
		for(int i = 0; i<aa.tamaño();i++)
		{	
			txtA.append("  BUS :\t\t " + aa.obtener(i).getBus()+ "\n");
			txtA.append("  CLIENTE :\t\t " + aa.obtener(i).getNombre()+ "\n");
			txtA.append("  EDAD :\t\t " + aa.obtener(i).getEdad()+ "\n");
			txtA.append("  T. DOCUMENTO :\t " + aa.obtener(i).getA()+ "\n");
			txtA.append("  N° DOCUMENTO :\t " + aa.obtener(i).getNum_doc()+ "\n");
			txtA.append("  SEXO :\t\t " + aa.obtener(i).getB()+ "\n");
			txtA.append("  RUTA :\t\t " + aa.obtener(i).getRuta() + "\n");
			txtA.append("  H. SALIDA :\t\t " + aa.obtener(i).getHora()+ "\n");
			txtA.append("  N° BOLETOS :\t\t " + aa.obtener(i).getCant()+ "\n");
			txtA.append("  I. PAGO :\t\t " + aa.obtener(i).getIp()+ "\n");
			txtA.append("  DESCUENTO :\t " + aa.obtener(i).getDesc()+ "\n");
			txtA.append("  INCREMENTO :\t " + aa.obtener(i).getIncremento()+ "\n");
			txtA.append("  I. FACTURADO :\t " + aa.obtener(i).getTotal()+ "\n");
			txtA.append("  -------------------------------------------------"+ "\n");
		}
		
	}
	
	
	/*
	void listar() {
		for (int i=0; i<aa.tamaño(); i++) {
			Object fila[] = { aa.obtener(i).getNombre(),
							  aa.obtener(i).getNum_doc(),
							  aa.obtener(i).getA(),
							  aa.obtener(i).getB(),
							  aa.obtener(i).getAs(),
							  aa.obtener(i).getBus(),
							  aa.obtener(i).getRuta(),
							  aa.obtener(i).getHora(),
							  aa.obtener(i).getEdad(),
							  aa.obtener(i).getCant(),
							  aa.obtener(i).getIp(),
							  aa.obtener(i).getDesc(),
							  aa.obtener(i).getIncremento(),
							  aa.obtener(i).getTotal()
							};
		}
	}
	*/
}
