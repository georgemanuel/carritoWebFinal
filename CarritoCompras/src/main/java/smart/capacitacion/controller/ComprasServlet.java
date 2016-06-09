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

/**
 * Servlet implementation class ComprasServlet
 */
public class ComprasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CarritoComprasServiceImpl carritoComprasServiceImpl = new CarritoComprasServiceImpl();
	ComprasServiceImpl comprasServiceImpl = new ComprasServiceImpl();
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ComprasServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String opcion = request.getParameter("opcion");
		
		if(opcion.equals("1")){
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
			//System.out.println(carritoCompras);
			compra.setCarritoCompras(carritoCompras);
			//System.out.println("productos"+carritoCompras.getIdCarrito());			
			//System.out.println("productos"+carritoCompras.getProductosEnCarrito().size());
			//Double total = 0.0;
			///for (int i=0;i<carritoCompras.getProductosEnCarrito().size();i++ ){
				
				//total=total+carritoCompras.getProductosEnCarrito().get(i).getPrecioProducto();
			//}
			//compra.setTotal(total);
			comprasServiceImpl.realizarCompra(compra);	
			response.sendRedirect("views/login.jsp");	
			
		}		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
