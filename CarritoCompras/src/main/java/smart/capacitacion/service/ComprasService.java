package smart.capacitacion.service;

import java.util.List;


import smart.capacitacion.modelo.CarritoCompras;
import smart.capacitacion.modelo.Compra;

public interface ComprasService {

	public Boolean realizarCompra(CarritoCompras carritoCompras);

	public Boolean cancelarCompra(CarritoCompras carritoCompras);

	public List<Compra> obtenerComprasByFechas(String fechaInicio, String fechaFin);

}
