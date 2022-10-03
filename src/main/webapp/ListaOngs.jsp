<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="jstl"%>
	
	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Agenda</title>


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
		<h5>Contatos cadastrado</h5>
	
	<table class="table">
		<thead>
			<tr>
				<th>ONG</th>
				<th>Nome Administrador</th>
				<th>Email</th>
				<th>Estado</th>
				<th>Link da doação</th>
			</tr>
		</thead>
		<tbody>
		    <!--Para cada contato se chamará contao -->
			<jstl:forEach items="${listaDeOngs}" var="ong">
				<tr>
					<td>${ong.nomeOng}</td>
					<td>${ong.nomeAdm}</td>
					<td>${ong.email}</td>
					<td>${ong.estado}</td>
					<td>${ong.linkDoacao}</td>
					<td>
						<!--<a href="editar?id=${contato.id}" class="btn btn-success">Editar</a>  -->  
						<a href="excluir?id=${ong.id}" onclick="return confirm('Deseja Excluir?')" class="btn btn-danger">Excluir</a>
					</td>
				</tr>
			</jstl:forEach>
			
		</tbody>
	</table>
	</div>
</body>
</html>