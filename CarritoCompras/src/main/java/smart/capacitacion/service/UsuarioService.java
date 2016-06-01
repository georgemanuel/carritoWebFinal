package smart.capacitacion.service;

import smart.capacitacion.modelo.Usuario;

public interface UsuarioService {
	
	public boolean crearCuenta(Usuario usuario);
	public String borrarCuenta(String borrarCuentaUsuario);
	public boolean login(Usuario usuario);
}
