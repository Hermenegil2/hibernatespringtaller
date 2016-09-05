<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="/hibernatespringtaller/resources/css/bootstrap.css">

<title>Insert title here</title>
</head>
<body Class="container">
<nav>
			<ul class="nav nav-pills nav-justified"> 
			    	<li><a href="/" >Inicio</a></li>
					<li Class="active"><a href="#" >Registrar Cliente</a></li>
					<li><a href="productos/formulario">Registrar Producto</a></li>
		   </ul>

</nav>
<form action="/hibernatespringtaller/clientes" method="post" class="hero-unit">


<label for="nombre">Nombre</label>
<input type="text" name="nombre" id="nombre">

<label for="correo">Correo</label>
<input type="text" name="correo" id="correo">


<input type="submit" value="Enviar Datos">

</form>



</body>
</html>