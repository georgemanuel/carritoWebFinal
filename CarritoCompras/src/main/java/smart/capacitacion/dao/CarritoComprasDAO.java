package smart.capacitacion.dao;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;	
import java.util.ArrayList;
import java.util.List;

import smart.capacitacion.modelo.CarritoCompras;
import smart.capacitacion.modelo.Producto;
import smart.capacitacion.modelo.Usuario;

public class CarritoComprasDAO extends DAOGeneral{
	 Connection conexion = null;
	 Statement sentencia = null;
	 Statement sentencia2 = null;
	 ResultSet resultado = null;
	 
	 public CarritoComprasDAO(){
		 this.conexion=getConnection();
	 }
	 
	 public CarritoCompras crearCarritoByUsuario(Usuario usuario) {
			try {
				CarritoCompras carritoCompras2 = new CarritoCompras();
				sentencia = conexion.createStatement();
				String consultaSQL = "INSERT INTO public.\"CARRITO_COMPRAS\"(\"ID_CARRITO\", \"ID_USUARIO\",\"STATUS\")"
						+ "VALUES (nextval('sec_carrito_compras')" + "," + usuario.getIdUsuario() + ",1);";
				System.out.println(consultaSQL);
				sentencia.execute(consultaSQL);
				sentencia = conexion.createStatement();
				String consultaSQL2 = "SELECT C.\"ID_CARRITO\" FROM \"USUARIO\" U INNER JOIN \"CARRITO_COMPRAS\" C ON (U.\"ID_USUARIO\" = C.\"ID_USUARIO\") WHERE C.\"ID_USUARIO\" ='"
						+ usuario.getIdUsuario() + "'";
				resultado = sentencia.executeQuery(consultaSQL2);
				while (resultado.next()) {
					
					CarritoCompras carritoCompras = new CarritoCompras();
					carritoCompras.setIdCarrito(resultado.getInt("ID_CARRITO"));
					carritoCompras.setUsuario(usuario);

					
					return carritoCompras;
				}

			} catch (Exception error) {
				error.printStackTrace();
			}
			return null;

		}
	 
	 //agregar producto al carrito
	 public List<Producto> agregarProductoAlCarrito(CarritoCompras carritoCompras){
         try{
        	 //inserta datos idProducto e idCarrito en la tabla carrito_producto
        	 sentencia = conexion.createStatement();
        	 String consultaSQL = "INSERT INTO public.\"CARRITO_PRODUCTO\"(\"ID_CARRITO\", \"ID_PRODUCTO\")" + "VALUES (" + carritoCompras.getIdCarrito() + "," + carritoCompras.getProductosEnCarrito().get(0).getIdProducto()+ ");";
        	 System.out.println(consultaSQL);
        	 sentencia.execute(consultaSQL);
        	 //recupera esos datos
        	 sentencia2 = conexion.createStatement();
        	 String consultaSQL2 = "SELECT * FROM \"CARRITO_PRODUCTO\" CP INNER JOIN \"PRODUCTO\" P ON P.\"ID_PRODUCTO\" = CP.\"ID_PRODUCTO\" where CP.\"ID_CARRITO\" = " + carritoCompras.getIdCarrito();
        	 System.out.println(consultaSQL2);
        	 resultado = sentencia.executeQuery(consultaSQL2);
        	 List<Producto> listaCarritoCompras = new ArrayList<Producto>();
        	 Producto producto;
        	 while(resultado.next()){
        		 producto = new Producto();
        		 producto.setIdProducto(resultado.getInt("ID_PRODUCTO"));
        		 producto.setColorProducto(resultado.getString("COLOR"));
        		 producto.setMarcaProducto(resultado.getString("MARCA"));
        		 producto.setPrecioProducto(resultado.getDouble("PRECIO"));
        		 producto.setNombreProducto(resultado.getString("NOMBRE_PRODUCTO"));
        		 listaCarritoCompras.add(producto);
        	 }
        	 return listaCarritoCompras;
        	 }
         
        	 catch(Exception error){
            	 error.printStackTrace();
             }
             return null;
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
