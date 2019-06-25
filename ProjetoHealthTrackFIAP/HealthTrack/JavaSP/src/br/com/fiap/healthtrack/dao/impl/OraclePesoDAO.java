package br.com.fiap.healthtrack.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.fiap.healthtrack.bean.Peso;
import br.com.fiap.healthtrack.dao.PesoDAO;
import br.com.fiap.healthtrack.exception.DBException;
import br.com.fiap.healthtrack.singleton.ConnectionManager;

public class OraclePesoDAO implements PesoDAO {

	private Connection conexao;

	
	@Override
	public void cadastrar(Peso peso) throws DBException {
		PreparedStatement stmt = null;

	    try {
	      conexao = ConnectionManager.getInstance().getConnection();
	      String sql = "INSERT INTO T_PESOS (ID_PESAGEM, N_PESO, DT_PESAGEM) VALUES (SQ_T_PESOS.NEXTVAL, ?, ?)";
	      stmt = conexao.prepareStatement(sql);
	      stmt.setDouble(1, peso.getPesos());
	      java.sql.Date data = new java.sql.Date(peso.getData().getTimeInMillis());
	      stmt.setDate(2, data);
	      
	      

	      stmt.executeUpdate();
	    } catch (SQLException e) {
	      e.printStackTrace();
	      throw new DBException("Erro ao cadastrar.");
	    } finally {
	      try {
	        stmt.close();
	        conexao.close();
	      } catch (SQLException e) {
	        e.printStackTrace();
	      }
	    }
	  }
	
	
	
	
	
	
	
	

	@Override
	public void atualizar(Peso peso) throws DBException {
		PreparedStatement stmt = null;

	    try {
	      conexao = ConnectionManager.getInstance().getConnection();
	      String sql = "UPDATE T_PESOS SET N_PESO = ?, DT_PESAGEM = ? WHERE ID_PESAGEM = ?";
	      stmt = conexao.prepareStatement(sql);
	      stmt.setDouble(1, peso.getPesos());
	      java.sql.Date data = new java.sql.Date(peso.getData().getTimeInMillis());
	      stmt.setDate(2, data);
	      

	      stmt.executeUpdate();
	    } catch (SQLException e) {
	      e.printStackTrace();
	      throw new DBException("Erro ao atualizar.");
	    } finally {
	      try {
	        stmt.close();
	        conexao.close();
	      } catch (SQLException e) {
	        e.printStackTrace();
	      }
	    }
	  }

	
	
	

	
	

	@Override
	public void remover(int codigo) throws DBException {
		PreparedStatement stmt = null;

	    try {
	      conexao = ConnectionManager.getInstance().getConnection();
	      String sql = "DELETE FROM T_PESOS WHERE ID_PESAGEM = ?";
	      stmt = conexao.prepareStatement(sql);
	      stmt.setInt(1, codigo);
	      stmt.executeUpdate();
	    } catch (SQLException e) {
	      e.printStackTrace();
	      throw new DBException("Erro ao remover.");
	    } finally {
	      try {
	        stmt.close();
	        conexao.close();
	      } catch (SQLException e) {
	        e.printStackTrace();
	      }
	    }
	  }
	

	
	
	
	
	

	@Override
	public Peso buscar(int id) {
		Peso peso = null;
	    PreparedStatement stmt = null;
	    ResultSet rs = null;
	    try {
	      conexao = ConnectionManager.getInstance().getConnection();
	      stmt = conexao.prepareStatement("SELECT * FROM T_PESOS WHERE ID_PESAGEM = ?");
	      stmt.setInt(1, id);
	      rs = stmt.executeQuery();

	      if (rs.next()){
	        int codigo = rs.getInt("ID_PESAGEM");
	        double pesos = rs.getDouble("N_PESO");
	        java.sql.Date data1 = rs.getDate("DT_PESAGEM");
	        Calendar data = Calendar.getInstance();
	        data.setTimeInMillis(data1.getTime());
	        
	        
	        
	        peso = new Peso(codigo, pesos, data);
	      }
	      
	    } catch (SQLException e) {
	      e.printStackTrace();
	    }finally {
	      try {
	        stmt.close();
	        rs.close();
	        conexao.close();
	      } catch (SQLException e) {
	        e.printStackTrace();
	      }
	    }
	    return peso;
	  }
	
	
	
	
	
	
	
	
	
	

	@Override
	public List<Peso> listar() {
		List<Peso> lista = new ArrayList<Peso>();
	    PreparedStatement stmt = null;
	    ResultSet rs = null;
	    try {
	      conexao = ConnectionManager.getInstance().getConnection();
	      stmt = conexao.prepareStatement("SELECT * FROM T_PESOS");
	      rs = stmt.executeQuery();

	      //Percorre todos os registros encontrados
	      while (rs.next()) {
	        int codigo = rs.getInt("ID_PESAGEM");
	        double pesos = rs.getDouble("N_PESO");
	        java.sql.Date data1 = rs.getDate("DT_PESAGEM");
	        Calendar data = Calendar.getInstance();
	        data.setTimeInMillis(data1.getTime());
	        
	        
	        Peso peso = new Peso(codigo, pesos, data);
	        lista.add(peso);
	      }
	    } catch (SQLException e) {
	      e.printStackTrace();
	    }finally {
	      try {
	        stmt.close();
	        rs.close();
	        conexao.close();
	      } catch (SQLException e) {
	        e.printStackTrace();
	      }
	    }
	    return lista;
	  }

	}