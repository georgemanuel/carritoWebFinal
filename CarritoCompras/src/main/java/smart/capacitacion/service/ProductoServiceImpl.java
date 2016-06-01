package smart.capacitacion.service;

import java.util.ArrayList;

import java.util.List;

import smart.capacitacion.dao.CarritoComprasDAO;
import smart.capacitacion.modelo.CarritoCompras;
import smart.capacitacion.modelo.Producto;

public class ProductoServiceImpl implements ProductoService {

	@Override
	public Producto obtenerProductosByIdCarrito(CarritoCompras idCarrito) {

		return null;
	}

	@Override
	public Producto verTodosLosProductos() {
		List<Producto> todosLosProductos = new ArrayList<Producto>();
		//todosLosProductos = Producto.getTodosLosProductos();
		return (Producto) todosLosProductos;
	}

}