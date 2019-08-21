package Clases;

public class ClaseChofer {
	
	public String dni = " ";
	public String nombre = " ";
	public String Edad = " ";
	public String direccion = " ";
	
	
	public ClaseChofer(String dni, String nombre, String edad, String direccion) {
		this.dni = dni;
		this.nombre = nombre;
		Edad = edad;
		this.direccion = direccion;
	}


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEdad() {
		return Edad;
	}


	public void setEdad(String edad) {
		Edad = edad;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
	
}
