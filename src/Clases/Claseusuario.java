package Clases;

public class Claseusuario {
	
	private int tipoDocumento, sexo, edad;
	private String nombre, numDocumento, docValor;
	public static boolean validacion = false;
	
	public Claseusuario(int tipoDocumento, int sexo, int edad, String nombre, String numDocumento, String docValor) {
		this.tipoDocumento = tipoDocumento;
		this.sexo = sexo;
		this.nombre = nombre;
		this.edad = edad;
		this.numDocumento = numDocumento;
		this.docValor = docValor;
	}

	public int getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(int tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public int getSexo() {
		return sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNumDocumento() {
		return numDocumento;
	}

	public void setNumDocumento(String numDocumento) {
		this.numDocumento = numDocumento;
	}
	
	public String getDocValor() {
		return numDocumento;
	}

	public void setDocValor(String docValor) {
		this.docValor = docValor;
	}
	
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
	
	public boolean validarEdad(int edad) {
		if (edad < 18) return true;
		return false;
	}
	
	private boolean respuestaDeValidacion(String num_doc) {
		if(num_doc.length() != 8 || num_doc == null) {
			return true;
		}
		return false;
	}
}

