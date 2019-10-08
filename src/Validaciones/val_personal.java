package Validaciones;
import Clases.*;

public class val_personal {
	
	public static boolean validacion = false;
	
	
	public static boolean isContraseña(String Contraseña)
	{
		try 
		{
			String pattern = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])([a-zA-Z0-9]).{8,}$";
			return true;
		} 
		catch (Exception e) {
			return false;
			// TODO: handle exception
		}
	}
	
	
	public static boolean isDNI(String DNI)
	{
		try 
		{
			String pattern = "[0-9]{8}";
			return true;
		} 
		catch (Exception e) {
			return false;
			// TODO: handle exception
		}
	}
	
	public static boolean isCorreo(String Correo)
	{
		try {
			String pattern = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
			return true;
		} catch (Exception e) {
			// Añadir mensaje
			return false;
		}
	}
	
	public static boolean isTelefono(int Telefono)
	{
		try {
			String pattern = "[0-9]{6}";
			return true;
		} catch (Exception e) {
			// Añadir mensaje
			return false;
		}
	}
	
	public static boolean isCelular(int Celular)
	{
		try {
			String pattern = "[0-9]{9}";
			return true;
		} catch (Exception e) {
			// Añadir mensaje
			return false;
		}
	}
	
	public static boolean isOtroDoc(String OtroDoc)
	{
		try 
		{
			String pattern = "[0-9]{12}";
			return true;
		} 
		catch (Exception e) {
			return false;
			// TODO: handle exception
		}
	}
	
	
	public static boolean isEdad(int Edad)
	{
		try {
			String pattern = "[0-9]{3}";
			return true;
		} catch (Exception e) {
			return false;
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
