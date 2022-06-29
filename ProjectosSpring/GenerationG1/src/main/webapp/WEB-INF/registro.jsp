<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> <!-- nos permite trabajar con formularios -->

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registro</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body>
	<div class="container">
		<c:if test="${msgError != null }">
			<c:out value="${msgError }"></c:out>
		</c:if>
		<form:form action="/registro/usuario" method="Post" modelAttribute="usuario">
			
			<form:label path="nombre" >Nombre: </form:label>
			<form:input path="nombre" class="form-control" for="nombre"/>
			<br>
			<br>
			<form:label path="apellido">Apellido: </form:label>
			<form:input path="apellido" class="form-control" for="apellido"/>
			<br>
			<br>
			<form:label path="edad">Edad: </form:label>
			<form:input type="number" class="form-control" path="edad" for="edad"/>
			<br>
			<br>
			<form:label path="password">Password: </form:label>
			<form:input type="password" class="form-control" path="password" for="password"/>
			<br>
			<br>			
			</form:form>
	</div>

</body>
</html>