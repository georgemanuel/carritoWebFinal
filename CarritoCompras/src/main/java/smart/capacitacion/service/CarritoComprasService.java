package smart.capacitacion.service;

import smart.capacitacion.modelo.CarritoCompras;


public interface CarritoComprasService {
	
	public boolean crearCarrito(CarritoCompras carritoCompras);
		
	public boolean eliminarProductoDelCarrito(CarritoCompras carritoCompras);
	
	public boolean agregarProductoAlCarrito(CarritoCompras carritoCompras);
}