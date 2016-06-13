package smart.capacitacion.modelo;
import java.util.ArrayList;
import java.util.List;

public class CarritoCompras {
	
	private Integer idCarrito;
	private Usuario usuario;
	private Double subTotal;
	private Double total;
	private Integer status = 1;
	private List<Producto> productosEnCarrito;
	
	
	public CarritoCompras(){
	 productosEnCarrito= new ArrayList<Producto>();	
	}
	
	

	public CarritoCompras(Integer idCarrito, Usuario usuario, Double subTotal, Double total, Integer status,
			List<Producto> productosEnCarrito) {
		super();
		this.idCarrito = idCarrito;
		this.usuario = usuario;
		this.subTotal = subTotal;
		this.total = total;
		this.status = status;
		this.productosEnCarrito = productosEnCarrito;
	}



	public Integer getIdCarrito() {
		return idCarrito;
	}

	public void setIdCarrito(Integer idCarrito) {
		this.idCarrito = idCarrito;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public List<Producto> getProductosEnCarrito() {
		return productosEnCarrito;
	}

	public void setProductosEnCarrito(List<Producto> productosEnCarrito) {
		this.productosEnCarrito = productosEnCarrito;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
	
	
}
