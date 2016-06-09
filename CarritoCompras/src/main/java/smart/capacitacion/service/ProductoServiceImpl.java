package smart.capacitacion.service;

import java.util.ArrayList;

import java.util.List;

import smart.capacitacion.dao.ProductoDAO;
import smart.capacitacion.modelo.CarritoCompras;
import smart.capacitacion.modelo.Producto;

public class ProductoServiceImpl implements ProductoService {
	ProductoDAO productoDAO = new ProductoDAO(); 
	
	@Override
	public Producto obtenerProductosByIdCarrito(CarritoCompras idCarrito) {

		return null;
	}

	@Override
	public List<Producto> obtenerTodosLosProductos() {
		return this.productoDAO.obtenerTodosLosProductos();
	}

}