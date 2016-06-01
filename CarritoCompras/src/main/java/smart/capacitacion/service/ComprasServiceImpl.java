package smart.capacitacion.service;

import java.util.List;


import smart.capacitacion.dao.ComprasDAO;
import smart.capacitacion.modelo.CarritoCompras;
import smart.capacitacion.modelo.Compra;
import smart.capacitacion.modelo.Usuario;

public class ComprasServiceImpl implements ComprasService {

	ComprasDAO comprasDAO = new ComprasDAO();

	@Override
	public Boolean realizarCompra(CarritoCompras carritoCompra) {
		// TODO Auto-generated method stub
		return comprasDAO.realizarCompra(carritoCompra);
	}

	@Override
	public Boolean cancelarCompra(CarritoCompras carritoCompra) {
		// TODO Auto-generated method stub
		return comprasDAO.borrarCompra(carritoCompra);
	}

	@Override
	public List<Compra> obtenerComprasByFechas(String fechaInicio, String fechaFin) {
		// TODO Auto-generated method stub
		return comprasDAO.obtenerComprasByFechas(fechaInicio, fechaFin);
	}

}
