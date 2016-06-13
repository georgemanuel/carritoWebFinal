package smart.capacitacion.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import smart.capacitacion.modelo.CarritoCompras;
import smart.capacitacion.modelo.Compra;
import smart.capacitacion.service.CarritoComprasService;
import smart.capacitacion.service.CarritoComprasServiceImpl;

import smart.capacitacion.service.ComprasServiceImpl;
import smart.capacitacion.service.UsuarioService;
import smart.capacitacion.service.UsuarioServiceImpl;

/**
 * Servlet implementation class ComprasServlet
 */
public class ComprasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CarritoComprasServiceImpl carritoComprasServiceImpl = new CarritoComprasServiceImpl();
	ComprasServiceImpl comprasServiceImpl = new ComprasServiceImpl();
	UsuarioService usuarioServiceImpl= new UsuarioServiceImpl();
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ComprasServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String opcion = request.getParameter("opcion");

		if (opcion.equals("1")) {
			Compra compra = new Compra();
			compra.setFormaPago(request.getParameter("formaPago"));
			compra.setCalle(request.getParameter("calle"));
			compra.setCodigoPostal(request.getParameter("codigoPostal"));
			compra.setColonia(request.getParameter("colonia"));
			compra.setFechaCompra(request.getParameter("fechaCompra"));
			compra.setMaternoUsuario(request.getParameter("maternoUsuario"));
			compra.setMontoEnvio(Double.parseDouble(request.getParameter("montoEnvio")));
			compra.setNombreUsuario(request.getParameter("nombreUsuario"));
			compra.setNumero(request.getParameter("numero"));
			compra.setPaternoUsuario(request.getParameter("paternoUsuario"));
			CarritoCompras carritoCompras = (CarritoCompras) request.getSession().getAttribute("carritoCompras");
			compra.setCarritoCompras(carritoCompras);
			 Double total = 0.0;
			 System.out.println("productos en carrito;"+carritoCompras.getProductosEnCarrito().size());
			 for (int i=0;i<carritoCompras.getProductosEnCarrito().size();i++){
				 System.out.println("recorrido"+carritoCompras.getProductosEnCarrito().get(i));
				 total=total+carritoCompras.getProductosEnCarrito().get(i).getPrecioProducto();
			 }
			 compra.setTotal(total);
			Compra compraFinal = comprasServiceImpl.realizarCompra(compra);
			if (compraFinal != null) {
				carritoCompras=comprasServiceImpl.modificarCarrito(carritoCompras);
				//CarritoCompras carritoCompras2 = new CarritoCompras();
				//carritoCompras2 = carritoComprasServiceImpl.crearCarritoByUsuario(carritoCompras.getUsuario());
				//request.getSession().setAttribute("carritoCompras", carritoCompras2 );
				response.sendRedirect("views/catalogoProductosGeneral.jsp");
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
