<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Atualização de Alimento</title>
<%@ include file="header.jsp" %>
</head>
<body>
<%@ include file="menu.jsp" %>
<div class="container">
  <h1>Edição de Alimento</h1>
  <form action="alimentacao" method="post">
    <input type="hidden" value="editar" name="acao">
    <input type="hidden" value="${alimentacao.codigo }" name="codigo">
    <div class="form-group">
      <label for="id-tipo">Tipo</label>
      <input type="text" name="tipo" id="id-tipo" class="form-control" value="${alimentacao.tipo }" >
    </div>
    <div class="form-group">
      <label for="id-descrição">Descrição</label>
      <input type="text" name="descrição" id="id-descrição" class="form-control" value="${alimentacao.descricao }">
    </div>
    <div class="form-group">
      <label for="id-calorias">Calorias</label>
      <input type="text" name="calorias" id="id-calorias" class="form-control" value="${alimentacao.calorias }">
    </div>
    <div class="form-group">
      <label for="id-data">Data</label>
      <input type="text" name="data" id="id-data" class="form-control" 
        value='<fmt:formatDate value="${alimentacao.data.time }" pattern="dd/MM/yyyy"/>'>
    </div>
    <input type="submit" value="Salvar" class="btn btn-primary">
    <a href="alimentacao?acao=listar" class="btn btn-danger">Cancelar</a>
  </form>
</div>
<%@ include file="footer.jsp" %>
</body>
</html>