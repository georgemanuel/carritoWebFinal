package smart.capacitacion.service;

import java.util.List;


import smart.capacitacion.modelo.CarritoCompras;
import smart.capacitacion.modelo.Compra;
import smart.capacitacion.modelo.Usuario;

public interface ComprasService {


	public Boolean cancelarCompra(CarritoCompras carritoCompras);

	public List<Compra> obtenerComprasByFechas(String fechaInicio, String fechaFin);
	
	public Compra realizarCompra(Compra compra);
	
	public CarritoCompras modificarCarrito(CarritoCompras carritoCompras);
	
	public Compra sumarPrecio(Compra compra);
}
