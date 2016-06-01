package smart.capacitacion.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

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
        	 //String productoNoExiste = "N/E";
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
}
