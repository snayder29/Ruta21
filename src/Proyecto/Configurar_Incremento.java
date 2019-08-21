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
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Configurar_Incremento extends JFrame {

	private JPanel contentPane;
	private JTextField txtIncremento1;
	private JTextField txtIncremento3;
	private JTextField txtIncremento2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Configurar_Incremento frame = new Configurar_Incremento();
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
	public Configurar_Incremento() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 335, 228);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIncremento = new JLabel("Incremento 1:");
		lblIncremento.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIncremento.setBounds(32, 12, 118, 22);
		contentPane.add(lblIncremento);
		
		txtIncremento1 = new JTextField();
		txtIncremento1.setText("5");
		txtIncremento1.setHorizontalAlignment(SwingConstants.RIGHT);
		txtIncremento1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtIncremento1.setColumns(10);
		txtIncremento1.setBounds(160, 11, 98, 23);
		contentPane.add(txtIncremento1);
		
		JLabel label_1 = new JLabel("%");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(268, 12, 35, 22);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("%");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(268, 55, 35, 22);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("%");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBounds(268, 98, 35, 22);
		contentPane.add(label_3);
		
		
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				grabar();
				
				dispose();
			}
		});
		btnGuardar.setForeground(Color.BLUE);
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnGuardar.setBounds(174, 140, 114, 30);
		contentPane.add(btnGuardar);
		
		txtIncremento3 = new JTextField();
		txtIncremento3.setText("9");
		txtIncremento3.setHorizontalAlignment(SwingConstants.RIGHT);
		txtIncremento3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtIncremento3.setColumns(10);
		txtIncremento3.setBounds(160, 97, 98, 23);
		contentPane.add(txtIncremento3);
		
		txtIncremento2 = new JTextField();
		txtIncremento2.setText("7");
		txtIncremento2.setHorizontalAlignment(SwingConstants.RIGHT);
		txtIncremento2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtIncremento2.setColumns(10);
		txtIncremento2.setBounds(160, 54, 98, 23);
		contentPane.add(txtIncremento2);
		
		JLabel lblIncremento_1 = new JLabel("Incremento 2:");
		lblIncremento_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIncremento_1.setBounds(32, 55, 118, 22);
		contentPane.add(lblIncremento_1);
		
		JLabel lblIncremento_2 = new JLabel("Incremento 3:");
		lblIncremento_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIncremento_2.setBounds(32, 98, 118, 22);
		contentPane.add(lblIncremento_2);
		
		JButton button_1 = new JButton("Cancelar");
		button_1.setIcon(new ImageIcon(Configurar_Incremento.class.getResource("/iconos22x22/dialog-cancel-3.png")));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Inicio ir = new Inicio();
				ir.setVisible(true);
				dispose();
			}
		});
		button_1.setForeground(Color.RED);
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_1.setBounds(30, 140, 114, 30);
		contentPane.add(button_1);
		
		setLocationRelativeTo(null);
		
		txtIncremento1.setText("" + (int)(Inicio.incremento1*100));
		txtIncremento2.setText("" + (int)(Inicio.incremento2*100));
		txtIncremento3.setText("" + (int)(Inicio.incremento3*100));
		
	}

	void grabar()
	{
		if(JOptionPane.showConfirmDialog(null, "¿Esta seguro de modificar los datos?","Confirmación", JOptionPane.YES_NO_OPTION)==0)
		{
		
		Inicio.incremento1 = Double.parseDouble(txtIncremento1.getText())/100;
		Inicio.incremento2= Double.parseDouble(txtIncremento2.getText())/100;
		Inicio.incremento3 = Double.parseDouble(txtIncremento2.getText())/100;;
		
		JOptionPane.showMessageDialog(null, "Datos Guardados Exitosamente");
		
		Inicio ir = new Inicio();
		ir.setVisible(true);
		dispose();
		}
	}
	
	
}
