package smart.capacitacion.service;

import smart.capacitacion.modelo.CarritoCompras;
import smart.capacitacion.modelo.Producto;

public interface ProductoService {
	
	public Producto obtenerProductosByIdCarrito(CarritoCompras idCarrito);
	
	public Producto verTodosLosProductos();

}
