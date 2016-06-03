package smart.capacitacion.service;

import smart.capacitacion.dao.UsuarioDAO;
import smart.capacitacion.modelo.CarritoCompras;
import smart.capacitacion.modelo.Usuario;


public class UsuarioServiceImpl implements UsuarioService {
	UsuarioDAO usuarioDAO = new UsuarioDAO();

	@Override
	public boolean crearCuenta(Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String borrarCuenta(String borrarCuentaUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario login(Usuario usuario) {
		// TODO Auto-generated method stub
		return this.usuarioDAO.login(usuario);
	}

	@Override
	public CarritoCompras obtenerCarritoComprasByUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		CarritoCompras carritoCompras = this.usuarioDAO.obtenerCarritoComprasByUsuario(usuario);
		if ( carritoCompras!=null){
			return carritoCompras;
		}
		else{
			//Codigo para crear el carrito
			return null;
		}
	}
	

}
