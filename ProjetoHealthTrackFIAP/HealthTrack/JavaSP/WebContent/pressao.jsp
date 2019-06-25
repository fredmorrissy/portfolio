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
  <h2>Listagem de press�o arterial</h2>
  <p>Veja abaixo a listagem com as informa��es sobre as medi��es de sua press�o arterial:</p>            
  <table class="table table-hover">
    <thead>
      <tr>
        <th>Data</th>
        <th>Hora</th>
        <th>Press�o Sist�lica</th>
        <th>Press�o Diast�lica</th>
        <th>Situa��o</th>
        <th>Alterar</th>
        <th>Deletar</th>
      </tr>
    </thead>
    <tbody>
      <tr>
        <td>20/03/18</td>
        <td>8:30</td>
        <td>120mmHg</td>
        <td>80mmHg</td>
        <td>Normal</td>
        <td><button type="button" class="btn btn-outline-primary btn-sm">Editar</button></td>
        <td><button type="button" class="btn btn-outline-danger btn-sm">Apagar</button></td>
      </tr>
      <tr>
        <td>18/03/18</td>
        <td>13:00</td>
        <td>120mmHg</td>
        <td>80mmHg</td>
        <td>Normal</td>
        <td><button type="button" class="btn btn-outline-primary btn-sm">Editar</button></td>
        <td><button type="button" class="btn btn-outline-danger btn-sm">Apagar</button></td>
      </tr>
      <tr>
        <td>15/03/18</td>
        <td>19:30</td>
        <td>120mmHg</td>
        <td>80mmHg</td>
        <td>Normal</td>
        <td><button type="button" class="btn btn-outline-primary btn-sm">Editar</button></td>
        <td><button type="button" class="btn btn-outline-danger btn-sm">Apagar</button></td>
      </tr>
      <tr>
        <td>10/03/18</td>
        <td>21:30</td>
        <td>120mmHg</td>
        <td>80mmHg</td>
        <td>Normal</td>
        <td><button type="button" class="btn btn-outline-primary btn-sm">Editar</button></td>
        <td><button type="button" class="btn btn-outline-danger btn-sm">Apagar</button></td>
      </tr>
      <tr>
        <td>05/03/18</td>
        <td>23:00</td>
        <td>120mmHg</td>
        <td>80mmHg</td>
        <td>Normal</td>
        <td><button type="button" class="btn btn-outline-primary btn-sm">Editar</button></td>
        <td><button type="button" class="btn btn-outline-danger btn-sm">Apagar</button></td>
      </tr>
    </tbody>
  </table>
</div>

<button type="button" class="btn btn-outline-success botaoadd">Adicionar press�o arterial</button>


</body>
</html>