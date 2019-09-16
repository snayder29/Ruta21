package Proyecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class reestablecer_contraseña extends JFrame {

	private JPanel contentPane;
	private JTextField txtIngreseSuCorreo;
	private JTextField txtIngresecodigo;
	private JButton btnSiguiente;
	private JLabel lbltexto1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					reestablecer_contraseña frame = new reestablecer_contraseña();
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
	public reestablecer_contraseña() {
		setBackground(new Color(135, 206, 250));
		setType(Type.POPUP);
		setTitle("Reestablecer Contrase\u00F1a");
		
		
		setAutoRequestFocus(false);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 527, 383);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(152, 251, 152));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnSiguiente = new JButton("Siguiente >");
		btnSiguiente.setBounds(312, 309, 103, 25);
		contentPane.add(btnSiguiente);
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				contentPane.removeAll();
				
				JLabel lblNewLabel = new JLabel("Ingrese el código:");
				lblNewLabel.setBounds(22, 37, 377, 25);
				contentPane.add(lblNewLabel);
				lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 13));
				
				txtIngresecodigo = new JTextField();
				txtIngresecodigo.addMouseListener(new MouseAdapter() {
					@Override
					public void mousePressed(MouseEvent arg0) {
						
						txtIngresecodigo.setText(null);
						txtIngresecodigo.setForeground(Color.BLACK);
						txtIngresecodigo.setEnabled(true);;
					}
				});
				
				txtIngresecodigo.setBounds(121, 88, 213, 36);
				contentPane.add(txtIngresecodigo);
				txtIngresecodigo.setForeground(Color.GRAY);
				txtIngresecodigo.setText("ingrese el código");
				txtIngresecodigo.setHorizontalAlignment(SwingConstants.CENTER);
				txtIngresecodigo.setFont(new Font("Arial", Font.ITALIC, 15));
				txtIngresecodigo.setColumns(10);
				

				revalidate();
				repaint();
				}
		});
		btnSiguiente.setEnabled(false);
		btnSiguiente.setFont(new Font("Arial", Font.PLAIN, 13));
		
		txtIngreseSuCorreo = new JTextField();
		txtIngreseSuCorreo.setBounds(50, 75, 424, 36);
		contentPane.add(txtIngreseSuCorreo);
		txtIngreseSuCorreo.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				
				txtIngreseSuCorreo.setText(null);
				txtIngreseSuCorreo.setForeground(Color.BLACK);
				btnSiguiente.setEnabled(true);;
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
		lbltexto1.setFont(new Font("Arial", Font.PLAIN, 13));
		
		
		
		setLocationRelativeTo(null);
	}
}
