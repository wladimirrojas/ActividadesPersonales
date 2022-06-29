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
		
		<c:forEach var="auto" items="${autosCapturados}">
			<p>${auto.toString()}</p>
			<br>
			<br>		
		</c:forEach>		
	</div>

</body>
</html>