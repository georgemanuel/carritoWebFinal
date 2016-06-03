package smart.capacitacion.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import smart.capacitacion.controller.UsuarioServlet;
import smart.capacitacion.modelo.CarritoCompras;
import smart.capacitacion.modelo.Usuario;
import smart.capacitacion.service.CarritoComprasService;
import smart.capacitacion.service.CarritoComprasServiceImpl;
import smart.capacitacion.service.UsuarioServiceImpl;

public class UsuarioDAO extends DAOGeneral{
	 Connection conexion = null;
	 Statement sentencia = null;
	 ResultSet resultado = null;
	 
	 
	 public UsuarioDAO(){
		 this.conexion=getConnection();
	 }
	 
	 public String getNombreUsuarioByRFC(String rfcUsuario){
         try{
        	 sentencia = conexion.createStatement();
        	 String consultaSQL = "select * from \"USUARIO\" where \"RFC\"='"+rfcUsuario+"'";
        	 System.out.println(consultaSQL);
        	 resultado = sentencia.executeQuery(consultaSQL);
        	 String nombreUsuario="N/E";
        	 while (resultado.next()) {
        		 nombreUsuario = resultado.getString("NOMBRE_USUARIO");
        		 System.out.println("Resultado:"+nombreUsuario);
        	 }
        	 return nombreUsuario;
         }
         catch(Exception error){
        	 error.printStackTrace();
         }
         return "ERROR";
 
	 }

	public Usuario login(Usuario usuario) {
		// TODO Auto-generated method stub
		try{
	       	 sentencia = conexion.createStatement();
	       	 String consultaSQL = "select * from \"USUARIO\" where \"EMAIL\"='"+usuario.getEmailUsuario()+"' AND \"PASSWORD\"='"+usuario.getPasswordUsuario()+"'";
	       	 System.out.println(consultaSQL);
	       	 resultado = sentencia.executeQuery(consultaSQL);
	       	 while (resultado.next()) {
	       		 usuario.setIdUsuario(resultado.getInt("ID_USUARIO"));
	       		 return usuario;
	       	 } 	 
        }
        catch(Exception error){
       	 error.printStackTrace();
        }
		return null;
	}
	
	public CarritoCompras obtenerCarritoComprasByUsuario(Usuario usuario){
		try{
       	 	sentencia = conexion.createStatement();
       	 	String consultaSQL = "SELECT \"ID_CARRITO\" FROM \"USUARIO\" U INNER JOIN \"CARRITO_COMPRAS\" C ON U.\"ID_USUARIO\" = C.\"ID_USUARIO\" WHERE U.\"ID_USUARIO\" = " + usuario.getIdUsuario() + ";";
       	 	System.out.println(consultaSQL);
       	 	resultado = sentencia.executeQuery(consultaSQL);
       	 	while(resultado.next()){
       	 		CarritoCompras carritoCompras = new CarritoCompras();
       	 		carritoCompras.setIdCarrito(resultado.getInt("ID_CARRITO"));
       	 		//un join carrito y producto
       	 		//crear una lista de carrito List <
       	 		//ejecutar el query y en el while 
       	 		//llenar la lista de productos
       	 		// settear la lista en el productosCarrito de CarritoCompras
       	 		return carritoCompras;
       	 	}
       	 	return null;
       	 }
         catch(Exception error){
       	 error.printStackTrace();
        }
		return null;
	}
}
