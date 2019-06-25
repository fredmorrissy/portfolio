package br.com.fiap.healthtrack.teste;

import java.util.Calendar;
import java.util.List;

import br.com.fiap.healthtrack.bean.Atividade;
import br.com.fiap.healthtrack.dao.AtividadeDAO;
import br.com.fiap.healthtrack.exception.DBException;
import br.com.fiap.healthtrack.factory.DAOFactory;

public class AtividadeDAOTeste {

  public static void main(String[] args) {
	  AtividadeDAO dao = DAOFactory.getAtividadeDAO();
    
    //Cadastrar um produto
    Atividade atividade = new Atividade(0,"Descriçãoatividade",1500,Calendar.getInstance(),"Natação");
    try {
      dao.cadastrar(atividade);
      System.out.println("Atividade cadastrada.");
    } catch (DBException e) {
      e.printStackTrace();
    }

    //Buscar um produto pelo código e atualizar
    atividade = dao.buscar(1);
    atividade.setDescricao("descriçãoatualizada");
    atividade.setCalorias(2000);
    try {
      dao.atualizar(atividade);
      System.out.println("Atividade atualizada.");
    } catch (DBException e) {
      e.printStackTrace();
    }
    
    //Listar os produtos
    List<Atividade> lista = dao.listar();
    for (Atividade item : lista) {
      System.out.println(item.getDescricao() + " " + item.getCalorias() + " " + item.getTipo());
    }
    
    //Remover um produto
    try {
      dao.remover(1);
      System.out.println("Atividade removida.");
    } catch (DBException e) {
      e.printStackTrace();
    } 
  } 
}