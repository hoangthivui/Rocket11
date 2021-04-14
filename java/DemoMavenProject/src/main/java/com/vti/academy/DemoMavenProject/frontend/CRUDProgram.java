package com.vti.academy.DemoMavenProject.frontend;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.vti.academy.DemoMavenProject.backend.DepartmentDao;
import com.vti.academy.DemoMavenProject.entity.Department;
import com.vti.ultis.ScannerUtils;

public class CRUDProgram {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		question2_3();
	}		
	public static void question2_3() throws ClassNotFoundException, SQLException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào id: ");
		int x = scanner.nextInt();
		Department department= new DepartmentDao().getDepartmentByID(x);
		System.out.println(department);
		scanner.close();
	}
}

