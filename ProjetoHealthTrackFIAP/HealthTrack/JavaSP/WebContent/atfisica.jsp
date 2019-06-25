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
  <h2>Listagem de atividades físicas</h2>
  <p>Veja abaixo a listagem com as informações sobre suas atividades físicas:</p>            
  <table class="table table-hover">
    <thead>
      <tr>
        <th>Data</th>
        <th>Hora</th>
        <th>Tipo</th>
        <th>Descrição</th>
        <th>Calorias</th>
        <th>Alterar</th>
        <th>Deletar</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>20/03/18</td>
        <td>18:00</td>
        <td>Corrida</td>
        <td>Opcional</td>
        <td>800 cal</td>
        <td><button type="button" class="btn btn-outline-primary btn-sm">Editar</button></td>
        <td><button type="button" class="btn btn-outline-danger btn-sm">Apagar</button></td>
      </tr>
      <tr>
        <td>18/03/18</td>
        <td>19:00</td>
        <td>Pedalada</td>
        <td>Opcional</td>
        <td>750 cal</td>
        <td><button type="button" class="btn btn-outline-primary btn-sm">Editar</button></td>
        <td><button type="button" class="btn btn-outline-danger btn-sm">Apagar</button></td>
      </tr>
      <tr>
        <td>15/03/18</td>
        <td>19:30</td>
        <td>Caminhada</td>
        <td>Opcional</td>
        <td>400 cal</td>
        <td><button type="button" class="btn btn-outline-primary btn-sm">Editar</button></td>
        <td><button type="button" class="btn btn-outline-danger btn-sm">Apagar</button></td>
      </tr>
        <tr>
        <td>10/03/18</td>
        <td>11:30</td>
        <td>Natação</td>
        <td>Opcional</td>
        <td>1000 cal</td>
        <td><button type="button" class="btn btn-outline-primary btn-sm">Editar</button></td>
        <td><button type="button" class="btn btn-outline-danger btn-sm">Apagar</button></td>
      </tr>
        <tr>
        <td>05/03/18</td>
        <td>10:00</td>
        <td>Pedalada</td>
        <td>Opcional</td>
        <td>450 cal</td>
        <td><button type="button" class="btn btn-outline-primary btn-sm">Editar</button></td>
        <td><button type="button" class="btn btn-outline-danger btn-sm">Apagar</button></td>
      </tr>
    </tbody>
  </table>
</div>

<button type="button" class="btn btn-outline-success botaoadd">Adicionar atividade física</button>

</body>
</html>