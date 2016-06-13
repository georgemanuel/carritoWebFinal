<%@ page import="smart.capacitacion.modelo.CarritoCompras"%>
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
	align: right;
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
	text-align: right;
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
	color: white;
	margin: 10px 10px 0px 10px;
	list-style-type: none;
	padding: 5px 0px 5px 0px;
	border-bottom-left-radius: 13px;
	border-bottom-right-radius: 13px;
}

header {
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
<script language="javascript">

function validarCampos(){
	if (document.getElementById("nombreUsuario").value=="" ){
		document.getElementById("divMensajeError").innerHTML = "Por favor ingrese el nombre del usuario";
		return false;
	}else if (document.getElementById("paternoUsuario").value==""){
		document.getElementById("divMensajeError1").innerHTML = "Por favor ingrese apellido Paterno";
		return false;
	}else if (document.getElementById("maternoUsuario").value==""){
		document.getElementById("divMensajeError2").innerHTML = "Por favor ingrese apellido Materno";
		return false;
	}else if (document.getElementById("calle").value==""){
		document.getElementById("divMensajeError3").innerHTML = "Por favor ingrese calle";
		return false;
	}else if (document.getElementById("numero").value==""){
		document.getElementById("divMensajeError4").innerHTML = "Por favor ingrese numero";
		return false;
	}else if (document.getElementById("codigoPostal").value==""){
		document.getElementById("divMensajeError5").innerHTML = "Por favor ingrese codigo postal";
		return false;
	}else if (document.getElementById("colonia").value==""){
		document.getElementById("divMensajeError6").innerHTML = "Por favor ingrese colonia";
		return false;
	}else if (document.getElementById("formaPago").value==""){
		document.getElementById("divMensajeError7").innerHTML = "Por favor ingrese forma de pago";
		return false;
	}else if (document.getElementById("fechaCompra").value==""){
		document.getElementById("divMensajeError8").innerHTML = "Por favor ingrese fecha de compra";
		return false;
	}else if (document.getElementById("montoEnvio").value==""){
		document.getElementById("divMensajeError9").innerHTML = "Por favor ingrese monto de envio";
		return false;
	}
	}


	</script>


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
		<%
			CarritoCompras carritoCompras = (CarritoCompras) (session.getAttribute("carritoCompras"));
		%>
		Productos:<%=carritoCompras.getProductosEnCarrito().size()%>
		<form name="loginForm" action="../ComprasServlet" method="post">
			
			<input type="hidden" name="opcion" id="opcion" value="1"> <input
				id="guardar" type="submit" name="guardar" value="guardar" onclick="return validarCampos()"
				 required="required"/>
			<div class="tableRow">
				<p>
				<table>
					<tr>
						<th>Direccion de Envio:</th>
					</tr>
					<tr>
						<td>Nombre:</td>
						<td><div id="divMensajeError"/></div></td>
						<td><input propiedades="id_input" type="text"
							name="nombreUsuario" id="nombreUsuario" value=""></td>
					</tr>
					<tr>
						<td>Apellido Paterno:</td>
						<td><div id="divMensajeError1"/></div></td>
						<td><input propiedades="id_input" type="text"
							name="paternoUsuario" id="paternoUsuario" value=""></td>
					</tr>
					<tr>
						<td>Apellido Materno:</td>
						<td><div id="divMensajeError2"/></div></td>
						<td><input propiedades="id_input" type="text"
							name="maternoUsuario" id="maternoUsuario" value=""></td>
					</tr>
					<tr>
						<td>Calle:</td>
						<td><div id="divMensajeError3"/></div></td>
						<td><input propiedades="id_input" type="text" name="calle"
							id="calle" value=""></td>
					</tr>
					<tr>
						<td>Numero:</td>
						<td><div id="divMensajeError4"/></div></td>
						<td><input propiedades="id_input" type="text" name="numero"
							id="numero" value=""></td>
					</tr>
					<tr>
						<td>CP:</td>
						<td><div id="divMensajeError5"/></div></td>
						<td><input propiedades="id_input" type="text"
							name="codigoPostal" id="codigoPostal" value=""></td>
					</tr>
					<tr>
						<td>Colonia:</td>
						<td><div id="divMensajeError6"/></div></td>
						<td><input propiedades="id_input" type="text" name="colonia"
							id="colonia" value=""></td>
					</tr>
					<tr>
						<td>Metodo de Pago:</td>
						<td><div id="divMensajeError7"/></div></td>
						<td><input propiedades="id_input" type="text"
							name="formaPago" id="formaPago" value=""></td>
					</tr>
					<tr>
						<td>Fecha Compra:</td>
						<td><div id="divMensajeError8"/></div></td>
						<td><input propiedades="id_input" type="text"
							name="fechaCompra" id="fechaCompra" value=""></td>
					</tr>
					<tr>
						<td>Monto De Envio:</td>
						<td><div id="divMensajeError9"/></div></td>
						<td><input propiedades="id_input" type="text"
							name="montoEnvio" id="montoEnvio" value=""></td>
					</tr>
				</table>
				<td>>Push para comprar:</td>
		</form>
	</center>



	</p>

	</form>
</body>
</html>