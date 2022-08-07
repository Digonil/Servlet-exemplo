<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Cliente</h1>
	<br>
	
	<a href="cliente-novo">Novo Cliente</a>
	
	<br>
	
	<table>
		<tr>
			<th>Id</th>
			<th>Nome</th>
			<th>Email</th>
			<th>Açoes</th>
		</tr>
		
		<c:forEach items="${listaClientes}" var="cliente"> 
		<tr>
			<td>${cliente.idCliente}#</td>
			<td>${cliente.nomeCliente}</td>
			<td>${cliente.emailCliente }</td>
			<td><a href="cliente-excluir?id=${cliente.idCliente}"></a> 
		</tr>
		</c:forEach>
		
	</table>
</body>
</html>