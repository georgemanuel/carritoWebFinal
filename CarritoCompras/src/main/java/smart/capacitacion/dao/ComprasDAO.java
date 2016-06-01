package smart.capacitacion.dao;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import smart.capacitacion.modelo.CarritoCompras;
import smart.capacitacion.modelo.Compra;

public class ComprasDAO extends DAOGeneral {

	Connection conexion = null;
	Statement sentencia = null;
	ResultSet resultado = null;

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

	public boolean realizarCompra(CarritoCompras carritoCompras) {
		try {
			sentencia = conexion.createStatement();
			String consultaSQL = "INSERT INTO public.\"COMPRA\"(\"ID_COMPRA\",\"SUBTOTAL\",\"TOTAL\",\"ID_CARRITO\",\"FECHA_COMPRA\")"
					+ "VALUES (5,1000,2000," + carritoCompras.getIdCarrito() + ",'30-05-16');";
			System.out.println(consultaSQL);
			sentencia.execute(consultaSQL);
			System.out.println("Se guardo el usuario con exito.");
			return true;
		}

		catch (Exception error) {
			error.printStackTrace();
		}
		System.out.println("Error");
		return false;

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

}
