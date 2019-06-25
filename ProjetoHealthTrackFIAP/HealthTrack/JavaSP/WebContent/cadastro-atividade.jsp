<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Atividade</title>
<%@ include file="header.jsp" %>
</head>
<body>
<%@ include file="menu.jsp" %>
  <div class="container">
  <h1>Cadastro de Atividades</h1>
  
  <c:if test="${not empty msg }">
    <div class="alert alert-success">${msg}</div>
  </c:if>
  <c:if test="${not empty erro }">
    <div class="alert alert-danger">${erro}</div>
  </c:if>
  
  <form action="atividade" method="post">
    <div class="form-group">
      <label for="id-tipo">Tipo</label>
      <input type="text" name="tipo" id="id-tipo" class="form-control">
    </div>
    <div class="form-group">
      <label for="id-descrição">Descrição</label>
      <input type="text" name="descrição" id="id-descrição" class="form-control">
    </div>
    <div class="form-group">
      <label for="id-calorias">Calorias</label>
      <input type="text" name="calorias" id="id-calorias" class="form-control">
    </div>
    <div class="form-group">
      <label for="id-data">Data</label>
      <input type="text" name="data" id="id-data" class="form-control">
    </div>
    <input type="submit" value="Salvar" class="btn btn-primary">
  </form>
</div>
<%@ include file="footer.jsp" %>
</body>
</html>