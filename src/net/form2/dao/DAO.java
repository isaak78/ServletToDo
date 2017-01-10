package net.form2.dao;

import java.sql.Connection;
import java.sql.DriverManager;
 
/**

 * 
 */
public class DAO {
	public Connection getConexao() {
		Connection conn = null;
		String user = "root";
		String pass = "xxxxxx";
		String based = "form2";
 
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://172.17.0.2:3306/" + based,
					 user, pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}