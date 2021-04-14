package com.vti.academy.DemoMavenProject.Utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.management.loading.PrivateClassLoader;

public class KetNoi {
	private Connection connection;
	
	
	private void Connecting() throws ClassNotFoundException, SQLException {
		String url ="jdbc:mysql://localhost:3306/test?autoReconnect=true&useSSL=false&characterEncoding=latin1" ;
		String username="root";
		String password="100799";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url,username,password);
		System.out.println("kết nối thành công");
	}
	
	
	public Connection connect()throws FileNotFoundException, IOException, ClassNotFoundException, SQLException, SQLException {

		String url ="jdbc:mysql://localhost:3306/test?autoReconnect=true&useSSL=false&characterEncoding=latin1" ;
		String username="root";
		String password="100799";
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection(url, username, password);
		return connection;
	}
	
	public void disconnect() throws SQLException {
		connection.close();
	}
	
}
