<%@ page import="smart.capacitacion.modelo.CarritoCompras" %>
<%@ page import="smart.capacitacion.modelo.Producto" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="smart.capacitacion.service.*" %>

<!DOCTYPE HTML>
<html>
<head>
	<style>
		body {
			font-family: sans-serif;
			}
		table {
				display: table-cell;
				display: inline;
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
	<script>
		function enviarFormulario(idProducto){
			console.log(idProducto)
			document.getElementById("idProducto").value=idProducto;
			document.forms.formProductos.submit();
		}
	</script>
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
			<li><form name="loginForm" action="../ComprasServlet" method="post">
		<a href="confirmacionCompra.jsp">Realizar Compra</a>
	</form></li>
			
		</ul>
	</nav>
	<p>
		
	</p>
	<section>
	<form name="formProductos" action="../ProductoServlet">
	<input type="hidden" id="idProducto" name="idProducto" value=""/>
	<table>
		<%
		ProductoService productoService = new ProductoServiceImpl();
		List<Producto> productosAll = new ArrayList<Producto>();
		productosAll = productoService.obtenerTodosLosProductos();
		int i=0;
		int limite=4;
		%>
		<tr>
		<%for (; i<limite; i++) {%>
				<td><%=productosAll.get(i).getNombreProducto()%></td>
				<td><img src="<%=productosAll.get(i).getUrlImagen()%>"/></td>
				<td><input type="button" value="comprar" onclick="enviarFormulario(<%=productosAll.get(i).getIdProducto()%>)"/>
		<%} %>
		</tr>
		<tr>
		<%for (;i<limite*2; i++) {%>
				<td><%=productosAll.get(i).getNombreProducto() %></td>
				<td><img src="<%=productosAll.get(i).getUrlImagen()%>"/></td>
				<td><input type="button" value="comprar" onclick="enviarFormulario(<%=productosAll.get(i).getIdProducto()%>)"/>
		<%} %>
		</tr>
		<tr>
		<%for (; i<productosAll.size(); i++) {%>
				<td><%=productosAll.get(i).getNombreProducto() %></td>
				<td><img src="<%=productosAll.get(i).getUrlImagen()%>"/></td>
				<td><input type="button" value="comprar" onclick="enviarFormulario(<%=productosAll.get(i).getIdProducto()%>)"/>
		<%} %>
		</tr>
		
	</table>
	</form>
	</section>
</body>
</html>