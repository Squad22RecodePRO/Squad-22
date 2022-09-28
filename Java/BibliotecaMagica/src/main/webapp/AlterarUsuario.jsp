<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alteração do usuario ${usuario.nome}</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css"
	rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
	crossorigin="anonymous"></script>

</head>
<body>

		<div class="container">
		<h5>Alteração do usuario ${usuario.nome}</h5>
		<form action="editar" method="post" class="form-control">

			<input type="hidden" name="id" value="${usuario.id}">
			<p>Nome:</p>
			<p>
				<input type="text" name="nome" value="${usuario.nome}">
			</p>
			<p>Email:</p>
			<p>
				<input type="text" name="email" value="${usuario.email}">
			</p>
			<p>Data de nascimento:</p>
			<p>
				<input type="text" name="dataNasc" value="${usuario.dataNasc}">
			</p>
			<p>Id permissão:</p>
			<p>
				<input type="number" name="permissao" value="${usuario.permissao}">
			</p>
			<button type="submit" class="btn btn-success">Atualizar</button>
		</form>
		
	</div>

</body>
</html>