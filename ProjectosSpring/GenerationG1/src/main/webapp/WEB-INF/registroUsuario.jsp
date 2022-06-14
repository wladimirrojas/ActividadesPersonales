<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro</title>
</head>
<body>
	<div>
		<!-- pasar informacion desde la vista a una url(action), se ven en la ruta   por default es con method="get" -->
		<!-- method="Post" los parametros van ocultos -->
		<form action="/registro/usuario" method="Post">
			<label for="nombre"> Nombre: </label>
			<input type="text" id="nombre" name="nombre">
			<br>
			<br>
			<label for="apellido"> Apellido: </label>
			<input type="text" id="apellido" name="apellido">
			<br>
			<br>
			<label for="edad"> Edad: </label>
			<input type="number" id="edad" name="edad">
			<br>
			<br>
			<input type="submit" value="Registrar"> <!-- submit para envío de informacion -->
			<input type="button" value="Enviar"> <!--  -->
		</form>
	</div>

</body>
</html>