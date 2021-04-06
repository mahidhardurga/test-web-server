<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Hi!,This is Home..</h1>

	<form:form action="/addStudent" modelAttribute="student">
		<form:input path="name" placeholder="Enter Name" />

		<form:input path="city" placeholder="Enter City" />

		<button type="submit">Add</button>
	</form:form>

	<c:if test="${isDone == true}">
		<table>
			<td>${student.id}</td>
			<td>${student.name}</td>
			<td>${student.city}</td>
		</table>
		
		<h3>${Sucess}</h3>
	</c:if>

</body>
</html>