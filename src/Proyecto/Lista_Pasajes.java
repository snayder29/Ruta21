package Proyecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Lista_Pasajes extends JFrame {

	private JPanel contentPane;
	private JTextArea txtLista;
	private JButton btnAceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Lista_Pasajes frame = new Lista_Pasajes();
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
	public Lista_Pasajes() {
		setResizable(false);
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(Lista_Pasajes.class.getResource("/imagenes/Lista.png")));
		setTitle("Lista de Pasajes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 472, 446);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				Inicio ir = new Inicio();
				ir.setVisible(true);
				dispose();
			}
		});
		btnAceptar.setIcon(new ImageIcon(Lista_Pasajes.class.getResource("/iconos22x22/dialog-accept.png")));
		btnAceptar.setForeground(Color.BLUE);
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAceptar.setBounds(173, 354, 119, 29);
		contentPane.add(btnAceptar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(16, 28, 434, 300);
		contentPane.add(scrollPane);
		
		txtLista = new JTextArea();
		txtLista.setEditable(false);
		txtLista.setFont(new Font("Tahoma", Font.PLAIN, 13));
		scrollPane.setViewportView(txtLista);
		
		setLocationRelativeTo(null);
		
		CargarDatos();
	}
	
	void CargarDatos()
	{
		txtLista.setText(null);
		txtLista.append("\t***********Lista de Pasajes************\n\n");
		txtLista.append("Ruta 1 :\t\t" + Inicio.nombre1 + "\n");
		txtLista.append("Precio por pasaje : \t" + Inicio.precio1 + "\n\n");
		txtLista.append("Ruta 2 :\t\t" + Inicio.nombre2 + "\n");
		txtLista.append("Precio por pasaje : \t" + Inicio.precio2 + "\n\n");
		txtLista.append("Ruta 3 :\t\t" + Inicio.nombre3 + "\n");
		txtLista.append("Precio por pasaje : \t" + Inicio.precio3 + "\n\n\n");
		txtLista.append("   *   Incrementos por tipo de Bus: \n");
		txtLista.append(Inicio.Bus1 +":\t      " + (int)(Inicio.incremento1*100) + " %\n");
		txtLista.append(Inicio.Bus2 +":\t      " + (int)(Inicio.incremento2*100) + "%\n");
		txtLista.append(Inicio.Bus3 +":\t      " + (int)(Inicio.incremento3*100) + "%\n\n\n");
		txtLista.append("   *   Descuentos: \n");
		txtLista.append("Si adquiere 3 pasajes :\t      " + (int) (Inicio.descuento1*100) + " %\n");
		txtLista.append("Si adquiere 5 pasajes :\t      " + (int)(Inicio.descuento2*100) + "%\n");
		txtLista.append("Si adquiere mas de 8 pasajes :      " + (int)(Inicio.descuento3*100) + "%\n\n\n");
		txtLista.append("   *   Regalos : \n");
		txtLista.append("Si el I. Pago excede los S/.140 :      1 " + Inicio.obsequio + "\n");
		txtLista.append("Por cada 3 pasajes comprados :      1 " + Inicio.premioSorpresa+ "\n");
	}
	
	
	
}
