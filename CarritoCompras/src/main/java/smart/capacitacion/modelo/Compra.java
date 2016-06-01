package smart.capacitacion.modelo;

public class Compra {
	private Usuario usuario;
	private Integer idCompra;
	private Double subtotal;
	private Double total;
	private Integer idUsuario;
	private Integer idCarrito;
	private String fechaCompra;
	private CarritoCompras carritoCompras;

	public Compra() {

	}

	public Compra(Usuario usuario, Integer id_Compra, Double subtotalCompra, Double totalCompra, Integer id_Usuario,
			Integer id_Carrito, String fecha_Compra, CarritoCompras carritocompras) {
		super();
		this.usuario = usuario;
		this.idCompra = id_Compra;
		this.subtotal = subtotalCompra;
		this.total = totalCompra;
		this.idUsuario = id_Usuario;
		this.idCarrito = id_Carrito;
		this.fechaCompra = fecha_Compra;
		this.carritoCompras = carritocompras;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Integer getIdCompra() {
		return idCompra;
	}

	public void setIdCompra(Integer idCompra) {
		this.idCompra = idCompra;
	}

	public Double getSubtotalCompra() {
		return subtotal;
	}

	public void setSubtotalCompra(Double subtotalCompra) {
		this.subtotal = subtotalCompra;
	}

	public Double getTotalCompra() {
		return total;
	}

	public void setTotalCompra(Double totalCompra) {
		this.total = totalCompra;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setId_Usuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Integer getIdCarrito() {
		return idCarrito;
	}

	public void setId_Carrito(Integer idCarrito) {
		this.idCarrito = idCarrito;
	}

	public String getFechaCompra() {
		return fechaCompra;
	}

	public void setFecha_Compra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public CarritoCompras getCarritocompras() {
		return carritoCompras;
	}

	public void setCarritocompras(CarritoCompras carritocompras) {
		this.carritoCompras = carritocompras;
	}

	
}
