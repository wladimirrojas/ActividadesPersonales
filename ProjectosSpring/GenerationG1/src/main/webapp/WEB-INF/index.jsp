<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  <!-- nos permite usar anotaciones adicionales de js con el prefijo c -->
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Titulo de la página</title>
</head>
<body>
<h1>Hola Mundo a <c:out value="${nombre}"></c:out> <c:out value="${apellido}"></c:out> </h1>
<p>
<br>
<p>Objeto  <c:out value="${usuario.nombre } ${usuario.apellido }"></c:out> </p>

</body>
</html>