package smart.capacitacion.service;

import java.util.List;

import smart.capacitacion.modelo.CarritoCompras;
import smart.capacitacion.modelo.Producto;
import smart.capacitacion.modelo.Usuario;


public interface CarritoComprasService {
	
	public CarritoCompras crearCarritoByUsuario(Usuario usuario);
		
	public boolean eliminarProductoDelCarrito(CarritoCompras carritoCompras);

	public List<Producto> agregarProductoAlCarrito(CarritoCompras carritoCompras);

	CarritoCompras obtenerCarritoComprasByUsuario(Usuario usuario);
}