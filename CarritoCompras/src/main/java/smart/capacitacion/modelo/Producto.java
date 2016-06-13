package smart.capacitacion.modelo;

import java.util.List;

public class Producto {
	// test
	private Integer idProducto;
	private String nombreProducto;
	private double precioProducto;
	private String colorProducto;
	private String marcaProducto;
	private String UrlImagen;
	private List<Producto> todosLosProductos;
	
	public Producto(){
		
	}

	public Producto(Integer idProducto, String nombreProducto, double precioProducto, String colorProducto,
			String marcaProducto, String urlImagen, List<Producto> todosLosProductos) {
		super();
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.precioProducto = precioProducto;
		this.colorProducto = colorProducto;
		this.marcaProducto = marcaProducto;
		UrlImagen = urlImagen;
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

	public double getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(double d) {
		this.precioProducto = d;
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

	public String getUrlImagen() {
		return UrlImagen;
	}

	public void setUrlImagen(String urlImagen) {
		UrlImagen = urlImagen;
	}
	
	
}