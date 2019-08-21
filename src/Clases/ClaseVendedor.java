package Clases;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Proyecto.Inicio;
import Proyecto.Login;

public class ClaseVendedor {
	
	private String user;
	private String clave;
	private String usuario;
	
	public ClaseVendedor(String us, String cl){
		this.user = us;
		this.clave = cl;
	}

	
	public String getUser() {
		return user;
	}


	public void setUser(String user) {
		this.user = user;
	}


	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	
	//metodo iniciosesion
	public void InicioSesion()
	{

		//si user es igual a (nombre) y comparammos la clave(numeros)sea = 0
		if(user.equalsIgnoreCase("snayder") && clave.compareTo("201815535")==0)
		{	
			usuario = "SNAYDER BRYAN ROASIO MIRANDA";
			Inicio.Usuario =  usuario;
		}else if(user.equalsIgnoreCase("David") && clave.compareTo("201814308")==0)
		{
			usuario = "David Vargas Domingues";
			Inicio.Usuario = usuario;
		}else if(user.equalsIgnoreCase("flor") && clave.compareTo("201815315")==0)
		{
			usuario = "FLOR LECCA ALTAMIRANO";
			Inicio.Usuario = usuario;
		}else if(user.equalsIgnoreCase("Ivan") && clave.compareTo("201810960")==0)
		{
			usuario = "Ivan Moncada Rodriguez";
			Inicio.Usuario = usuario;
		}else
		{
			//si el usuario o clave son incorrecto, se desplegara un mensaje
			JOptionPane.showMessageDialog(null,"acceso incorrecto");
			/*
			txtpass.setText(null);
			txtuser.setText(null);
			//hacemos q el puntero aparesca en la caja de texto, para ingresar
			txtuser.requestFocus();
			*/
		} 
		
	}
}
