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
  <h2>Alterar Senha</h2>
  <p>Sua senha deve ter no mínimo seis caracteres, combinando letras e números.</p>
  <form action="#" id="alterarsenha">
   
    <div class="form-group" >
      <label for="pwdatual">Digite sua senha atual:</label>
      <input type="password" class="form-control" id="pwdatual" placeholder="Senha atual" name="pwdatual">
    </div>
    <div class="form-group">
      <label for="pwdnova">Crie uma nova senha:</label>
      <input type="password" class="form-control" id="pwdnova" placeholder="Nova senha" name="pwdnova">
    </div>
    <div class="form-group">
      <label for="pwdnova2">Repita sua nova senha:</label>
      <input type="password" class="form-control" id="pwdnova2" placeholder="Repita nova senha" name="pwdnova2">
    </div>
    
    <button type="submit" class="btn btn-primary">Alterar senha</button>
    <a href="perfil.jsp" class="btn btn-danger" role="button">Cancelar</a>
  </form>
</div>

</body>
</html>