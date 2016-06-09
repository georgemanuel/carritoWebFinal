package smart.capacitacion.service;

import java.util.List;

import smart.capacitacion.modelo.CarritoCompras;
import smart.capacitacion.modelo.Producto;

public interface ProductoService {
	
	public Producto obtenerProductosByIdCarrito(CarritoCompras idCarrito);
	public List<Producto> obtenerTodosLosProductos();

}
