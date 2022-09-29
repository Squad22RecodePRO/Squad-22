<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alterar login: ${login.login}</title>

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
		<h4 class="text-center my-4">Alterar login: ${login.login}</h4>
		<div class="container d-flex justify-content-center flex-wrap">
		
			<form action="editarLogin" method="post" class="form-control p-3"
				style="width: 500px;">

				<input type="hidden" name="id" value="${login.id}">
				<fieldset>
					<div class="row g-3">
						<div class="form-group mb-3 col-12">
							<label for="login" class="form-label">Login: </label> <input
								type="text" name="login" class="form-control"
								value="${login.login}">
						</div>
					</div>
					<div class="row g-3">
						<div class="form-group mb-3 col-12">
							<label for="senha" class="form-label">Senha: </label> <input
								type="text" name="senha" class="form-control"
								value="${login.senha}">
						</div>
					</div>
					<div class="row g-3">
						<div class="form-group col-12">
							<label for="usuario" class="form-label">Id usuário </label> <input
								type="number" name="usuario" class="form-control"
								value="${login.getUsuario().id}">
						</div>
					</div>
					<div class="form-group mb-3 float-end">
					<a href="listarUsuario" class="link-secondary">Consultar usuários </a>
				</div>
					<button type="submit" class="mt-4 btn btn-outline-success">Atualizar</button>
				</fieldset>
			</form>
		</div>
	</div>
</body>
</html>