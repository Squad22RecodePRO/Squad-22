<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Alterar usuário ${usuario.nome}</title>
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

	<div class="container">
		<h4 class="text-center my-4">Alterar usuário: ${usuario.nome}</h4>
		<div class="container d-flex justify-content-center flex-wrap">

			<form action="editarUsuario" method="post" class="form-control p-3"
				style="width: 600px;">

				<input type="hidden" name="id" value="${usuario.id}">

				<div class="row">
					<div class="form-group mb-3 col-12">
						<label for="nome" class="form-label">Nome: </label> <input
							type="text" name="nome" class="form-control"
							value="${usuario.nome}">
					</div>
				</div>
				<div class="row">
					<div class="form-group mb-3 col-12">
						<label for="email" class="form-label">Email: </label> <input
							type="text" name="email" class="form-control"
							value="${usuario.email}">
					</div>
				</div>
				<div class="row">
					<div class="form-group col-6">
						<label for="dataNasc" class="form-label">Data de
							nascimento </label> <input type="text" name="dataNasc"
							class="form-control" value="${usuario.dataNasc}">
					</div>

					<div class="form-group col-6">
						<label for="permissao" class="form-label">Id permissao: </label> <input
							type="number" name="permissao" class="form-control"
							value="${usuario.getPermissao().id}">
					</div>
				</div>
				<div class="form-group mb-3 float-end">
					<a href="listarPermissao" class="link-secondary">Consultar permissões </a>
				</div>

				<div class="col-12 mt-4">
					<button type="submit" class="btn btn-outline-success">Atualizar</button>
				</div>
			</form>
		</div>
	</div>

</body>
</html>