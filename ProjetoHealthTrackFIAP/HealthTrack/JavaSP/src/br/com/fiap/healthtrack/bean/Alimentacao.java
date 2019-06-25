package br.com.fiap.healthtrack.bean;

import java.util.Calendar;

public class Alimentacao {

	private int codigo;
	
	private String descricao;
	
	private int calorias;
	
	private Calendar data;
	
	private String tipo;

	
	public Alimentacao() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Alimentacao(int codigo, String descricao, int calorias, Calendar data, String tipo) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.calorias = calorias;
		this.data = data;
		this.tipo = tipo;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public int getCalorias() {
		return calorias;
	}


	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}


	public Calendar getData() {
		return data;
	}


	public void setData(Calendar data) {
		this.data = data;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
}