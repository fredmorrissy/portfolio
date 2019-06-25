package br.com.fiap.healthtrack.teste;

import java.util.Calendar;
import java.util.List;

import br.com.fiap.healthtrack.bean.Pressao;
import br.com.fiap.healthtrack.dao.PressaoDAO;
import br.com.fiap.healthtrack.exception.DBException;
import br.com.fiap.healthtrack.factory.DAOFactory;

public class PressaoDAOTeste {

  public static void main(String[] args) {
	  PressaoDAO dao = DAOFactory.getPressaoDAO();
    
    //Cadastrar um produto
    Pressao pressao = new Pressao(0,120,80,Calendar.getInstance());
    try {
      dao.cadastrar(pressao);
      System.out.println("Pressao cadastrada.");
    } catch (DBException e) {
      e.printStackTrace();
    }

    //Buscar um produto pelo código e atualizar
    pressao = dao.buscar(1);
    pressao.setPa_sist(140);
    pressao.setPa_diast(90);
    try {
      dao.atualizar(pressao);
      System.out.println("Pressao atualizada.");
    } catch (DBException e) {
      e.printStackTrace();
    }
    
    //Listar os produtos
    List<Pressao> lista = dao.listar();
    for (Pressao item : lista) {
      System.out.println(item.getPa_sist() + " " + item.getPa_diast());
    }
    
    //Remover um produto
    try {
      dao.remover(1);
      System.out.println("Pressao removida.");
    } catch (DBException e) {
      e.printStackTrace();
    } 
  } 
}