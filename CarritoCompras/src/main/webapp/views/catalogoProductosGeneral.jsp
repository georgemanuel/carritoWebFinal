<%@ page import="smart.capacitacion.modelo.CarritoCompras" %>
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
			background-image: url("../img/pared.jpg");
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
	<title>catalogo de productos</title>
</head>
<body>
	<header>
		<h1>CATALOGO DE PRODUCTOS</h1>
	</header>
	<nav>
		<ul>
			<li>Home</li>
			<li>Catalogo</li>
			<%CarritoCompras carritoCompras = (CarritoCompras)(session.getAttribute("carritoCompras"));  %>
			<li><a href="../ProductoServlet">Carrito de Compras (<%= carritoCompras.getProductosEnCarrito().size() %>)Productos</a></li>
			<li>Mi cuenta</li>
		</ul>
	</nav>
	<p>
		
	</p>
	<section>
	<table>
		<tr>
			<td>
				<img src="../img/converse.jpg" alt = "tenis converse">
				<p>
					Tenis Converse $800
				</p>
				<p>
					<input type= "submit" value= "Agregar">
				</p>
			</td>
			
			<td>
				<img src = "../img/bicicleta.jpg" alt = "bicicleta">
				<p>
					Bicicleta $10,000
				</p>
				<p>
					<input type= "submit" value= "Agregar">
				</p>
			</td>
			
			<td>
				<img src = "../img/gameBoy.jpg" alt= "gameBoy">
				<p>
					Game boy $5000
				</p>
				<p>
					<input type= "submit" value= "Agregar">
				</p>
			</td>
			
			<td>
				<img src = "../img/espada.jpg" alt= "espada">
				<p>
					Espada $18,000
				</p>
				<p>
					<input type= "submit" value= "Agregar">
				</p>
			</td>
			
			<td>
				<img src = "../img/casco.jpg" alt= "casco">
				<p>
					Casco $900
				</p>
				<p>
					<input type= "submit" value= "Agregar">
				</p>
			</td>
		</tr>
	</table>
	<table>
		<tr>
			<td>
				<img src = "../img/jabon.jpg" alt= "jabon">
				<p>
					Jabon $15
				</p>
				<p>
					<input type= "submit" value= "Agregar">
				</p>
			</td>
			
			<td>
				<img src = "../img/botella_color.jpg" alt= "botella_color">
				<p>
					Botella de color $20
				</p>
				<p>
					<input type= "submit" value= "Agregar">
				</p>
			</td>
			
			<td>
				<img src = "../img/millenium_falcon.jpg" alt= "millenium_falcon">
				<p>
					Millenium Falcon $900,000
				</p>
				<p>
					<input type= "submit" value= "Agregar">
				</p>
			</td>
			
			<td>
				<img src = "../img/at-at.jpg" alt= "at-at">
				<p>
					Mascota AT-AT $3000
				</p>
				<p>
					<input type= "submit" value= "Agregar">
				</p>
			</td>
		
			<td>
				<img src = "../img/mustang.jpg" alt= "mustang">
				<p>
					Mustang $800,000
				</p>
				<p>
					<input type= "submit" value= "Agregar">
				</p>
			</td>
		</tr>
	</table>
	</section>
</body>
</html>