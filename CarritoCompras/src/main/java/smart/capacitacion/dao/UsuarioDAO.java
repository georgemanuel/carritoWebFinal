package smart.capacitacion.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import smart.capacitacion.modelo.Usuario;

public class UsuarioDAO extends DAOGeneral{
	 Connection conexion = null;
	 Statement sentencia = null;
	 ResultSet resultado = null;
	 
	 public UsuarioDAO(){
		 this.conexion=getConnection();
	 }
	 
	 public String getNombreUsuarioByRFC(String rfcUsuario){
         try{
        	 sentencia = conexion.createStatement();
        	 String consultaSQL = "select * from \"USUARIO\" where \"RFC\"='"+rfcUsuario+"'";
        	 System.out.println(consultaSQL);
        	 resultado = sentencia.executeQuery(consultaSQL);
        	 String nombreUsuario="N/E";
        	 while (resultado.next()) {
        		 nombreUsuario = resultado.getString("NOMBRE_USUARIO");
        		 System.out.println("Resultado:"+nombreUsuario);
        	 }
        	 return nombreUsuario;
         }
         catch(Exception error){
        	 error.printStackTrace();
         }
         return "ERROR";
 
	 }

	public boolean login(Usuario usuario) {
		// TODO Auto-generated method stub
		try{
	       	 sentencia = conexion.createStatement();
	       	 String consultaSQL = "select * from \"USUARIO\" where \"EMAIL\"='"+usuario.getEmailUsuario()+"' AND \"PASSWORD\"='"+usuario.getPasswordUsuario()+"'";
	       	 System.out.println(consultaSQL);
	       	 resultado = sentencia.executeQuery(consultaSQL);
	       	 while (resultado.next()) {
	       		 return true;
	       	 }
        }
        catch(Exception error){
       	 error.printStackTrace();
        }
		return false;
}
}
