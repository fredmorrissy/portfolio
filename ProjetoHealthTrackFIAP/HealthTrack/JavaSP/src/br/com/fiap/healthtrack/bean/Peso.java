package br.com.fiap.healthtrack.bean;

import java.util.Calendar;

public class Peso {

	
	private int codigo;
	
	private double pesos;
	
	private Calendar data;

	
	
	

	public Peso() {
		super();
		// TODO Auto-generated constructor stub
	}



	


	
	public Peso(int codigo, double pesos, Calendar data) {
		super();
		this.codigo = codigo;
		this.pesos = pesos;
		this.data = data;
	}







	public int getCodigo() {
		return codigo;
	}







	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}







	public double getPesos() {
		return pesos;
	}







	public void setPesos(double pesos) {
		this.pesos = pesos;
	}







	public Calendar getData() {
		return data;
	}







	public void setData(Calendar data) {
		this.data = data;
	}

}	
	
