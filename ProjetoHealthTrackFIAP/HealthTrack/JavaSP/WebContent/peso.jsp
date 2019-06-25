<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@ include file="header.jsp" %>
</head>
<body>


<%@ include file="footer.jsp" %>
<%@ include file="menu.jsp" %>


      <div class="container">
  <h2>Listagem de pesos</h2>
  <p>Veja abaixo a listagem com as informações sobre seu peso:</p>            
  <table class="table table-hover">
    <thead>
      <tr>
        <th>Data</th>
        <th>Peso</th>
        <th>Alterar</th>
        <th>Deletar</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>20/03/18</td>
        <td>70kg</td>
        <td><button type="button" class="btn btn-outline-primary btn-sm">Editar</button></td>
        <td><button type="button" class="btn btn-outline-danger btn-sm">Apagar</button></td>
      </tr>
      <tr>
        <td>18/03/18</td>
        <td>50kg</td>
        <td><button type="button" class="btn btn-outline-primary btn-sm">Editar</button></td>
        <td><button type="button" class="btn btn-outline-danger btn-sm">Apagar</button></td>
      </tr>
      <tr>
        <td>15/03/18</td>
        <td>55kg</td>
        <td><button type="button" class="btn btn-outline-primary btn-sm">Editar</button></td>
        <td><button type="button" class="btn btn-outline-danger btn-sm">Apagar</button></td>
      </tr>
    </tbody>
  </table>
</div>

<button type="button" class="btn btn-outline-success botaoadd">Adicionar peso</button>


</body>
</html>