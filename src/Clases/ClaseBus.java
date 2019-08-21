package Clases;

public class ClaseBus {
	
	public String placa = " ";
	public String f_adquirido = " ";
	public String Modelo = " ";
	public String Marca = " ";
	
	
	public ClaseBus(String placa, String f_adquirido, String modelo, String marca) {
		this.placa = placa;
		this.f_adquirido = f_adquirido;
		this.Modelo = modelo;
		this.Marca = marca;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public String getF_adquirido() {
		return f_adquirido;
	}


	public void setF_adquirido(String f_adquirido) {
		this.f_adquirido = f_adquirido;
	}


	public String getModelo() {
		return Modelo;
	}


	public void setModelo(String modelo) {
		Modelo = modelo;
	}


	public String getMarca() {
		return Marca;
	}


	public void setMarca(String marca) {
		Marca = marca;
	}

	
	
	

}
