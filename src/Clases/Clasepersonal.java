package Clases;

public class Clasepersonal {
	
	private int doc_identidad, cod_personal, edad, cod_ocupacion;
	private String nombre_1,nombre_2,apellidos,genero,correo,direccion,
					celular_1,celular_2,f_ingreso,f_modificacion;	
	
	
	public Clasepersonal(int doc_identidad, int cod_personal, int edad, int cod_ocupacion, String nombre_1,
			String nombre_2, String apellidos, String genero, String correo, String direccion, String celular_1,
			String celular_2, String f_ingreso, String f_modificacion) {
		super();
		this.doc_identidad = doc_identidad;
		this.cod_personal = cod_personal;
		this.edad = edad;
		this.cod_ocupacion = cod_ocupacion;
		this.nombre_1 = nombre_1;
		this.nombre_2 = nombre_2;
		this.apellidos = apellidos;
		this.genero = genero;
		this.correo = correo;
		this.direccion = direccion;
		this.celular_1 = celular_1;
		this.celular_2 = celular_2;
		this.f_ingreso = f_ingreso;
		this.f_modificacion = f_modificacion;
	}
	
	public int getDoc_identidad() {
		return doc_identidad;
	}

	public void setDoc_identidad(int doc_identidad) {
		this.doc_identidad = doc_identidad;
	}

	public int getCod_personal() {
		return cod_personal;
	}

	public void setCod_personal(int cod_personal) {
		this.cod_personal = cod_personal;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getCod_ocupacion() {
		return cod_ocupacion;
	}

	public void setCod_ocupacion(int cod_ocupacion) {
		this.cod_ocupacion = cod_ocupacion;
	}

	public String getNombre_1() {
		return nombre_1;
	}

	public void setNombre_1(String nombre_1) {
		this.nombre_1 = nombre_1;
	}

	public String getNombre_2() {
		return nombre_2;
	}

	public void setNombre_2(String nombre_2) {
		this.nombre_2 = nombre_2;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCelular_1() {
		return celular_1;
	}

	public void setCelular_1(String celular_1) {
		this.celular_1 = celular_1;
	}

	public String getCelular_2() {
		return celular_2;
	}

	public void setCelular_2(String celular_2) {
		this.celular_2 = celular_2;
	}

	public String getF_ingreso() {
		return f_ingreso;
	}

	public void setF_ingreso(String f_ingreso) {
		this.f_ingreso = f_ingreso;
	}

	public String getF_modificacion() {
		return f_modificacion;
	}

	public void setF_modificacion(String f_modificacion) {
		this.f_modificacion = f_modificacion;
	}




	}

