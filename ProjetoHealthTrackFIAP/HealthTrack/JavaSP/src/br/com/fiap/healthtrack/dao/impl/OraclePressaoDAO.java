package br.com.fiap.healthtrack.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.fiap.healthtrack.bean.Pressao;
import br.com.fiap.healthtrack.dao.PressaoDAO;
import br.com.fiap.healthtrack.exception.DBException;
import br.com.fiap.healthtrack.singleton.ConnectionManager;

public class OraclePressaoDAO implements PressaoDAO{

	private Connection conexao;

	@Override
	public void cadastrar(Pressao pressao) throws DBException {
		PreparedStatement stmt = null;

	    try {
	      conexao = ConnectionManager.getInstance().getConnection();
	      String sql = "INSERT INTO T_PRESSAO (ID_PRESSAO, N_PRESSAO_SIST, N_PRESSAO_DIAS, DT_PRESSAO) VALUES (SQ_T_PRESSAO.NEXTVAL, ?, ?, ?)";
	      stmt = conexao.prepareStatement(sql);
	      stmt.setInt(1, pressao.getPa_sist());
	      stmt.setInt(2, pressao.getPa_diast());
	      java.sql.Date data = new java.sql.Date(pressao.getData().getTimeInMillis());
	      stmt.setDate(3, data);
	      
	      
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
	public void atualizar(Pressao pressao) throws DBException {
		PreparedStatement stmt = null;

	    try {
	      conexao = ConnectionManager.getInstance().getConnection();
	      String sql = "UPDATE T_PRESSAO SET N_PRESSAO_SIST = ?, N_PRESSAO_DIAS = ?, DT_PRESSAO = ? WHERE ID_PRESSAO = ?";
	      stmt = conexao.prepareStatement(sql);
	      stmt.setInt(1, pressao.getPa_sist());
	      stmt.setInt(2, pressao.getPa_diast());
	      java.sql.Date data = new java.sql.Date(pressao.getData().getTimeInMillis());
	      stmt.setDate(3, data);
	      stmt.setInt(4, pressao.getCodigo());

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
	      String sql = "DELETE FROM T_PRESSAO WHERE ID_PRESSAO = ?";
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
	public Pressao buscar(int id) {
		Pressao pressao = null;
	    PreparedStatement stmt = null;
	    ResultSet rs = null;
	    try {
	      conexao = ConnectionManager.getInstance().getConnection();
	      stmt = conexao.prepareStatement("SELECT * FROM T_PRESSAO WHERE ID_PRESSAO = ?");
	      stmt.setInt(1, id);
	      rs = stmt.executeQuery();

	      if (rs.next()){
	        int codigo = rs.getInt("ID_PRESSAO");
	        int pa_sist = rs.getInt("N_PRESSAO_SIST");
	        int pa_diast = rs.getInt("N_PRESSAO_DIAS");
	        java.sql.Date data1 = rs.getDate("DT_PRESSAO");
	        Calendar data = Calendar.getInstance();
	        data.setTimeInMillis(data1.getTime());
	        
	        
	        pressao = new Pressao(codigo, pa_sist, pa_diast, data);
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
	    return pressao;
	  }
	
	
	
	
	
	
	

	@Override
	public List<Pressao> listar() {
		List<Pressao> lista = new ArrayList<Pressao>();
	    PreparedStatement stmt = null;
	    ResultSet rs = null;
	    try {
	      conexao = ConnectionManager.getInstance().getConnection();
	      stmt = conexao.prepareStatement("SELECT * FROM T_PRESSAO");
	      rs = stmt.executeQuery();

	      //Percorre todos os registros encontrados
	      while (rs.next()) {
	        int codigo = rs.getInt("ID_PRESSAO");
	        int pa_sist = rs.getInt("N_PRESSAO_SIST");
	        int pa_diast = rs.getInt("N_PRESSAO_DIAS");
	        java.sql.Date data1 = rs.getDate("DT_PRESSAO");
	        Calendar data = Calendar.getInstance();
	        data.setTimeInMillis(data1.getTime());
	        
	        
	        Pressao pressao = new Pressao(codigo, pa_sist, pa_diast, data);
	        lista.add(pressao);
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
	
