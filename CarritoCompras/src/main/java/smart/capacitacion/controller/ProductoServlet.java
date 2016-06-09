package smart.capacitacion.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import smart.capacitacion.modelo.CarritoCompras;
import smart.capacitacion.modelo.Producto;
import smart.capacitacion.service.CarritoComprasService;
import smart.capacitacion.service.CarritoComprasServiceImpl;
import smart.capacitacion.service.ProductoService;
import smart.capacitacion.service.ProductoServiceImpl;

/**
 * Servlet implementation class ProductoServlet
 */
public class ProductoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProductoService productoService = new ProductoServiceImpl();
	CarritoComprasService carritoComprasService = new CarritoComprasServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		Producto producto = new Producto();
		producto.setIdProducto(Integer.parseInt(request.getParameter("idProducto")));
		System.out.println(producto);
		List<Producto> productos = new ArrayList<Producto>();
		productos.add(producto);
		CarritoCompras carritoCompras = (CarritoCompras) request.getSession().getAttribute("carritoCompras");
		carritoCompras.setProductosEnCarrito(productos);
		//mando  llamar al service
		producto = carritoComprasService.agregarProductoAlCarrito(carritoCompras);
		request.getSession().setAttribute("carritoCompras", carritoCompras);
		System.out.println(carritoCompras);
		response.sendRedirect("views/carritoCompras.jsp");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

}
