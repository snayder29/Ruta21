package Proyecto;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;

public class Modificar_Pasajes extends JFrame {

	private JPanel contentPane;
	private JLabel lblRuta1;
	private JTextField txtprecio1;
	private JTextField txtprecio2;
	private JTextField txtprecio3;
	private JLabel lblS_2;
	private JLabel lblS;
	private JLabel lblS_1;
	private JLabel lblRuta2;
	private JLabel lblRuta3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modificar_Pasajes frame = new Modificar_Pasajes();
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
	public Modificar_Pasajes() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Modificar_Pasajes.class.getResource("/imagenes/registro.png")));
		setTitle("Modificar el Precio del Pasaje");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 336, 275);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRutas = new JLabel("Modifique el precio de las rutas");
		lblRutas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRutas.setBounds(63, 11, 195, 20);
		contentPane.add(lblRutas);
		
		lblRuta1 = new JLabel("dfgh");
		lblRuta1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRuta1.setBounds(10, 52, 144, 20);
		contentPane.add(lblRuta1);
		
		lblRuta2 = new JLabel("xcvfg");
		lblRuta2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRuta2.setBounds(10, 89, 144, 20);
		contentPane.add(lblRuta2);
		
		lblRuta3 = new JLabel("sdfg");
		lblRuta3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRuta3.setBounds(10, 123, 144, 20);
		contentPane.add(lblRuta3);
		
		txtprecio1 = new JTextField();
		txtprecio1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtprecio1.setHorizontalAlignment(SwingConstants.RIGHT);
		txtprecio1.setBounds(164, 51, 103, 22);
		contentPane.add(txtprecio1);
		txtprecio1.setColumns(10);
		
		txtprecio2 = new JTextField();
		txtprecio2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtprecio2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtprecio2.setColumns(10);
		txtprecio2.setBounds(164, 88, 103, 22);
		contentPane.add(txtprecio2);
		
		txtprecio3 = new JTextField();
		txtprecio3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtprecio3.setHorizontalAlignment(SwingConstants.RIGHT);
		txtprecio3.setColumns(10);
		txtprecio3.setBounds(164, 122, 103, 22);
		contentPane.add(txtprecio3);
		
		JButton btnAceptar = new JButton("Guardar");
		btnAceptar.setIcon(new ImageIcon(Modificar_Pasajes.class.getResource("/iconos22x22/dialog-accept.png")));
		btnAceptar.setForeground(Color.BLUE);
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				guardar();
				dispose();
			}
		});
		btnAceptar.setBounds(179, 179, 119, 29);
		contentPane.add(btnAceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setIcon(new ImageIcon(Modificar_Pasajes.class.getResource("/iconos22x22/dialog-cancel-3.png")));
		btnCancelar.setForeground(Color.RED);
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				Inicio ir = new Inicio();
				ir.setVisible(true);
				dispose();
			}
		});
		btnCancelar.setBounds(30, 179, 119, 29);
		contentPane.add(btnCancelar);
		
		lblS_2 = new JLabel("S/.");
		lblS_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblS_2.setBounds(283, 52, 46, 20);
		contentPane.add(lblS_2);
		
		lblS = new JLabel("S/.");
		lblS.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblS.setBounds(283, 89, 46, 20);
		contentPane.add(lblS);
		
		lblS_1 = new JLabel("S/.");
		lblS_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblS_1.setBounds(283, 123, 46, 20);
		contentPane.add(lblS_1);
		
		CargarInformacion();
		setLocationRelativeTo(null);
	}
	
	void CargarInformacion()
	{
		lblRuta1.setText(Inicio.nombre1);
		lblRuta2.setText(Inicio.nombre2);
		lblRuta3.setText(Inicio.nombre3);
		
		txtprecio1.setText("" + Inicio.precio1);
		txtprecio2.setText("" + Inicio.precio2);
		txtprecio3.setText("" + Inicio.precio3);
	}


	void guardar()
	{
		if(JOptionPane.showConfirmDialog(null, "¿Esta seguro de modificar los datos?","Confirmacion", JOptionPane.YES_NO_OPTION)==0)
		{
			Inicio.precio1 = Double.parseDouble(txtprecio1.getText());
			Inicio.precio2 = Double.parseDouble(txtprecio2.getText());
			Inicio.precio3 = Double.parseDouble(txtprecio3.getText());
		}
		JOptionPane.showMessageDialog(null, "Datos Guardados Exitosamente");
		
		Inicio ir = new Inicio();
		ir.setVisible(true);
		dispose();
	}
}
