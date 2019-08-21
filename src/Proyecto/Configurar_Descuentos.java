package Proyecto;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Configurar_Descuentos extends JFrame {

	private JPanel contentPane;
	private JTextField txtDescuento1;
	private JTextField txtDescuento2;
	private JTextField txtDescuento3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Configurar_Descuentos frame = new Configurar_Descuentos();
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
	public Configurar_Descuentos() {
		setResizable(false);
		setTitle("Configurar Descuentos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 314, 232);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBoletos = new JLabel("3 Boletos :");
		lblBoletos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBoletos.setBounds(10, 21, 118, 22);
		contentPane.add(lblBoletos);
		
		txtDescuento1 = new JTextField();
		txtDescuento1.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDescuento1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtDescuento1.setBounds(138, 20, 98, 23);
		contentPane.add(txtDescuento1);
		txtDescuento1.setColumns(10);
		
		JLabel lblBoletos_1 = new JLabel("5 Boletos :");
		lblBoletos_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBoletos_1.setBounds(10, 64, 118, 22);
		contentPane.add(lblBoletos_1);
		
		txtDescuento2 = new JTextField();
		txtDescuento2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDescuento2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtDescuento2.setColumns(10);
		txtDescuento2.setBounds(138, 63, 98, 23);
		contentPane.add(txtDescuento2);
		
		JLabel lblMasDe = new JLabel("Mas de 8 Boletos :");
		lblMasDe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMasDe.setBounds(10, 107, 118, 22);
		contentPane.add(lblMasDe);
		
		txtDescuento3 = new JTextField();
		txtDescuento3.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDescuento3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtDescuento3.setColumns(10);
		txtDescuento3.setBounds(138, 106, 98, 23);
		contentPane.add(txtDescuento3);
		
		JLabel label_2 = new JLabel("%");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(246, 21, 35, 22);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("%");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBounds(246, 64, 35, 22);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("%");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_4.setBounds(246, 107, 35, 22);
		contentPane.add(label_4);
		
		
		JButton btnaceptar = new JButton("Aceptar");
		btnaceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				grabar();
				dispose();
			}
		});
		btnaceptar.setForeground(Color.BLUE);
		btnaceptar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnaceptar.setBounds(172, 154, 98, 25);
		contentPane.add(btnaceptar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				Inicio ir = new Inicio();
				ir.setVisible(true);
				dispose();
			}
		});
		btnCancelar.setForeground(Color.RED);
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCancelar.setBounds(37, 154, 98, 25);
		contentPane.add(btnCancelar);
		
		setLocationRelativeTo(null);
		
		txtDescuento1.setText("" + (int)(Inicio.descuento1*100));
		txtDescuento2.setText("" + (int)(Inicio.descuento2*100));
		txtDescuento3.setText("" + (int)(Inicio.descuento3*100));
	}
	
	
	void grabar()
	{
		if(JOptionPane.showConfirmDialog(null, "¿Esta seguro de modificar los datos?","ConfirmaciÃ³n", JOptionPane.YES_NO_OPTION)==0)
		{
		
		Inicio.descuento1 = Double.parseDouble(txtDescuento1.getText())/100;
		Inicio.descuento2 = Double.parseDouble(txtDescuento2.getText())/100;
		Inicio.descuento3 = Double.parseDouble(txtDescuento3.getText())/100;;
		
		JOptionPane.showMessageDialog(null, "Datos Guardados Exitosamente");
		
		Inicio ir = new Inicio();
		ir.setVisible(true);
		dispose();
		}
	}	
}
