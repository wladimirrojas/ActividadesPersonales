<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registro de autos</title>
</head>
<body>
	<div>
		<c:if test="${mensaje != null }">
			<c:out value="${mensaje }"></c:out>
		</c:if>
		<form:form action="/registrar/auto" method="Post" modelAttribute="auto">
			
			<form:label path="marca">Marca: </form:label>
			<form:input path="marca" for="marca"/>
			<br>
			<br>
			<form:label path="modelo">Modelo: </form:label>
			<form:input path="modelo" for="modelo"/>
			<br>
			<br>
			<form:label path="color">Color: </form:label>
			<form:input path="color" for="color"/>
			<br>
			<br>
			<form:label path="anio">Año: </form:label>
			<form:input type="number" path="anio" for="anio"/>
			<br>
			<br>
			<form:label path="velocidad">Spido: </form:label>
			<form:input type="number" path="velocidad" for="velocidad"/>
			<br>
			<br>						
			<input type="submit" value="Registrar">
				
		</form:form>
	</div>

</body>
</html>