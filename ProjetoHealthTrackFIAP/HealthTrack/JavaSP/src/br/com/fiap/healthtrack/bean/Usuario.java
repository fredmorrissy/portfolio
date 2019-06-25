package br.com.fiap.healthtrack.bean;

import java.util.Calendar;

public class Usuario {


	
	private int codigo;
	
	private String nome;
	
	private Calendar data;
	
	private String genero;
	
	private double altura;
	
	private String email;
	
	private String senha;

	
	
	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Usuario(int codigo, String nome, Calendar data, String genero, double altura, String email, String senha) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.data = data;
		this.genero = genero;
		this.altura = altura;
		this.email = email;
		this.senha = senha;
	}



	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public Calendar getData() {
		return data;
	}



	public void setData(Calendar data) {
		this.data = data;
	}



	public String getGenero() {
		return genero;
	}



	public void setGenero(String genero) {
		this.genero = genero;
	}



	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getSenha() {
		return senha;
	}



	public void setSenha(String senha) {
		this.senha = senha;
	}

	
	
	
}	