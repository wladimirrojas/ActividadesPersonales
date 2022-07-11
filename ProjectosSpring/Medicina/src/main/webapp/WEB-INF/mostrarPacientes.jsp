<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mostrar Pacientes</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body>

	<div class="container">

		<table class="table">
			<thead>
				<tr>
					<th scope="col">#</th>
					<th scope="col">Nombre de Paciente</th>
					<th scope="col">Fecha de Nacimiento</th>
					<th scope="col">Rut</th>
					<th scope="col">Acciones</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="paciente" items="${listaPacientes}">
					<tr>
						<th scope="row">${paciente.id}</th>
						<td>${paciente.nombre} ${paciente.apellido}</td>
						<td>${paciente.fechaNacimiento}</td>
						<td>${paciente.rut}</td>
						<td><a class="btn btn-warning" href="/paciente/" role="button">Editar</a></td>
						<td><a class="btn btn-danger" href="/paciente/eliminar/${paciente.id}" role="button">Eliminar</a></td>

					</tr>
				</c:forEach>
			</tbody>
		</table>
		<br>
		<a class="btn btn-outline-success" href="/paciente">Crear Paciente</a>
		<a class="btn btn-outline-success" href="/cita">Crear Cita</a>
	</div>
</body>
</html>