package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import utils.Conexion;

public class LoginDao {
	
	public static int validar(String usu, String pass) {
		Connection con;
		Conexion cn = new Conexion();
		
		PreparedStatement ps;
		ResultSet rs;
		String us ="";
		int valido = 0;
		String sql = "Select * from db.persona where usu = ? and pass ?";
		try {
		
			con = cn.getConnection();
			ps =con.prepareStatement(sql);
			ps.setString(1,usu);
			ps.setString(2,pass);
			rs = ps.executeQuery();
			while(rs.next()) {
				us = rs.getString("user");
			}
			if(us.equals("admin")) {
				valido = 1;
			}
			else {valido = 0;}
		}
		catch (Exception ex){
			return valido;
		}
		return valido;
		
	}
}