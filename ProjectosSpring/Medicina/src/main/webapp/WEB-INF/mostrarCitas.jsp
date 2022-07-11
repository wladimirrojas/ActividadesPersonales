<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Mostrar citas</title>
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
					<th scope="col">Paciente</th>
					<th scope="col">Hora</th>
					<th scope="col">Area médica</th>
					<th scope="col">Acciones</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="citaMedica" items="${listaCitas}">
					<tr>
						<th scope="row">${citaMedica.id}</th>
						<td>${citaMedica.paciente.nombre}
							${citaMedica.paciente.apellido}</td>
						<td>${citaMedica.hora}</td>
						<td>${citaMedica.areaMedica}</td>
						<td><a class="btn btn-warning" href="/cita/editar" role="button">Editar</a></td>
						<td><a class="btn btn-danger" href="/cita/eliminar/${citaMedica.id}" role="button">Eliminar</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a class="btn btn-outline-success" href="/paciente">Crear Paciente</a>
		<a class="btn btn-outline-success" href="/cita">Crear Cita</a>
	</div>
</body>
</html>