package br.com.fiap.healthtrack.controller;

  import java.io.IOException;
  import java.text.SimpleDateFormat;
  import java.util.Calendar;

  import javax.servlet.ServletException;
  import javax.servlet.annotation.WebServlet;
  import javax.servlet.http.HttpServlet;
  import javax.servlet.http.HttpServletRequest;
  import javax.servlet.http.HttpServletResponse;

import br.com.fiap.healthtrack.bean.Atividade;
import br.com.fiap.healthtrack.dao.AtividadeDAO;

  import br.com.fiap.healthtrack.exception.DBException;
  import br.com.fiap.healthtrack.factory.DAOFactory;

  @WebServlet("/atividade")
  public class AtividadeServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    
    private AtividadeDAO dao;
    
    @Override
    public void init() throws ServletException {
      super.init();
      dao = DAOFactory.getAtividadeDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
      try{
    	String tipo = request.getParameter("tipo");
    	String descricao = request.getParameter("descricao");
        int calorias = Integer.parseInt(request.getParameter("calorias"));
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Calendar data = Calendar.getInstance();
        data.setTime(format.parse(request.getParameter("data")));
        
        
        Atividade atividade = new Atividade(0, descricao, calorias, data, tipo); 
        dao.cadastrar(atividade);
        
        request.setAttribute("msg", "Atividade cadastrada!");
      }catch(DBException db) {
        db.printStackTrace();
        request.setAttribute("erro", "Erro ao cadastrar");
      }catch(Exception e){
        e.printStackTrace();
        request.setAttribute("erro","Por favor, valide os dados");
      }
      request.getRequestDispatcher("cadastro-atividade.jsp").forward(request, response);
    }

  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  


