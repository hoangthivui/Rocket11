package Polymorphism.Question_1.frontend;

import Polymorphism.Question_1.backend.StudentManagement;

public class Program1 {
	public static void main(String[] args) {
		StudentManagement studentManagement=new StudentManagement();
		studentManagement.initStudents();
		studentManagement.caLopDiemDanh();
		studentManagement.diHocBai();
		studentManagement.donVeSinh();
	}
}
