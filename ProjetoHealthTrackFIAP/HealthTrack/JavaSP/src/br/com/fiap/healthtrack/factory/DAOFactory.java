package br.com.fiap.healthtrack.factory;

import br.com.fiap.healthtrack.dao.AlimentacaoDAO;
import br.com.fiap.healthtrack.dao.AtividadeDAO;
import br.com.fiap.healthtrack.dao.PesoDAO;
import br.com.fiap.healthtrack.dao.PressaoDAO;
import br.com.fiap.healthtrack.dao.impl.OracleAlimentacaoDAO;
import br.com.fiap.healthtrack.dao.impl.OracleAtividadeDAO;
import br.com.fiap.healthtrack.dao.impl.OraclePesoDAO;
import br.com.fiap.healthtrack.dao.impl.OraclePressaoDAO;

public class DAOFactory {

  public static AlimentacaoDAO getAlimentacaoDAO() {
    return new OracleAlimentacaoDAO();
  }
  
  
  
  public static AtividadeDAO getAtividadeDAO() {
	    return new OracleAtividadeDAO();
	  }
  
  
  public static PesoDAO getPesoDAO() {
	    return new OraclePesoDAO();
	  }
  
  
  public static PressaoDAO getPressaoDAO() {
	    return new OraclePressaoDAO();
	  }
  
  
  
  
  
  
  
}