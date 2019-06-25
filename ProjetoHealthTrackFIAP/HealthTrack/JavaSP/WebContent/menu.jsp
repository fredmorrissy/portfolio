<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div id="wrapper" class="animate">
    <nav class="navbar header-top fixed-top navbar-expand-lg navbar-dark bg-primary">
      <span class="navbar-toggler-icon leftmenutrigger"></span>
      <a class="navbar-brand" href="#">Health Track</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarText" aria-controls="navbarText"
        aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarText">
        <ul class="navbar-nav animate side-nav">
          <li class="nav-item">
            <a class="nav-link" href="painelcontrole.jsp" title="Dashboard"><i class="fas fa-cube"></i> Dashboard <i class="fas fa-cube shortmenu animate"></i></a>   
          </li>
          <li class="nav-item">
            <a class="nav-link" href="perfil.jsp" target="_self" title="Perfil"><i class="fas fa-user"></i> Perfil <i class="fas fa-user shortmenu animate"></i></a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="peso.jsp" target="_self" title="Peso"><i class="fas fa-balance-scale"></i> Peso <i class="fas fa-balance-scale shortmenu animate"></i></a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="alimentacao?acao=listar" target="_self" title="Alimentação"><i class="fas fa-utensils"></i> Alimentação <i class="fas fa-utensils shortmenu animate"></i></a>
          </li>
           <li class="nav-item">
            <a class="nav-link" href="pressao.jsp" target="_self" title="Pressão"><i class="fas fa-heartbeat"></i> Pressão <i class="fas fa-heartbeat shortmenu animate"></i></a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="atfisica.jsp" target="_self" title="Atividades"><i class="fas fa-bicycle"></i> Atividades <i class="fas fa-bicycle shortmenu animate"></i></a>
          </li>
        </ul>
        <ul class="navbar-nav ml-md-auto d-md-flex">
          <li class="nav-item">
            <a class="nav-link" href="perfil.jsp"><i class="fas fa-user"></i> Perfil </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="index.jsp"><i class="fas fa-key"></i> Sair </a>
          </li>
        </ul>
      </div>
    </nav>
  </div>






</body>
</html>