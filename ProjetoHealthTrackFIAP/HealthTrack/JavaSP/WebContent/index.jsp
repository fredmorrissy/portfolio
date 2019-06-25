<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<%@ include file="header.jsp" %>
<link rel="stylesheet" type="text/css" href="resources/css/login.css">

<title>Insert title here</title>


</head>
<body>

<%@ include file="footer.jsp" %>


  <h1>Health Track</h1>

	
<div class="container-fluid bg">
	<div class="row">
		<div class="col-md-4 offset-md-4"></div>
		<div class="col-md-4 offset-md-4">

		  <!--form start-->
		   <form class="form-container" name="login">
		   	<h1>Login</h1>
 			<div class="form-group">
    			<label for="exampleInputEmail1">Email</label>
    			<input type="email" class="form-control" id="exampleInputEmail1" name="emaillogin" placeholder="Digite seu email">
    		</div>
            <div class="form-group">
     			<label for="exampleInputPassword1">Senha</label>
    			<input type="password" class="form-control" id="exampleInputPassword1" name="senhalogin" placeholder="Digite sua senha">
          <p class="fsize">Mínimo seis caracteres, combinando letras e números.</p>
  			</div>
  			<div class="form-group form-check">
    			<input type="checkbox" class="form-check-input" id="exampleCheck1">
    			<label class="form-check-label" for="exampleCheck1">Lembrar-me</label>
  			</div>
  			<a href="painelcontrole.jsp" class="btn btn-success btn-block" role="button">Fazer login</a>
  			<a href="cadastro.jsp" class="btn btn-outline-success btn-block" role="button">Cadastre-se</a>

  			
  				
  <!-- Button to Open the Modal -->
  <button type="button" class="btn btn-primary btn-block btn-sm" data-toggle="modal" data-target="#myModal">Esqueci minha senha
  </button>

  <!-- The Modal -->
  <div class="modal fade" id="myModal" name="modalemail">
    <div class="modal-dialog">
      <div class="modal-content">
      
        <!-- Modal Header -->
        <div class="modal-header">
          <h2 class="modal-title">Esqueci minha senha</h2>
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
        
        <!-- Modal body -->
        <div class="modal-body">
          <p class="modal-parag">Digite seu e-mail abaixo para que possamos reenviar a sua senha:</p>
          <label for="email" class="emlcolor">E-mail de contato:</label>
    	  <input type="email" class="form-control" id="email" name="emailmodal" placeholder="Digite aqui seu e-mail">
    	  <button type="button" class="btn btn-success">Reenviar senha</button>

        </div>
        
        <!-- Modal footer -->
        <div class="modal-footer">
          <button type="button" class="btn btn-danger" data-dismiss="modal">Close</button>
        </div>
        
      </div>
    </div>
  </div>
  
</div>
<div class="container">

  			</div>	
			
			</form>	
			<!--form end-->	  
		</div>
		
	</div>
</div>




</body>
</html>