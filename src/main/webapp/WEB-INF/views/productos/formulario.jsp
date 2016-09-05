<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="/hibernatespringtaller/resources/css/bootstrap.css">
<link rel="stylesheet" type="text/css" href="/hibernatespringtaller/resources/css/style.css">
<title>Insert title here</title>
</head>
<body Class=container>

<nav>
			<ul class="nav nav-pills nav-justified"> 
			    	<li><a href="/" >Inicio</a></li>
					<li><a href="/form/" >Registrar Cliente</a></li>
					<li Class="active"><a href="#">Registrar Producto</a></li>
		   </ul>

</nav>
	<form action="/hibernatespringtaller/productos/" method="post" class="hero-unit">


<label for="descripcion">Descripcion</label>
<input type="text" name="descripcion" id="descripcion">

<label for="fechavencimiento">Fecha Vencimiento</label>
<input type="text" name="fechavencimiento" id="fechavencimiento">

<label for="precio">Precio</label>
<input type="number" name="precio" id="precio">

<label for="cantidad">Cantidad</label>
<input type="number" name="cantidad" id="cantidad">
<input type="submit" value="Enviar Datos">

</form>
</body>
</html>