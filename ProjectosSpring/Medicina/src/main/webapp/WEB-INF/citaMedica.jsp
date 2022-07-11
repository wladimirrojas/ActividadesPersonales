<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Agregar Cita Médica</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
</head>
<body>

	<div class="container">

		<form:form action="/cita/guardarCita" method="post"
			modelAttribute="citaMedica">
			<br>
			<form:select path="paciente" class="form-select">
				<form:option value="0">Seleccione paciente</form:option>
				<c:forEach var="paciente" items="${listaPacientes}">
					<form:option value="${paciente.id}">${paciente.nombre} ${paciente.apellido}</form:option>
				</c:forEach>
			</form:select>
			<br>
			<div class="form-floating mb-3">
				<form:input path="hora" class="form-control" id="floatingInput"
					for="hora" />
				<form:label for="floatingInput" path="hora">Hora:</form:label>
			</div>
			<div class="form-floating mb-3">
				<form:input path="areaMedica" class="form-control" for="areaMedica"
					id="floatingInput" />
				<form:label for="floatingInput" path="areaMedica">Area médica:</form:label>

			</div>

			<input class="btn btn-primary" type="submit" value="Registrar cita">
		</form:form>
		<br>
		<a class="btn btn-outline-success" href="/paciente">Crear Paciente</a>
		<a class="btn btn-outline-success" href="/cita/mostrarCitas">Mostrar citas</a>
	</div>
</body>
</html>