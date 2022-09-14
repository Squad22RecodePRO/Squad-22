<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Usuários</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa"
	crossorigin="anonymous"></script>


</head>
<body>

	<div class="container">
		<h3>Cadastro usuário</h3>
		<form action="InserirUsuario" method="post" class="form-control">
			<fieldset>
				<legend>Dados de usuário</legend>

				<p>
					<label for="nome">Nome:</label> <input type="text" id="nome"
						name="nome" size="40" class="form-control" required>
				</p>

				<p>
					<label for="email">Email:</label> <input type="email"
						id="email" name="email" size="15" class="form-control" required>
				</p>

				<p>
					<label for="data">Data de nascimento:</label> <input type="text"
						id="data" name="dataNasc" size="15" class="form-control" required>
				</p>

				<p>
					<input type="submit" value="Cadastrar Cliente"
						class="btn btn-primary">
				</p>
			</fieldset>
		</form>
		
		<br>
		<h5>Usuário cadastrado</h5>
		<table class="table">
			<thead>
				<tr>
					<th>Nome</th>
					<th>Email</th>
					<th>Data de nascimento</th>
					<th>Açoes</th>
				</tr>
			</thead>
			<tbody>
				<jstl:forEach items="${listaUsuarios}" var="usuario">
					<tr>
						<td>${usuario.nome}</td>
						<td>${usuario.email}</td>
						<td>${usuario.dataNasc}</td>
						<td><a href="editar?id=${usuario.id}" class="btn btn-success">Editar</a>
							<a href="excluir?id=${usuario.id}"
							onclick="return confirm('Deseja Excluir?')"
							class="btn btn-danger">Excluir</a></td>
					</tr>
				</jstl:forEach>

			</tbody>
		</table>
	</div>
</body>
</html>