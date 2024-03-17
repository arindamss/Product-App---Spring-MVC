<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Product Table</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f4f4f4;
}

table {
	width: 100%;
	border-collapse: collapse;
	margin-top: 20px;
}

th, td {
	padding: 12px 15px;
	text-align: left;
	border-bottom: 1px solid #ddd;
}

th {
	background-color: #4CAF50;
	color: white;
	font-weight: bold;
}

tr:hover {
	background-color: #f2f2f2;
}

.delete-icon, .update-icon {
	cursor: pointer;
}

.delete-icon:hover, .update-icon:hover {
	color: red;
}
</style>
</head>
<body>

	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Details</th>
				<th>Price</th>
				<th>Actions</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${data }" var="p">


				<tr>
					<td>${p.id }</td>
					<td>${p.name}</td>
					<td>${p.desc }</td>
					<td>${p.price }</td>
					<td><a href="delete/${p.id }"><span class="delete-icon" >&#128465;</span> </a>&nbsp;<a href="update/${p.id }"><span
						class="update-icon">&#9998;</span></a></td>
				</tr>
			</c:forEach>

			<!-- Add more rows as needed -->
		</tbody>
	</table>
	<a href="addForm"><button>Add</button></a>

</body>
</html>
