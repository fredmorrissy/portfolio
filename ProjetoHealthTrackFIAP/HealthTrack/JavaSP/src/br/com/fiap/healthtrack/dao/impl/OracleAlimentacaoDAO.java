package br.com.fiap.healthtrack.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.fiap.healthtrack.bean.Alimentacao;
import br.com.fiap.healthtrack.dao.AlimentacaoDAO;
import br.com.fiap.healthtrack.exception.DBException;
import br.com.fiap.healthtrack.singleton.ConnectionManager;

public class OracleAlimentacaoDAO implements AlimentacaoDAO{
	
	private Connection conexao;

	@Override
	public void cadastrar(Alimentacao alimentacao) throws DBException {
		PreparedStatement stmt = null;

	    try {
	      conexao = ConnectionManager.getInstance().getConnection();
	      String sql = "INSERT INTO T_ALIMENTACAO (ID_ALIMENTACAO, DS_ALIMENTACAO, N_CALORIAS, DT_ALIMENTACAO, TIPO_ALIMENTO) VALUES (SQ_T_ALIMENTACAO.NEXTVAL, ?, ?, ?, ?)";
	      stmt = conexao.prepareStatement(sql);
	      stmt.setString(1, alimentacao.getDescricao());
	      stmt.setInt(2, alimentacao.getCalorias());
	      java.sql.Date data = new java.sql.Date(alimentacao.getData().getTimeInMillis());
	      stmt.setDate(3, data);
	      stmt.setString(4, alimentacao.getTipo());
	      

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
	public void atualizar(Alimentacao alimentacao) throws DBException {
		PreparedStatement stmt = null;

	    try {
	      conexao = ConnectionManager.getInstance().getConnection();
	      String sql = "UPDATE T_ALIMENTACAO SET DS_ALIMENTACAO = ?, N_CALORIAS = ?, DT_ALIMENTACAO = ?, TIPO_ALIMENTO = ? WHERE ID_ALIMENTACAO = ?";
	      stmt = conexao.prepareStatement(sql);
	      stmt.setString(1, alimentacao.getDescricao());
	      stmt.setInt(2, alimentacao.getCalorias());
	      java.sql.Date data = new java.sql.Date(alimentacao.getData().getTimeInMillis());
	      stmt.setDate(3, data);
	      stmt.setString(4, alimentacao.getTipo());
	      stmt.setInt(5, alimentacao.getCodigo());

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
	      String sql = "DELETE FROM T_ALIMENTACAO WHERE ID_ALIMENTACAO = ?";
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
	public Alimentacao buscar(int id) {
		Alimentacao alimentacao = null;
	    PreparedStatement stmt = null;
	    ResultSet rs = null;
	    try {
	      conexao = ConnectionManager.getInstance().getConnection();
	      stmt = conexao.prepareStatement("SELECT * FROM T_ALIMENTACAO WHERE ID_ALIMENTACAO = ?");
	      stmt.setInt(1, id);
	      rs = stmt.executeQuery();

	      if (rs.next()){
	        int codigo = rs.getInt("ID_ALIMENTACAO");
	        String descricao = rs.getString("DS_ALIMENTACAO");
	        int calorias = rs.getInt("N_CALORIAS");
	        java.sql.Date data1 = rs.getDate("DT_ALIMENTACAO");
	        Calendar data = Calendar.getInstance();
	        data.setTimeInMillis(data1.getTime());
	        String tipo = rs.getString("TIPO_ALIMENTO");
	        
	        
	        alimentacao = new Alimentacao(codigo, descricao, calorias, data, tipo);
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
	    return alimentacao;
	  }

		
	

	
	
	
	
	

	@Override
	public List<Alimentacao> listar() {
		List<Alimentacao> lista = new ArrayList<Alimentacao>();
	    PreparedStatement stmt = null;
	    ResultSet rs = null;
	    try {
	      conexao = ConnectionManager.getInstance().getConnection();
	      stmt = conexao.prepareStatement("SELECT * FROM T_ALIMENTACAO");
	      rs = stmt.executeQuery();

	      //Percorre todos os registros encontrados
	      while (rs.next()) {
	        int codigo = rs.getInt("ID_ALIMENTACAO");
	        String descricao = rs.getString("DS_ALIMENTACAO");
	        int calorias = rs.getInt("N_CALORIAS");
	        java.sql.Date data1 = rs.getDate("DT_ALIMENTACAO");
	        Calendar data = Calendar.getInstance();
	        data.setTimeInMillis(data1.getTime());
	        String tipo = rs.getString("TIPO_ALIMENTO");
	        
	        Alimentacao alimentacao = new Alimentacao(codigo, descricao, calorias, data, tipo);
	        lista.add(alimentacao);
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

