package br.com.fiap.healthtrack.dao;

import java.util.List;
import br.com.fiap.healthtrack.bean.Pressao;
import br.com.fiap.healthtrack.exception.DBException;

public interface PressaoDAO {
  
  void cadastrar(Pressao pressao) throws DBException;
  void atualizar(Pressao pressao) throws DBException;
  void remover(int codigo) throws DBException;
  Pressao buscar(int id);
  List<Pressao> listar();
}