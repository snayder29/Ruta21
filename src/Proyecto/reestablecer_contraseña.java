package Proyecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;

import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;

public class reestablecer_contrase�a extends JFrame {

	private JPanel contentPane;
	private JTextField txtIngreseSuCorreo;
	private JTextField txtIngresecodigo;
	private JButton btnSiguiente;
	private JLabel lbltexto1;
	private JLabel lbltexto2;
	private JLabel lblimagen;
	private JButton btncancelar;
	private JButton btnatras;
	private JPasswordField pwscontrase�a1;
	private JPasswordField pwscontrase�a2;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					reestablecer_contrase�a frame = new reestablecer_contrase�a();
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
	public reestablecer_contrase�a() {
		
		
		setBackground(new Color(135, 206, 250));
		setType(Type.POPUP);
		setTitle("Reestablecer Contrase\u00F1a");
		
		
		setAutoRequestFocus(false);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 533, 420);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
			
		
		//boton cancelar
		btncancelar = new JButton("Caneclar");
		btncancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				dispose();
			}
		});
		btncancelar.setFont(new Font("Arial", Font.PLAIN, 13));
		btncancelar.setBounds(414, 337, 103, 25);
		contentPane.add(btncancelar);

		
		// boton sgte para el sgte GUI para ingresar el codigo de verificacion
		btnSiguiente = new JButton("Siguiente >");
		btnSiguiente.setBounds(297, 337, 103, 25);
		contentPane.add(btnSiguiente);
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				// llamando al 2 constructor
				reestablecer_contrase�a1();
				}
		});
		
		//se deshabilita el boton siguiente
		btnSiguiente.setEnabled(false);
		btnSiguiente.setFont(new Font("Arial", Font.PLAIN, 13));
		
		txtIngreseSuCorreo = new JTextField();
		txtIngreseSuCorreo.setBounds(50, 75, 424, 36);
		contentPane.add(txtIngreseSuCorreo);
		//evento de clic sobre la caja de texto
		txtIngreseSuCorreo.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				
				// limpia el contenido de la caja de texto
				txtIngreseSuCorreo.setText(null);
				//asigan el color negro para el contenido de la caja de texto
				txtIngreseSuCorreo.setForeground(Color.BLACK);
				//habilita el boton siguiente
				btnSiguiente.setEnabled(true);
			}
		});
		txtIngreseSuCorreo.setForeground(Color.GRAY);
		txtIngreseSuCorreo.setText("ingrese su correo electronico");
		txtIngreseSuCorreo.setHorizontalAlignment(SwingConstants.CENTER);
		txtIngreseSuCorreo.setFont(new Font("Arial", Font.ITALIC, 15));
		txtIngreseSuCorreo.setColumns(10);
		
		lbltexto1 = new JLabel("Ingrese su correo electr\u00F3nico:");
		lbltexto1.setBounds(10, 27, 377, 25);
		contentPane.add(lbltexto1);
		lbltexto1.setFont(new Font("Arial", Font.PLAIN, 14));
		
		// se asigna una imgamen de fondo para el lvl
		lblimagen = new JLabel("");
		lblimagen.setIcon(new ImageIcon(reestablecer_contrase�a.class.getResource("/imagenes/carretera-cielo-nubes-paisaje.jpg")));
		lblimagen.setBounds(0, 0, 530, 391);
		contentPane.add(lblimagen);
		
		setLocationRelativeTo(null);
	}
		
	//********************************************************************************************************************************************
	//********************************************************************************************************************************************
	
		//segundo constructor que servira para cambiar todo el entorno del gui
		public void reestablecer_contrase�a1() {
			
			//remueve todo del jpanel
			contentPane.removeAll();
			
			//volviendo a crear todos los elementoss
			JLabel lblNewLabel = new JLabel("Ingrese el c�digo:");
			lblNewLabel.setBounds(22, 37, 377, 25);
			contentPane.add(lblNewLabel);
			lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 14));
			
			txtIngresecodigo = new JTextField();
			//acccion para cuando se haga clic en la caja de texto
			txtIngresecodigo.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					
					txtIngresecodigo.setText(null);
					txtIngresecodigo.setForeground(Color.BLACK);
					//txtIngresecodigo.setEnabled(true);
					btnSiguiente.setEnabled(true);
					btnatras.setEnabled(true);
				}
			});
			
			txtIngresecodigo.setBounds(121, 88, 263, 36);
			contentPane.add(txtIngresecodigo);
			txtIngresecodigo.setForeground(Color.GRAY);
			txtIngresecodigo.setText("ingrese el c�digo");
			txtIngresecodigo.setHorizontalAlignment(SwingConstants.CENTER);
			txtIngresecodigo.setFont(new Font("Arial", Font.ITALIC, 16));
			txtIngresecodigo.setColumns(10);
			
			
			//boton atras
			btnatras = new JButton("< Atras");
			btnatras.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					dispose();
					reestablecer_contrase�a a = new reestablecer_contrase�a();
					a.setVisible(true);
				}
			});
			btnatras.setFont(new Font("Arial", Font.PLAIN, 13));
			btnatras.setEnabled(false);
			btnatras.setBounds(184, 337, 103, 25);
			contentPane.add(btnatras);
			
			
			//boton cancelar
			btncancelar = new JButton("Caneclar");
			btncancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					dispose();
				}
			});
			btncancelar.setFont(new Font("Arial", Font.PLAIN, 13));
			btncancelar.setBounds(414, 337, 103, 25);
			contentPane.add(btncancelar);

			
			// boton sgte para el sgte GUI para ingresar el codigo de verificacion
			btnSiguiente = new JButton("Siguiente >");
			btnSiguiente.setBounds(297, 337, 103, 25);
			contentPane.add(btnSiguiente);
			btnSiguiente.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					// llamando al 2 constructor
					reestablecer_contrase�a2();
					}
			});
			
			//se deshabilita el boton siguiente
			btnSiguiente.setEnabled(false);
			btnSiguiente.setFont(new Font("Arial", Font.PLAIN, 13));
			
			btnSiguiente.setEnabled(false);
			btnSiguiente.setFont(new Font("Arial", Font.PLAIN, 13));
			
			
			lblimagen = new JLabel("");
			lblimagen.setIcon(new ImageIcon(reestablecer_contrase�a.class.getResource("/imagenes/carretera-cielo-nubes-paisaje.jpg")));
			lblimagen.setBounds(0, 0, 530, 391);
			contentPane.add(lblimagen);

			revalidate();
			repaint();

		}
		
		//********************************************************************************************************************************************
		//********************************************************************************************************************************************
		
		//tercer constructor que servira para cambiar todo el entorno del gui
		public void reestablecer_contrase�a2()
		{
			contentPane.removeAll();
			
			lbltexto1 = new JLabel("Ingrese su nueva contrase�a:");
			lbltexto1.setBounds(22, 37, 377, 25);
			contentPane.add(lbltexto1);
			lbltexto1.setFont(new Font("Arial", Font.PLAIN, 13));
			
			lbltexto2 = new JLabel("Reescriba la contrase�a:");
			lbltexto2.setBounds(23, 147, 377, 25);
			contentPane.add(lbltexto2);
			lbltexto2.setFont(new Font("Arial", Font.PLAIN, 13));
			
			
			pwscontrase�a1 = new JPasswordField();
			pwscontrase�a1.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					
					pwscontrase�a1.setText(null);
					pwscontrase�a1.setForeground(Color.BLACK);
				}
			});
			
			pwscontrase�a1.setBounds(130, 88, 267, 36);
			contentPane.add(pwscontrase�a1);
			pwscontrase�a1.setForeground(Color.GRAY);
			pwscontrase�a1.setText("Nueva Contrase�a");
			pwscontrase�a1.setHorizontalAlignment(SwingConstants.CENTER);
			pwscontrase�a1.setFont(new Font("Arial", Font.ITALIC, 15));
			pwscontrase�a1.setColumns(10);
			
			
			pwscontrase�a2 = new JPasswordField();
			pwscontrase�a2.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent arg0) {
					
					pwscontrase�a2.setText(null);
					pwscontrase�a2.setForeground(Color.BLACK);
					btnSiguiente.setEnabled(true);
				}
			});
			
			pwscontrase�a2.setBounds(131, 198, 267, 36);
			contentPane.add(pwscontrase�a2);
			pwscontrase�a2.setForeground(Color.GRAY);
			pwscontrase�a2.setText("Nueva Contrase�a");
			pwscontrase�a2.setHorizontalAlignment(SwingConstants.CENTER);
			pwscontrase�a2.setFont(new Font("Arial", Font.ITALIC, 15));
			pwscontrase�a2.setColumns(10);
			

			
			//boton atras
			btnatras = new JButton("< Atras");
			btnatras.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					dispose();
					reestablecer_contrase�a a = new reestablecer_contrase�a();
					a.setVisible(true);
				}
			});
			btnatras.setFont(new Font("Arial", Font.PLAIN, 13));
			btnatras.setEnabled(true);
			btnatras.setBounds(184, 337, 103, 25);
			contentPane.add(btnatras);
			
			
			//boton cancelar
			btncancelar = new JButton("Caneclar");
			btncancelar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					dispose();
				}
			});
			btncancelar.setFont(new Font("Arial", Font.PLAIN, 13));
			btncancelar.setBounds(414, 337, 103, 25);
			contentPane.add(btncancelar);

			
			// boton sgte para el sgte GUI para ingresar el codigo de verificacion
			btnSiguiente = new JButton("Siguiente >");
			btnSiguiente.setBounds(297, 337, 103, 25);
			contentPane.add(btnSiguiente);
			btnSiguiente.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					if(pwscontrase�a1.getText() == pwscontrase�a2.getText())
					{
						JOptionPane.showMessageDialog(null,"Contrase�a cambiada exitosamente");
						dispose();
					}else
					{
						JOptionPane.showMessageDialog(null, "Erro las claves no coinciden \n porfavor intentelo nuevamente");
						pwscontrase�a1.setText("null");
						pwscontrase�a2.setText("null");
						pwscontrase�a1.requestFocus();
					}
					
				}
			});
			
			//se deshabilita el boton siguiente
			btnSiguiente.setEnabled(false);
			btnSiguiente.setFont(new Font("Arial", Font.PLAIN, 13));
			
			
			lblimagen = new JLabel("");
			lblimagen.setIcon(new ImageIcon(reestablecer_contrase�a.class.getResource("/imagenes/carretera-cielo-nubes-paisaje.jpg")));
			lblimagen.setBounds(0, 0, 530, 391);
			contentPane.add(lblimagen);
			

			revalidate();
			repaint();
		
		}
}


