<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Demo</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body>

	<div class="container">
		<form:form action="/paciente/guardarPaciente" method="post" modelAttribute="paciente">

			<form:label path="nombre">Nombre:</form:label>
			<form:input class="form-control" path="nombre" for="nombre" />
			<br>
			<form:label path="apellido">Apellido:</form:label>
			<form:input class="form-control" path="apellido" for="apellido" />
			<br>
			<form:label path="fechaNacimiento">Fecha de Nacimiento:</form:label>
			<form:input class="form-control" type="date" path="fechaNacimiento" for="fechaNacimiento" />
			<br>
			<form:label path="rut">Rut:</form:label>
			<form:input class="form-control" path="rut" for="rut" />
			<br>
			<input class="btn btn-primary" type="submit" value="Registrar paciente">
		</form:form>
		<br>
		<a class="btn btn-outline-success" href="paciente/mostrarPacientes">Mostrar Pacientes</a>
		<a class="btn btn-outline-success" href="/cita">Crear Cita</a>
	</div>
</body>
</html>