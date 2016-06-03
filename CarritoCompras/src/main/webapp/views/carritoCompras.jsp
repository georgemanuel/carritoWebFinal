<%@ page import="smart.capacitacion.modelo.Producto" %>
<%@ page import="java.util.*" %>

<!DOCTYPE HTML>
<html>
<head>
	<style>
		body {
			font-family: sans-serif;
			}
		table {
				padding: 10px;
				font-family: sans-serif;
				color:white;
			}
		td, th {
				border: 1px solid black;
				text-align: center;
				background-color: teal;
			}
		ul li {
			display: inline;
			padding: 5px 10px 5px 10px;
			}
		ul {
			background-color: teal;
			color:white;
			margin: 10px 10px 0px 10px;
			list-style-type: none;
			padding: 5px 0px 5px 0px;
			border-bottom-left-radius: 13px;
			border-bottom-right-radius: 13px;
			}
		header{
			background-image: url("img/pared.jpg");
			background-repeat: repeat-x;
			background-position: right;
			background-color: navy;
			margin: 10px 10px 0px 10px;
			height: 175px;
			color: white;
			border-top-left-radius: 13px;
			border-top-right-radius: 13px;
			}
		h1 {
			margin: 10px;
			padding: 30px;
			text-align: center;
			font-family: sans-serif;
			font-size: 75px;
			}
		section {
			padding: 15px;
			margin: 5px;
			}
		img {
			width: 235px;
			height: 235px;
			}
	</style>
	<meta charset="utf-8">
	<title>tus productos</title>
</head>
<body>
	<header>
		<h1>TUS PRODUCTOS</h1>
	</header>
	<nav>
		<ul>
			<li>Home</li>
			<li>Catalogo</li>
			<li>Carrito de Compras</li>
			<li>Mi cuenta</li>
		</ul>
	</nav>
	<p>
		
	</p>
	<section>
	<table>
		<%List <Producto> productos = new ArrayList<Producto>();%>
		<% for (int i=0; i<productos.size();i++){%>
		<tr>
			<td>
				<img src="../img/converse.jpg" alt = "tenis converse">
				<p>
					Tenis Converse $800
				</p>
				<p>
					<input type= "submit" value= "Eliminar">
				</p>
				<p>
					<input type= "submit" value= "Comprar">
				</p>
			</td>
		</tr>	
		<%}%>	
	</table>
	
	</section>
</body>
</html>