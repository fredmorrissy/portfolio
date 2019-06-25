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

<form class="shadow m-5 p-5" id="formCadastro">
		<h1>Cadastro de Usuário</h1>
	  	<div class="form-group col-5">

    <label for="nome">Nome Completo:</label>
    <input type="text" name="nome" class="form-control" id="nome">
    	</div>
    
    	<div class="form-group col-2">
        	<label for="data">Data de nascimento:</label>
    		<input type="date" name="data" class="form-control" id="data">
    	</div>

    	<div class="form-group col-2">
    <label for="genero">Gênero:</label>
    <select class="form-control" name="genero" id="genero">
        <option value="">----</option>
        <option value="M">Masculino</option>
        <option value="F">Feminino</option>
        <option value="Outro">Outro</option>
        <option value="naoinformar">Não desejo informar</option>
    </select>
    	</div>

    	<div class="form-group col-5">
    <label for="peso">Peso (em Kg):</label>
    <input type="text" name="peso" class="form-control" id="peso">
    	</div>

    	<div class="form-group col-5">
    <label for="altura">Altura (em metros):</label>
    <input type="text" name="altura" class="form-control" id="altura">
    	</div>

    	<div class="form-group col-5">
    <label for="email">E-mail de contato:</label>
    <input type="email" name="email" class="form-control" id="email">
    	</div>

    	<div class="form-group col-5">
    <label for="senha">Senha:</label>
    <input type="password" name="senha" class="form-control" id="senha">
    	</div>


    <button type="submit" class="btn btn-primary">Cadastrar</button>
    <a href="index.jsp" class="btn btn-danger" role="button">Cancelar</a>
    

  
  </form>
  </div>

</body>
</html>