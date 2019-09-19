package Proyecto;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.MessageFormat;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JProgressBar;
import java.awt.Color;
import javax.swing.JInternalFrame;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtuser;
	private JPasswordField txtpass;
	private Timer tiempo;
	private JButton btnAceptar;
	/**
	 * Launch the application.
	 */

	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	

	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		
		setFont(null);
		setResizable(false);
		setForeground(new Color(0, 0, 0));
		setAutoRequestFocus(false);
		setBackground(new Color(255, 255, 255));
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/imagenes/Llave.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 763, 517);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.menu);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setForeground(Color.BLACK);
		lblUsuario.setFont(new Font("Arial", Font.PLAIN, 17));
		lblUsuario.setBounds(401, 211, 125, 29);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setForeground(new Color(0, 0, 0));
		lblContrasea.setFont(new Font("Arial", Font.PLAIN, 17));
		lblContrasea.setBounds(401, 252, 125, 29);
		contentPane.add(lblContrasea);
		
		txtuser = new JTextField();
		txtuser.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent arg0) {
				
				txtuser.setText(null);
				txtuser.setForeground(Color.BLACK);
			}
		});
		txtuser.setForeground(Color.GRAY);
		txtuser.setText("Ingrese su usuario");
		txtuser.setHorizontalAlignment(SwingConstants.CENTER);
		txtuser.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtuser.setBounds(530, 211, 205, 29);
		contentPane.add(txtuser);
		txtuser.setColumns(10);
		
		txtpass = new JPasswordField();
		txtpass.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				txtpass.setText(null);
				txtpass.setForeground(Color.BLACK);
			}
		});
		txtpass.setEchoChar('*');
		txtpass.setText("Ingrese su contraseña");
		txtpass.setToolTipText("Ingrese su contrase\u00F1a");
		txtpass.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpass.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER){
					InicioSesion();
                }
			}
		});
		
		txtpass.setHorizontalAlignment(SwingConstants.CENTER);
		txtpass.setBounds(530, 252, 205, 29);
		contentPane.add(txtpass);
		
		btnAceptar = new JButton("Iniciar Sesion");
		btnAceptar.setForeground(new Color(255, 255, 255));
		btnAceptar.setBackground(new Color(30, 144, 255));
		btnAceptar.setFont(new Font("Arial", Font.BOLD, 15));
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//llamo al metodo InicioSesion
				InicioSesion();
			}
		});
		btnAceptar.setBounds(475, 328, 224, 36);
		contentPane.add(btnAceptar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/imagenes/bus.jpg")));
		lblNewLabel.setBounds(0, 0, 380, 490);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/imagenes/sesion.png")));
		lblNewLabel_1.setBounds(506, 21, 140, 140);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Olvide mi contrase\u00F1a");
		lblNewLabel_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				JOptionPane.showMessageDialog(null,"Espere plataforma en construccion");
				
				reestablecer_contraseña a = new reestablecer_contraseña();
				a.setVisible(true);
			}
		});
		lblNewLabel_2.setForeground(new Color(0, 0, 255));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(599, 282, 136, 20);
		contentPane.add(lblNewLabel_2);
		
		
		//para que nuestro GUI se muestre centrado
		setLocationRelativeTo(null);
		
	}
	
	
	//metodo iniciosesion
	void InicioSesion()
	{
		//declaro variable string
		String user,clave;
		//asigno
		user = txtuser.getText();
		//asigno en base ala evaluacion
		clave = String.valueOf(txtpass.getPassword());
		//si user es igual a (nombre) y comparammos la clave(numeros)sea = 0
		if(user.equalsIgnoreCase("snayder") && clave.compareTo("201815535")==0)
		{
			Inicio.Usuario =  "SNAYDER BRYAN ROSARIO MIRANDA";
			inicio();
			//llamara al metodo mostrar
		}else if(user.equalsIgnoreCase("David") && clave.compareTo("201814308")==0)
		{
			Inicio.Usuario = "David Vargas Domingues";
			inicio();

		}else if(user.equalsIgnoreCase("flor") && clave.compareTo("201815315")==0)
		{
			Inicio.Usuario = "FLOR LECCA ALTAMIRANO";
			inicio();

		}else
		{
			//si el usuario o clave son incorrecto, se desplegara un mensaje
			JOptionPane.showMessageDialog(null,"acceso incorrecto");
			//pondremos los cuadros de user y pass vacios para volver a ingresar
			txtpass.setText(null);
			txtuser.setText("Ingrese su usuario");
			txtuser.requestFocus();
			
			//hacemos q el puntero aparesca en la caja de texto, para ingresar
			txtuser.requestFocus();
		}
	}
	
	private void inicio()
	{
		Inicio a = new Inicio();
		a.setVisible(true);
		dispose();
	}
}
