<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro login</title>

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
		<h3>Cadastro login</h3>
		<form action="InserirLogin" method="post" class="form-control">
			<fieldset>
				<legend>Dados do login</legend>

				<p>
					<label for="login">Login:</label> <input type="text" id="login"
						name="login" size="20" class="form-control" required>
				</p>

				<p>
					<label for="senha">Senha:</label> <input type="text" id="senha"
						name="senha" size="20" class="form-control" required>
				</p>

				<p>
					<label for="usuario">Id usuário:</label> <input type="number"
						id="usuario" name="usuario" size="15" class="form-control" required>
				</p>

				<p>
					<input type="submit" value="Cadastrar Cliente"
						class="btn btn-primary">
				</p>
			</fieldset>
		</form>

		<br>
		<h5>Login cadastrado</h5>
		<table class="table">
			<thead>
				<tr>
					<th>Login</th>
					<th>Senha</th>
					<th>Id usuário</th>
					<th>Açoes</th>
				</tr>
			</thead>
			<tbody>
				<jstl:forEach items="${listaLogins}" var="login">
					<tr>
						<td>${login.login}</td>
						<td>${login.senha}</td>
						<td>${login.getUsuario().id}</td>
						<td><a href="editar?id=${login.id}" class="btn btn-success">Editar</a>
							<a href="excluir?id=${login.id}" onclick="return confirm('Deseja Excluir?')"
							class="btn btn-danger">Excluir</a></td>
					</tr>
				</jstl:forEach>

			</tbody>
		</table>
	</div>

</body>
</html>