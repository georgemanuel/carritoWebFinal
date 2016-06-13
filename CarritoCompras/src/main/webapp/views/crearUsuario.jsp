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
			align: center;
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
	</style>
	<meta charset="utf-8">
	<title>Crear Cuenta</title>
	<script language="javascript">
	function validarCampos(){
		if(document.getElementById("nombreUsuario").value==""){
			document.getElementById("divMensajeError").innerHTML = "Por favor ingrese el nombre del usuario";
			return false;
		}else if(document.getElementById("apellidoPaterno").value==""){
			document.getElementById("divMensajeError1").innerHTML = "Por favor ingrese apellido paterno ";
			return false;
		}else if(document.getElementById("apellidoMaterno").value==""){
			document.getElementById("divMensajeError2").innerHTML = "Por favor ingrese apellido materno ";
			return false;
		}else if(document.getElementById("fechaNacimiento").value==""){
			document.getElementById("divMensajeError3").innerHTML = "Por favor ingrese su fecha de nacimiento ";
			return false;
		}else if(document.getElementById("sexoUsuario").value==""){
			document.getElementById("divMensajeError4").innerHTML = "Por favor ingrese su sexo ";
			return false;
		}else if(document.getElementById("calleUsuario").value==""){
			document.getElementById("divMensajeError5").innerHTML = "Por favor ingrese su calle ";
			return false;
		}else if(document.getElementById("numerousuario").value==""){
			document.getElementById("divMensajeError6").innerHTML = "Por favor ingrese su numero ";
			return false;
		}else if(document.getElementById("coloniaUsuario").value==""){
			document.getElementById("divMensajeError7").innerHTML = "Por favor ingrese su colonia ";
			return false;
		}else if(document.getElementById("delegacionUsuario").value==""){
			document.getElementById("divMensajeError8").innerHTML = "Por favor ingrese su delegacion ";
			return false;
		}else if(document.getElementById("telUsuario").value==""){
			document.getElementById("divMensajeError9").innerHTML = "Por favor ingrese su telefono ";
			return false;
		}else if(document.getElementById("cellUsuario").value==""){
			document.getElementById("divMensajeError10").innerHTML = "Por favor ingrese su celular ";
			return false;
		}else if(document.getElementById("emailUsuario").value==""){
			document.getElementById("divMensajeError11").innerHTML = "Por favor ingrese su email ";
			return false;
		}else if(document.getElementById("passwordUsuario").value==""){
			document.getElementById("divMensajeError12").innerHTML = "Por favor ingrese su password ";
			return false;
		}else if(document.getElementById("rfcUsuario").value==""){
			document.getElementById("divMensajeError13").innerHTML = "Por favor ingrese su rfc";
			return false;
		}
	}
	
	
	</script>
	
	
</head>
<center>
<body>
	<header>
		<h1>CREAR CUENTA</h1>
	</header>
	<nav>
		<ul>
			<li>Home</li>
			<li>Catalogo</li>
			<li>Carrito de Compras</li>
			<li>Mi cuenta</li>
		</ul>
	</nav>
	
	<form name="loginForm" action="../UsuarioServlet" method="post">
	<%=request.getSession().getAttribute("error")%>
	<input type ="hidden" name= "opcion" id="opcion" value="2">	
	
		<div class = "tableRow">
			<p>
<input id ="guardar"type="submit" name="guardar" value="Guardar"  onclick="return validarCampos()" required="required" >				
				<table >
<tr>
<th>Datos Generales:</th>
</tr>
<tr>
<td>Nombre:</td>
<td><div id="divMensajeError"/></div></td>
<td> <input propiedades="id_input" type="text" name="nombreUsuario" id="nombreUsuario" value=""></td>
</tr>
<tr>
<td>Apellido Paterno:</td>
<td><div id="divMensajeError1"/></div></td>
<td><input propiedades="id_input" type="text" name="apellidoPaterno" id="apellidoPaterno" value=""></td>
</tr>
<tr>
<td>Apellido Materno:</td>
<td><div id="divMensajeError2"/></div></td>
<td> <input propiedades="id_input" type="text" name="apellidoMaterno" id="apellidoMaterno" value=""></td>
</tr>
<tr>
<td>Fecha De Nacimiento:</td>
<td><div id="divMensajeError3"/></div></td>
<td> <input propiedades="id_input" type="date" name="fechaNacimiento" id="fechaNacimiento" value=""></td>
</tr>
<tr>
<td>Sexo:</td>
<td><div id="divMensajeError4"/></div></td>
<td>Masculino: <input  propiedades="id_input"type="radio" name="sexoUsuario" id="sexoUsuario" value="Masculino">
Femenino:<input propiedades="id_input" type="radio" name="femeninino"   id="sexoUsuario" value="Femenino"></td>
</tr>
<tr>
<td>Calle:</td>
<td><div id="divMensajeError5"/></div></td>
<td> <input propiedades="id_input" type="text" name="calleUsuario" id="calleUsuario" value=""></td>
</tr>
<tr>
<td>Numero:</td>
<td><div id="divMensajeError6"/></div></td>
<td> <input propiedades="id_input" type="text" name="numerousuario" id="numerousuario" value=""></td>
</tr>
<tr>
<td>Colonia:</td>
<td><div id="divMensajeError7"/></div></td>
<td> <input propiedades="id_input" type="text" name="coloniaUsuario" id="coloniaUsuario" value=""></td>
</tr>
<tr>
<td>Delegacion:</td>
<td><div id="divMensajeError8"/></div></td>
<td> <input propiedades="id_input" type="text" name="delegacionUsuario" id="delegacionUsuario" value=""></td>
</tr>
<tr>
<td>Telefono:</td>
<td><div id="divMensajeError9"/></div></td>
<td> <input propiedades="id_input"  type="text" name="telUsuario" id="telUsuario" value=""></td>
</tr>
<tr>
<td>Celular:</td>
<td><div id="divMensajeError10"/></div></td>
<td> <input propiedades="id_input"type="text" name="cellUsuario" id ="cellUsuario" value=""></td>
</tr>
<tr>
<td>Email:</td>
<td><div id="divMensajeError11"/></div></td>
<td> <input propiedades="id_input"type="text" name="emailUsuario" id="emailUsuario" value=""></td>
</tr>
<tr>
<td>Password:</td>
<td><div id="divMensajeError12"/></div></td>
<td> <input propiedades="id_input"type="password" name="passwordUsuario" id="passwordUsuario" value=""></td>
</tr>
<tr>
<td>RFC:</td>
<td><div id="divMensajeError13"/></div></td>
<td> <input propiedades="id_input"type="text" name="rfcUsuario" id="rfcUsuario" value=""></td>
</tr>
</table>
</form>
</center>
</div>

				
				
			</p>
			
	</form>
</body>
</html>