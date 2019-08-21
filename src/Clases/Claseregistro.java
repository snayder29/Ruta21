package Clases;
public class Claseregistro {
	
	
private String nombre,num_doc,a,b,as, bus, ruta, hora;
private int edad,cant;
private double ip,desc,incremento,total;

public Claseregistro(String nombre, String num_doc, String a, String b, String as, String bus, String ruta, String hora,
		int edad, int cant, double ip, double desc, double incremento, double total) {

	this.nombre = nombre;
	this.num_doc = num_doc;
	this.a = a;
	this.b = b;
	this.as = as;
	this.bus = bus;
	this.ruta = ruta;
	this.hora = hora;
	this.edad = edad;
	this.cant = cant;
	this.ip = ip;
	this.desc = desc;
	this.incremento = incremento;
	this.total = total;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getNum_doc() {
	return num_doc;
}

public void setNum_doc(String num_doc) {
	this.num_doc = num_doc;
}

public String getA() {
	return a;
}

public void setA(String a) {
	this.a = a;
}

public String getB() {
	return b;
}

public void setB(String b) {
	this.b = b;
}

public String getAs() {
	return as;
}

public void setAs(String as) {
	this.as = as;
}

public String getBus() {
	return bus;
}

public void setBus(String bus) {
	this.bus = bus;
}

public String getRuta() {
	return ruta;
}

public void setRuta(String ruta) {
	this.ruta = ruta;
}

public String getHora() {
	return hora;
}

public void setHora(String hora) {
	this.hora = hora;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}

public int getCant() {
	return cant;
}

public void setCant(int cant) {
	this.cant = cant;
}

public double getIp() {
	return ip;
}

public void setIp(double ip) {
	this.ip = ip;
}

public double getDesc() {
	return desc;
}

public void setDesc(double desc) {
	this.desc = desc;
}

public double getIncremento() {
	return incremento;
}

public void setIncremento(double incremento) {
	this.incremento = incremento;
}

public double getTotal() {
	return total;
}

public void setTotal(double total) {
	this.total = total;
}



}
