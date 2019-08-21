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
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Configurar_Obsequio extends JFrame {

	private JPanel contentPane;
	private JTextField txtIPago;
	private JTextField txtObsequio1;
	private JLabel lblobsequio1;
	private JLabel lblobsequio2;
	private JTextField txtObsequio2;
	private JTextField txtNVentas;
	private JLabel lblN;
	private JLabel lblOsequio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Configurar_Obsequio frame = new Configurar_Obsequio();
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
	public Configurar_Obsequio() {
		setTitle("Configurar Obsequios");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 345, 282);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblobsequio1 = new JLabel("I.Pago");
		lblobsequio1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblobsequio1.setBounds(22, 31, 143, 22);
		contentPane.add(lblobsequio1);
		
		txtIPago = new JTextField();
		txtIPago.setHorizontalAlignment(SwingConstants.RIGHT);
		txtIPago.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtIPago.setColumns(10);
		txtIPago.setBounds(198, 31, 98, 23);
		contentPane.add(txtIPago);
		
		
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				guardar();
				dispose();
			}
		});
		btnGuardar.setForeground(Color.BLUE);
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnGuardar.setBounds(186, 191, 118, 31);
		contentPane.add(btnGuardar);
		
		JButton button_1 = new JButton("Cancelar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Inicio ir = new Inicio();
				ir.setVisible(true);
				dispose();
			}
		});
		button_1.setIcon(new ImageIcon(Configurar_Obsequio.class.getResource("/iconos22x22/dialog-cancel-3.png")));
		button_1.setForeground(Color.RED);
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_1.setBounds(34, 191, 118, 31);
		contentPane.add(button_1);
		
		txtObsequio1 = new JTextField();
		txtObsequio1.setHorizontalAlignment(SwingConstants.RIGHT);
		txtObsequio1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtObsequio1.setColumns(10);
		txtObsequio1.setBounds(198, 65, 98, 23);
		contentPane.add(txtObsequio1);
		
		lblobsequio2 = new JLabel("Obsequio 1");
		lblobsequio2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblobsequio2.setBounds(22, 65, 143, 22);
		contentPane.add(lblobsequio2);
		
		txtObsequio2 = new JTextField();
		txtObsequio2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtObsequio2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtObsequio2.setColumns(10);
		txtObsequio2.setBounds(198, 130, 98, 23);
		contentPane.add(txtObsequio2);
		
		txtNVentas = new JTextField();
		txtNVentas.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNVentas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtNVentas.setColumns(10);
		txtNVentas.setBounds(198, 96, 98, 23);
		contentPane.add(txtNVentas);
		
		lblN = new JLabel("N° de Ventas");
		lblN.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblN.setBounds(22, 95, 143, 22);
		contentPane.add(lblN);
		
		lblOsequio = new JLabel("Osequio 2");
		lblOsequio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOsequio.setBounds(22, 129, 143, 22);
		contentPane.add(lblOsequio);
		
		setLocationRelativeTo(null);
		
		txtIPago.setText(""+Inicio.importeMinimoObsequiable);
		txtObsequio1.setText(Inicio.obsequio);
		txtNVentas.setText(""+Inicio.numeroClienteSorpresa);
		txtObsequio2.setText(Inicio.premioSorpresa);
		
	}

	 void guardar()
	{
		if(JOptionPane.showConfirmDialog(null, "¿Esta seguro de modificar los datos?","Confirmación", JOptionPane.YES_NO_OPTION)==0)
		{
		Inicio.importeMinimoObsequiable = Integer.parseInt(txtIPago.getText());
		Inicio.obsequio = txtObsequio1.getText();
		Inicio.numeroClienteSorpresa = Integer.parseInt(txtNVentas.getText());
		Inicio.premioSorpresa = txtObsequio2.getText();
		
		JOptionPane.showMessageDialog(null, "Datos Guardados Exitosamente");
		
		Inicio ir = new Inicio();
		ir.setVisible(true);
		dispose();
		}
	} 
}
