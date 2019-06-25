package br.com.fiap.healthtrack.teste;

import java.util.Calendar;
import java.util.List;

import br.com.fiap.healthtrack.bean.Alimentacao;
import br.com.fiap.healthtrack.dao.AlimentacaoDAO;
import br.com.fiap.healthtrack.exception.DBException;
import br.com.fiap.healthtrack.factory.DAOFactory;

public class AlimentacaoDAOTeste {

  public static void main(String[] args) {
	  AlimentacaoDAO dao = DAOFactory.getAlimentacaoDAO();
    
    //Cadastrar um produto
    Alimentacao alimentacao = new Alimentacao(0,"Descrição",1000,Calendar.getInstance(),"Maçã");
    try {
      dao.cadastrar(alimentacao);
      System.out.println("Alimento cadastrado.");
    } catch (DBException e) {
      e.printStackTrace();
    }

    //Buscar um produto pelo código e atualizar
    alimentacao = dao.buscar(1);
    alimentacao.setDescricao("Descrição atualizada");
    alimentacao.setCalorias(30);
    try {
      dao.atualizar(alimentacao);
      System.out.println("Alimento atualizado.");
    } catch (DBException e) {
      e.printStackTrace();
    }
    
    //Listar os produtos
    List<Alimentacao> lista = dao.listar();
    for (Alimentacao item : lista) {
      System.out.println(item.getDescricao() + " " + item.getCalorias() + " " + item.getTipo());
    }
    
    //Remover um produto
    try {
      dao.remover(1);
      System.out.println("Alimento removido.");
    } catch (DBException e) {
      e.printStackTrace();
    } 
  } 
}