package smart.capacitacion.modelo;

public class Compra {
	
	private Usuario usuario;
	private Integer idCompra;
	private Integer idCarrito;
	private String fechaCompra;
	private String formaPago;
	private String nombreUsuario;
	private String paternoUsuario;
	private String maternoUsuario;
	private String calle;
	private String numero;
	private String codigoPostal;
	private String colonia;
	private Integer numConfirmacion;
	private Double total;
	private Double montoEnvio;
	private CarritoCompras carritoCompras;

	public Compra() {

	}

	public Compra(Usuario usuario, Integer idCompra, Integer idCarrito, String fechaCompra, Double costoProducto,
			String formaPago, String nombreUsuario, String paternoUsuario, String maternoUsuario, String calle,
			String numero, String codigoPostal, String colonia, Integer numConfirmacion, Double total,
			Double montoEnvio, CarritoCompras carritoCompras) {
		super();
		this.usuario = usuario;
		this.idCompra = idCompra;
		this.idCarrito = idCarrito;
		this.fechaCompra = fechaCompra;
		this.formaPago = formaPago;
		this.nombreUsuario = nombreUsuario;
		this.paternoUsuario = paternoUsuario;
		this.maternoUsuario = maternoUsuario;
		this.calle = calle;
		this.numero = numero;
		this.codigoPostal = codigoPostal;
		this.colonia = colonia;
		this.numConfirmacion = numConfirmacion;
		this.total = total;
		this.montoEnvio = montoEnvio;
		this.carritoCompras = carritoCompras;
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

	public Integer getIdCarrito() {
		return idCarrito;
	}

	public void setIdCarrito(Integer idCarrito) {
		this.idCarrito = idCarrito;
	}

	public String getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public String getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPaternoUsuario() {
		return paternoUsuario;
	}

	public void setPaternoUsuario(String paternoUsuario) {
		this.paternoUsuario = paternoUsuario;
	}

	public String getMaternoUsuario() {
		return maternoUsuario;
	}

	public void setMaternoUsuario(String maternoUsuario) {
		this.maternoUsuario = maternoUsuario;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public Integer getNumConfirmacion() {
		return numConfirmacion;
	}

	public void setNumConfirmacion(Integer numConfirmacion) {
		this.numConfirmacion = numConfirmacion;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Double getMontoEnvio() {
		return montoEnvio;
	}

	public void setMontoEnvio(Double montoEnvio) {
		this.montoEnvio = montoEnvio;
	}

	public CarritoCompras getCarritoCompras() {
		return carritoCompras;
	}

	public void setCarritoCompras(CarritoCompras carritoCompras) {
		this.carritoCompras = carritoCompras;
	}
	
	

	

	
}
