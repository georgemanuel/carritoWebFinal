<%@ page import="smart.capacitacion.modelo.CarritoCompras" %>
<!DOCTYPE HTML>
<html>
<head>
	<style>
		body {
			font-family: sans-serif;
		}
		form {
			display: table;
			padding: 10px;
			border: thin dotted #7e7e7e;
			background-color: teal;
			align:right;
		}
		form textarea {
			width: 500px;
			height: 200px;
		}
		div.tableRow {
			display: table-row;
		}
		div.tableRow p {
			display: table-cell;
			vertical-align: top;
			padding: 3px;
			text-align:right;
		}
		div.tableRow p:first-child {
			text-align: right;
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
			background-image: url("imagenes/pared.jpg");
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
	</style>
	<meta charset="utf-8">
	<title>Compra</title>
</head>
<body>
	<header>
		<h1>COMPRA</h1>
	</header>
	<nav>
		<ul>
			<li>Home</li>
			<li>Catalogo</li>
			<li>Carrito de Compras</li>
			<li>Mi cuenta</li>
			
			
		</ul>
	</nav>
	<center>
	<%CarritoCompras carritoCompras = (CarritoCompras)(session.getAttribute("carritoCompras"));  %>
	Productos:<%=carritoCompras.getProductosEnCarrito().size()%>
	<form name="loginForm" action="../ComprasServlet" method="post">
	<input type ="hidden" name= "opcion" id="opcion" value="1">
	 <input id ="guardar"type="submit" name="guardar" value="Guardar" required="required">
		<div class = "tableRow">
			<p>
			
			<table >
<tr>
<th>Direccion de Envio:</th>
</tr>
<tr>
<td>Nombre:</td>
<td><input propiedades="id_input" type="text" name="nombreUsuario" id="nombreUsuario" value=""></td>
</tr>
<tr>
<td>Apellido Paterno:</td>
<td> <input propiedades="id_input" type="text" name="paternoUsuario" id="paternoUsuario" value=""></td>
</tr>
<tr>
<td>Apellido Materno:</td>
<td> <input propiedades="id_input" type="text" name="maternoUsuario" id="maternoUsuario" value=""></td>
</tr>
<tr>
<td>Calle:</td>
<td> <input propiedades="id_input" type="text" name="calle" id="calle" value="" ></td>
</tr>
<tr>
<td>Numero:</td>
<td> <input propiedades="id_input" type="text" name="numero" id="numero" value=""></td>
</tr>
<tr>
<td>CP:</td>
<td> <input propiedades="id_input" type="text" name="codigoPostal"  id="codigoPostal" value=""></td>
</tr>
<tr>
<td>Colonia:</td>
<td> <input propiedades="id_input" type="text" name="colonia" id="colonia" value=""></td>
</tr>
<tr>
<td>Metodo de Pago:</td>
<td> <input propiedades="id_input" type="text" name="formaPago" id="formaPago" value=""></td>
</tr>
<tr>
<td>Fecha Compra:</td>
<td> <input propiedades="id_input" type="text" name="fechaCompra" id="fechaCompra" value=""></td>
</tr>
<tr>
<td>Monto De Envio:</td>
<td> <input propiedades="id_input" type="text" name="montoEnvio" id="montoEnvio" value=""></td>
</tr>
</table>
<td>>Push para comprar:</td>


</form>
</center>
			
			
			
			</p>
			
	</form>
</body>
</html>