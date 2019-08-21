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

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField txtuser;
	private JPasswordField txtpass;
	private Timer tiempo;
	private JProgressBar barra;
	private JButton btnAceptar;
	private JButton btnCancelar;
	private JLabel lblNewLabel;
	/**
	 * Launch the application.
	 */
	//es el tiempo que demorara en cargar la barra
	public final static int TWO_SECOND=10;
	//declaro un contador
	int cont;
	
	
	//clase del TimerListener
	class TimerListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e) 
		{
			//incremento del contador
			cont++;
			//evaluo la barra en funcion al contador
			barra.setValue(cont);
			if(cont==100)
			{
				//si cont = 100, el tiempo se detiene
				tiempo.stop();
				//escondo la barra de carga
				esconder();
				//llamo al jframe Inicio
				Inicio menu = new Inicio();
				//hago que el jframe sea visible
				menu.setVisible(true);
			}
		}
	}
	
	
	
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
		setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/imagenes/Llave.jpg")));
		
		setResizable(false);
		
		
		setTitle("Gestion de Usuarios");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 307, 232);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngreseSuUsuario = new JLabel("Ingrese su Usuario y Contrase\u00F1a para ingresar");
		lblIngreseSuUsuario.setForeground(Color.BLUE);
		lblIngreseSuUsuario.setHorizontalAlignment(SwingConstants.CENTER);
		lblIngreseSuUsuario.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblIngreseSuUsuario.setBounds(10, 11, 257, 26);
		contentPane.add(lblIngreseSuUsuario);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setForeground(Color.BLUE);
		lblUsuario.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblUsuario.setBounds(32, 48, 83, 19);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setForeground(Color.BLUE);
		lblContrasea.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblContrasea.setBounds(32, 88, 83, 19);
		contentPane.add(lblContrasea);
		
		txtuser = new JTextField();
		txtuser.setHorizontalAlignment(SwingConstants.RIGHT);
		txtuser.setFont(new Font("Verdana", Font.PLAIN, 13));
		txtuser.setBounds(134, 47, 86, 20);
		contentPane.add(txtuser);
		txtuser.setColumns(10);
		
		txtpass = new JPasswordField();
		txtpass.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER){
					InicioSesion();
                }
			}
		});
		
		txtpass.setHorizontalAlignment(SwingConstants.CENTER);
		txtpass.setBounds(134, 87, 86, 20);
		contentPane.add(txtpass);
		
		barra = new JProgressBar();
		barra.setStringPainted(true);
		barra.setBackground(Color.CYAN);
		barra.setForeground(Color.BLUE);
		barra.setFont(new Font("Verdana", Font.ITALIC, 13));
		barra.setBounds(24, 125, 235, 19);
		contentPane.add(barra);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//llamo al metodo InicioSesion
				InicioSesion();
			}
		});
		btnAceptar.setBounds(32, 155, 89, 23);
		contentPane.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//llamo al metodo cerrar
				cerrar();
			}
		});
		btnCancelar.setBounds(165, 155, 89, 23);
		contentPane.add(btnCancelar);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/imagenes/Llave.jpg")));
		lblNewLabel.setBounds(0, 0, 302, 203);
		contentPane.add(lblNewLabel);
		barra.setVisible(false);
		
		
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
			Inicio.Usuario =  "SNAYDER BRYAN ROASIO MIRANDA";
			//llamara al metodo mostrar
			mostrar();
		}else if(user.equalsIgnoreCase("David") && clave.compareTo("201814308")==0)
		{
			Inicio.Usuario = "David Vargas Domingues";
			mostrar();
		}else if(user.equalsIgnoreCase("flor") && clave.compareTo("201815315")==0)
		{
			Inicio.Usuario = "FLOR LECCA ALTAMIRANO";
			mostrar();
		}else if(user.equalsIgnoreCase("Ivan") && clave.compareTo("201810960")==0)
		{
			Inicio.Usuario = "Ivan Moncada Rodriguez";
			mostrar();
		}else
		{
			//si el usuario o clave son incorrecto, se desplegara un mensaje
			JOptionPane.showMessageDialog(null,"acceso incorrecto");
			//pondremos los cuadros de user y pass vacios para volver a ingresar
			txtpass.setText(null);
			txtuser.setText(null);
			//hacemos q el puntero aparesca en la caja de texto, para ingresar
			txtuser.requestFocus();
		}
		
	}
	
	
	//metodo mostar
	void mostrar()
	{
		//hacemos visible la barra de carga
		barra.setVisible(true);
		//el contador empesara desde -1
		cont=-1;
		//barra evaluado en 0
		barra.setValue(0);
		//hacemos que el numero de % se muestre
		barra.setStringPainted(true);
		//asignamos al tiempo un nuevo tiempo, con el tiempo en segundos, y llamando al metodo TimerListener
		tiempo=new Timer(TWO_SECOND, new TimerListener());
		//llamo al metodo activar
		activar();
	}
	
	//metodo esconder
	void esconder()
	{
		//para que solo se ejecute en este gui
		this.setVisible(false);
	}
	
	//metodo activar
	void activar()
	{
		//comienza a correr el tiempo
		tiempo.start();
	}
	
	
	
	void cerrar(){
		Object [] opciones ={"Aceptar","Cancelar"};
		int eleccion = JOptionPane.showOptionDialog(this,"En realidad desea realizar cerrar la aplicacion","Mensaje de Confirmacion",
		JOptionPane.YES_NO_OPTION,
		JOptionPane.QUESTION_MESSAGE,null,opciones,"Aceptar");
		if (eleccion == JOptionPane.YES_OPTION)
		{
			Cerrar_Aplicacion cerrar = new Cerrar_Aplicacion();
			cerrar.setVisible(true);
			dispose();
		}
	}
}
