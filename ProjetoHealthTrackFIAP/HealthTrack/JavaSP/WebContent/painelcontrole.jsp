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




  <div class="container listapesos">
    <div class="row">
      <div class="col">

        <div class="container userinfo">
  
  
  <button type="button" class="btn btn-outline-primary" data-toggle="collapse" data-target="#demo">Informações pessoais</button>
  <div id="demo" class="collapse">
    <b>Nome:</b> Frederico Morrissy<br> <b>Idade:</b>31 anos<br> <b>IMC:</b>20,3 (Peso Ideal)<br> <b>Peso:</b>60kg<br> <b>Pressão Arterial=</b>120/80mmHg(Normal)
  </div>
</div>




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
  <button type="button" class="btn btn-outline-success btn-sm botaoadd">Adicionar peso</button>

    </div>
  </div>
</div>


    







  <div class="container listaalim">
    <div class="row">
      <div class="col">

  <h2>Listagem de alimentos consumidos</h2>
  <p>Veja abaixo a listagem com as informações sobre os alimentos que você consumiu:</p>            
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
        <td>8:30</td>
        <td>Café da manhã</td>
        <td>Pão, presunto e queijo, suco de laranja</td>
        <td>200 cal</td>
        <td><button type="button" class="btn btn-outline-primary btn-sm">Editar</button></td>
        <td><button type="button" class="btn btn-outline-danger btn-sm">Apagar</button></td>
      </tr>
      <tr>
        <td>18/03/18</td>
        <td>13:00</td>
        <td>Almoço</td>
        <td>Arroz, Feijão, Carne bovina</td>
        <td>800 cal</td>
        <td><button type="button" class="btn btn-outline-primary btn-sm">Editar</button></td>
        <td><button type="button" class="btn btn-outline-danger btn-sm">Apagar</button></td>
      </tr>
      <tr>
        <td>15/03/18</td>
        <td>19:30</td>
        <td>Jantar</td>
        <td>Salada, peixe, suco</td>
        <td>150 cal</td>
        <td><button type="button" class="btn btn-outline-primary btn-sm">Editar</button></td>
        <td><button type="button" class="btn btn-outline-danger btn-sm">Apagar</button></td>
      </tr>
        <tr>
        <td>10/03/18</td>
        <td>21:30</td>
        <td>Lanche leve</td>
        <td>Sanduíche</td>
        <td>80 cal</td>
        <td><button type="button" class="btn btn-outline-primary btn-sm">Editar</button></td>
        <td><button type="button" class="btn btn-outline-danger btn-sm">Apagar</button></td>
      </tr>
        <tr>
        <td>05/03/18</td>
        <td>23:00</td>
        <td>Fruta</td>
        <td>Maçã</td>
        <td>52 cal</td>
        <td><button type="button" class="btn btn-outline-primary btn-sm">Editar</button></td>
        <td><button type="button" class="btn btn-outline-danger btn-sm">Apagar</button></td>
      </tr>
    </tbody>
  </table>


<a href="cadastro-alimentacao.jsp"><button type="button" class="btn btn-outline-success btn-sm botaoadd">Adicionar alimento</button></a>

    </div>
  </div>
</div>













<div class="container listapressao">
    <div class="row">
      <div class="col">

  <h2>Listagem de pressão arterial</h2>
  <p>Veja abaixo a listagem com as informações sobre as medições de sua pressão arterial:</p>            
  <table class="table table-hover">
    <thead>
      <tr>
        <th>Data</th>
        <th>Hora</th>
        <th>Pressão Sistólica</th>
        <th>Pressão Diastólica</th>
        <th>Situação</th>
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

<button type="button" class="btn btn-outline-success btn-sm botaoadd">Adicionar pressão arterial</button>

    </div>
  </div>
</div>











<div class="container listativ">
    <div class="row">
      <div class="col">

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

<button type="button" class="btn btn-outline-success btn-sm botaoadd">Adicionar atividade física</button>

   </div>
  </div>
</div>


</body>
</html>