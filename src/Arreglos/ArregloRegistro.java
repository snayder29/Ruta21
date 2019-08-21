package Arreglos;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.function.DoublePredicate;

import Clases.Claseregistro;


public class ArregloRegistro {
	
//  Atributo privado
	private ArrayList <Claseregistro> reg;
	//  Constructor
    public ArregloRegistro() {
    	reg = new ArrayList <Claseregistro> ();
		cargarregistro();
    }
	
//  Operaciones públicas básicas
	public void adicionar(Claseregistro x) {
		reg.add(x);
	}
    public int tamaño() {
		return reg.size();
	}
	public Claseregistro obtener(int i) {
		return reg.get(i);
	}
	
	/*
	public Claseregistro buscar(String num_doc) {
		for (int i=0; i<tamaño(); i++)
			if (obtener(i).getNum_doc() == num_doc)
				return obtener(i);
		return null;
	}
	*/
	
	public Claseregistro buscar(String num_doc) {
		Claseregistro x;
		for (int i=0; i<tamaño(); i++)
		{
			x = obtener(i);
			if (x.getNum_doc().equals(num_doc))
				return x;
		}
		return null;
	}
	
	
	public void eliminar(Claseregistro x) {
		reg.remove(x);
	}
	public void grabarregistro() {
		try {
			PrintWriter pw;
			String linea;
			Claseregistro x;
			pw = new PrintWriter(new FileWriter("registro.txt"));
			for (int i=0; i<tamaño(); i++) {
				x = obtener(i);
				linea = x.getNombre() + ";" +
						x.getNum_doc() + ";" +
						x.getA() + ";"+
						x.getB() + ";" +
						x.getAs() + ";"+
						x.getBus() + ";"+
						x.getRuta() + ";"+
						x.getHora() + ";"+
						x.getEdad() + ";"+
						x.getCant() + ";"+
						x.getIp() + ";"+
						x.getDesc() + ";"+
						x.getIncremento() + ";"+
						x.getTotal();
				pw.println(linea);
			}
			pw.close();
		}
		catch (Exception e) {
		}
	}
	private void cargarregistro() {
		try {
			BufferedReader br;
			String linea,nombre,num_doc,a,b,as, bus, ruta, hora;
			String[] s;
			int edad,cant;
			double ip,desc,incremento,total;
			br = new BufferedReader(new FileReader("registro.txt"));
			while ((linea = br.readLine()) != null) {
				s = linea.split(";");
				nombre = s[0].trim();
				num_doc = s[1].trim();
				a = s[2].trim();
				b = s[3].trim();
				as = s[4].trim();
				bus = s[5].trim();
				ruta = s[6].trim();
				hora = s[7].trim();
				edad = Integer.parseInt(s[8].trim());
				cant = Integer.parseInt(s[9].trim());
				ip = Double.parseDouble(s[10].trim());
				desc = Double.parseDouble(s[11].trim());
				incremento = Double.parseDouble(s[12].trim());
				total = Double.parseDouble(s[13].trim());
				
				adicionar(new Claseregistro(nombre,num_doc,a,b,as, bus, ruta, hora,edad,cant,ip,desc,incremento,total));
			}
			br.close();
		}
		catch (Exception e) {
		}
	}
	

}
