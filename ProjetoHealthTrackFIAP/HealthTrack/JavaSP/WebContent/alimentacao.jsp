<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro de Alimentos</title>
<%@ include file="header.jsp" %>
</head>
<body>

<%@ include file="menu.jsp" %>
  <div class="container">
    <h1>Alimentos</h1>
    
    <c:if test="${not empty msg }">
    <div class="alert alert-success">${msg}</div>
</c:if>
<c:if test="${not empty erro }">
  <div class="alert alert-danger">${erro}</div>
</c:if>
    
    <table class="table table-striped">
      <tr>
        <th>Tipo</th>
        <th>Descrição</th>
        <th>Calorias</th>    
        <th>Data</th>   
      </tr>
      <c:forEach items="${alimentos }" var="p">
        <tr>
          <td>${p.tipo}</td>
          <td>${p.descricao}</td>
          <td>${p.calorias}</td>
          <td>
            <fmt:formatDate value="${p.data.time }" pattern="dd/MM/yyyy"/>
          </td>
          <td>
            <c:url value="alimentacao" var="link">
              <c:param name="acao" value="abrir-form-edicao"/>
              <c:param name="codigo" value="${p.codigo }"/>
            </c:url>
            <a href="${link}">Editar</a>
          </td>
        </tr>
      </c:forEach>
    </table>
  </div>
<%@ include file="footer.jsp" %>




<a href="cadastro-alimentacao.jsp"><button type="button"  class="btn btn-outline-success botaoadd">Adicionar alimento</button></a>

</body>
</html>