package smart.capacitacion.modelo;

import java.util.List;

public class Producto {
	// test
	private Integer idProducto;
	private String nombreProducto;
	private Integer precioProducto;
	private String colorProducto;
	private String marcaProducto;
	private List<Producto> todosLosProductos;
	
	public Producto(){
		
	}

	public Producto(Integer idProducto, String nombreProducto, Integer precioProducto, String colorProducto,
			String marcaProducto, List<Producto> todosLosProductos) {
		super();
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.precioProducto = precioProducto;
		this.colorProducto = colorProducto;
		this.marcaProducto = marcaProducto;
		this.todosLosProductos = todosLosProductos;
	}

	public Integer getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public Integer getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(Integer precioProducto) {
		this.precioProducto = precioProducto;
	}

	public String getColorProducto() {
		return colorProducto;
	}

	public void setColorProducto(String colorProducto) {
		this.colorProducto = colorProducto;
	}

	public String getMarcaProducto() {
		return marcaProducto;
	}

	public void setMarcaProducto(String marcaProducto) {
		this.marcaProducto = marcaProducto;
	}

	public List<Producto> getTodosLosProductos() {
		return todosLosProductos;
	}

	public void setTodosLosProductos(List<Producto> todosLosProductos) {
		this.todosLosProductos = todosLosProductos;
	}
	
}