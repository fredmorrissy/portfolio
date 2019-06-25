package br.com.fiap.healthtrack.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.fiap.healthtrack.bean.Atividade;
import br.com.fiap.healthtrack.dao.AtividadeDAO;
import br.com.fiap.healthtrack.exception.DBException;
import br.com.fiap.healthtrack.singleton.ConnectionManager;

public class OracleAtividadeDAO implements AtividadeDAO{
	
	private Connection conexao;

	@Override
	public void cadastrar(Atividade atividade) throws DBException {
		PreparedStatement stmt = null;

	    try {
	      conexao = ConnectionManager.getInstance().getConnection();
	      String sql = "INSERT INTO T_ATIVIDADE (ID_ATIVIDADE, DS_ATIVIDADE, N_CALORIAS_GASTAS, DT_ATIVIDADE, TIPO_ATIVIDADE) VALUES (SQ_T_ATIVIDADE.NEXTVAL, ?, ?, ?, ?)";
	      stmt = conexao.prepareStatement(sql);
	      stmt.setString(1, atividade.getDescricao());
	      stmt.setInt(2, atividade.getCalorias());
	      java.sql.Date data = new java.sql.Date(atividade.getData().getTimeInMillis());
	      stmt.setDate(3, data);
	      stmt.setString(4, atividade.getTipo());
	      

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
	public void atualizar(Atividade atividade) throws DBException {
		PreparedStatement stmt = null;

	    try {
	      conexao = ConnectionManager.getInstance().getConnection();
	      String sql = "UPDATE T_ATIVIDADE SET DS_ATIVIDADE = ?, N_CALORIAS_GASTAS = ?, DT_ATIVIDADE = ?, TIPO_ATIVIDADE = ? WHERE ID_ATIVIDADE = ?";
	      stmt = conexao.prepareStatement(sql);
	      stmt.setString(1, atividade.getDescricao());
	      stmt.setInt(2, atividade.getCalorias());
	      java.sql.Date data = new java.sql.Date(atividade.getData().getTimeInMillis());
	      stmt.setDate(3, data);
	      stmt.setString(4, atividade.getTipo());
	      stmt.setInt(5, atividade.getCodigo());

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
	      String sql = "DELETE FROM T_ATIVIDADE WHERE ID_ATIVIDADE = ?";
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
	public Atividade buscar(int id) {
		Atividade atividade = null;
	    PreparedStatement stmt = null;
	    ResultSet rs = null;
	    try {
	      conexao = ConnectionManager.getInstance().getConnection();
	      stmt = conexao.prepareStatement("SELECT * FROM T_ATIVIDADE WHERE ID_ATIVIDADE = ?");
	      stmt.setInt(1, id);
	      rs = stmt.executeQuery();

	      if (rs.next()){
	        int codigo = rs.getInt("ID_ATIVIDADE");
	        String descricao = rs.getString("DS_ATIVIDADE");
	        int calorias = rs.getInt("N_CALORIAS_GASTAS");
	        java.sql.Date data1 = rs.getDate("DT_ATIVIDADE");
	        Calendar data = Calendar.getInstance();
	        data.setTimeInMillis(data1.getTime());
	        String tipo = rs.getString("TIPO_ATIVIDADE");
	        
	        
	        atividade = new Atividade(codigo, descricao, calorias, data, tipo);
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
	    return atividade;
	  }
	
	
	
	
	
	
	
	

	@Override
	public List<Atividade> listar() {
		List<Atividade> lista = new ArrayList<Atividade>();
	    PreparedStatement stmt = null;
	    ResultSet rs = null;
	    try {
	      conexao = ConnectionManager.getInstance().getConnection();
	      stmt = conexao.prepareStatement("SELECT * FROM T_ATIVIDADE");
	      rs = stmt.executeQuery();

	      //Percorre todos os registros encontrados
	      while (rs.next()) {
	        int codigo = rs.getInt("ID_ATIVIDADE");
	        String descricao = rs.getString("DS_ATIVIDADE");
	        int calorias = rs.getInt("N_CALORIAS_GASTAS");
	        java.sql.Date data1 = rs.getDate("DT_ATIVIDADE");
	        Calendar data = Calendar.getInstance();
	        data.setTimeInMillis(data1.getTime());
	        String tipo = rs.getString("TIPO_ATIVIDADE");
	        
	        Atividade atividade = new Atividade(codigo, descricao, calorias, data, tipo);
	        lista.add(atividade);
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
