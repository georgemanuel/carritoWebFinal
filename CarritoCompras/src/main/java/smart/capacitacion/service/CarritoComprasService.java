package smart.capacitacion.service;

import smart.capacitacion.modelo.CarritoCompras;
import smart.capacitacion.modelo.Producto;
import smart.capacitacion.modelo.Usuario;


public interface CarritoComprasService {
	
	public CarritoCompras crearCarritoByUsuario(Usuario usuario);
		
	public boolean eliminarProductoDelCarrito(CarritoCompras carritoCompras);

	public Producto agregarProductoAlCarrito(CarritoCompras carritoCompras);

	CarritoCompras obtenerCarritoComprasByUsuario(Usuario usuario);
}