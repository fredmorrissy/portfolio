package br.com.fiap.healthtrack.dao;

import java.util.List;
import br.com.fiap.healthtrack.bean.Alimentacao;
import br.com.fiap.healthtrack.exception.DBException;

public interface AlimentacaoDAO {
  
  void cadastrar(Alimentacao alimentacao) throws DBException;
  void atualizar(Alimentacao alimentacao) throws DBException;
  void remover(int codigo) throws DBException;
  Alimentacao buscar(int id);
  List<Alimentacao> listar();
}