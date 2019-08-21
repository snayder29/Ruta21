package Clases;

import javax.swing.JOptionPane;

import Proyecto.Inicio;

public class ClaseModificarPasaje {
	
	public double pasaje1;
	public double pasaje2;
	public double pasaje3;
	public ClaseModificarPasaje(double pasaje1, double pasaje2, double pasaje3) {
		this.pasaje1 = pasaje1;
		this.pasaje2 = pasaje2;
		this.pasaje3 = pasaje3;
	}
	public double getPasaje1() {
		return pasaje1;
	}
	public void setPasaje1(double pasaje1) {
		this.pasaje1 = pasaje1;
	}
	public double getPasaje2() {
		return pasaje2;
	}
	public void setPasaje2(double pasaje2) {
		this.pasaje2 = pasaje2;
	}
	public double getPasaje3() {
		return pasaje3;
	}
	public void setPasaje3(double pasaje3) {
		this.pasaje3 = pasaje3;
	}

	public void guardar()
	{
		if(JOptionPane.showConfirmDialog(null, "¿Esta seguro de modificar los datos?","Confirmacion", JOptionPane.YES_NO_OPTION)==0)
		{
			Inicio.precio1 = pasaje1;
			Inicio.precio2 = pasaje1;
			Inicio.precio3 = pasaje1;
		}
		JOptionPane.showMessageDialog(null, "Datos Guardados Exitosamente");
		
		Inicio ir = new Inicio();
		ir.setVisible(true);
	}
	
	
	

}
