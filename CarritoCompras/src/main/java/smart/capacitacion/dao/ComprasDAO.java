package smart.capacitacion.dao;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import smart.capacitacion.modelo.CarritoCompras;
import smart.capacitacion.modelo.Compra;
import smart.capacitacion.modelo.Usuario;

public class ComprasDAO extends DAOGeneral {

	Connection conexion = null;
	Statement sentencia = null;
	ResultSet resultado = null;
	ResultSet resultado1 = null;
	Statement sentencia1 = null;
	
	public ComprasDAO() {
		this.conexion = getConnection();
	}

	public List<Compra> obtenerComprasByFechas(String fechaInicio, String fechaFin) {
		try {
			sentencia = conexion.createStatement();
			String consultaSQL = "SELECT \"ID_COMPRA\" FROM \"COMPRA\" WHERE \"FECHA_COMPRA\" ='" + fechaInicio + "'";
			System.out.println(consultaSQL);
			resultado = sentencia.executeQuery(consultaSQL);
			List<Compra> compras = new ArrayList<Compra>();
			Compra compra;
			while (resultado.next()) {
				compra = new Compra();
				compra.setIdCompra(resultado.getInt("ID_COMPRA"));
				compras.add(compra);

			}
			return compras;
		} catch (Exception error) {
			error.printStackTrace();
		}
		return null;
	}

	public boolean borrarCompra(CarritoCompras carritoCompras) {
		try {
			sentencia = conexion.createStatement();
			String consultaSQL = " DELETE FROM public.\"COMPRA\" WHERE \"ID_CARRITO\" IN (SELECT \"ID_CARRITO\" FROM \"CARRITO_COMPRAS\") AND \"ID_CARRITO\"= "
					+ carritoCompras.getIdCarrito() + " ";
			System.out.println(consultaSQL);
			sentencia.execute(consultaSQL);
			System.out.println("Se elimino el usuario con exito.");
			return true;
		}

		catch (Exception error) {
			error.printStackTrace();
		}
		System.out.println("Error");
		return false;

	}

	public Compra realizarCompra(Compra compra) {
		try {
			sentencia = conexion.createStatement();
			String consultaSQL = "INSERT INTO \"COMPRA\"(\"ID_COMPRA\",\"ID_CARRITO\","
					+ "\"FECHA_COMPRA\",\"FORMA_PAGO\",\"NOMBRE_USUARIO\",\"PATERNO_USUARIO\",\"MATERNO_USUARIO\",\"CALLE\",\"NUMERO\",\"CODIGO_POSTAL\",\"COLONIA\",\"NUM_CONFIRMACION\",\"TOTAL\",\"MONTO_ENVIO\")"
					+ "VALUES (nextval('sec_compra')" + "," + compra.getCarritoCompras().getIdCarrito()  
					+ "," + "'" + compra.getFechaCompra() + "'" + "," 
					+ "'"
					+ compra.getFormaPago() + "'" + "," + "'" + compra.getNombreUsuario() + "'" + "," + "'" 
					+ compra.getPaternoUsuario() + "'" + "," + "'" + compra.getMaternoUsuario() + "'" + "," +  "'" 
					+ compra.getCalle() + "'" + "," + "'" + compra.getNumero() + "'" + "," 
					+ compra.getCodigoPostal() + "," + "'" + compra.getColonia() + "'" + "," 
					+ "nextval('sec_confirmacion')" + "," +  compra.getTotal() + "," 
					+ compra.getMontoEnvio() + ");";
			System.out.println(consultaSQL);
			sentencia.execute(consultaSQL);
			sentencia = conexion.createStatement();
			String consultaSQL2 = "SELECT C.\"ID_COMPRA\" FROM \"COMPRA\" C INNER JOIN \"CARRITO_COMPRAS\" CC ON (C.\"ID_CARRITO\" = C.\"ID_CARRITO\") WHERE C.\"ID_CARRITO\" ='"
					+ compra.getCarritoCompras().getIdCarrito() + "'";
			resultado = sentencia.executeQuery(consultaSQL2);
			while (resultado.next()) {
				compra.setIdCompra(resultado.getInt("ID_COMPRA"));
				return compra;
			}
		
		} catch (Exception error) {
			error.printStackTrace();
		}
		return null;

	}

	public Compra sumarPrecio(Compra compra){
		try {
			sentencia = conexion.createStatement();
			String consultaSQL = "UPDATE \"COMPRA\" "
					  + "SET \"ID_COMPRA\" =" + compra.getIdCompra() + ", \"ID_CARRITO\" = " + compra.getCarritoCompras().getIdCarrito() + ", \"FECHA_COMPRA\" = " + compra.getFechaCompra() + ", \"FORMA_PAGO\" = " + compra.getFormaPago() + "," + 
				       "\"NOMBRE_USUARIO\" = " + compra.getNombreUsuario() + ", \"PATERNO_USUARIO\" = " + compra.getPaternoUsuario() + ", \"MATERNO_USUARIO\" = " + compra.getMaternoUsuario() + ", " + 
				       "\"CALLE\" = "+ compra.getCalle()+ ", \"NUMERO\" = "+ compra.getNumero() + ", \"CODIGO_POSTAL\" = "+ compra.getCodigoPostal() + ", \"COLONIA\" = "+ compra.getColonia() + ", \"NUM_CONFIRMACION\" = " + compra.getNumConfirmacion() + ", " + 
				       "\"TOTAL\" = " + compra.getTotal() + ", \"MONTO_ENVIO\" = " + compra.getMontoEnvio() + "WHERE \"ID_COMPRA\" = " + compra.getIdCompra() + ";";
			System.out.println(consultaSQL);
			sentencia.execute(consultaSQL);			
			sentencia1 = conexion.createStatement();
			String consultaSQL3 = "SELECT SUM (P.\"PRECIO\") FROM \"PRODUCTO\" P INNER JOIN \"CARRITO_PRODUCTO\" CP ON (P.\"ID_PRODUCTO\" = CP.\"ID_PRODUCTO\") WHERE CP.\"ID_CARRITO\" ='"
					+ compra.getIdCompra() + "'";
			resultado1 = sentencia1.executeQuery(consultaSQL3);
			System.out.println(resultado1);
			while (resultado1.next()) {
				compra.setTotal(resultado1.getDouble("TOTAL"));
				return compra;
			}
		} catch (Exception error) {
			error.printStackTrace();
		}
		return null;
		
		
		
	}
	
	public CarritoCompras modificarCarrito(CarritoCompras carritoCompras) {
		try {
			sentencia = conexion.createStatement();
			String consultaSQL = "UPDATE \"CARRITO_COMPRAS\" SET \"STATUS\" = 0 WHERE \"ID_CARRITO\" = " + carritoCompras.getIdCarrito() + " ";
			System.out.println(consultaSQL);
			sentencia.execute(consultaSQL);
			System.out.println("Se modifico el usuario con exito.");
			return carritoCompras;
		}

		catch (Exception error) {
			error.printStackTrace();
		}
		return null;

		
	}
	
}
