package smart.capacitacion.dao;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;

import smart.capacitacion.modelo.CarritoCompras;

public class CarritoComprasDAO extends DAOGeneral{
	 Connection conexion = null;
	 Statement sentencia = null;
	 ResultSet resultado = null;
	 
	 public CarritoComprasDAO(){
		 this.conexion=getConnection();
	 }
	 
	 public boolean crearCarrito(CarritoCompras carritoCompras){
         try{
        	 sentencia = conexion.createStatement();
        	 String consultaSQL = "INSERT INTO public.\"CARRITO_COMPRAS\"(\"ID_CARRITO\", \"ID_USUARIO\")" + "VALUES (4,"+carritoCompras.getUsuario().getIdUsuario()+");";
        	 System.out.println(consultaSQL);
        	 sentencia.execute(consultaSQL);
        	 System.out.println(resultado);
        	 return true;
         }
         catch(Exception error){
        	 error.printStackTrace();
         }
         return false;
 
	 }
	 
	 //agregar producto al carrito
	 public boolean agregarProductoAlCarrito(CarritoCompras carritoCompras){
         try{
        	 sentencia = conexion.createStatement();
        	 String consultaSQL = "INSERT INTO public.\"CARRITO_PRODUCTO\"(\"ID_CARRITO\", \"ID_PRODUCTO\")" + "VALUES (" + carritoCompras.getIdCarrito() + "," + carritoCompras.getProductosEnCarrito().get(0).getIdProducto()+ ");";
        	 System.out.println(consultaSQL);
        	 sentencia.execute(consultaSQL);
        	 System.out.println(resultado);
        	 return true;
         }
         catch(Exception error){
        	 error.printStackTrace();
         }
         return false;
 
	 }
	 
	 public boolean eliminarProductoDelCarrito(CarritoCompras carritoCompras){
		 try{
			 sentencia = conexion.createStatement();
        	 String consultaSQL = "DELETE FROM public.\"CARRITO_PRODUCTO\" WHERE \"ID_CARRITO\"="+carritoCompras.getIdCarrito()+" AND \"ID_PRODUCTO\"="+carritoCompras.getProductosEnCarrito().get(0).getIdProducto();
        	 System.out.println(consultaSQL);
        	 sentencia.execute(consultaSQL);
        	 System.out.println(resultado);
        	 return true;
		 }
		 catch (Exception e){
			 
		 }
		return false;
	 }
}
