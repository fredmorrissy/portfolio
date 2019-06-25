package br.com.fiap.healthtrack.bean;

import java.util.Calendar;

public class Pressao {




	private int codigo;

	private int pa_sist;
	
	private int pa_diast;
	
	private Calendar data;

	
	
	public Pressao() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Pressao(int codigo, int pa_sist, int pa_diast, Calendar data) {
		super();
		this.codigo = codigo;
		this.pa_sist = pa_sist;
		this.pa_diast = pa_diast;
		this.data = data;
	}


	
	
	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public int getPa_sist() {
		return pa_sist;
	}


	public void setPa_sist(int pa_sist) {
		this.pa_sist = pa_sist;
	}


	public int getPa_diast() {
		return pa_diast;
	}


	public void setPa_diast(int pa_diast) {
		this.pa_diast = pa_diast;
	}


	public Calendar getData() {
		return data;
	}


	public void setData(Calendar data) {
		this.data = data;
	}
	
	
	

	
}