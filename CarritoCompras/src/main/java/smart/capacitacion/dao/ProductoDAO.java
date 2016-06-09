package smart.capacitacion.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import smart.capacitacion.modelo.Producto;

public class ProductoDAO extends DAOGeneral{
	 Connection conexion = null;
	 Statement sentencia = null;
	 ResultSet resultado = null;
	 
	 public ProductoDAO(){
		 this.conexion=getConnection();
	 }
	 
	 public Integer getProductoById(Integer idProducto){
         try{
        	 sentencia = conexion.createStatement();
        	 String consultaSQL = "select * from \"PRODUCTO\" where \"ID_PRODUCTO\"='"+idProducto+"'";
        	 System.out.println(consultaSQL);
        	 resultado = sentencia.executeQuery(consultaSQL);
        	 while (resultado.next()) {
        		 idProducto = resultado.getInt("ID_PRODUCTO");
        		 System.out.println("Resultado: "+idProducto);
        	 }
        	 return idProducto;
         }
         catch(Exception error){
        	 error.printStackTrace();
         }
         return null;
	 }

	public List<Producto> obtenerTodosLosProductos() {
		// TODO Auto-generated method stub
		try{
	       	 sentencia = conexion.createStatement();
	       	 String consultaSQL = "select * from \"PRODUCTO\"";
	       	 System.out.println(consultaSQL);
	       	 resultado = sentencia.executeQuery(consultaSQL);
	       	 List<Producto> productos = new ArrayList<Producto>();
	       	 Producto producto;
	       	 while (resultado.next()) {
	       		 producto = new Producto();
	       		 producto.setIdProducto(resultado.getInt("ID_PRODUCTO"));
	       		 producto.setNombreProducto(resultado.getString("NOMBRE_PRODUCTO"));
	       		 productos.add(producto);
	       	}
	       	return productos;
	    }
        catch(Exception error){
       	 error.printStackTrace();
        }
        return null;
	}
	 
	 
}
