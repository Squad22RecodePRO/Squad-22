<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Gênero</title>

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
	<h3 class="text-center my-4">Gêneros</h3>

	<div class="container d-flex justify-content-center flex-wrap">
		<form action="InserirGenero" method="post" class="form-control p-3"
			style="width: 500px;">

			<fieldset>
				<legend>Dados de cadastro</legend>

				<div class="row g-3">
					<div class="form-group mb-3 col-12">
						<label for="genero" class="form-label">Gênero: </label> <input
							name="genero" type="text" class="form-control" id="genero" required>
					</div>
				</div>

				<div class="col-12">
					<button type="submit" class="btn btn-outline-success">Cadastrar</button>
				</div>
			</fieldset>
		</form>
		<!-- Fim formulário cadastro -->
		

		<!-- Início tabela mostrar -->
		<div class="container mt-5 mb-5">

			<h4 class="mb-2 text-center">Gêneros cadastrados</h4>
			<div class="table-responsive d-flex justify-content-center">
				<table class="mt-3 table table-bordered align-middle text-center"
					style="width: 600px;">
					<thead class="table-light">
						<tr>
							<th>Id</th>
							<th>Gênero</th>
							<th>Ações</th>
						</tr>
					</thead>
					<tbody>
						<jstl:forEach items="${listaGenero}" var="genero">
							<tr>
								<td>${genero.id_genero}</td>
								<td>${genero.genero}</td>

								<td class="p-2"><a
									href="editarGenero?id_genero=${genero.id_genero}"
									class="btn btn-outline-info me-2">Editar</a> <a
									href="excluirGenero?id_genero=${genero.id_genero}"
									onclick="return confirm('Deseja Excluir?')"
									class="btn btn-outline-danger">Excluir</a></td>
							</tr>
						</jstl:forEach>

					</tbody>
				</table>
			</div>
		</div>
		<!-- Fim tabela mostrar -->
	</div>
</body>
</html>