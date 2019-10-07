package Validaciones;
import Clases.*;

public class val_personal {
	
	public static boolean validacion = false;
	
	
	public static boolean isPasswordValid(String password)
	{
		try 
		{
			String pattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).{8,}$";
			/* System.out.println(Pattern.matches(usuario, txtUsuario.getText()));
			System.out.println(Pattern.matches(clave, txtClave.getText())); */
			return true;
			
		} 
		catch (Exception e) {
			return false;
			// TODO: handle exception
		}
	}
	
	/*
	public void mensajeValidacion(int tipo_doc, String num_doc) {
		switch (tipo_doc) {
			case 0:
				setDocValor("DNI");
				validacion = respuestaDeValidacion(num_doc);
			case 1:
				setDocValor("PASAPORTE");
				validacion = respuestaDeValidacion(num_doc);
			case 2:
				setDocValor("CARNET");
				validacion = respuestaDeValidacion(num_doc);
		}
		
		
	}
	*/
}
