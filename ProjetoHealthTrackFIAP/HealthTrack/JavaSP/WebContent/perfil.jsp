<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Perfil</title>
<%@ include file="header.jsp" %>
</head>
<body>


<%@ include file="footer.jsp" %>
<%@ include file="menu.jsp" %>


<form class="shadow m-5 p-5">
		<h1>Perfil - Dados Pessoais</h1>
	  	<div class="form-group col-5">

    <label for="nome">Nome Completo:</label>
    <input type="text" class="form-control" id="nome">
    	</div>
    
    	<div class="form-group col-2">

        	<label for="data">Data de nascimento:</label>
    		<input type="date" class="form-control" id="data">
    	</div>

    	<div class="form-group col-2">
    <label for="genero">Gênero:</label>
    <select class="form-control" id="genero">
        <option value="M">Masculino</option>
        <option value="F">Feminino</option>
        <option value="Outro">Outro</option>
        <option value="naoinformar">Não desejo informar</option>
    </select>
    	</div>

    	<div class="form-group col-5">
    <label for="peso">Peso (em Kg):</label>
    <input type="text" class="form-control" id="peso">
    	</div>

    	<div class="form-group col-5">
    <label for="altura">Altura (em metros):</label>
    <input type="text" class="form-control" id="altura">
    	</div>

    	<div class="form-group col-5">
    <label for="email">E-mail de contato:</label>
    <input type="email" class="form-control" id="email">

    	</div>

    <a href="alterarsenha.jsp" class="btn btn-warning" role="button">Alterar minha senha</a>


    <button type="button" class="btn btn-primary">Alterar dados</button>
    <button type="button" class="btn btn-success">Salvar</button>
    <a href="painelcontrole.jsp" class="btn btn-danger" role="button">Cancelar</a>
    

  
  </form>


</body>
</html>