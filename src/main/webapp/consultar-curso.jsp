<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="pt-br">

<body>
	<h1 class="intro">Selecione as suas preferências para encontrar o
		curso perfeito!</h1>
	<form action="consultar-curso" method="post">
		<div class="container-field">
			<select class="optn" name="modalidade">
				<option selected disabled value="">Modalidade</option>
			</select> <select class="optn" name="nota">
				<option selected disabled value="">Nota</option>
			</select> <select class="optn" name="turno">
				<option selected disabled value="">Turno</option>
			</select> <label>Preço</label> <input type="range" min="${curso.PrecoMinimo}"
				max="${curso.PrecoMaximo}" value="50" name="preco"> <select
				class="optn" name="duracao">
				<option selected disabled value="">Duração do curso</option>
			</select> <select class="optn" name="area">
				<option selected disabled value="">Área</option>
			</select> <select class="optn" name="instituicao">
				<option selected disabled value="">Instituição</option>
			</select> <input class="btn-buscar" type="submit" value="Buscar">
		</div>
	</form>
	<div>
		<section class="search-result">
			<h2>Resultados da pesquisa</h2>
			<c:forEach var="curso" items="${cursos}">
				<div class="container-card">
					<div class="card">
						<div class="content-card">
							<div class="ctn-card">
								<img class="img-card" src="" alt="">
							</div>
							<div>
								<i class="material-icons">info</i>
							</div>
						</div>
						<div class="card-info">
							<div>
								<a href="${curso.link}" class="card-link">${curso.nome}</a>
							</div>
						</div>
					</div>
				</div>
			</c:forEach>
	</div>

</body>

</html>