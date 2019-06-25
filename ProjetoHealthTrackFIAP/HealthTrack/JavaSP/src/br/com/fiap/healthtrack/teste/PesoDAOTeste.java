package br.com.fiap.healthtrack.teste;

import java.util.Calendar;
import java.util.List;

import br.com.fiap.healthtrack.bean.Peso;
import br.com.fiap.healthtrack.dao.PesoDAO;
import br.com.fiap.healthtrack.exception.DBException;
import br.com.fiap.healthtrack.factory.DAOFactory;

public class PesoDAOTeste {

  public static void main(String[] args) {
	  PesoDAO dao = DAOFactory.getPesoDAO();
    
    //Cadastrar um produto
    Peso peso = new Peso(0,60,Calendar.getInstance());
    try {
      dao.cadastrar(peso);
      System.out.println("Peso cadastrado.");
    } catch (DBException e) {
      e.printStackTrace();
    }

    //Buscar um produto pelo código e atualizar
    peso = dao.buscar(1);
    peso.setPesos(70);
    try {
      dao.atualizar(peso);
      System.out.println("Peso atualizado.");
    } catch (DBException e) {
      e.printStackTrace();
    }
    
    //Listar os produtos
    List<Peso> lista = dao.listar();
    for (Peso item : lista) {
      System.out.println(item.getPesos());
    }
    
    //Remover um produto
    try {
      dao.remover(1);
      System.out.println("Peso removido.");
    } catch (DBException e) {
      e.printStackTrace();
    } 
  } 
}