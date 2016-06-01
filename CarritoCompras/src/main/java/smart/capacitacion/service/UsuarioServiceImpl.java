package smart.capacitacion.service;

import smart.capacitacion.dao.UsuarioDAO;
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
	public boolean login(Usuario usuario) {
		// TODO Auto-generated method stub
		return this.usuarioDAO.login(usuario);
	}
	

}
