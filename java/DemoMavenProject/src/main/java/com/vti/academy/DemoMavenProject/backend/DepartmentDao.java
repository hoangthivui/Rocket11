package com.vti.academy.DemoMavenProject.backend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.vti.academy.DemoMavenProject.Utils.KetNoi;
import com.vti.academy.DemoMavenProject.entity.Department;

public class DepartmentDao {
	private KetNoi ketnoi;
	public List<Department> departments() throws ClassNotFoundException, SQLException {
		List<Department> department = new ArrayList<Department>();

		String url = "jdbc:mysql://localhost:3306/test?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username = "root";
		String password = "100799";

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection(url, username, password);

		System.out.println("thành công");
		// Step 3: Create a statement object
		String sql = "Select * from Department";

		// Step 4: Excute Query
		Statement statement = connection.createStatement();

		ResultSet resultset = statement.executeQuery(sql);

		// Step 5: Xu li ket qua
		while (resultset.next()) {
			System.out.print(resultset.getInt("DepartmentID") + " ");
			System.out.println(resultset.getString("DepartmentName"));
		}
		return department;

	}
	public Department getDepartmentByID(int id) throws SQLException, ClassNotFoundException {
		// get connection
		String url = "jdbc:mysql://localhost:3306/test?autoReconnect=true&useSSL=false&characterEncoding=latin1";
		String username = "root";
		String password = "100799";
		Connection connection = DriverManager.getConnection(url, username, password);
		Class.forName("com.mysql.cj.jdbc.Driver");

		// Step 4: Excute Query
		Statement statement = connection.createStatement();
		// Create a statement object
		String sql = "SELECT * FROM Department WHERE DepartmentId = ?";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);

		// set parameter
		preparedStatement.setInt(1, id);

		// Step 4: execute query
		ResultSet resultSet = preparedStatement.executeQuery();
		Department department = new Department();
		// Step 5: handling result set
		if (resultSet.next()) {
			department.setId(resultSet.getInt("DepartmentId"));
			department.setName(resultSet.getString("DepartmentName"));
		} else {
			System.err.println("Không thể tìm thấy id!");
		}
		return department;
	}
	



}
