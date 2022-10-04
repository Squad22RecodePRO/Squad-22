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
	<!-- Início do navbar -->
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<div class="container-fluid">
			<a class="navbar-brand me-5" href="#"> <img class="logo"
				src="imgs/logo_escrita_semfundo.png"
				style="width: 120px; height: 40px;">
			</a>
			<button class="navbar-toggler" type="button"
				data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup"
				aria-controls="navbarNavAltMarkup" aria-expanded="false"
				aria-label="Toggle navigation">
				<span class="navbar-toggler-icon"></span>
			</button>
			<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
				<div class="navbar-nav">
					<a class="nav-link mx-2" href="listarUsuario">Usuários</a> <a
						class="nav-link mx-2" href="listarLogin">Logins</a> <a
						class="nav-link mx-2" href="listarPermissao">Permissões</a> <a
						class="nav-link mx-2" href="listarGenero">Gêneros</a> <a
						class="nav-link mx-2" href="listarLivro">Livros</a>
				</div>

			</div>
		</div>
	</nav>
	<!-- Fim do navbar -->

	<!-- Início do formulário cadastro -->
	<h3 class="text-center my-4">Usuários</h3>

	<div class="container d-flex justify-content-center flex-wrap">
		<form action="InserirUsuario" method="post" class="form-control p-3"
			style="width: 600px;">

			<fieldset>
				<legend>Dados de cadastro</legend>

				<div class="row g-3">
					<div class="form-group mb-3 col-12">
						<label for="nome" class="form-label">Nome: </label> <input
							type="text" id="nome" name="nome" class="form-control" required>
					</div>
				</div>

				<div class="row g-3">
					<div class="form-group mb-3 col-12">
						<label for="email" class="form-label">Email: </label> <input
							type="email" id="email" name="email" class="form-control"
							required>
					</div>
				</div>

				<div class="row g-3">
					<div class="form-group col-6">
						<label for="data" class="form-label">Data de nascimento: </label>
						<input type="text" id="data" name="dataNasc" class="form-control"
							required>
					</div>

					<div class="form-group col-6">
						<label for="permissao" class="form-label">Id permissão </label> <input
							type="number" id="permissao" name="permissao"
							class="form-control" required>
					</div>
				</div>
				<div class="form-group mb-3 float-end">
					<a href="listarPermissao" class="link-secondary">Consultar permissões </a>
				</div>

				<div class="col-12 mt-4">
					<button type="submit" class="btn btn-outline-success">Cadastrar</button>
				</div>
			</fieldset>
		</form>
		<!-- Fim formulário cadastro -->

		<!-- Início tabela mostrar -->
		<div class="container mt-5 mb-5">

			<h4 class="mb-2 text-center">Usuários cadastrados</h4>
			<div class="table-responsive d-flex justify-content-center">
				<table class="mt-3 table table-bordered align-middle text-center"
					style="width: 1000px;">
					
					<thead class="table-light">
						<tr>
							<th>Id</th>
							<th>Nome</th>
							<th>Email</th>
							<th>Data de nascimento</th>
							<th>Permissão</th>
							<th>Açoes</th>
						</tr>
					</thead>
					<tbody>
						<jstl:forEach items="${listaUsuarios}" var="usuario">
							<tr>
								<td>${usuario.id}</td>
								<td>${usuario.nome}</td>
								<td>${usuario.email}</td>
								<td>${usuario.dataNasc}</td>
								<td>${usuario.getPermissao().tipo}</td>
								
								<td class="p-2">
									<a href="editarUsuario?id=${usuario.id}"
									class="btn btn-outline-info me-2">Editar</a> 
									<a	href="excluirUsuario?id=${usuario.id}"
									onclick="return confirm('Deseja Excluir?')"
									class="btn btn-outline-danger">Excluir</a>
								</td>
							</tr>
						</jstl:forEach>

					</tbody>
				</table>
			</div>
		</div>
		</div>
</body>
</html>