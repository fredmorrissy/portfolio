package br.com.fiap.healthtrack.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.healthtrack.dao.AlimentacaoDAO;
import br.com.fiap.healthtrack.bean.Alimentacao;
import br.com.fiap.healthtrack.exception.DBException;
import br.com.fiap.healthtrack.factory.DAOFactory;

@WebServlet("/alimentacao")
public class AlimentoServlet extends HttpServlet {

  private static final long serialVersionUID = 1L;
  
  private AlimentacaoDAO dao;
  
  @Override
  public void init() throws ServletException {
    super.init();
    dao = DAOFactory.getAlimentacaoDAO();
  }

  
  
  

  protected void doPost(HttpServletRequest request, HttpServletResponse response)
		  throws ServletException, IOException {

		  String acao = request.getParameter("acao");
		   
		  switch (acao) {
		  case "cadastrar":
		    cadastrar(request, response);
		    break;
		  case "editar":
		    editar(request,response);
		    break;
		  }
		}

		private void editar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			try{

				  int codigo = Integer.parseInt(request.getParameter("codigo"));
				  String tipo = request.getParameter("tipo");
			      String descricao = request.getParameter("descrição");
			      int calorias = Integer.parseInt(request.getParameter("calorias"));
			      SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			      Calendar data = Calendar.getInstance();
			      data.setTime(format.parse(request.getParameter("data")));
			      
			      Alimentacao alimentacao = new Alimentacao(codigo, descricao, calorias, data, tipo); 
			      dao.atualizar(alimentacao);
			      
			      request.setAttribute("msg", "Alimento atualizado!");
			    }catch(DBException db) {
			      db.printStackTrace();
			      request.setAttribute("erro", "Erro ao atualizar");
			    }catch(Exception e){
			      e.printStackTrace();
			      request.setAttribute("erro","Por favor, valide os dados");
			  }
			  listar(request,response);
			}

		
			
		





		private void listar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			List<Alimentacao> lista = dao.listar();
		      request.setAttribute("alimentos", lista);
		      request.getRequestDispatcher("alimentacao.jsp").forward(request, response); 
		  }
		  





		private void cadastrar(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException {
			try{
			      String tipo = request.getParameter("tipo");
			      String descrição = request.getParameter("descrição");
			      int calorias = Integer.parseInt(request.getParameter("calorias"));
			      SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			      Calendar data = Calendar.getInstance();
			      data.setTime(format.parse(request.getParameter("data")));
			      
			      Alimentacao alimentacao = new Alimentacao(0, descrição, calorias, data, tipo); 
			      dao.cadastrar(alimentacao);
			      
			      request.setAttribute("msg", "Alimento cadastrado!");
			    }catch(DBException db) {
			      db.printStackTrace();
			      request.setAttribute("erro", "Erro ao cadastrar");
			    }catch(Exception e){
			      e.printStackTrace();
			      request.setAttribute("erro","Por favor, valide os dados");
			    }
			    request.getRequestDispatcher("cadastro-alimentacao.jsp").forward(request, response);
			  }
  
  
  
  
  
  
  
  
  
  
  

  
  
  
  
  
  
  
  
  
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String acao = request.getParameter("acao");
      
    switch (acao) {
    case "listar":
      List<Alimentacao> lista = dao.listar();
      request.setAttribute("alimentos", lista);
      request.getRequestDispatcher("alimentacao.jsp").forward(request, response);
      break;
    case "abrir-form-edicao":
      int id = Integer.parseInt(request.getParameter("codigo"));
      Alimentacao alimentacao = dao.buscar(id);
      request.setAttribute("alimentos", alimentacao);
      request.getRequestDispatcher("edição-alimento.jsp").forward(request, response);
    } 
  }
  
 
}